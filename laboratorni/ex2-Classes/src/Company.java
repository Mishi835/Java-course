import java.util.Scanner;

public class Company{
        private String companyName;
        private String establishmentdate ;
        private String bulstat;
        public Company(String companyName,String establishmentdate,String bulstat){
            this.companyName=companyName;
            this.establishmentdate=establishmentdate;
            this.bulstat=bulstat;
            setBulstat(bulstat);
        }
        public String getCompanyName(){
            return this.companyName;
        }
        public void setCompanyName(String companyName){
            this.companyName=companyName;
        }
        public String getEstablishmentdate(){
            return this.establishmentdate;
        }
        public void setEstablishmentdate(String date){
            this.establishmentdate=date;
        }
        public String getBulstat(){
            return this.bulstat;
        }
        public void setBulstat(String bulstat){
            if(bulstat.length()!=10){
                throw new IllegalArgumentException("The bulstat has to be 10 symbols");
            }
                this.bulstat=bulstat;

        }
    static class FirmaET extends Company{
        private String ownerName;
        private double firstCapital;
        private double actualcapital;

        public FirmaET(String companyName, String establishmentDatem, String bulstat, String ownerName, double firstCapital, double actualcapital){
            super(companyName,establishmentDatem,bulstat);
            this.ownerName=ownerName;
            this.firstCapital=firstCapital;
            this.actualcapital=actualcapital;
        }
        public String getOwnerName() {
            return ownerName;
        }

        public double getFirstCapital() {
            return firstCapital;
        }

        public double getActualcapital() {
            return actualcapital;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public void setFirstCapital(double firstCapital) {
            this.firstCapital = firstCapital;
        }

        public void setActualcapital(double actualcapital) {
            this.actualcapital = actualcapital;
        }
        public double calculateCapital(){
            double capital=this.actualcapital-this.firstCapital;
            return capital;
        }
    }

}
