package cn.wwn.demo;

public class AlipayConfig {
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数
    public static String return_url = "http://localhost:8888/success.jsp";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8888/notify";
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900624905";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl"
    		+ "hZKWYouHznxYfJvzW/caacuv2vN6XPUz1R/EUTE+i9NeNPsjMdt8FjLiRlgR/DP/HKeDv5khS8jxsZmlgVDEYdCKGArl"
    		+ "tuWhnEUynWQhu+ABcLSTRv02CpzJoK35hyx/JHoSavnb3WcpHE8KAhEvYH3WJbKMDdIko3hgIpGsFOeH7Z/cFJU7f4W8b6"
    		+ "6aVdvDmO56IIbr6SXegXsgXo4gToDfPgPcD+2rnxgZrkZCmBmZbbfoz7+viCcvR6Nmq+MEIgILQeeKhf9BMhZ8KPLAQORZa9KfPvYCFluHiK5/qEZfBSiX0nnOlEWUhqzrw3irzSRuOTa4vE1eskC2VwIgQIDAQAB";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEugIBADANBgkqhkiG9w0BAQEFAASCBKQwggSgAgEAAoIBAQCWFkpZii4fO"
    		+ "fFh8m/Nb9xppy6/a83pc9TPVH8RRMT6L0140+yMx23wWMuJGWBH8M/8cp4O/mSFLyPGxmaWBUMRh0IoYCuW25aGcRTKdZCG74"
    		+ "AFwtJNG/TYKnMmgrfmHLH8kehJq+dvdZykcTwoCES9gfdYlsowN0iSjeGAikawU54ftn9wUlTt/hbxvrppV28OY7noghuvpJd6Be"
    		+ "yBejiBOgN8+A9wP7aufGBmuRkKYGZltt+jPv6+IJy9Ho2ar4wQiAgtB54qF/0EyFnwo8sBA5Flr0p8+9gIWW4eIrn+oRl8FKJfSec6"
    		+ "URZSGrOvDeKvNJG45Nri8TV6yQLZXAiBAgMBAAECggEAXuJIrsLE1cjz6VAzjlUhq0meLDYjP2uTJl/s1SX8wY4WFEUmTvnlbwUz58C7"
    		+ "Nb/wPVDYy/HX6rsaixfy0vUQqYwxLwVdiUnZp7Tlx/j7HdNbxEieW1FJQT/U/Iu3ZyrM+zfi+nBLKBPaq7tKpKRVkNkRXlg2CrVok/5Oic"
    		+ "zhU6cQk+vwRsdUz7l+RNZ1BelBr2OprscoiUp9pWN4hkxvBUwoCFVW4UtO+2we32vnxWsh14Gzf6ddDprMoYfb91rwqR8JF0FnlNFPc6txIT"
    		+ "qcZxrjQNs9QstbWcxv1OzFS+XWP+Vcmo5iEhRVlGKFmKhOEYpXvG03MO1GcDAJbF8AAQKBgQDVryXf2qsuyOWytemWbVNs9FjOqf+XhdNQ4bDM"
    		+ "kFdZoGU6LysftIdBFaUbDhyWzdbF9tVxCHD+W4WJURa7rgbCDP7k/BZo1qNK6xKj1CJwM3+SS/XdY7N51fNdWm6opcgdiHCE7BWXEskfOxm1RX"
    		+ "zMUEvb6Wnougi4jplfMoRAgQKBgQCzzwxFtA4XH7fEfCloayVTqGsnPNLxmXZH7i+rX8e8z1zV1NxQbXVuF2m4DVxzsh1US0TRaF411P0TiyTZ4"
    		+ "zmSFTvQjdsev06078ZjofG5gDX7EtA5p2Qox7quJHWsQf3L610nlXDvg+B/RCIZlFZF6U/DwefeQDYyTGMWGvPIAQJ/Iw6ZKCC39PUAulEeAY/uH"
    		+ "/H2n/FD/Zf3E03zs5v6uLmX4fPbH1h+2C6057to9VTP56qXWfQIlbJuNhkXobLraOq45th01L5iC+iFJlunSsEoLNhJfgjdaR+wzaAIh6KrMi0wSJ"
    		+ "5y7FYoqPcJQLQlxV9nEq04svXSeHTstLGVAQKBgEHKxMbMd0tmw6sVc2FNsz7FJVAaJWVZrbnsIW0ngsJHbcSgOm0DYDCESJ6b5PRAfBLX57pn4fD"
    		+ "4mhGInFdNmUcmldhdz4uUnIwAICtcmkIx846G98HgyflR+7C0jooVK3RuDovpVoWNT5vBpmiNqnOyRwlt7hWYkTweTzNLcWABAoGAY0CgX/5UqzNp"
    		+ "i+VN6GBtzJcrCRYpKFhFLt5YJ9Uj8ckcLDTEMFuelWdv6bGaITFcE7aeR1wyo4CjVWsFR+7JisgwEs1P6i0b6+eFPdLovEhOkTHg6ChoczqY72TTE2"
    		+ "7emOwottkT7oKlcJAQbb4oo+FDZrrfd1xX+i9ysq9iI7s=";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}