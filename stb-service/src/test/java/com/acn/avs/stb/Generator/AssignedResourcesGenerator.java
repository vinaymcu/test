package com.acn.avs.stb.Generator;

import java.util.ArrayList;
import java.util.List;

import com.acn.avs.common.model.stb.AssignedResources;
import com.acn.avs.common.model.stb.Resource;
import com.acn.avs.common.model.stb.STB;

public class AssignedResourcesGenerator extends
AbstractEntityGenerator<AssignedResources> {

@Override
public Class<AssignedResources> getEntityClass() {
return AssignedResources.class;
}

@Override
protected void buildLists() {
	
	RandomData randomData = new RandomData();
	AssignedResources assignResouces=new AssignedResources();
	List<Resource> resouces=new ArrayList<Resource>();
	List<Resource> invResouces=new ArrayList<Resource>();
	Resource resObj =new Resource();
	resObj.setName("networkbandwidth");
	resObj.setUnit(randomData.randomInteger(1));
	
	Resource resObj2 =new Resource();
	resObj2.setName("mpeg2streamlimit");
	resObj2.setUnit(randomData.randomInteger(1));
	
	Resource resObj3 =new Resource();
	resObj3.setName("testWrong");
	resObj3.setUnit(randomData.randomInteger(1));
	
	resouces.add(resObj);
	resouces.add(resObj2);
	invResouces.add(resObj3);
	// add valid with all fields
			for (int index = 0; index < 3; index++) {
				AssignedResources res=new AssignedResources();
				res.setResource(resouces);
				addValid(res);
			}
			AssignedResources res=new AssignedResources();
			addValid(res);
			AssignedResources inRes=new AssignedResources();
			inRes.setResource(invResouces);
	/*
	
	
	RandomData randomData = new RandomData();
	AssignedResources assignResouces=new AssignedResources();
	List<Resource> resouces=new ArrayList<Resource>();
	ResourcesGenerator prgDetailGen = new ResourcesGenerator();
	Resource prgDetail = prgDetailGen.getValid().get(0);
	addDependency(prgDetailGen.getDependencies());
	addDependency(prgDetail);
	
	resouces.add(prgDetail);
	// add valid with all fields
			for (int index = 0; index < 3; index++) {
				AssignedResources res=new AssignedResources();
				res.setResource(resource);
			}
*/}

}
