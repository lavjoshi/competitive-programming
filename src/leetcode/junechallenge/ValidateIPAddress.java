package leetcode.junechallenge;

public class ValidateIPAddress {

    public static void main(String args[]){
//        System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
        System.out.println(validIPAddress("15.16.-0.1"));
//        System.out.println(validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
//        System.out.println(validIPAddress("172.16.254.1"));
//        System.out.println(validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    public static String validIPAddress(String IP) {

        String ipv4[] = IP.split("\\.");
        String ipv6[] = IP.split(":");
        if(ipv4.length != 4 && ipv6.length != 8){
            return "Neither";
        }
        if(IP.endsWith(":") || IP.endsWith(".")){
            return "Neither";
        }
        Boolean isV4 = false;
        if(ipv4.length ==4 ){
            isV4 = true;
            for(String s : ipv4){
                try{
                    if(s.isEmpty() || s.length() >4){
                        isV4 = false;
                        break;
                    }
                    if(s.charAt(0) == '0' && s.length() >1){
                        isV4 = false;
                        break;
                    }
                    for(Character c : s.toCharArray()){
                        if(!Character.isDigit(c)){
                            isV4 = false;
                            break;
                        }
                    }
                    int i = Integer.parseInt(s);
                    if(i >=256){
                        isV4 = false;
                        break;
                    }
                }catch(Exception e){
                    isV4 = false;
                    break;
                }
            }
        }
        Boolean isv6 = false;
        if(ipv6.length ==8 ){
            isv6 = true;
            for(String s : ipv6){
                try{
                   if(s.isEmpty() || s.length() > 4){
                       isv6 = false;
                       break;
                   }
                   for(Character c : s.toCharArray()){
                        if(!((c >='0' && c<='9') || (c >='a' && c<='f') || (c >='A' && c<='F'))){
                            isv6 = false;
                            break;
                        }
                   }


                }catch(Exception e){
                    isv6 = false;
                    break;
                }
            }
        }
        if( isV4){
            return "IPv4";
        }else if(isv6){
            return "IPv6";

        }else{
            return "Neither";
        }
    }
}
