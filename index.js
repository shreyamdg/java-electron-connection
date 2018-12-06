const ipc = require('electron').ipcRenderer;
var java = require("java");

ipc.send('ini', document.getElementById('screen').innerHTML);

document.getElementById('toggle').onclick = function() {
  ipc.send('names', document.getElementById('screen').innerHTML);
}

document.getElementById('addname').onclick = function() {
  console.log(document.getElementById('textname').value);
  ipc.send('addnames', document.getElementById('textname').value);
}

ipc.on('updateResult', function(event, data){
  document.getElementById('screen').innerHTML = data;
});
