var Car = function (prize, nameTag, dateAddCar, yearCar, kmCar){
	this.prize = prize;
	this.nameTag = nameTag;
	this.dateAddCar = dateAddCar;
	this.yearCar = yearCar;
	this.kmCar = kmCar;
	}
	
	
Car.prototype.validateForm = function() {
if (this.prize == "" || this.nameTag == "" || this.dateAddCar == "" || yearCar == "" || this.kmCar == "")
	{
	return false;
	}
return true;
  
};
