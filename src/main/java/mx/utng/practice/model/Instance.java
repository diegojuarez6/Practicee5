package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="instances")
public class Instance {

	@Id @GeneratedValue
	private Long id;
	@Column(length =50)
	private String releaseName;
	@Column(length =20)
	private String releaseType;
	@Column(length =20)
	private String releaseNotes;
	
	public Instance(String releaseName, String releaseType, String releaseNotes) {
		super();
		this.releaseName = releaseName;
		this.releaseType = releaseType;
		this.releaseNotes = releaseNotes;
	}
	
	public Instance() {
		this("","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}

	public String getReleaseType() {
		return releaseType;
	}

	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	public String getReleaseNotes() {
		return releaseNotes;
	}

	public void setReleaseNotes(String releaseNotes) {
		this.releaseNotes = releaseNotes;
	}

	@Override
	public String toString() {
		return "Instance [id=" + id + ", releaseName=" + releaseName + ", releaseType=" + releaseType
				+ ", releaseNotes=" + releaseNotes + "]";
	}
	
}
