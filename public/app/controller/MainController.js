Ext.define('playful.controller.MainController', {
    extend: 'Ext.app.Controller',
    requires:[
              'playful.view.MainView'
              ],
    config:{
    	view: 'playful.view.MainView'
    },
    initialize: function(){
    	this.callParent();
    }
    	
});