package testing1;

import java.util.StringTokenizer;

public class Splitting {
	
	public static void main(String[] args) {
  /* String[] str = "approvedRequestsForCam,fromDate=2018-08-01,toDate=2018-08-14".split(",");
   System.out.println(str[0]);
   String[] fDate = str[1].split("=");
   System.out.println(fDate[0]+" is "+fDate[1]);
   String[] tDate = str[2].split("=");
   System.out.println(tDate[0]+" is "+tDate[1]);*/
//		String s =" AND vendor.name LIKE '%sag%' AND item.name LIKE '%giv%' AND indentNumber LIKE '%jai%' AND indentNumber LIKE '%jai%' AND indentNumber LIKE '%jai%'"; 
	//	String[] str = "AND vendor LIKE '%dina%'".split(" ");
//		System.out.println(str[0]);
		/*StringTokenizer strss = new StringTokenizer(s,"AND");
		while(strss.hasMoreElements()) {
			System.out.println(strss.nextElement());
		}*/
//		String[] sss = s.split("AND");
//		String r = "";
//		for(String ss:sss) {
//			if(!ss.trim().equalsIgnoreCase(""))
//			r=r+" AND a.mcmTransaction."+ss.trim();
//		}
//		System.out.println(r);
		/*System.out.println(str[1] + " " + str[2]+" " + str[3]);
		System.out.println(str[2]);
		System.out.println(str[3]);*/
		Splitting splitting = new Splitting();
		System.out.println(splitting.getVersionNumber("1.1.15"));
		
	}
	
	public String getVersionNumber(String version) {
		try {
			if (version != null && !version.equalsIgnoreCase("")) {
				String[] versionSplit = version.split("\\.");
				Long versionNoAfterSplit = Long.parseLong(versionSplit[2]);
				if (!versionNoAfterSplit.equals("")) {
					versionNoAfterSplit++;
				}
				System.out.println("versionNoAfterSplit ::: "+versionNoAfterSplit);
				return versionSplit[0].concat(".").concat(versionSplit[1]).concat(".").concat(versionNoAfterSplit.toString());

			} else {
				return "1.1.0";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return version;
		}
	}
	
}
