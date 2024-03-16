package vn.edu.greenwich.cw_1_sample.models;

import android.util.Log;

import java.io.Serializable;

public class Resident implements Serializable {
    protected long _id;
    protected String _name;
    protected String _destination;
    protected String _startDate;
    protected String _endDate;
    protected String _hotel;
    protected String _comment;
    protected int _owner;

    public Resident() {
        _id = -1;
        _name = null;
        _destination = null;
        _startDate = null;
        _endDate = null;
        _hotel = null;
        _comment = null;
        _owner = -1;
    }

    public Resident(long id, String name, String startDate, String endDate, int owner , String destination, String hotel, String comment) {
        _id = id;
        _name = name;
        _destination = destination;
        _startDate = startDate;
        _endDate = endDate;
        _hotel = hotel;
        _comment = comment;
        _owner = owner;
    }

    public long getId() { return _id; }
    public void setId(long id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }

    public String getDestination() {return _destination;}
    public void setDestination(String destination) {_destination = destination;}

    public String getHotel() {return _hotel;}
    public void setHotel(String hotel) {_hotel = hotel;}

    public String getComment() {return _comment;}
    public void setComment(String comment) {_comment = comment;}


    public String getStartDate() {
        return _startDate;
    }
    public void setStartDate(String startDate) {
        _startDate = startDate;
    }

    public String getEndDate() {
        return _endDate;
    }
    public void setEndDate(String endDate) {_endDate = endDate;
    }

    public int getOwner() {
        return _owner;
    }
    public void setOwner(int owner) {
        _owner = owner;
    }

    public boolean isEmpty() {
        if (-1 == _id && null == _name && null == _startDate && -1 == _owner)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "[" + _startDate + "] " + _name;
    }
}