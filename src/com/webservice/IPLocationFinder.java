package com.webservice;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			if(args.length !=1)
			{
             System.out.println("You need to pass one ip address");
             
	        }
			else
			{
				String ipAdress = args[0];
				 System.out.println(ipAdress);
				 GeoIPService ipService = new GeoIPService();
				GeoIPServiceSoap  geoIPServiceSoap = ipService.getGeoIPServiceSoap();
				
				//String location1String;
				//String location2String;
				
				//location1String = geoIPServiceSoap.getIpLocation20(ipAdress);
				//location2String = geoIPServiceSoap.getIpLocation(ipAdress);
				
				//System.out.println(location1String);
				//System.out.println(location2String);
				
				System.out.println(geoIPServiceSoap.getIpLocation(ipAdress));
				
				
			}

}
}
