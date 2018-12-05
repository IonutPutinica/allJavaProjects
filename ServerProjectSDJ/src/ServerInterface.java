import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote
{
   public String getPaidMembers();

   public String getUnpaidMembers();

   public String getMembers();

   public void setPaid(String cpr);

   public void setUnpaid(String cpr);

}
