  insert into connection_type
   (connection_mode, name, status, company_id, supported)
 values
   (1, 'bridged', 'A', 1, 0);
insert into connection_type
   (connection_mode, name, status, company_id, supported)
 values
   (2, 'upnpnapt', 'A', 1, 0);
insert into connection_type
   (connection_mode, name, status, company_id, supported)
 values
   (3, 'implicitnat', 'A', 1, 1);

insert into resource
   (id, name, description, unit, assignable)
 values
   (3, 'dvbt tuners', 'dvb-t tuner', 'integer', 1);
insert into resource
   (id, name, description, unit, assignable)
 values
   (1, 'networkbandwidth', 'network bandwidth', 'kbps', 0);
insert into resource
   (id, name, description, unit, assignable)
 values
   (2, 'mpeg2streamlimit', 'mpeg-2 stream limit', 'integer', 1);
insert into resource
   (id, name, description, unit, assignable)
 values
   (4, 'dvbs tuners', 'dvb-s tuner', 'integer', 1);
  
 
/* insert data*/
  
 INSERT INTO settopbox_default
   (attribute_property, equipment_id, serial_number, ip_address, mac_address, 
    hw_version, sw_version, STATUS, company_id, assigned_subs_id, 
    assigned_subs_name, last_updated_on, last_updated_by, location,  
    secure_id, stb_id, overriding_default, max_bw_update, hd_reception, 
    tstv_buffer_size, external_ip_address, 
    port_trigger, connection_mode, basic_captioning, adv_captioning, stb_profile, 
    hd_interest, ui_version, stb_name, port_opa, cas_device_id, 
    dyn_rm_capable, vmx_client_id)
 VALUES
   ('defaultvalue', 0, ' ', ' ', ' ', 
    ' ', ' ', 'A', 0, 0, 
    ' ', ' ', ' ', 'atsubscriberpremise', 
    ' ', NULL, NULL, NULL, 0, 
    0, NULL, 
    9001, 1, NULL, NULL, NULL, 
    0, ' ', NULL, 9021, NULL, 
    ' ', ' ');
	
insert into settopbox_location
   (location)
 values
   ('atsubscriberpremise');

insert into settopbox_location
   (location)
 values
   ('other');
   
   
    
  /* insert data */
insert into settopbox_type
   (client_type, description, status)
 values
   ('pcapplication', 'pcclient', 'A');
insert into settopbox_type
   (client_type, description, status)
 values
   ('application', 'javaclient', 'A');
insert into settopbox_type
   (client_type, description, status)
 values
   ('browser', 'thinclient', 'A');
commit;
   
   
insert into vendor_type
   (vnd_type, description)
 values
   ('D', 'Distributor');
insert into vendor_type
   (vnd_type, description)
 values
   ('S', 'Movie Studio');
insert into vendor_type
   (vnd_type, description)
 values
   ('H', 'Hardware');
   

insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10542, 'Beate Uhse Licensing BV', 'S', 'A', '20091014092647653', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10581, 'Lumière Publishing BVBA', 'S', 'A', '20091104152943357', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10622, 'Tilgin', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10623, 'Motorola', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10624, 'SA', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10762, 'IDTV', 'S', 'A', '20100716113931921', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1101, 'RCV', 'S', 'A', '20060410111858850', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1102, 'Reserve - 0', 'S', 'A', '20060410112356825', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1104, 'DFW (Dutch Film Works)', 'S', 'A', '20060410112527914', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1111, 'Reserve - 3', 'S', 'A', '20060410112504978', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1100, 'Myrio Test', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1103, 'VFE', 'S', 'A', '20060410111547026', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1105, 'A-film', 'S', 'A', '20060410111535244', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1106, 'Going Dutch', 'S', 'A', '20060410111755165', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1107, 'PK-Media', 'S', 'A', '20060410111834814', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1108, 'RTL (Diadora)', 'S', 'A', '20060410111643210', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1109, 'Forum', 'S', 'A', '20080905062255542', 
    'wtaco');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1110, 'Warner Bros', 'S', 'A', '20080905062310704', 
    'wtaco');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1112, 'Reserve - 4', 'S', 'A', '20060410111736528', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1113, 'Reserve - 5', 'S', 'A', '20060410111925358', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1157, 'Miramax', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1166, 'Sony Pictures', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1156, 'Lion''s Gate', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1167, 'Starz', 'D', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1165, 'Showtime', 'D', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1155, 'HBO', 'D', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1153, 'Encore', 'D', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1169, 'Trimark', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1150, 'A&E Network', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1154, 'ESPN', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1158, 'NCTC', 'D', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1168, 'Steeplechase', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1151, 'Accuweather', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1164, 'Reuters', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1163, 'Real Networks', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1152, 'DMX', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1162, 'QBeo', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1161, 'Other - Web Based Content', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1159, 'Other - Motion Pictures', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1160, 'Other - TV Programming', 'S', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1170, 'WSNet', 'S', 'A', ' ', 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1171, 'Music Choice', 'S', 'A', ' ', 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1172, 'iNDemand', 'S', 'A', ' ', 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1173, 'Fujitsu Siemens', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1174, 'Humax', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1175, 'Eagle', 'H', 'I', '20160307081302988', 
    'eelan');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1176, 'Pace', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1177, 'Next Level Communications', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1178, 'Thomson Consumer Electronics', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1179, 'i3 micro technology', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1180, 'Amino', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1181, 'Entone', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1182, 'Zhone', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (1183, 'Siemens', 'H', 'A', null, 
    null);
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10081, 'Telescreen', 'S', 'A', '20061207140833310', 
    'kpnid');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10101, 'Just Entertainment', 'S', 'A', '20070122064056543', 
    'kpnid');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10121, 'IFFR', 'S', 'A', '20070122091707331', 
    'kpnid');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10021, 'Kreatel', 'H', 'A', '20051208125707750', 
    'stephan');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10061, 'Niet van toepassing', 'S', 'A', '20060602145445945', 
    'root');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10161, 'Strengholt', 'S', 'A', '20070223131400180', 
    'kpnid');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10041, 'A-Films', 'S', 'A', '20060130111323412', 
    'ken');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10042, 'RC', 'S', 'A', '20060410112259643', 
    'test');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10141, 'Video Art Holland', 'S', 'A', '20070222081542299', 
    'kpnid');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10181, 'Three Lines Distribution', 'S', 'A', '20070703144725454', 
    'root');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10182, 'Three Lines Distribution', 'S', 'I', '20070703144856095', 
    'root');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10201, 'NFF', 'S', 'A', '20070924123351237', 
    'wtaco');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10221, 'Private', 'D', 'A', '20071025075352688', 
    'wmartienw');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10241, 'Hom', 'S', 'A', '20080528125739943', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10242, 'Paramount', 'S', 'A', '20080528125917281', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10243, 'Sony', 'S', 'A', '20080528130049498', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10244, 'Bridge', 'S', 'A', '20080528130149982', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10245, 'Dream', 'S', 'A', '20080528130242784', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10246, 'Formatel', 'S', 'A', '20080528130347675', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10247, 'Indies', 'S', 'A', '20080528130451210', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10248, 'Living Colours', 'S', 'A', '20080528130535661', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10249, 'Moviebank', 'S', 'A', '20080528130637396', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10250, 'Transworld', 'S', 'A', '20080528130735374', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10251, 'Universal', 'S', 'A', '20080528131106261', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10252, 'MGM', 'S', 'A', '20080528131146681', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10253, 'Fox', 'S', 'A', '20080528131313341', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10254, 'A-Films', 'S', 'I', '20080528135340370', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10261, 'Zipper', 'S', 'A', '20080529075226103', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10321, 'BBI', 'S', 'A', '20081003131520159', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10421, 'Belga Films', 'S', 'A', '20090210114337834', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10422, 'Disney', 'S', 'A', '20090210114527251', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10642, 'Vereniging Evangelische Omroep (EO)', 'S', 'A', '20100210093053667', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10662, 'E1 Entertainment', 'S', 'A', '20100226093046870', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10301, 'Cineart', 'S', 'A', '20080925125143559', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10361, 'NBC Universal', 'S', 'I', '20090403131730371', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10461, 'Splendid Film: SPL', 'S', 'A', '20090420123721780', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10481, 'Dupuis', 'S', 'A', '20090617142437738', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10501, 'Submarine', 'S', 'A', '20090821091307582', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10401, 'Paradiso', 'S', 'A', '20090206101206019', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10441, 'Lime Lights', 'S', 'A', '20090211142854719', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10521, 'PIAS', 'S', 'A', '20090821131735059', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10541, 'Walt Disney Company Ltd', 'S', 'A', '20091014092039477', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10601, 'Monte Verdi Media', 'S', 'A', '20091215111016563', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10782, 'Cinema Delicatessen', 'S', 'A', '20100802091037560', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10802, 'All3Media', 'S', 'A', '20100906123449125', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10281, 'MMI', 'S', 'A', '20080711123015774', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10341, 'Daring', 'S', 'A', '20081013091051616', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10381, 'A-Film', 'S', 'A', '20090119102446810', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10561, 'ABC Distribution Rights BV', 'S', 'A', '20091026155100196', 
    'wtaco');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10621, 'Discovery Networks Benelux', 'S', 'A', '20100202154304905', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10682, 'AWM Media', 'S', 'A', '20100322141948078', 
    'wtaco');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10702, 'Kudeta Live', 'S', 'A', '20100426144058412', 
    'wurleyc');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10722, 'Studio 100', 'S', 'A', '20100521113642515', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10742, 'Nickelodeon', 'S', 'A', '20100521113757697', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10743, 'JimJam', 'S', 'A', '20100521113832534', 
    'wrutgerv');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10803, 'VOD Vendor Anuj', 'S', 'A', '20120328122338865', 
    'tmuser');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10804, 'Arcadyan', 'H', 'A', '20121211092024313', 
    'psharma');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10823, 'A1', 'S', 'A', '20150703050045970', 
    'atul');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10843, 'sheik21', 'D', 'A', '20160301092151936', 
    'shk');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10884, 'kaushik', 'H', 'A', '20160325093940651', 
    'eelan');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10883, 'df', 'D', 'A', '20160325093709365', 
    'eelan');
insert into vendor
   (id, name, type, status, last_updated_on, 
    last_updated_by)
 values
   (10863, 'AIMS', 'D', 'A', '20160307081248078', 
    'eelan');
	
insert into stb_profile
   (name, display_name, multi_tuner, priority, hd_reception, 
    sd_tuners, hd_tuners)
 values
   ('OFF', 'off', 0, 0, 0, 
    0, 0);
insert into stb_profile
   (name, display_name, multi_tuner, priority, hd_reception, 
    sd_tuners, hd_tuners)
 values
   ('ST SD', 'sd tv', 0, 1, 0, 
    1, 0);
insert into stb_profile
   (name, display_name, multi_tuner, priority, hd_reception, 
    sd_tuners, hd_tuners)
 values
   ('DT SD', 'sd tv + sd cpvr', 1, 2, 0, 
    2, 0);
insert into stb_profile
   (name, display_name, multi_tuner, priority, hd_reception, 
    sd_tuners, hd_tuners)
 values
   ('ST HD', 'hd tv', 0, 3, 1, 
    0, 1);
insert into stb_profile
   (name, display_name, multi_tuner, priority, hd_reception, 
    sd_tuners, hd_tuners)
 values
   ('DT SD/HD', 'hd/sd tv + sd/hd cpvr', 1, 4, 1, 
    1, 1);
insert into stb_profile
   (name, display_name, multi_tuner, priority, hd_reception, 
    sd_tuners, hd_tuners)
 values
   ('DT HD', 'hd tv + hd cpvr', 1, 5, 1, 
    0, 2);

	
  

  
  /* insert data */
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1963DB-512', 'application', 1183, null, 'A', 
    '20131108125724776', 'deven', null, 'None', 1, 
    30, 0, 0, 0, 1000, 
    1, 'DT HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_1960-9DBA', 'application', 1183, null, 'A', 
    '20110726095002781', 'sumit', null, 'None', 1, 
    30, 0, 0, 0, 2000, 
    1, 'DT HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_1910-9DBA', 'application', 1183, null, 'A', 
    '20120116114051957', 'naveen3', null, 'Basic', 1, 
    30, 0, 0, 0, 0, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1903DB-512', 'application', 1183, null, 'A', 
    '20130402095714615', '3475', null, 'None', 1, 
    30, 0, 0, 0, 50, 
    1, 'DT HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_1960-9DB', 'application', 10623, null, 'A', 
    '20110713131322604', 'myrio', null, 'Basic', 1, 
    30, 0, 0, 0, 2000, 
    1, 'DT SD/HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('VIP1960-9DB 256', 'application', 10623, null, 'A', 
    '20101110061131874', 'nmc', null, 'None', 1, 
    30, 0, 0, 0, 1000, 
    1, 'DT SD/HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('VIP1903', 'application', 10623, null, 'A', 
    '20120221065944175', 'myrio', null, 'None', 0, 
    30, 0, 0, 0, 0, 
    1, 'ST HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('VIP1963', 'application', 10623, null, 'A', 
    '20130402060202258', 'parul1', null, 'None', 1, 
    30, 0, 0, 0, 50, 
    1, 'DT HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1963', 'application', 10623, null, 'A', 
    '20150929041936491', 'ajay', null, 'None', 1, 
    30, 0, 0, 0, 2000, 
    1, 'DT HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('SAIPP430MC', 'application', 1180, null, 'A', 
    '20150922044804352', 'ajay', null, 'Basic', 1, 
    30, 0, 0, 0, 4500, 
    1, 'DT SD/HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1960-9-256', 'application', 10623, null, 'A', 
    '20160229131757039', 'eelan', null, 'None', 1, 
    30, 0, 0, 0, 2000, 
    1, 'DT HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1910', 'application', 10623, null, 'A', 
    '20120116114035138', 'naveen3', null, 'None', 1, 
    30, 0, 0, 0, 0, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1853-PLTV', 'application', 10623, null, 'A', 
    '20130402091653932', 'psharma', null, 'Basic', 0, 
    30, 0, 0, 0, 1440, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1910-9-256', 'application', 10623, null, 'A', 
    '20120116114059607', 'naveen3', null, 'None', 1, 
    30, 0, 0, 0, 0, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1903', 'application', 1180, null, 'A', 
    '20111003085132254', 'myrio', null, 'None', 0, 
    30, 0, 0, 0, 0, 
    1, 'ST HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('VIP1853DB', 'application', 10623, null, 'A', 
    '20121004122943886', 'sumit', null, 'Basic', 0, 
    30, 0, 0, 0, 10, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1853', 'application', 10623, null, 'A', 
    '20150428091336558', 'ajay', null, 'Basic', 0, 
    30, 0, 0, 0, 428, 
    1, 'ST HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('TC1', 'browser', 1180, null, 'A', 
    '20120626122310158', 'myrio', null, 'None', 0, 
    30, 0, 0, 0, 0, 
    0, 'ST SD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('PCC1', 'pcapplication', 1180, null, 'A', 
    '20120626121538819', 'myrio', null, 'Strong', 0, 
    30, 1, 1, 0, 0, 
    0, 'ST SD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('HMB2260', 'application', 10804, null, 'A', 
    '20140327083821567', 'psharma', null, 'None', 0, 
    30, 0, 0, 0, 1024, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('Motorola_VIP1853DB', 'application', 10623, null, 'A', 
    '20130411063713365', 'viveck5', null, 'None', 0, 
    30, 0, 0, 0, 500, 
    1, 'ST HD', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('VIP2952', 'application', 10623, null, 'A', 
    '20150312095210825', 'ajay', null, 'Basic', 0, 
    30, 0, 0, 0, 1024, 
    1, 'ST HD', 1);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('ROKU_DEVICE', 'browser', 1180, '3.0.7_8.dev', 'I', 
    '20151007064723950', 'ajay', null, 'None', 0, 
    30, 0, 0, 0, 0, 
    1, 'OFF', 0);
insert into settopbox_version
   (hw_version, settopbox_type, vendor_id, myrio_sw_version, status, 
    last_updated_on, last_updated_by, ui_version, auth_level, cpvr_capable, 
    client_timeout, ss_refresh, ss_expiration, stb_auto_register_inv, tstv_buffer_size, 
    hd_capable, max_stb_profile, qoe_capable)
 values
   ('123', 'application', 1180, '3.0.7_8.dev', 'A', 
    '20160303102652724', 'eelan', null, 'None', 0, 
    30, 0, 0, 0, 0, 
    1, 'ST HD', 0);

insert into stb_pro_assignment_step
   (priority, step)
 values
   (0, 'maxnrstb');

insert into stb_pro_assignment_step
   (priority, step)
 values
   (1, 'maxnrhdstb');

insert into stb_pro_assignment_step
   (priority, step)
 values
   (2, 'maxprofhdstb');

insert into stb_pro_assignment_step
   (priority, step)
 values
   (3, 'maxprofsdstb');
   
insert into sw_version
   (id, name, is_target_group_id, target_id, signature, 
    encrypted, status, multicast_ip_address, multicast_port, multicast_bw, 
    priority, filename, description, uiversion, last_updated_on, 
    last_updated_by, schedule, session_name, distribute_via_mmddf, unicast_url, 
    access_url)
 values
   (3712, '3.8.1-00', 2, null, 0, 
    0, 'i', '239.196.205.101', 64000, 2048, 
    0, 'http://10.196.205.20/myrio/vip2952.utc.install.3.0.7_6.dev', null, 0, '20160413104237601', 
    'amrit29', parsedatetime('4/13/2016 12:01:23.976000', 'MM/dd/yyyy hh:mm:ss.SS'), 'nareshk_2', 1, null, 
    null);
insert into sw_version
   (id, name, is_target_group_id, target_id, signature, 
    encrypted, status, multicast_ip_address, multicast_port, multicast_bw, 
    priority, filename, description, uiversion, last_updated_on, 
    last_updated_by, schedule, session_name, distribute_via_mmddf, unicast_url, 
    access_url)
 values
   (3725, '3.8.1-001', 2, null, 0, 
    0, 'i', null, 0, 64, 
    0, 'sdsd', null, 0, '20160428071010146', 
    'amrit29', parsedatetime('4/28/2016 9:09:42.801000','MM/dd/yyyy hh:mm:ss.SS'), 'filetype.stbvendor.hwmodel', 1, null, 
    null);
insert into sw_version
   (id, name, is_target_group_id, target_id, signature, 
    encrypted, status, multicast_ip_address, multicast_port, multicast_bw, 
    priority, filename, description, uiversion, last_updated_on, 
    last_updated_by, schedule, session_name, distribute_via_mmddf, unicast_url, 
    access_url)
 values
   (3726, '3.8.1-02', 2, null, 0, 
    0, 'i', null, 0, 64, 
    0, 'sds', null, 0, '20160428071023543', 
    'amrit29', parsedatetime('4/28/2016 9:10:13.554000','MM/dd/yyyy hh:mm:ss.SS'), 'filetype.stbvendor.hwmodel', 1, null, 
    null);
insert into sw_version
   (id, name, is_target_group_id, target_id, signature, 
    encrypted, status, multicast_ip_address, multicast_port, multicast_bw, 
    priority, filename, description, uiversion, last_updated_on, 
    last_updated_by, schedule, session_name, distribute_via_mmddf, unicast_url, 
    access_url)
 values
   (3727, '3.8.1-00', 2, null, 0, 
    0, 'i', null, 0, 64, 
    0, 'sd', null, 1, '20160428071844648', 
    'amrit29', parsedatetime('4/28/2016 9:18:31.830000','MM/dd/yyyy hh:mm:ss.SS'), 'filetype.stbvendor.hwmodel', 1, null, 
    null);
insert into sw_version
   (id, name, is_target_group_id, target_id, signature, 
    encrypted, status, multicast_ip_address, multicast_port, multicast_bw, 
    priority, filename, description, uiversion, last_updated_on, 
    last_updated_by, schedule, session_name, distribute_via_mmddf, unicast_url, 
    access_url)
 values
   (3711, '3.8.1-00', 1, '702,703', 0, 
    0, 'i', '239.196.205.102', 64001, 64, 
    1, 'http://10.196.205.20/myrio/vip2952.utc.install.3.0.7_6.dev', null, 0, '20160413104437625', 
    'amrit29', parsedatetime('4/13/2016 12:00:28.427000','MM/dd/yyyy hh:mm:ss.SS'), 'nareshk_1', 1, null, 
    null);
commit;




