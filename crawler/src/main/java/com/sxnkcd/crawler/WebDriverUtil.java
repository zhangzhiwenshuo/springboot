package com.sxnkcd.crawler;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class WebDriverUtil {
    /**
     * 设置页面下载路径
     * @param downloadpath 传入的下载路径 例如"/tmp/MuAgent"
     * @return cap =》 调用者: ChromeDriver driver = new ChromeDriver(cap);
     */
    public static DesiredCapabilities setDownloadPath(String downloadpath) {
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadpath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("start-maximized");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return cap;
    }
}
