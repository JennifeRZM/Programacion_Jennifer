public class CONTRASEA {

    private String Logitud;
    private String Contrasea;

    public String getLogitud() {
        return Logitud;
    }

    public String getContrasea() {
        return Contrasea;
    }

    public void setLogitud(String Logitud) {
        this.Logitud = Logitud;
    }

    public void setContrasea(String Contrasea) {
        this.Contrasea = Contrasea;
    }

    public boolean Medir() {
      return Contrasea.length()>=8;
    }

    int m = 0;
    int y = 0;
    int num = 0;

    public boolean isStrong() {

        for (int i = 0; i <= Contrasea.length()-1; i++) {
            boolean p = Character.isUpperCase(Contrasea.charAt(i));
            if (p == true) {
                y = y + 1;
            } else {

            }
        }
        for (int i = 0; i <= Contrasea.length()-1; i++) {
            boolean pl = Character.isLowerCase(Contrasea.charAt(i));
            if (pl == true) {
                m = m + 1;
            } else {

            }
        }
        for (int i = 0; i <= Contrasea.length()-1; i++) {
              try{
                  Integer.parseInt(Contrasea.substring(i, i+1));
                  num = num + 1;

              }catch(Exception e){
              }

        }


        if (Medir() == true) {
            if (y >= 2) {
                if (m >= 1) {
                        if(num >= 5){
                            return true;
                        }else{
                            return false;
                        }
                } else {
                   return false;

                }
            } else {
                return false;

            }



        } else {
           return false;
        }

    }
}
