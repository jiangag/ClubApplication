package sg.iss.team7clubapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="booking_detail")
	public class BookingDetail{

	@Id 
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="facility_id")
	private String facilityId;
	@Column(name="reserved_date")
	private LocalDate reservedDate;
	@Column(name="slot_number")
	private int slotNumber;
	private String status;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	public LocalDate getReservedDate() {
		return reservedDate;
	}
	public void setReservedDate(LocalDate reservedDate) {
		this.reservedDate = reservedDate;
	}
	public int getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	}


	
