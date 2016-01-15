/**
 * define array {key1:obj1,key2:obj2......};
 */

function Map(data) {
	this.keys = new Array();
	this.data = new Object();
	if (data != undefined) {
		this.data = data;
	}

	this.put = function(key, value) {
		if (this.data[key] == null) {
			this.keys.push(key);
		}
		this.data[key] = value;
	};

	this.get = function(key) {
		return this.data[key];
	};

	this.remove = function(key) {
		//this.keys.remove(key);
		this.data[key] = null;
		for (i in this.keys) {
			if (this.keys[i] == key) {
				this.keys.splice(i, 1);
				break;
			}
		}
		delete this.data[key];
	};
	this.each = function(fn) {
		if ( typeof fn != 'function') {
			return;
		}
		var len = this.keys.length;
		for (var i = 0; i < len; i++) {
			var k = this.keys[i];
			fn(k, this.data[k], i);
		}
	};

	this.entrys = function() {
		var len = this.keys.length;
		var entrys = new Array(len);
		for (var i = 0; i < len; i++) {
			entrys[i] = {
				key : this.keys[i],
				value : this.data[i]
			};
		}
		return entrys;
	};

	this.isEmpty = function() {
		return this.keys.length == 0;
	};

	this.size = function() {
		return this.keys.length;
	};
	this.toJson = function() {
		var json =new Array();
		for ( i = 0; i < this.keys.length; i++) {
			var key = this.keys[i];
			var obj;
			obj = {
				"key" : this.keys[i],
				"value" : this.data[key]
			};
			json[i] = obj;
		}
		return json;
	}
}