public class Main {
    public static void main(String[]args)
    {
        WebHelper helper = WebHelper.getInstance();

        System.out.println("Prima accesare (va descărca pagina):");
        System.out.println(helper.getWebSiteContent());

        System.out.println("A doua accesare (folosește conținutul memorat):");
        System.out.println(helper.getWebSiteContent());
    }
}
