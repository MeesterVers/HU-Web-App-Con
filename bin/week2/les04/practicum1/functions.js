function getTextAreaValue() {
	var textareaValue = document.getElementById("uniek_id").value;

	if (textareaValueOld != textareaValue) {
		textareaValueOld = textareaValue;
		console.log(textareaValue);
	}
	
}
var textareaValueOld = "";
setInterval(function(){
 getTextAreaValue();
}, 5000);
