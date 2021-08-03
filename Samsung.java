class Samsung implements Mobile {
    public String unlock(){
        return "Samsung: Unlocked";
    }
    public String call(String mobileNumber){
        return "Samsung: calling "+mobileNumber;
    }
    public String openApp(String openApp){
        return "Samsung: opening "+openApp;
    }
}
/*
 * TODO 2: Implement Mobile interface and provide implementation to the Mobile
 * interface methods such that they return the following output. (without double quotes).
 * 		unlock(): String => "Samsung: Unlocked"
 * 		call(mobileNumber: String): String => "Samsung: calling <mobileNumber>"
 * 		openApp(appName: String): String => "Samsung: opening <appName>"
 *
 * 		For example:
 * 		Samsung: Unlocked
 * 		Samsung: calling 1234567890
 * 		Samsung: opening Gallery
 */
