package gr.hua.dit.springmvc1.entity;

import java.security.Principal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "aitisi")
public class Aitisi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "student_email")
	private String student_email;

	@Column(name = "eisodima")
	private float eisodima;

	@Column(name = "aderfia_spoudazoun")
	private int aderfia_spoudazoun;

	@Column(name = "anergoi_goneis")
	private int anergoi_goneis;

	@Column(name = "entopiotita")
	private int entopiotita;

	@Column(name = "eti_entos_estias")
	private int eti_entos_estias;

	@Column(name = "moria")
	private int moria;

	@Column(name = "katastasi")
	private String katastasi;

	public Aitisi() {
		// TODO Auto-generated constructor stub
	}

	public int getEntopiotita() {
		return entopiotita;
	}

	public void setEntopiotita(int entopiotita) {
		this.entopiotita = entopiotita;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public float getEisodima() {
		return eisodima;
	}

	public void setEisodima(float eisodima) {
		this.eisodima = eisodima;
	}

	public int getAderfia_spoudazoun() {
		return aderfia_spoudazoun;
	}

	public void setAderfia_spoudazoun(int aderfia_spoudazoun) {
		this.aderfia_spoudazoun = aderfia_spoudazoun;
	}

	public int getAnergoi_goneis() {
		return anergoi_goneis;
	}

	public int getEti_entos_estias() {
		return eti_entos_estias;
	}

	public void setEti_entos_estias(int eti_entos_estias) {
		this.eti_entos_estias = eti_entos_estias;
	}

	public void setAnergoi_goneis(int anergoi_goneis) {
		this.anergoi_goneis = anergoi_goneis;
	}

	public int getMoria() {
		return moria;
	}

	public void setMoria() {

		
		
		
		if (this.entopiotita < 50 || this.eti_entos_estias >= 4) {
				this.katastasi = "Απορρίπτεται";
				this.moria = 0;
			}else if (this.eisodima <= 0 && this.anergoi_goneis == 2){
				
					this.katastasi = "Εγκρίνεται";
					this.moria = 10000;
				}else {
					this.katastasi = "Υπό Εξέταση";
				}
				
			
				
		if (this.anergoi_goneis < 2 && this.entopiotita > 50 && this.eti_entos_estias < 4) {
			if (this.eisodima < 10000) {
				this.moria = 100 + (this.aderfia_spoudazoun * 2) + 50 - (this.eti_entos_estias * 10);

			} else {
				if (this.eisodima >= 10000 && this.eisodima <= 15000) {
					this.moria = 30 + (this.aderfia_spoudazoun * 2) + 50 - (this.eti_entos_estias * 10);
				} else {
					if (this.eisodima > 15000) {
						this.moria = (this.aderfia_spoudazoun * 2) + 50 - (this.eti_entos_estias * 10);
					}
				}
			}
			
		}
	}

	public String getKatastasi() {
		return katastasi;
	}

	public void setKatastasi(String katastasi) {
		this.katastasi = katastasi;
	}

}
