public class Properties
{
    private String url = null;
    private String login = null;
    private String password = null;
    private String wronglogin = null;
    private String browser = null;
    private String name = null;

    private String googleLogin = null;
    private String googlePassword = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type = null;

    public Properties(String url, String login, String password, String wronglogin, String browser, String name, String type) {
        this.url = url;
        this.login = login;
        this.password = password;
        this.wronglogin = wronglogin;
        this.browser = browser;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWronglogin() {
        return wronglogin;
    }

    public void setWronglogin(String wronglogin) {
        this.wronglogin = wronglogin;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getGooglePassword() {
        return googlePassword;
    }

    public void setGooglePassword(String googlePassword) {
        this.googlePassword = googlePassword;
    }

    public String getGoogleLogin() {
        return googleLogin;
    }

    public void setGoogleLogin(String googleLogin) {
        this.googleLogin = googleLogin;
    }
}
