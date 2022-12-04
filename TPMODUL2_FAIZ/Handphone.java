public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override

    public void informasi(){
        if (this.fingerprint == true){
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesaar %d GB dan processor secepat %.2f Ghz. Selain itu handphone ini juga memiliki Fingerprint", drive, ram, processor);
        } else {
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesaar %d GB dan processor secepat %.2f Ghz. Selain itu handphone ini TIDAK memiliki Fingerprint", drive, ram, processor);
        }
    }

    public void telfon(int no_hp){
        System.out.printf("%nHandphone berhasil menyambungkan telfon ke No %s",no_hp);
    }
    
    public void kirimSMS(int no_hp){
        System.out.printf("%nHandphone berhasil mengirim SMS ke No %s",no_hp);
    }

    public void kirimSMS(int no_hp, int no_hpp){
        System.out.printf("%nHandphone berhasil mengirim SMS ke No %s dan %s",no_hp, no_hpp);
    }
}