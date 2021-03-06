package ProjectoLobos.CTL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Vot")
public class Vot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
private int id =0;
@Column(name="sender")
private String sender;
@Type(type="numeric_boolean") 
@Column(name="Receiver")
private boolean receiver ;
@Column(name = "partida")
private Partida partida;
@Column(name = "torn")
private int torn=0;
public Vot() {
	super();
	// TODO Auto-generated constructor stub
}
public Vot(int id, String sender, boolean receiver, Partida partida, int torn) {
	super();
	this.id = id;
	this.sender = sender;
	this.receiver = receiver;
	this.partida = partida;
	this.torn = torn;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public boolean isReceiver() {
	return receiver;
}
public void setReceiver(boolean receiver) {
	this.receiver = receiver;
}
public Partida getPartida() {
	return partida;
}
public void setPartida(Partida partida) {
	this.partida = partida;
}
public int getTorn() {
	return torn;
}
public void setTorn(int torn) {
	this.torn = torn;
}


}
