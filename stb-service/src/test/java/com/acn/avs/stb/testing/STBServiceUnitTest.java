/***************************************************************************
 * Copyright (C) Accenture
 * 
 * The reproduction, transmission or use of this document or its contents is not permitted without
 * prior express written consent of Accenture. Offenders will be liable for damages. All rights,
 * including but not limited to rights created by patent grant or registration of a utility model or
 * design, are reserved.
 * 
 * Accenture reserves the right to modify technical specifications and features.
 * 
 * Technical specifications and features are binding only insofar as they are specifically and
 * expressly agreed upon in a written contract.
 * 
 **************************************************************************/

package com.acn.avs.stb.testing;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.acn.avs.common.model.SearchFilter;
import com.acn.avs.common.model.stb.STB;
import com.acn.avs.common.model.stb.STBManager;
import com.acn.avs.common.model.stb.STBWrapper;
import com.acn.avs.stb.Generator.STBServiceGenerator;
import com.acn.avs.stb.config.TestConfig;
import com.acn.avs.stb.service.StbService;

/**
 * @author happy.dingra 
 * Unit test class for creating test cases for stb micro services
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@EnableJpaRepositories("com.acn.avs.stb.repository")
@ComponentScan(basePackages = { "com.acn.avs" })
@SpringApplicationConfiguration(classes = TestConfig.class)
@TestPropertySource(locations = "classpath:application-test.properties")
@EnableWebMvc
public class STBServiceUnitTest {

	@Autowired
	private StbService service;

	private STBServiceGenerator serviceGenGen = new STBServiceGenerator();

	/**
	 * 
	 * @testValidSTB throws SQLException 
	 * This method is used to create STBs with valid data.
	 */

	@Test
	public void testAllValidSTB() throws SQLException {

		List<STB> stbList = serviceGenGen.getValid();

		Map<Integer, STB> stbMap = new HashMap<>();

		if (stbList.size() != 0) {
			for (STB stb : stbList) {
				STBWrapper comm = new STBWrapper();
				STBManager manager = new STBManager();
				manager.setSTB(stb);
				comm.setSTBManager(manager);
				STBWrapper stbComm = service.save(comm);
				stbMap.put(stbComm.getSTBManager().getSTB().getEquipmentId(), stbComm.getSTBManager().getSTB());
			}
		}

		STBWrapper stbGetList = service.search(new SearchFilter());
		Assert.assertEquals(stbGetList.getSTBManager().getStbDetails().getSTBList().size(), stbList.size());
		for (STB stb : stbGetList.getSTBManager().getStbDetails().getSTBList()) {

			STB actualStb = stbMap.get(stb.getEquipmentId());
			Assert.assertEquals("IpAddress should be same ", actualStb.getIpAddress(), stb.getIpAddress());
			Assert.assertEquals("HwVersion should be same ", actualStb.getHwVersion(), stb.getHwVersion());
            //TODO add more assertion
            
			
		}
	}

	/**
	 * 
	 * testInValidSTBWithInvalidResrc throws SQLException method is used to
	 * create STBs with inValid Resource name.
	 */
	@Test
	public void testInValidSTBWithInvalidResrc() throws SQLException {
		try {
			STB stb = serviceGenGen.getInvalid().get(5);
			STBWrapper comm = new STBWrapper();
			STBManager manager = new STBManager();
			manager.setSTB(stb);
			comm.setSTBManager(manager);
			STBWrapper comm2 = service.save(comm);
			Assert.assertEquals(comm2.getSTBManager().getSTB().getAssignedResources().getResource().size(), 0);
			//TODO add more assertion
			
		} catch (DataIntegrityViolationException e) {
			Assert.fail("Exception due to Invalid Resouce name");
		}

	}

	/**
	 * testInValidSTBWithValidAsgnRes throws SQLException method used to create
	 * STB with valid Assign Resource
	 */
	@Test
	public void testInValidSTBWithValidAsgnRes() throws SQLException {
		try {
			STB stb = serviceGenGen.getValid().get(0);
			STBWrapper comm = new STBWrapper();
			STBManager manager = new STBManager();
			manager.setSTB(stb);
			comm.setSTBManager(manager);
			STBWrapper comm2 = service.save(comm);
			Assert.assertEquals(comm2.getSTBManager().getSTB().getAssignedResources().getResource().size(), 2);
			//TODO add more assertion
		} catch (DataIntegrityViolationException e) {
			Assert.fail("DataIntegrityViolationException Expected exception was not thrown");
		}

	}

	/**
	 * testValidSTBResourceSize throws SQLException method used to test size of
	 * created resource
	 */
	@Test
	public void testValidSTBResourceSize() throws SQLException {
		try {
			STB stb = serviceGenGen.getValid().get(0);
			STBWrapper comm = new STBWrapper();
			STBManager manager = new STBManager();
			manager.setSTB(stb);
			comm.setSTBManager(manager);
			STBWrapper comm2 = service.save(comm);
			Assert.assertEquals(comm2.getSTBManager().getSTB().getAssignedResources().getResource().size(), 2);
			//TODO add more assertion
		} catch (DataIntegrityViolationException e) {
			Assert.fail("DataIntegrityViolationException Expected exception was not thrown");
		}

	}

	/**
	 * @testInValidSTBWithAsgnResNull throws SQLException
	 *  method used to create STB with Assign Resource null
	 */
	@Test
	public void testInValidSTBWithAsgnResNull() throws SQLException {
		try {
			STB stb = serviceGenGen.getInvalid().get(3);
			STBWrapper comm = new STBWrapper();
			STBManager manager = new STBManager();
			manager.setSTB(stb);
			comm.setSTBManager(manager);
			STBWrapper comm2 = service.save(comm);
			Assert.assertNull(comm2.getSTBManager().getSTB().getAssignedResources());
			//TODO add more assertion
		} catch (DataIntegrityViolationException e) {
			Assert.fail("DataIntegrityViolationException Expected exception was not thrown");
		}

	}

	/**
	 * testInValidSTBWithResourceNull throws SQLException 
	 * method used to create STB without resources
	 */
	@Test
	public void testInValidSTBWithResourceNull() throws SQLException {
		try {
			STB stb = serviceGenGen.getInvalid().get(4);
			STBWrapper comm = new STBWrapper();
			STBManager manager = new STBManager();
			manager.setSTB(stb);
			comm.setSTBManager(manager);
			STBWrapper comm2 = service.save(comm);
			Assert.assertNotNull(comm2.getSTBManager().getSTB().getAssignedResources());
			Assert.assertEquals(comm2.getSTBManager().getSTB().getAssignedResources().getResource().size(), 0);
			//TODO add more assertion
		} catch (DataIntegrityViolationException e) {
			Assert.fail("DataIntegrityViolationException Expected exception was not thrown");
		}

	}

	/**
	 * @testInValidSTBWithSerialNull throws SQLException
	 *  This method is used to create STBs with serial null.
	 */
	@Test(expected = DataIntegrityViolationException.class)
	public void testInValidSTBWithSerialNull() throws DataIntegrityViolationException {
				STB stb = serviceGenGen.getInvalid().get(0);
		
		STBWrapper comm = new STBWrapper();
		STBManager manager = new STBManager();
		manager.setSTB(stb);
		comm.setSTBManager(manager);
		service.save(comm);
	}

	/**
	 * testInValidSTBWithMacNull throws SQLException 
	 * This method is used to create STBs with mac address as null.
	 */
	@Test(expected = DataIntegrityViolationException.class)
	public void testInValidSTBWithMacNull() throws DataIntegrityViolationException {

		STB stb = serviceGenGen.getInvalid().get(1);
		STBWrapper comm = new STBWrapper();
		STBManager manager = new STBManager();
		manager.setSTB(stb);
		comm.setSTBManager(manager);
		service.save(comm);
	}

	/**
	 * @testInValidSTBWithVMXNull throws SQLException
	 * This method is used to  create STBs with VMX as null.
	 */
	@Test(expected = DataIntegrityViolationException.class)
	public void testInValidSTBWithVMXNull() throws DataIntegrityViolationException {
		STB stb = serviceGenGen.getInvalid().get(2);
		STBWrapper comm = new STBWrapper();
		STBManager manager = new STBManager();
		manager.setSTB(stb);
		comm.setSTBManager(manager);
		service.save(comm);
	}

}
