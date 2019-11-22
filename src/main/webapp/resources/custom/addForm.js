function addForm() {
	var param = {
			
			surname:$("#isimsoyisim").val(),
			TcNo:$("#tcno").val(),
			adres:$("#adres").val(),
			email:$("#eposta").val(),
			telefon:$("#tel").val(),
			dogumtarihi:$("#dtarih").val(),
			soru1:$("#soru1").val(),
			soru2:$("#soru2").val(),
			soru3:$("#soru3").val(),
			soru4:$("#soru4").val(),
			soru5:$("#soru5").val()
			
	}
	
	var ser_data = JSON.stringify(param);
	
	$.ajax({
		type:"POST",
		contentType:'application/json; charset=UTF-8',
		url:'addForm',
		data:ser_data,
		succes:function(data){
			alert(data);
		},
		error:function(data){
			alert(data);
		}
	});
}


