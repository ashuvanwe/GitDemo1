package one.to.one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accountplus 
{
	@Id
private int acpid;
private String addr;


public int getAcpid() {
	return acpid;
}
public void setAcpid(int acpid) {
	this.acpid = acpid;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
}
