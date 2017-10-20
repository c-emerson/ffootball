package fantasy;

import java.net.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.MatchResult;

import javax.swing.text.Position;

import fantasy.Player_Interface.position;

import java.io.*;
import java.lang.reflect.Array;

public class URLReader {
	public static void main(Team team) {
		
		String inputLine = "\r\n" + 
				"<!DOCTYPE html>\r\n" + 
				"<html id=\"Stencil\" class=\"NoJs template-html5 Sticky-off Desktop\" lang=\"en-US\" xmlns:fb=\"https://www.facebook.com/2008/fbml\">\r\n" + 
				"	<head>\r\n" + 
				"        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EDGE\" />\r\n" + 
				"    <link rel=\"canonical\" href=\"https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=2\" />\r\n" + 
				"    <link rel=\"dns-prefetch\" href=\"https://s.yimg.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//csc.beap.bc.yahoo.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//geo.query.yahoo.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//y.analytics.yahoo.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//b.scorecardresearch.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//l.yimg.com\" />\r\n" + 
				"    <!-- IMPORTANT: DON'T PUT ANYTHING THAT DOES STUFF (scripts, stylesheets, etc.) BEFORE THIS META TAG -->\r\n" + 
				"    <script>\r\n" + 
				"    (function(html){\r\n" + 
				"        var c = html.className;\r\n" + 
				"        c += \" JsEnabled\";\r\n" + 
				"        c = c.replace(\"NoJs\",\"\");\r\n" + 
				"        html.className = c;\r\n" + 
				"    })(document.documentElement);\r\n" + 
				"    </script>\r\n" + 
				"		<title>SZYFG1 - The Jirky Boys | Fantasy Football | Yahoo! Sports</title>\r\n" + 
				"    <meta name=\"apple-mobile-web-app-title\" content=\"Y! Fantasy\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_57x57.jpg?v=1\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_72x72.jpg?v=1\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_114x114.jpg?v=1\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_144x144.jpg?v=1\" />\r\n" + 
				"<link href=\"https://s.yimg.com/zz/combo?kx/yucs/uh3s/atomic/88/css/atomic-min.css&kx/yucs/uh_common/meta/3/css/meta-min.css&kx/yucs/uh3s/uh/410/css/uh-gs-grid-min.css&os/stencil/3.0.0-alpha7/desktop/styles-ltr.css\" type=\"text/css\" rel=\"stylesheet\" /><link href=\"https://sp.yimg.com/ua/assets/eJxdkVuTojAUhH-RGfCCWvsks-Dg4CguXl9SIQSM5MIkQcVfvwi7Uzv7lsrX6dPpg7V-0YYITFkvQZoAt7_sHyczncdlPvuBG1xXVBFNDICkvNflnK_9-aZuUYlyAlK56ZE0dSyYroP2mmIpQJTdQzSMguI8H3ZGulTUEIilIuDtnrsHDwdys3z3W2qkZIaW4ObaK2pXNJwFdNUSJChHhjaeGvOPdGqdRrnN3T-jqMivfVB7r4EwF3ZYO_uiy8ZQTZSQzcQSGXwG42Rl7aw4CXM2cb9ywi4VGJjoXnxuR3kKtddS_nxVlSDaYv9ozIDDh6paIqTQ6BnMSE4fRHUHDLjtO9aBO_3B57BrgsuUQJJSA7Y9ac-mRXbk1fXS1fEsIpFIpeBtnXyG8QrdoKiHLUwVygxMkSGG8uYHFBdEATy6hOu9DQtr6olWhyvdzIaGII6fTiQmM7pBFFe7JP9XoWSzZgWu-ykbB2VmDr3ttuVZxdiLyNhfYZYxcLr81N5ioZwoYl2bV5oSCZ-dMqoN8Ecujx819noVsr7b6FIqA__TH3eTgb2MAzMNXmW37jOHWsgbEGM_vksT_louwuV3q1bT2rXK64dI4PsQnxYPZ_RlYmQtDQLHiPSXQrK4ih_oNwYaB3g,.css?z&m\" type=\"text/css\" rel=\"stylesheet\" /><style type=\"text/css\" id=\"css-all\">\r\n" + 
				".ysf-medal{\r\n" + 
				"    width:280px;\r\n" + 
				"    background-color:#292929;\r\n" + 
				"    -moz-opacity: 0.8;\r\n" + 
				"    opacity:.80;\r\n" + 
				"    filter:alpha(opacity=80);\r\n" + 
				"    border-radius: 40px 10px 10px 40px;\r\n" + 
				"    position:fixed;\r\n" + 
				"    bottom:20px;\r\n" + 
				"    left:10%;\r\n" + 
				"    right:10%;\r\n" + 
				"    margin:0 auto;\r\n" + 
				"    z-index:2000;\r\n" + 
				"    *display:none;\r\n" + 
				"    -webkit-font-smoothing: antialiased;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".no-autorun .ysf-medal {\r\n" + 
				"    -moz-opacity: 0.85;\r\n" + 
				"    opacity:.85;\r\n" + 
				"    filter:alpha(opacity=85);\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".ysf-medal .hd h3{\r\n" + 
				"    text-indent:-999em;\r\n" + 
				"    height:5px;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd{\r\n" + 
				"    background-repeat:no-repeat;\r\n" + 
				"    padding-left:90px;\r\n" + 
				"    margin-left:5px;\r\n" + 
				"    height:76px;\r\n" + 
				"    color:#fff;\r\n" + 
				"    text-align:left;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd a.view{\r\n" + 
				"    color:#fff;\r\n" + 
				"    font-weight:bold;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd a.close{\r\n" + 
				"    float:right;\r\n" + 
				"    display:none;\r\n" + 
				"    text-indent:-999em;\r\n" + 
				"    background-image:url(https://s.yimg.com/dh/ap/us/sp/fn/default/circle_close.png);\r\n" + 
				"    width:22px;\r\n" + 
				"    height:22px;\r\n" + 
				"    position:relative;\r\n" + 
				"    top: -70px;\r\n" + 
				"    left: 10px;\r\n" + 
				"}\r\n" + 
				".no-autorun .ysf-medal .bd a.close {\r\n" + 
				"    display:inline;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".ysf-medal .bd .desc{\r\n" + 
				"    padding-top:11px;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd .desc strong{\r\n" + 
				"    font-weight:bold;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd .remaining{\r\n" + 
				"    font-size:11px;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				".ysf-medal .ft{\r\n" + 
				"    height:5px;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"</style><!--[if lte IE 8]>\r\n" + 
				"<script type=\"text/javascript\" src=\"https://s.yimg.com/zz/combo?yui-s:3.18.1/build/yui/yui-min.js&yui-s:3.18.1/build/oop/oop-min.js&yui-s:3.18.1/build/event-custom-base/event-custom-base-min.js&yui-s:3.18.1/build/event-base/event-base-min.js&yui-s:3.18.1/build/event-custom-complex/event-custom-complex-min.js&yui-s:3.18.1/build/attribute-core/attribute-core-min.js&yui-s:3.18.1/build/attribute-observable/attribute-observable-min.js&yui-s:3.18.1/build/attribute-extras/attribute-extras-min.js&yui-s:3.18.1/build/attribute-base/attribute-base-min.js&yui-s:3.18.1/build/base-core/base-core-min.js&yui-s:3.18.1/build/base-base/base-base-min.js&yui-s:3.18.1/build/base-build/base-build-min.js&yui-s:3.18.1/build/base-observable/base-observable-min.js&yui-s:3.18.1/build/pluginhost-base/pluginhost-base-min.js&yui-s:3.18.1/build/pluginhost-config/pluginhost-config-min.js&yui-s:3.18.1/build/dump/dump-min.js&ss/rapid-3.42.2.js&os/mit/td/asset-loader-s-65445b17.js&aj/lh-0.9.js&os/mit/media/p/content/content-aft-min-8acb8a6.js\"></script>\r\n" + 
				"<![endif]-->\r\n" + 
				"<!--[if gt IE 8]><!-->\r\n" + 
				"<script type=\"text/javascript\" src=\"https://s.yimg.com/zz/combo?yui-s:3.18.1/build/yui/yui-min.js&yui-s:3.18.1/build/oop/oop-min.js&yui-s:3.18.1/build/event-custom-base/event-custom-base-min.js&yui-s:3.18.1/build/event-base/event-base-min.js&yui-s:3.18.1/build/event-custom-complex/event-custom-complex-min.js&yui-s:3.18.1/build/attribute-core/attribute-core-min.js&yui-s:3.18.1/build/attribute-observable/attribute-observable-min.js&yui-s:3.18.1/build/attribute-extras/attribute-extras-min.js&yui-s:3.18.1/build/attribute-base/attribute-base-min.js&yui-s:3.18.1/build/base-core/base-core-min.js&yui-s:3.18.1/build/base-base/base-base-min.js&yui-s:3.18.1/build/base-build/base-build-min.js&yui-s:3.18.1/build/base-observable/base-observable-min.js&yui-s:3.18.1/build/pluginhost-base/pluginhost-base-min.js&yui-s:3.18.1/build/pluginhost-config/pluginhost-config-min.js&yui-s:3.18.1/build/dump/dump-min.js&ss/rapid-3.42.2.js&os/mit/td/asset-loader-s-65445b17.js&aj/lh-0.9.js&os/mit/media/p/content/content-aft-min-8acb8a6.js&yui-s:3.18.1/build/dom-core/dom-core-min.js&yui-s:3.18.1/build/dom-base/dom-base-min.js&yui-s:3.18.1/build/selector-native/selector-native-min.js&yui-s:3.18.1/build/selector/selector-min.js&yui-s:3.18.1/build/selector-css2/selector-css2-min.js&yui-s:3.18.1/build/selector-css3/selector-css3-min.js&yui-s:3.18.1/build/node-core/node-core-min.js&yui-s:3.18.1/build/node-base/node-base-min.js&yui-s:3.18.1/build/event-delegate/event-delegate-min.js&yui-s:3.18.1/build/event-synthetic/event-synthetic-min.js&yui-s:3.18.1/build/event-mousewheel/event-mousewheel-min.js&yui-s:3.18.1/build/event-mouseenter/event-mouseenter-min.js&yui-s:3.18.1/build/event-key/event-key-min.js&yui-s:3.18.1/build/event-focus/event-focus-min.js&yui-s:3.18.1/build/event-resize/event-resize-min.js&yui-s:3.18.1/build/event-hover/event-hover-min.js&yui-s:3.18.1/build/event-outside/event-outside-min.js&yui-s:3.18.1/build/event-touch/event-touch-min.js&yui-s:3.18.1/build/event-move/event-move-min.js&yui-s:3.18.1/build/event-flick/event-flick-min.js&yui-s:3.18.1/build/event-valuechange/event-valuechange-min.js&yui-s:3.18.1/build/event-tap/event-tap-min.js&yui-s:3.18.1/build/node-event-delegate/node-event-delegate-min.js&yui-s:3.18.1/build/node-pluginhost/node-pluginhost-min.js&yui-s:3.18.1/build/color-base/color-base-min.js&yui-s:3.18.1/build/dom-style/dom-style-min.js&yui-s:3.18.1/build/dom-screen/dom-screen-min.js&yui-s:3.18.1/build/node-screen/node-screen-min.js&yui-s:3.18.1/build/node-style/node-style-min.js&yui-s:3.18.1/build/querystring-stringify-simple/querystring-stringify-simple-min.js&yui-s:3.18.1/build/querystring-parse-simple/querystring-parse-simple-min.js&yui-s:3.18.1/build/io-base/io-base-min.js&yui-s:3.18.1/build/datatype-xml-parse/datatype-xml-parse-min.js&yui-s:3.18.1/build/io-xdr/io-xdr-min.js&yui-s:3.18.1/build/io-form/io-form-min.js&yui-s:3.18.1/build/io-upload-iframe/io-upload-iframe-min.js&yui-s:3.18.1/build/queue-promote/queue-promote-min.js&yui-s:3.18.1/build/io-queue/io-queue-min.js&yui-s:3.18.1/build/base-pluginhost/base-pluginhost-min.js&yui-s:3.18.1/build/json-parse/json-parse-min.js\"></script>\r\n" + 
				"<!--<![endif]-->\r\n" + 
				"<script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\"><!--\r\n" + 
				"// just to make sure YAHOO.namespace works, which allows us some flexibility.\r\n" + 
				"var YSF, YFB, YMedia;\r\n" + 
				"if(typeof YAHOO==\"undefined\"||!YAHOO){var YAHOO={};}\r\n" + 
				"YAHOO.namespace=function(){var b=arguments,g=null,e,c,f;for(e=0;e<b.length;e=e+1){f=(\"\"+b[e]).split(\".\");g=YAHOO;for(c=(f[0]==\"YAHOO\")?1:0;c<f.length;c=c+1){g[f[c]]=g[f[c]]||{};g=g[f[c]];}}return g;};\r\n" + 
				"(function() {\r\n" + 
				"YAHOO.namespace(\"YAHOO.Sports\");\r\n" + 
				"\r\n" + 
				"YAHOO.Sports.PlayerNoteConfig = {\r\n" + 
				"    cfg: {\r\n" + 
				"        player_notes_tabs_comscore: true,\r\n" + 
				"        player_notes_tabs_ads: true,\r\n" + 
				"        player_notes_xfbml: true,\r\n" + 
				"        player_notes_FB: true    },\r\n" + 
				"    is_enabled: function(feature) {\r\n" + 
				"\r\n" + 
				"        if (this.cfg[feature] !== 'undefined') {\r\n" + 
				"            return this.cfg[feature];\r\n" + 
				"        }\r\n" + 
				"        return false;\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"}());\r\n" + 
				"\r\n" + 
				"YUI.namespace('Fantasy');\r\n" + 
				"\r\n" + 
				"YUI.YUICfg = {\r\n" + 
				"    \r\n" + 
				"                'combine' : true,\r\n" + 
				"                'base' : 'https://s.yimg.com/',\r\n" + 
				"                'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                'root' : 'yui-s:3.18.1/build/',\r\n" + 
				"                'comboSep' : '&',\r\n" + 
				"                'filter': {\r\n" + 
				"                    'searchExp':';',\r\n" + 
				"                    'replaceStr': '&'\r\n" + 
				"                },    'groups' : {\r\n" + 
				"\r\n" + 
				"        'ysf-yui2' : {\r\n" + 
				"            'combine' : true,\r\n" + 
				"            'base' : 'https://s.yimg.com/d/lib/yui/',\r\n" + 
				"            'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"            'root' : '/d/lib/yui/2.9.0/build/',\r\n" + 
				"            'comboSep': '&',\r\n" + 
				"            'modules' :  {\r\n" + 
				"                'ysf-yui2-charts': {\r\n" + 
				"                    path: \"charts/charts.js\",\r\n" + 
				"                    requires: ['ysf-yui2-yde', 'ysf-yui2-element', 'ysf-yui2-datasource', 'ysf-yui2-json', 'ysf-yui2-swf']\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-datasource' : {\r\n" + 
				"                    path: \"datasource/datasource.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-carousel': {\r\n" + 
				"                    path: \"carousel/carousel.js\",\r\n" + 
				"                    requires: ['ysf-yui2-yde', 'ysf-yui2-element']\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-animation': {\r\n" + 
				"                    path: \"animation/animation.js\",\r\n" + 
				"                    requires: ['ysf-yui2-yde']\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-element': {\r\n" + 
				"                    path: \"element/element.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-json': {\r\n" + 
				"                    path: \"json/json.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-swf': {\r\n" + 
				"                    path: \"swf/swf.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-yde': {\r\n" + 
				"                    path: \"yahoo-dom-event/yahoo-dom-event.js\"\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        'ysf' : {\r\n" + 
				"            'combine' : true,\r\n" + 
				"            'base' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'comboBase' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'root' : '',\r\n" + 
				"            'comboSep': ';',\r\n" + 
				"            'filter': {\r\n" + 
				"                'searchExp':\"\\\\.(js|css)[\\\\?\\\\&a-zA-Z0-9]*;\",\r\n" + 
				"                'replaceStr': \";\"\r\n" + 
				"            },\r\n" + 
				"            'modules': {\"ysf-xhr\":{\"path\":\"js\\/ysf-xhr.TjPB8xMDyXDGa.js?m\",\"requires\":[\"io-base\",\"io-form\",\"base\",\"node\",\"json-parse\",\"querystring-stringify-simple\",\"querystring-parse-simple\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-xhr.TjPB8xMDyXDGa.js?m\"},\"yfa-module\":{\"path\":\"js\\/yfa-module.Uap008-a90vqf.js?m\",\"requires\":[\"ysf-xhr\",\"node\",\"node-event-delegate\",\"selector-css3\",\"base\",\"ysf-flyout-select\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/yfa-module.Uap008-a90vqf.js?m\"},\"ysf-formenhancer\":{\"path\":\"js\\/ysf-formenhancer.NRy-3PKlWLfNw.js?m\",\"requires\":[\"event\",\"event-custom\",\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-formenhancer.NRy-3PKlWLfNw.js?m\"},\"ysf-initlinks\":{\"path\":\"js\\/ysf-initlinks.AvRvJo2Qg8CvI.js?m\",\"requires\":[\"node\",\"event\",\"ysf-watchlist\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-initlinks.AvRvJo2Qg8CvI.js?m\"},\"ysf-watchlist\":{\"path\":\"js\\/ysf-watchlist.JRrVyG0sumYWR.js?m\",\"requires\":[\"ysf-xhr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-watchlist.JRrVyG0sumYWR.js?m\"},\"ysf-activeform\":{\"path\":\"js\\/ysf-activeform.CJVtzbyJse3Dm.js?m\",\"requires\":[\"node\",\"event\",\"base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-activeform.CJVtzbyJse3Dm.js?m\"},\"ysf-bracket-manager\":{\"path\":\"js\\/ysf-bracket-manager.3sTP1-8P7EwCg.js?m\",\"requires\":[\"dd-drag\",\"dd-drop\",\"dd-delegate\",\"dd-proxy\",\"base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-bracket-manager.3sTP1-8P7EwCg.js?m\"},\"ysf-overlay\":{\"path\":\"js\\/ysf-overlay.94W6yWx4S7Hz5.js?m\",\"requires\":[\"event-custom\",\"node\",\"event\",\"overlay\",\"widget-anim\",\"gallery-overlay-extras\",\"gallery-outside-events\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-overlay.94W6yWx4S7Hz5.js?m\"},\"ysf-tooltip\":{\"path\":\"js\\/ysf-tooltip.tC7-HLsoYb3iD.js?m\",\"requires\":[\"node\",\"overlay\",\"event-outside\",\"widget-anim\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-tooltip.tC7-HLsoYb3iD.js?m\"},\"ysf-validator\":{\"path\":\"js\\/ysf-validator.DwFNLtH8pfbgr.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-validator.DwFNLtH8pfbgr.js?m\"},\"ysf-html\":{\"path\":\"js\\/ysf-html.JYxjQg1s9coJH.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-html.JYxjQg1s9coJH.js?m\"},\"media-playernote-views-history\":{\"path\":\"js\\/media-playernote-views-history.iqFrKY2lqlSIj.js?m\",\"requires\":\"media-playernote-view\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/media-playernote-views-history.iqFrKY2lqlSIj.js?m\"},\"ysf-reg-validation\":{\"path\":\"js\\/ysf-reg-validation.mIyX9kxPb3d5c.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-validation.mIyX9kxPb3d5c.js?m\"},\"ysf-reg-scoring\":{\"path\":\"js\\/ysf-reg-scoring.HV3b5CQnHj574.js?m\",\"requires\":[\"node\",\"css3-selector\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-scoring.HV3b5CQnHj574.js?m\"},\"ysf-reg-createleague\":{\"path\":\"js\\/ysf-reg-createleague.pw1tkuk6bHkqK.js?m\",\"requires\":[\"node\",\"event\",\"ysf-activeform\",\"ysf-draft-datetime-picker\",\"ysf-tooltip\",\"ysf-reg-validation\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-createleague.pw1tkuk6bHkqK.js?m\"},\"ysf-draft-datetime-picker\":{\"path\":\"js\\/ysf-draft-datetime-picker.lmX33GIiOTqM9.js?m\",\"requires\":[\"calendar\",\"overlay\",\"event-outside\",\"datatype-date\",\"ysf-alerts\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-draft-datetime-picker.lmX33GIiOTqM9.js?m\"},\"ysf-alerts\":{\"path\":\"js\\/ysf-alerts.ouByWLVrokr2O.js?m\",\"requires\":[\"base-build\",\"node-event-delegate\",\"anim-base\",\"anim-easing\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-alerts.ouByWLVrokr2O.js?m\"},\"css-animation-events\":{\"path\":\"js\\/css-animation-events.qXHssa39lCL-y.js?m\",\"requires\":[\"node-base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/css-animation-events.qXHssa39lCL-y.js?m\"},\"ysf-rosterslot\":{\"path\":\"js\\/ysf-rosterslot.Yl66im8SLj5Qe.js?m\",\"requires\":[\"node\",\"base\",\"css-animation-events\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-rosterslot.Yl66im8SLj5Qe.js?m\"},\"ysf-rosterswapper\":{\"path\":\"js\\/ysf-rosterswapper.29T5QyHdensdQ.js?m\",\"requires\":[\"base\",\"node\",\"event\",\"ysf-rosterslot\",\"css-animation-events\",\"event-outside\",\"event-focus\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-rosterswapper.29T5QyHdensdQ.js?m\"},\"ysf-rosterswap-manager\":{\"path\":\"js\\/ysf-rosterswap-manager.HmHklwGLj6wMs.js?m\",\"requires\":[\"ysf-rosterswapper\",\"ysf-xhr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-rosterswap-manager.HmHklwGLj6wMs.js?m\"},\"ysf-tout\":{\"path\":\"js\\/ysf-tout.MBF5Vyw5rJhWz.js?m\",\"requires\":[\"node\",\"base\",\"transition\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-tout.MBF5Vyw5rJhWz.js?m\"},\"hover-intent\":{\"path\":\"js\\/hover-intent.eW-JpYUqhl0WO.js?m\",\"requires\":[\"node\",\"base\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/hover-intent.eW-JpYUqhl0WO.js?m\"},\"ysf-flyout-select\":{\"path\":\"js\\/ysf-flyoutselect.iUYWiOD8TNQjI.js?m\",\"requires\":[\"node\",\"hover-intent\",\"event\",\"event-hover\",\"base\",\"event-outside\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-flyoutselect.iUYWiOD8TNQjI.js?m\"},\"ysf-invite-contacts\":{\"path\":\"js\\/ysf-invite-contacts.2Vv8G1tRjf9bs.js?m\",\"requires\":[\"ysf-cors\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-invite-contacts.2Vv8G1tRjf9bs.js?m\"},\"ysf-private-cash-league-form\":{\"path\":\"js\\/ysf-private-cash-league-form.SNIX0N_Pj4Wfy.js?m\",\"requires\":[\"node\",\"events\",\"datatype-number\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-private-cash-league-form.SNIX0N_Pj4Wfy.js?m\"},\"ysf-sticky\":{\"path\":\"js\\/ysf-sticky.VY8xY986pzMeR.js?m\",\"requires\":[\"node\",\"event\",\"base\",\"event-resize\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-sticky.VY8xY986pzMeR.js?m\"},\"ysf-flowtips\":{\"path\":\"js\\/ysf-flowtips.Q1Ynm_Yrx_3lT.js?m\",\"requires\":[\"node\",\"event\",\"base\",\"overlay\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-flowtips.Q1Ynm_Yrx_3lT.js?m\"},\"ysf-headshot\":{\"path\":\"js\\/ysf-headshot.7WoTsd1kEznhi.js?m\",\"requires\":[\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-headshot.7WoTsd1kEznhi.js?m\"},\"ysf-video-player\":{\"path\":\"js\\/ysf-video-player.5xEbovWw4s1lV.js?m\",\"requires\":[\"node\",\"event\",\"ysf-overlay\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-video-player.5xEbovWw4s1lV.js?m\"},\"ysf-ffl\":{\"path\":\"js\\/ysf-ffl.TIWUibNr_0lAE.js?m\",\"requires\":[\"node\",\"event\",\"ysf-overlay\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-ffl.TIWUibNr_0lAE.js?m\"},\"ysf-viewloader\":{\"path\":\"js\\/ysf-viewloader.FAr8p2kP28c3D.js?m\",\"requires\":[\"yfa-module\",\"ysf-xhr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-viewloader.FAr8p2kP28c3D.js?m\"},\"media-overlay-surround\":{\"path\":\"js\\/playernote-overlay-surround.-e7MqBU3HdnS9.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node-screen\",\"event-resize\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-overlay-surround.-e7MqBU3HdnS9.js?m\"},\"media-overlay-close\":{\"path\":\"js\\/playernote-overlay-close.5xPQCqLnuN984.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node-event-delegate\",\"event-key\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-overlay-close.5xPQCqLnuN984.js?m\"},\"media-playernote-view\":{\"path\":\"js\\/playernote-view.p_2NXTIrbFttJ.js?m\",\"requires\":[\"plugin\",\"base-build\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-view.p_2NXTIrbFttJ.js?m\"},\"media-playernote\":{\"path\":\"js\\/playernote.CEhf5k58_EbPO.js?m\",\"requires\":[\"overlay\",\"io-base\",\"json-parse\",\"media-overlay-surround\",\"media-overlay-close\",\"dd-plugin\",\"media-playernote-css\",\"substitute\",\"media-playernote-view\",\"media-playernote-tabs\",\"transition\",\"media-playernote-views-notes\",\"media-playernote-views-twitter\",\"media-playernote-views-availability\",\"media-playernote-views-history\",\"media-playernote-views-video\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote.CEhf5k58_EbPO.js?m\"},\"media-playernotes\":{\"path\":\"js\\/playernotes.CI12jMp3_agYd.js?m\",\"requires\":[\"node-event-delegate\",\"base-build\",\"selector-css3\",\"media-playernote\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernotes.CI12jMp3_agYd.js?m\"},\"media-playernote-views-notes\":{\"path\":\"js\\/playernote-views-notes.p1ZBPH1M9oTch.js?m\",\"requires\":[\"media-playernote-view\",\"media-playernote-views-notes-css\",\"node-event-delegate\",\"base-build\",\"tabview\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-notes.p1ZBPH1M9oTch.js?m\"},\"media-playernote-tabs\":{\"path\":\"js\\/playernote-tabs.32XiuOIHmSdVn.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node-event-delegate\",\"transition\",\"media-playernote-tabs-css\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-tabs.32XiuOIHmSdVn.js?m\"},\"media-playernote-views-twitter\":{\"path\":\"js\\/playernote-views-twitter.jiKjK7eRFeXPG.js?m\",\"requires\":[\"media-playernote-view\",\"media-playernote-views-twitter-css\",\"node-event-delegate\",\"node-style\",\"selector-css3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-twitter.jiKjK7eRFeXPG.js?m\"},\"media-playernote-views-video\":{\"path\":\"js\\/playernote-views-video.HYRWaPq1XSSY_.js?m\",\"requires\":[\"media-playernote-view\",\"media-playernote-views-video-css\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-video.HYRWaPq1XSSY_.js?m\"},\"media-playernote-views-availability\":{\"path\":\"js\\/playernote-views-player-availability.rFMvUB9EBGQQS.js?m\",\"requires\":[\"media-playernote-view\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-player-availability.rFMvUB9EBGQQS.js?m\"},\"gallery-outside-events\":{\"path\":\"js\\/gallery-outside-events.yIArplQdPlne5.js?m\",\"requires\":[\"event-focus\",\"event-synthetic\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-outside-events.yIArplQdPlne5.js?m\"},\"gallery-overlay-extras\":{\"path\":\"js\\/gallery-overlay-extras.rR-Cbh2yn72pC.js?m\",\"requires\":[\"overlay\",\"plugin\",\"event-resize\",\"gallery-outside-events\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-overlay-extras.rR-Cbh2yn72pC.js?m\"},\"gallery-node-tokeninput\":{\"path\":\"js\\/gallery-node-tokeninput.DE6_qbFxO3_20.js?m\",\"requires\":[\"array-extras\",\"classnamemanager\",\"event-focus\",\"event-valuechange\",\"node-event-delegate\",\"node-pluginhost\",\"node-style\",\"plugin\",\"gallery-node-tokeninput-css\"],\"skinnable\":true,\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-node-tokeninput.DE6_qbFxO3_20.js?m\"},\"gallery-event-pasted\":{\"path\":\"js\\/gallery-event-pasted.BIEUZxnSiF06-.js?m\",\"requires\":[\"event-synthetic\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-event-pasted.BIEUZxnSiF06-.js?m\"},\"gallery-textarea-autoheight\":{\"path\":\"js\\/gallery-textarea-autoheight.9F78arvTCYXsk.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-textarea-autoheight.9F78arvTCYXsk.js?m\"},\"input-mask\":{\"path\":\"js\\/input-mask.k36gdGapEfHLK.js?m\",\"requires\":[\"event-valuechange\",\"gallery-event-pasted\",\"event-focus\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/input-mask.k36gdGapEfHLK.js?m\"},\"gallery-overlay-modal\":{\"path\":\"js\\/gallery-overlay-modal.t4Xzl_Jz4FEzx.js?m\",\"requires\":[\"overlay\",\"plugin\",\"event-focus\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-overlay-modal.t4Xzl_Jz4FEzx.js?m\"},\"ysf-reg-create-group-team\":{\"path\":\"js\\/ysf-reg-create-group-team.J_osWn9U_vAKu.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-create-group-team.J_osWn9U_vAKu.js?m\"},\"ysf-datasource\":{\"path\":\"js\\/ysf-datasource.qQ5JVzb1lpZ5-.js?m\",\"requires\":[\"base\",\"datasource-io\",\"datasource-jsonschema\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-datasource.qQ5JVzb1lpZ5-.js?m\"},\"dd-drag-offset\":{\"path\":\"js\\/dd-drag-offset.QlzVJXWsTAmQE.js?m\",\"requires\":[\"plugin\",\"dom-screen\",\"dd-drag\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-drag-offset.QlzVJXWsTAmQE.js?m\"},\"dd-sanity\":{\"path\":\"js\\/dd-sanity.ovGTPes4Mm1tt.js?m\",\"requires\":[\"plugin\",\"dd-ddm-base\",\"dd-drag\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-sanity.ovGTPes4Mm1tt.js?m\"},\"dd-touch\":{\"path\":\"js\\/dd-touch.KdG_-IyjrgaJH.js?m\",\"requires\":[\"plugin\",\"node-event-touch\",\"synthetic-touch-events\",\"dd-ddm\",\"dd-drag\",\"dd-drop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-touch.KdG_-IyjrgaJH.js?m\"},\"dd-touch-delegate\":{\"path\":\"js\\/dd-touch-delegate.Uh271g2OmyXlc.js?m\",\"requires\":[\"plugin\",\"node-event-touch\",\"synthetic-touch-events\",\"dd-ddm\",\"dd-drag\",\"dd-drop\",\"dd-touch\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-touch-delegate.Uh271g2OmyXlc.js?m\"},\"ysf-draftorder\":{\"path\":\"js\\/ysf-draftorder.5ot56ONHMyczE.js?m\",\"requires\":[\"widget\",\"dd-constrain\",\"dd-proxy\",\"dd-drop\",\"oop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-draftorder.5ot56ONHMyczE.js?m\"},\"ysf-drafttracker\":{\"path\":\"js\\/ysf-drafttracker._YynBSq4b2Q1w.js?m\",\"requires\":[\"widget\",\"oop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-drafttracker._YynBSq4b2Q1w.js?m\"},\"ysf-editdraftorder-observer\":{\"path\":\"js\\/ysf-editdraftorder-observer.94ULArkYk-PVu.js?m\",\"requires\":[\"ysf-formobserver\",\"ysf-draftorder\",\"io-form\",\"json\",\"selector-css3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-editdraftorder-observer.94ULArkYk-PVu.js?m\"},\"ysf-editdraftresults-observer\":{\"path\":\"js\\/ysf-editdraftresults-observer.4kLsN3lc-0ifI.js?m\",\"requires\":[\"ysf-formobserver\",\"ysf-draftcustomizer\",\"ysf-drafttracker\",\"ysf-playerpicker\",\"io-form\",\"json\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-editdraftresults-observer.4kLsN3lc-0ifI.js?m\"},\"ysf-iris-chat\":{\"path\":\"js\\/ysf-iris-chat.tqvMt87o3kMdf.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-iris-chat.tqvMt87o3kMdf.js?m\"},\"ysf-dfs-promos\":{\"path\":\"js\\/ysf-dfs-promos.MFq8uGuVlCcT8.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-dfs-promos.MFq8uGuVlCcT8.js?m\"},\"ysf-form\":{\"path\":\"js\\/ysf-form.jCf7FAoLG772g.js?m\",\"requires\":[\"widget\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-form.jCf7FAoLG772g.js?m\"},\"ysf-wcp-matchupdistchart\":{\"path\":\"js\\/ysf-wcp-matchupdistchart.ZqsttJiYTzcMZ.js?m\",\"requires\":[\"widget\",\"oop\",\"ysf-yui2-charts\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-wcp-matchupdistchart.ZqsttJiYTzcMZ.js?m\"},\"node-event-touch\":{\"path\":\"js\\/node-event-touch.GrAa0W5J9hoLv.js?m\",\"requires\":[\"node-base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/node-event-touch.GrAa0W5J9hoLv.js?m\"},\"ysf-formobserver\":{\"path\":\"js\\/ysf-formobserver.t9yrpgyoLqIsd.js?m\",\"requires\":[\"widget\",\"oop\",\"ysf-form\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-formobserver.t9yrpgyoLqIsd.js?m\"},\"ysf-pickem-picksnote\":{\"path\":\"js\\/ysf-pickem-picksnote.rzyLWbkej7bAK.js?m\",\"requires\":[\"oop\",\"io-base\",\"json\",\"ysf-smartpanel\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-pickem-picksnote.rzyLWbkej7bAK.js?m\"},\"ysf-playersearch-plugin\":{\"path\":\"js\\/ysf-playersearch-plugin.ixDhFqzXowRiK.js?m\",\"requires\":[\"node-base\",\"event-base\",\"base-build\",\"event-key\",\"autocomplete-sources\",\"autocomplete-plugin\",\"node-event-delegate\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-playersearch-plugin.ixDhFqzXowRiK.js?m\"},\"ysf-dynaplayers\":{\"path\":\"js\\/ysf-dynaplayers.8cKuCLw0Cp5FD.js?m\",\"requires\":[\"ysf-form\",\"ysf-ads\",\"base-build\",\"widget-base\",\"node-event-delegate\",\"io-form\",\"json-parse\",\"history\",\"ysf-initlinks\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-dynaplayers.8cKuCLw0Cp5FD.js?m\"},\"ysf-postload\":{\"path\":\"js\\/ysf-postload.9ibJkPNGYF_Zw.js?m\",\"requires\":[\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-postload.9ibJkPNGYF_Zw.js?m\"},\"ysf-preauctioncosts-playerdt\":{\"path\":\"js\\/ysf-preauctions-playerdt.o8NqOciJu5xTo.js?m\",\"requires\":[\"widget\",\"oop\",\"event-delegate\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-preauctions-playerdt.o8NqOciJu5xTo.js?m\"},\"ysf-preauctioncosts-observer\":{\"path\":\"js\\/ysf-preauctionscosts-observer.TJ6DCeWpIZMTC.js?m\",\"requires\":[\"ysf-formobserver\",\"ysf-preauctioncosts-playerdt\",\"io-form\",\"json\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-preauctionscosts-observer.TJ6DCeWpIZMTC.js?m\"},\"ysf-smartpanel\":{\"path\":\"js\\/ysf-smartpanel.8YgUg3KTbAmCN.js?m\",\"requires\":[],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-smartpanel.8YgUg3KTbAmCN.js?m\"},\"ysf-twitter-intelligence\":{\"path\":\"js\\/ysf-twitter-intelligence.BLhJUW3zf4W5h.js?m\",\"requires\":[\"io-xdr\",\"substitute\",\"json-parse\",\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-twitter-intelligence.BLhJUW3zf4W5h.js?m\"},\"bracket-map\":{\"path\":\"js\\/bracket-map.ec3-YVydkxycD.js?m\",\"requires\":[\"node\",\"event\",\"event-flick\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/bracket-map.ec3-YVydkxycD.js?m\"},\"ysf-ads\":{\"path\":\"js\\/ysf-sda.Rhmq_U0gTXFfV.js?m\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-sda.Rhmq_U0gTXFfV.js?m\"},\"io-upload-iframe\":{\"path\":\"js\\/io-upload-iframe.fqcrHH-wf_O7P.js?m\",\"requires\":[\"io-base\",\"node-base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/io-upload-iframe.fqcrHH-wf_O7P.js?m\"},\"ysf-cors\":{\"path\":\"js\\/ysf-cors.9u4jsmph2dlAS.js?m\",\"requires\":[\"io-base\",\"io-xdr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-cors.9u4jsmph2dlAS.js?m\"},\"ysf-editwaivers\":{\"path\":\"js\\/ysf-editwaivers.2iOnrluwEc9dR.js?m\",\"requires\":[\"dd-constrain\",\"dd-proxy\",\"dd-drop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-editwaivers.2iOnrluwEc9dR.js?m\"},\"ysf-makepayment\":{\"path\":\"js\\/ysf-makepayment.YGCvhH-NQAzDi.js?m\",\"requires\":[\"epay_widget\",\"node\",\"selector-css3\",\"ysf-overlay\",\"ysf-alerts\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-makepayment.YGCvhH-NQAzDi.js?m\"},\"ysf-leaguecontests\":{\"path\":\"js\\/ysf-leaguecontests.fL3cAsZ7W1YKH.js?m\",\"requires\":[\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-leaguecontests.fL3cAsZ7W1YKH.js?m\"},\"ysf-championchampions\":{\"path\":\"js\\/ysf-championchampions.zy9-TIYdELL1M.js?m\",\"requires\":[\"base\",\"ysf-cors\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-championchampions.zy9-TIYdELL1M.js?m\"},\"ysf-reactinvites\":{\"path\":\"js\\/ysf-react-invites.MiWYyhSVgeFeN.js?m\",\"requires\":[\"node-base\",\"io-xdr\",\"json-stringify\",\"ysf-html\",\"ysf-cors\",\"ysf-flowtips\",\"ysf-tout\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-react-invites.MiWYyhSVgeFeN.js?m\"},\"ysf-d3\":{\"path\":\"js\\/d3.TvK0Kfo0At0Ao.js?m\",\"requires\":[],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/d3.TvK0Kfo0At0Ao.js?m\"},\"ysf-c3\":{\"path\":\"js\\/c3.Fq7YHbqxM_pCy.js?m\",\"requires\":[\"ysf-d3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/c3.Fq7YHbqxM_pCy.js?m\"},\"ysf-d3-standings-plot\":{\"path\":\"js\\/ysf-d3-standings-plot.IlbXb4hgpEJHU.js?m\",\"requires\":[\"base\",\"ysf-d3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-d3-standings-plot.IlbXb4hgpEJHU.js?m\"}}        },\r\n" + 
				"        'ysf-css' : {\r\n" + 
				"            'combine' : true,\r\n" + 
				"            'base' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'comboBase' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'root' : '',\r\n" + 
				"            'comboSep': ';',\r\n" + 
				"            'filter': {\r\n" + 
				"                'searchExp':\"\\\\.(js|css)[\\\\?\\\\&a-zA-Z0-9]*;\",\r\n" + 
				"                'replaceStr': \";\"\r\n" + 
				"            },\r\n" + 
				"            'modules': {\"media-playernote-views-notes-css\":{\"path\":\"css\\/nonsass\\/playernote-views-notes.GdbNzHazXmry3.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-views-notes.GdbNzHazXmry3.css?m\"},\"media-playernote-tabs-css\":{\"path\":\"css\\/nonsass\\/playernote-tabs.4vgVG8tnX7t_g.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-tabs.4vgVG8tnX7t_g.css?m\"},\"media-playernote-css\":{\"path\":\"css\\/nonsass\\/playernote.PNQ08I-x9PQKE.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote.PNQ08I-x9PQKE.css?m\"},\"media-playernote-views-twitter-css\":{\"path\":\"css\\/nonsass\\/playernote-views-twitter.jV5gXgoJiFrgN.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-views-twitter.jV5gXgoJiFrgN.css?m\"},\"media-playernote-views-video-css\":{\"path\":\"css\\/nonsass\\/playernote-views-video.f-xx5zzcwInJs.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-views-video.f-xx5zzcwInJs.css?m\"},\"gallery-node-tokeninput-core\":{\"path\":\"css\\/nonsass\\/gallery-node-tokeninput-core.3n1lDg72nVCpW.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/gallery-node-tokeninput-core.3n1lDg72nVCpW.css?m\"},\"gallery-node-tokeninput-skin\":{\"path\":\"css\\/nonsass\\/gallery-node-tokeninput-skin.X_oDtZbWD9z8u.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/gallery-node-tokeninput-skin.X_oDtZbWD9z8u.css?m\"},\"gallery-node-tokeninput-css\":{\"path\":\"css\\/nonsass\\/gallery-node-tokeninput.PSfdVYvLiZUYE.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/gallery-node-tokeninput.PSfdVYvLiZUYE.css?m\"},\"team-logos-css\":{\"path\":\"css\\/nonsass\\/teamlogos.qS204j3tyXuq4.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/teamlogos.qS204j3tyXuq4.css?m\"}}        }\r\n" + 
				"        ,\r\n" + 
				"                    'yui2' : {\r\n" + 
				"                        'combine' : true,\r\n" + 
				"                        'base' : 'https://s.yimg.com/d/lib/yui/2in3.4/2.9.0/build/',\r\n" + 
				"                        'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                        'root' : '/d/lib/yui/2in3.4/2.9.0/build/',\r\n" + 
				"                        'patterns' :  {\r\n" + 
				"                            'yui2-': {\r\n" + 
				"                                configFn: function(me) {\r\n" + 
				"                                    if(/-skin|reset|fonts|grids|base/.test(me.name)) {\r\n" + 
				"                                        me.type = 'css';\r\n" + 
				"                                        me.path = me.path.replace(/\\.js/, '.css');\r\n" + 
				"                                        // this makes skins in builds earlier than 2.6.0 work as long as combine is false\r\n" + 
				"                                        me.path = me.path.replace(/\\/yui2-skin/, '/assets/skins/sam/yui2-skin');\r\n" + 
				"                                    }\r\n" + 
				"                                }\r\n" + 
				"                            }\r\n" + 
				"                        }\r\n" + 
				"                    },\r\n" + 
				"                    'yui2_8_paths': {\r\n" + 
				"                        'base' : 'https://s.yimg.com/d/lib/yui/2in3.4/2.8.2/build/',\r\n" + 
				"                        'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                        'root' :  '/d/lib/yui/2in3.4/2.8.2/build/'\r\n" + 
				"                    },\r\n" + 
				"                    'yui2_9_paths': {\r\n" + 
				"                        'base' : 'https://s.yimg.com/d/lib/yui/2in3.4/2.9.0/build/',\r\n" + 
				"                        'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                        'root' : '/d/lib/yui/2in3.4/2.9.0/build/'\r\n" + 
				"                    }    },\r\n" + 
				"    'modules' : {\r\n" + 
				"        \"swfplayer\" : {\r\n" + 
				"            fullpath: 'https://s.yimg.com/lq/lib/flash/swfobject/1.0/swfobject.js'\r\n" + 
				"        },\r\n" + 
				"        \"mobilizer\" : {\r\n" + 
				"            fullpath: 'https://s.yimg.com/lh/mbz/loader-min.js'\r\n" + 
				"        },\r\n" + 
				"        \"yos-widget-loader\" : {\r\n" + 
				"            fullpath: 'https://s.yimg.com/ly/widgetloader/1.0.1/js/widgetLoader.js'\r\n" + 
				"        },\r\n" + 
				"        \"twitter_widget\" : {\r\n" + 
				"            fullpath : \"https://platform.twitter.com/widgets.js\"\r\n" + 
				"        },\r\n" + 
				"        \"epay_widget\" : {\r\n" + 
				"            fullpath : \"https://s.yimg.com/av/yp/1.1.104/dist/payment_widget-min.js\"\r\n" + 
				"        },\r\n" + 
				"                    \"uh-js\" : {\r\n" + 
				"                        fullpath: \"https://s.yimg.com/zz/combo?kx/yucs/uh3s/uh/414/js/uh-min.js&kx/yucs/uh2/common/145/js/jsonp-super-cached-min.js&kx/yucs/uh3s/uh/379/js/escregex-min.js&kx/yucs/uh3s/uh/376/js/persistence-min.js&kx/yucs/uh3s/uh/401/js/menu_group_plugin-min.js&kx/yucs/uh3s/uh/430/js/menu-plugin-min.js&kx/yucs/uh3s/uh/463/js/menu_handler_v2-min.js&kx/yucs/uh3s/uh/376/js/gallery-jsonp-min.js&kx/yucs/uh3s/uh/408/js/logo_debug-min.js&kx/yucs/uh3/uh/js/958/localeDateFormat-min.js&kx/yucs/uh3s/uh/409/js/timestamp_library-min.js&kx/yucs/uh3s/uh/376/js/usermenu_v2-min.js&kx/yucs/uh3/signout-link/10/js/signout-min.js&kx/yucs/uhc/rapid/50/js/uh_rapid-min.js&kx/yucs/uhc/meta/71/js/meta-min.js&kx/yucs/uh3/disclaimer/388/js/disclaimer_seed-min.js&kx/yucs/uh3s/top-bar/137/js/top_bar_v2-min.js&kx/yucs/uh3s/top-bar/139/js/home_menu-min.js&kx/yucs/uh3s/search/379/js/search-min.js&kx/yucs/uh3/search/611/js/search_plugin-min.js&kx/yucs/uh3s/avatar/60/js/avatar-min.js&kx/yucs/uh3s/profile/167/js/fast-switch-min.js&kx/yucs/uh3s/mail-link/159/js/mailcount_ssl-min.js&pj/inproduct/v26s/js/yui/yhelp-bootstrap.js&kx/yucs/uh3s/help/81/js/help_menu_v4-min.js&kx/yucs/uh3/location/10/js/uh_locdrop-min.js\",\r\n" + 
				"                        requires: [\"node\",\"node-focusmanager\",\"event\",\"substitute\",\"cookie\",\"event-resize\",\"base\",\"event-hover\",\"event-mouseenter\",\"event-delegate\",\"oop\",\"dom-screen\",\"querystring-stringify\",\"event-custom\",\"event-move\",\"template-micro\",\"get\",\"anim\",\"jsonp\",\"json\",\"classnamemanager\",\"yql\",\"datatype-date\",\"event-focus\",\"plugin\",\"array-extras\",\"event-synthetic\",\"event-valuechange\",\"event-key\",\"querystring\",\"datatype-date-parse\",\"template\",\"view\",\"stencil\"]\r\n" + 
				"                    }\r\n" + 
				"     }\r\n" + 
				"     };\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var YSFOVERRIDE = {\r\n" + 
				"    \"use\": function() {\r\n" + 
				"        var func, args = [], useQueue;\r\n" + 
				"        for(var x=0; x<arguments.length; x++) {\r\n" + 
				"            args.push(arguments[x]);\r\n" + 
				"        }\r\n" + 
				"        if(args.length) {\r\n" + 
				"            useQueue = this.getUseQueue();\r\n" + 
				"            if(typeof args[args.length - 1] === \"function\") {\r\n" + 
				"                func = args.pop();\r\n" + 
				"                useQueue.funcs.push(func);\r\n" + 
				"            } \r\n" + 
				"            for(var x=0; x<args.length; x++) {\r\n" + 
				"                if(useQueue.requires.indexOf(args[x]) === -1) {\r\n" + 
				"                    useQueue.requires.push(args[x]);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"            if(this._INST) {\r\n" + 
				"                this.exec();\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"_currentUseQueue\": null,\r\n" + 
				"    \"getUseQueue\": function() {\r\n" + 
				"        if(this._currentUseQueue === null) {\r\n" + 
				"            this._currentUseQueue = {\r\n" + 
				"                \"funcs\": [],\r\n" + 
				"                \"requires\": []\r\n" + 
				"            };\r\n" + 
				"        }\r\n" + 
				"        return this._currentUseQueue;\r\n" + 
				"    },\r\n" + 
				"    \"resetUseQueue\": function() {\r\n" + 
				"        this._currentUseQueue = null;\r\n" + 
				"    },\r\n" + 
				"    \"rotateUseQueue\": function() {\r\n" + 
				"        var useQueue = this.getUseQueue();\r\n" + 
				"        this.resetUseQueue();\r\n" + 
				"        return useQueue;\r\n" + 
				"    },\r\n" + 
				"    \"_INST\": null,\r\n" + 
				"    \"requires\": [],\r\n" + 
				"    \"funcs\": [],\r\n" + 
				"    \"getInstance\": function() {\r\n" + 
				"        var _YSF;\r\n" + 
				"        if(this._INST) {\r\n" + 
				"            _YSF = this._INST;\r\n" + 
				"        }\r\n" + 
				"        else {\r\n" + 
				"            _YSF = YUI();\r\n" + 
				"            _YSF.applyConfig(YUI.YUICfg);\r\n" + 
				"            this._INST = _YSF;\r\n" + 
				"        }\r\n" + 
				"        return _YSF;\r\n" + 
				"    },\r\n" + 
				"    \"exec\": function() {\r\n" + 
				"        var _YSF, funcs, execFunc,\r\n" + 
				"            useQueue = this.rotateUseQueue(),\r\n" + 
				"            self = this;\r\n" + 
				"\r\n" + 
				"        execFunc = function(Y) {\r\n" + 
				"            var func;\r\n" + 
				"            //Y.log(useQueue.requires.join(\", \"));\r\n" + 
				"            while(useQueue.funcs.length) {\r\n" + 
				"                //Y.log(\"Executing use(). Remaining: \" + useQueue.funcs.length);\r\n" + 
				"                func = useQueue.funcs.shift();\r\n" + 
				"                func(Y);\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"        _YSF = this.getInstance();\r\n" + 
				"        _YSF.use.apply(_YSF, useQueue.requires.concat([execFunc]));\r\n" + 
				"        \r\n" + 
				"    }\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var useYSFOverride = true;\r\n" + 
				"YUI.YUICfg.root='yui:'+ YUI.version + '/';\r\n" + 
				"YUI.YUICfg.comboSep = '&';\r\n" + 
				"\r\n" + 
				"if(useYSFOverride) {\r\n" + 
				"    YSF = YSFOVERRIDE;\r\n" + 
				"}\r\n" + 
				"else {\r\n" + 
				"    YSF = YUI();\r\n" + 
				"    YSF.applyConfig(YUI.YUICfg);\r\n" + 
				"}\r\n" + 
				"YFB = YMedia = YSF;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.Af = window.Af || {};\r\n" + 
				"window.Af.config = window.Af.config || {};\r\n" + 
				"window.Af.config.transport = {\r\n" + 
				"    cors: true\r\n" + 
				"};\r\n" + 
				"window.Af.config.beacon = {\r\n" + 
				"    enable: true,\r\n" + 
				"    beaconUncaughtErr: true,\r\n" + 
				"    pathPrefix: '//beacon.fantasysports.yahoo.com/beacon',\r\n" + 
				"    sampleSize: 500,\r\n" + 
				"    batch: false,\r\n" + 
				"};\r\n" + 
				"YSF.Fantasy = {};\r\n" + 
				"YSF.Fantasy.League = {\r\n" + 
				"    \"id\": '686943',\r\n" + 
				"    \"uri\": \"/f1/686943\",\r\n" + 
				"};\r\n" + 
				"YSF.Fantasy.League.url = location.protocol + '//' + location.host + YSF.Fantasy.League.uri;\r\n" + 
				"\r\n" + 
				"YSF.use(\"node\", \"event\", \"base\", function(Y) {\r\n" + 
				"Y.log(\"Like poking around in code? Love fantasy sports? We're hiring stellar frontend, backend, devops, mobile, and data engineers ranging from interns to senior architects!  Let us know how you'd impact our products, share your sports related projects, or tell us why you should join our starting lineup!  Email us with a resume to sportsjobs@yahoo-inc.com.  See you on the field!\");\r\n" + 
				"\r\n" + 
				"YUI.namespace('Fantasy.ENV');\r\n" + 
				"YUI.Fantasy.ENV = { get: function() { return {}; } };\r\n" + 
				"YUI.Fantasy.adPath = '';\r\n" + 
				"var League = function(config) {\r\n" + 
				"    League.superclass.constructor.apply(this, arguments);\r\n" + 
				"};\r\n" + 
				"League.NAME = \"ysf-League\";\r\n" + 
				"League.ATTRS = {\r\n" + 
				"\r\n" + 
				"    'id' : {\r\n" + 
				"        value : '686943',\r\n" + 
				"        readOnly : true\r\n" + 
				"    },\r\n" + 
				"    'uri' : {\r\n" + 
				"        valueFn : function() {\r\n" + 
				"\r\n" + 
				"            var uri = '/f1',\r\n" + 
				"                id = this.get('id');\r\n" + 
				"\r\n" + 
				"            if (uri !== '' && id) {\r\n" + 
				"                uri += '/' + id;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            return uri;\r\n" + 
				"\r\n" + 
				"        },\r\n" + 
				"        readOnly: true\r\n" + 
				"    },\r\n" + 
				"    'url' : {\r\n" + 
				"        valueFn : function() {\r\n" + 
				"\r\n" + 
				"            var url = '',\r\n" + 
				"                uri = this.get('uri');\r\n" + 
				"\r\n" + 
				"            if (uri !== '') {\r\n" + 
				"                url = location.protocol + '//' + location.host + uri;\r\n" + 
				"            }\r\n" + 
				"            return url;\r\n" + 
				"\r\n" + 
				"        },\r\n" + 
				"        readOnly: true\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"Y.extend(League, Y.Base);\r\n" + 
				"\r\n" + 
				"YUI.namespace('Fantasy.League');\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.League = new League();\r\n" + 
				"\r\n" + 
				"/*\r\n" + 
				"YSFGlobalPublisher\r\n" + 
				"Use YSFGlobalPublisher to publish global custom events on the\r\n" + 
				"Y.Global object.\r\n" + 
				"*/\r\n" + 
				"var YSFGlobalPublisher = new Y.EventTarget();\r\n" + 
				"YSFGlobalPublisher.name = 'YSFGlobalPublisher';\r\n" + 
				"YSFGlobalPublisher.publish('ysf:beforeunload', {\r\n" + 
				"    broadcast : 2\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"window.onbeforeunload = function(e) {\r\n" + 
				"\r\n" + 
				"    var beforeUnloadEvent = YUI.Env.globalEvents.getEvent('ysf:beforeunload'),\r\n" + 
				"        beforeUnloadSubscribers = (beforeUnloadEvent) ? beforeUnloadEvent.subscribers : {} ,\r\n" + 
				"        reason = null,\r\n" + 
				"        s=null;\r\n" + 
				"\r\n" + 
				"    for (s in beforeUnloadSubscribers) {\r\n" + 
				"        if (beforeUnloadSubscribers.hasOwnProperty(s)) {\r\n" + 
				"            reason = beforeUnloadSubscribers[s].fn();\r\n" + 
				"            if (Y.Lang.isString(reason)) {\r\n" + 
				"                break;\r\n" + 
				"            }\r\n" + 
				"            reason = null;\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    if (reason) {\r\n" + 
				"        if (e) {\r\n" + 
				"            e.preventDefault();\r\n" + 
				"            e.returnValue = reason;\r\n" + 
				"        }\r\n" + 
				"        return reason;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"YUI.namespace(\"Fantasy.SpaceIds\");\r\n" + 
				"YUI.Fantasy.SpaceIds.pathmap = {\r\n" + 
				"    'playernote': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782203655,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782203656,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782203657,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782203658,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204201,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204199\r\n" + 
				"    },\r\n" + 
				"    'playernote_dynamic_notes': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204439,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204441,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204433,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204435,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204431,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204437\r\n" + 
				"    },\r\n" + 
				"    'playernote_dynamic_video': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204438,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204440,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204432,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204434,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204430,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204436\r\n" + 
				"    },\r\n" + 
				"    'playernote_dynamic_twitter': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204837,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204838,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204839,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204840\r\n" + 
				"    },\r\n" + 
				"    'players': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782201687,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782201980,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782200994,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782201116,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782202612,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782202472\r\n" + 
				"    },\r\n" + 
				"    'playersearch': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782201686,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782201939,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782200935,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782201255,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782202613,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782202473\r\n" + 
				"    },\r\n" + 
				"    'fb_like_league' : {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204622,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204624,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204618,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204620,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204626,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204628\r\n" + 
				"    },\r\n" + 
				"    'fb_like_team' : {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204623,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204625,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204619,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204621,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204627,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204629\r\n" + 
				"    },\r\n" + 
				"    'fb_like_player' : {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204632,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204633,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204630,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204631,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204634,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204635\r\n" + 
				"    },\r\n" + 
				"    'teamnews': {\r\n" + 
				"        'site/sports/fantasy_new/nascar/pickem':     782204349\r\n" + 
				"    },\r\n" + 
				"    'team': {\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782202656,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782201796,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782200906,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782202516,\r\n" + 
				"        'site/sports/fantasy_new/pga/pickem':        782201500,\r\n" + 
				"        'site/sports/fantasy_new/nascar/pickem':     782201582\r\n" + 
				"    },\r\n" + 
				"    'bracketwizard': {\r\n" + 
				"        'site/sports/fantasy_new/ncaab/pickem': 782204544,\r\n" + 
				"        'site/sports/fantasy_new/ncaab/secondchance': 782204502\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.SpaceIds.showAds = {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     true,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     true,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     true,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     true,\r\n" + 
				"        'site/sports/fantasy/nhl/full/free':         true,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     true,\r\n" + 
				"        'site/sports/fantasy/nba/full/free':         true,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     true,\r\n" + 
				"        'site/sports/fantasy_new/nascar/pickem':     true,\r\n" + 
				"        'site/sports/fantasy_new/ncaab/pickem':      true,\r\n" + 
				"        'site/sports/fantasy_new/ncaab/secondchance/': true\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.SpaceIds.spaceidpath = 'site/sports/fantasy_new/nfl/full/free';\r\n" + 
				"YUI.Fantasy.SpaceIds.spaceid     = '782200906';\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.SpaceIds.getSpaceId = function(subpath) {\r\n" + 
				"    if(YUI.Fantasy.SpaceIds.pathmap[subpath]) {\r\n" + 
				"        return YUI.Fantasy.SpaceIds.pathmap[subpath][this.spaceidpath];\r\n" + 
				"    }\r\n" + 
				"    return YUI.Fantasy.SpaceIds.spaceid;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"YSF.use('event', function (Y) {\r\n" + 
				"\r\n" + 
				"    Y.on('domready', function (e) {\r\n" + 
				"\r\n" + 
				"            try {\r\n" + 
				"\r\n" + 
				"                YAHOO.i13n.SPACEID = '782200906';\r\n" + 
				"                YAHOO.i13n.TEST_ID = '3.RTgzMjExMQdzcGRtdGVzdAZfQ0hHAzgwODk5BF92ZXIDNC42BF9IA2Zhbm9zODkzLnNwb3J0cy5iZjEueWFob28uY29tBF95YWYDMQJFODMzNDQwB3NwLXN0cm0tY29sbGVjdC0x';\r\n" + 
				"            \r\n" + 
				"                var conf = {\r\n" + 
				"                    use_rapid: true,\r\n" + 
				"                    yql_enabled: true,\r\n" + 
				"                    tracked_mods: [  ],\r\n" + 
				"                    spaceid: 782200906,\r\n" + 
				"                    nofollow_class: [\"yfa-link-tab\", \"ysf-cta-imgur\", \"yfa-rapid-nofollow\"],\r\n" + 
				"                    client_only: 1,\r\n" + 
				"                    test_id : \"3.RTgzMjExMQdzcGRtdGVzdAZfQ0hHAzgwODk5BF92ZXIDNC42BF9IA2Zhbm9zODkzLnNwb3J0cy5iZjEueWFob28uY29tBF95YWYDMQJFODMzNDQwB3NwLXN0cm0tY29sbGVjdC0x\",\r\n" + 
				"                    keys: {\r\n" + 
				"                        \"pd\" : \"team\",\r\n" + 
				"                        \"chan\" : \"\",\r\n" + 
				"                        \"lang\": \"en-US\",\r\n" + 
				"                        \"mkrt\": \"US\",\r\n" + 
				"                        \"site\": \"fullfantasy\",\r\n" + 
				"                        \"pst\": \"football\",\r\n" + 
				"                        \"paid\": \"686943\",\r\n" + 
				"                        \"pstaid\": \"free\"\r\n" + 
				"                    }\r\n" + 
				"                };\r\n" + 
				"\r\n" + 
				"                YAHOO.i13n.ywa= conf.ywa;\r\n" + 
				"                YAHOO.i13n.WEBWORKER_FILE = '/rapidworker-1.1.js';\r\n" + 
				"\r\n" + 
				"                var ins = new YAHOO.i13n.Rapid(conf),\r\n" + 
				"                    body;\r\n" + 
				" \r\n" + 
				"                window.rapidInstance = ins;\r\n" + 
				"\r\n" + 
				"                /**\r\n" + 
				"                 * Sends a beacon-click: Use this to track clicks that can't be tracked with regular rapid tracking due to the rapid link hijacking.\r\n" + 
				"                 * How to use: Add this classname to your element: 'yfa-rapid-beacon' and then add your module name: 'yfa-rapid-module-your-module-name-here'\r\n" + 
				"                 * For example, 'yfa-rapid-module-yfa-reg-createleague'.  You can add this to parent elements, such as anchor tags with your custom 'span'-tag type styling inside these,\r\n" + 
				"                 * up to a nesting level five levels deep (the limit is five to ensure speed/responsiveness).\r\n" + 
				"                 * @param event {Event} A dom click event.\r\n" + 
				"                 */\r\n" + 
				"                function handleBeaconClick(event) {\r\n" + 
				"\r\n" + 
				"                    var DEFAULT_POS = 0,\r\n" + 
				"                        MAX_LEN = 30,\r\n" + 
				"                        clickParams = {},\r\n" + 
				"                        tg, tgD, tagName, moduleName, match, position, linkName;\r\n" + 
				"\r\n" + 
				"                    function getActionable(target) {\r\n" + 
				"                        var MAX_LOOKUPS = 5,\r\n" + 
				"                            el = target,\r\n" + 
				"                            i = 0;\r\n" + 
				"\r\n" + 
				"                        while(++i < MAX_LOOKUPS) {\r\n" + 
				"                            if (el.hasClass('yfa-rapid-beacon') || el.hasClass('Beacon')) {\r\n" + 
				"                                return el;\r\n" + 
				"                            }\r\n" + 
				"                            if (el.ancestor()) {\r\n" + 
				"                                el = el.ancestor();\r\n" + 
				"                            } else {\r\n" + 
				"                                return null;\r\n" + 
				"                            }\r\n" + 
				"                        }\r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    tg = getActionable(event.target);\r\n" + 
				"                    if (!tg) {\r\n" + 
				"                        return;\r\n" + 
				"                    }\r\n" + 
				"                    tgD = tg.getDOMNode();\r\n" + 
				"                    tagName = tgD.tagName.toLowerCase();\r\n" + 
				"                    match = tg.getAttribute('class').match(/yfa-rapid-module-([^\\s]+)/);\r\n" + 
				"                    moduleName = (match && match.length > 1) ? match[1] : '';\r\n" + 
				"                    match = tg.getAttribute('class').match(/yfa-rapid-link-pos-(\\d+)/);\r\n" + 
				"                    position = (match && match.length > 1) ? match[1] : 0;\r\n" + 
				"                    linkName = '';\r\n" + 
				"\r\n" + 
				"                    if ((/a|button/).test(tagName)) {\r\n" + 
				"                        if (tgD.innerText) {\r\n" + 
				"                            linkName = tgD.innerText;\r\n" + 
				"                        } else {\r\n" + 
				"                            linkName = tg.getHTML().replace(/<[^>]+>/g, '');\r\n" + 
				"                        }\r\n" + 
				"                    } else if ((/input/).test(tagName)) {\r\n" + 
				"                        linkName = tg.getAttribute('value');\r\n" + 
				"                    }\r\n" + 
				"                    linkName = linkName.replace(/[^\\w\\s!]/g, ''); // Clean out characters that will not be easily enterable by keyboard into the analytics tool.\r\n" + 
				"\r\n" + 
				"                    //Add New instrumentation here to keep backwards compatability for now.\r\n" + 
				"                    if(tg.getData('slk') || tg.getData('sec') || tg.getData('clickParams')) {\r\n" + 
				"                        moduleName  = tg.getData('sec') || '';\r\n" + 
				"                        linkName    = tg.getData('slk') || linkName;\r\n" + 
				"                        clickParams = tg.getData('clickParams') ? JSON.parse(tg.getData('clickParams')) : {};\r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    ins.beaconClick(moduleName.substring(0, MAX_LEN), linkName.substring(0, MAX_LEN), position, clickParams);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                ins.init();\r\n" + 
				"                if (Y.Fantasy && !Y.Fantasy.rapid) {\r\n" + 
				"                    Y.Fantasy.rapid = ins;\r\n" + 
				"                }\r\n" + 
				"                body = Y.one('body');\r\n" + 
				"                body.delegate('click', handleBeaconClick, 'button, input[type=button], a, .Beacon');\r\n" + 
				"                body.all('form input[type=submit]').on('click', handleBeaconClick); // Need separate listener since submit-button clicks don't bubble.\r\n" + 
				"\r\n" + 
				"                \r\n" + 
				"                //console.log('document_name: ' + \"team\");\r\n" + 
				"                //console.log('tracked mods: ' + [  ]);\r\n" + 
				"            } catch (error) {}\r\n" + 
				"    });\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"// Custom UH Help Link\r\n" + 
				"YSF.use('node', 'event', 'event-custom', function(Y) {\r\n" + 
				"\r\n" + 
				"    Y.on('contentready', function () {\r\n" + 
				"        Y.use(\"uh-js\", function () {\r\n" + 
				"            Y.Global.once(\r\n" + 
				"                'ucs:helpMenuShow',\r\n" + 
				"                function(e) {\r\n" + 
				"\r\n" + 
				"                    // fire an event black with the help menu items.\r\n" + 
				"                    var et = new Y.EventTarget();\r\n" + 
				"                    et.publish(\r\n" + 
				"                        'ucs:helpMenuItems',\r\n" + 
				"                        {\r\n" + 
				"                            broadcast: 2,\r\n" + 
				"                            emitFacade: true\r\n" + 
				"                        }\r\n" + 
				"                    );\r\n" + 
				"\r\n" + 
				"                    // additional menu items to be added.\r\n" + 
				"                    var menuGroupOne = [\r\n" + 
				"                        {\r\n" + 
				"                            menuText: \"Help\",\r\n" + 
				"                            actionType: \"link\",\r\n" + 
				"                            url: \"javascript:void(0);\",\r\n" + 
				"                            inProductHelp: \"PROD_SPORTS_FAN_FOOTUS\",                            target: \"_top\"\r\n" + 
				"                        }\r\n" + 
				"                    ];\r\n" + 
				"\r\n" + 
				"                    var menuGroupTwo = [\r\n" + 
				"                        {\r\n" + 
				"                            menuText: \"Suggestions\",\r\n" + 
				"                            actionType: \"link\",\r\n" + 
				"                            url: \"https://yahoo.uservoice.com/forums/206158?auth=yahoo\",\r\n" + 
				"                            target: \"_top\"\r\n" + 
				"                        }\r\n" + 
				"                    ];\r\n" + 
				"\r\n" + 
				"                    var menuGroups = [\r\n" + 
				"                        menuGroupOne,\r\n" + 
				"                        menuGroupTwo\r\n" + 
				"                    ];\r\n" + 
				"\r\n" + 
				"                    var eventData = {\r\n" + 
				"                        menuGroups: menuGroups\r\n" + 
				"                    };\r\n" + 
				"\r\n" + 
				"                    et.fire(\r\n" + 
				"                        'ucs:helpMenuItems',\r\n" + 
				"                        eventData\r\n" + 
				"                    );\r\n" + 
				"                }\r\n" + 
				"            );\r\n" + 
				"        });\r\n" + 
				"    }, \"#UH\");\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"YSF.use('node', 'event', function(Y) {\r\n" + 
				"    Y.on('click', function(e){\r\n" + 
				"        e.preventDefault();\r\n" + 
				"        YSF.use('yhelp-bootstrap', function(Y) {\r\n" + 
				"            if(YUI.YHELP.initiate){\r\n" + 
				"                var article = Y.one('#In-product-help').getAttribute('data-inproducthelp');\r\n" + 
				"                YUI.YHELP.initiate({'locale' : 'en-us', 'product' : 'PROD_SPORTS_FAN_FOOTUS', 'page': 'article', 'params': {'doc_id': article } });\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"    }, '#In-product-help');\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"var DARLA_CONFIG = {\r\n" + 
				"  positions: {},\r\n" + 
				"  events: {\r\n" + 
				"    \"AUTO\": {\r\n" + 
				"       name: \"AUTO\",\r\n" + 
				"       sp: YUI.Fantasy.SpaceIds.spaceid,\r\n" + 
				"       autoRT: 60000,\r\n" + 
				"       autoIV: 1,\r\n" + 
				"       autoStart: true,\r\n" + 
				"       ps: {}\r\n" + 
				"    },\r\n" + 
				"    \"MANUAL_ROTATION\": {\r\n" + 
				"        name: \"MANUAL_ROTATION\",\r\n" + 
				"        sp: YUI.Fantasy.SpaceIds.spaceid,\r\n" + 
				"        ps: {}\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  onSuccess: function(evt_name) {\r\n" + 
				"    var ps;\r\n" + 
				"    if(evt_name === \"MANUAL_ROTATION\" || evt_name === \"prefetched\") {\r\n" + 
				"        ps = DARLA.evtSetting(\"MANUAL_ROTATION\", \"ps\");\r\n" + 
				"        if(ps && Object.keys(ps).length) {\r\n" + 
				"            setTimeout(function() {\r\n" + 
				"                DARLA.event(\"MANUAL_ROTATION\");\r\n" + 
				"            }, 60000);\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"//-->\r\n" + 
				"</script>\r\n" + 
				"	</head>\r\n" + 
				"\r\n" + 
				"	<body class=\"Js-yfa DarkTheme\">\r\n" + 
				"    <div id=\"outer-wrapper\" class=\"outer-wrapper\">\r\n" + 
				"      <div id=\"yucs-sidebar\" class=\"ct-ct-wrap yucs-sidebar Ta-start\">\r\n" + 
				"        <div style=\"\" id=\"yspcontentuhsidenav\" class=\"\"></div>      </div>\r\n" + 
				"\r\n" + 
				"      <div class=\"ct-box yui-sv\">\r\n" + 
				"        <div class=\"ct-box-hd yui-sv-hd\">\r\n" + 
				"            <div style=\"\" id=\"yspcontentuh\" class=\"\"><style type=\"text/css\">@font-face{font-family:uh;src:url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.eot?);src:url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.eot?#iefix) format('embedded-opentype'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.woff2?) format('woff2'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.woff?) format('woff'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.ttf?) format('truetype'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.svg?#uh) format('svg');font-weight:400;font-style:normal}[class^=Ycon],[class*=\" Ycon\"]{font-family:uh;speak:none;font-style:normal;font-weight:400;font-variant:normal;text-transform:none;line-height:1;-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale}</style><!-- empty --><!-- meta --><div id=\"yucs-meta\" data-authstate=\"signedin\" data-cobrand=\"standard\" data-crumb=\"pf3K2M0a2eL\" data-mc-crumb=\"iCxzglp8bb/\" data-gta=\"Xc/HNHQeyOM\" data-device=\"desktop\" data-experience=\"stencil-gs-grid\" data-firstname=\"bball4ever714\" data-style=\"fantasy\" data-flight=\"1508461091\" data-forcecobrand=\"standard\" data-guid=\"SOYUQYM66WFTSVMBSRPZFG3F2U\" data-host=\"football.fantasysports.yahoo.com\" data-https=\"1\" data-languagetag=\"en-us\" data-property=\"sports\" data-protocol=\"https\" data-shortfirstname=\"bball4ever714\" data-shortuserid=\"bball4ever714\" data-status=\"active\" data-spaceid=\"782200906\" data-test_id=\"\" data-userid=\"bball4ever714\" data-stickyheader=\"true\" data-headercollapse=\"\" data-uh-test=\"acctswitch\" data-beacon=\"0\" ></div><!-- /meta --> <div id=\"UH\" class=\"Row Pos(r) Start(0) T(0) End(0) Z(10) yucs \" role=\"banner\" data-protocol='https' data-property=\"sports\" data-spaceid=\"782200906\" data-stencil=\"true\"> <style>#yucs-profile {padding-left: 0!important;}\r\n" + 
				".yucs-trigger .Icon,\r\n" + 
				".yucs-trigger b {\r\n" + 
				"    line-height: 22px !important;\r\n" + 
				"    height: 22px !important;\r\n" + 
				"}\r\n" + 
				".yucs-trigger .Icon {\r\n" + 
				"   font-size: 22px !important;\r\n" + 
				"}\r\n" + 
				".yucs-trigger .AlertBadge,\r\n" + 
				".yucs-trigger .MailBadge {\r\n" + 
				"    line-height: 13px !important;\r\n" + 
				"    height: 13px !important;\r\n" + 
				"}\r\n" + 
				".yucs-mail_link_att.yucs-property-frontpage #yucs-mail_link_id i.Icon {\r\n" + 
				"    text-indent: -9999em;\r\n" + 
				"}\r\n" + 
				"/* mail badge */\r\n" + 
				".AlertBadge,\r\n" + 
				".MailBadge {\r\n" + 
				"    padding: 3px 6px 2px 6px;\r\n" + 
				"    min-width: 6px;\r\n" + 
				"    max-width: 16px;\r\n" + 
				"    margin-left: -13px;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"/* search box */\r\n" + 
				"\r\n" + 
				"#UHSearchBox {\r\n" + 
				"  border: 1px solid #ceced6 !important;\r\n" + 
				"  border-radius: 2px;\r\n" + 
				"  height: 34px;\r\n" + 
				"  *height: 18px;\r\n" + 
				"}\r\n" + 
				"#UHSearchBox:focus {\r\n" + 
				"border: 1px solid #7590f5 !important;\r\n" + 
				"  box-shadow: none !important;\r\n" + 
				"}\r\n" + 
				"/* buttons */\r\n" + 
				"#UHSearchWeb, #UHSearchProperty {\r\n" + 
				"  height: 32px !important;\r\n" + 
				"  line-height: 34px !important;\r\n" + 
				"-webkit-appearance: none;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#Stencil #UHSearchWeb,\r\n" + 
				"#Stencil #UHSearchProperty {\r\n" + 
				"    height: 30px;\r\n" + 
				"    box-sizing: content-box;\r\n" + 
				"    min-width: 92px;\r\n" + 
				"    padding-left: 14px;\r\n" + 
				"    padding-right: 14px;\r\n" + 
				"    *width: 100%;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#Stencil .UHCol1{\r\n" + 
				"z-index: 150;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"body {\r\n" + 
				"margin-top: 0px !important; \r\n" + 
				"}\r\n" + 
				".DarkTheme .yucs-trigger .Ycon {\r\n" + 
				"color: #fff;\r\n" + 
				"}\r\n" + 
				"#UH[data-property=groups] #uhWrapper {\r\n" + 
				"max-width: 1210px;\r\n" + 
				"margin: 0;\r\n" + 
				"min-width: 995px;\r\n" + 
				"}\r\n" + 
				"/*\r\n" + 
				"#UH[data-property=answers] #uhWrapper {\r\n" + 
				"max-width: 1260px;\r\n" + 
				"margin: 0;\r\n" + 
				"min-width: 1024px;\r\n" + 
				"}\r\n" + 
				"*/\r\n" + 
				"#UH[data-property=groups] .UHCol2{\r\n" + 
				"border-left: 190px solid transparent;\r\n" + 
				"padding-right: 335px;\r\n" + 
				"}\r\n" + 
				"/*\r\n" + 
				"#UH[data-property=answers] .UHCol2{\r\n" + 
				"border-left: 190px solid transparent;\r\n" + 
				"padding-right: 310px;\r\n" + 
				"}\r\n" + 
				"*/\r\n" + 
				"/*#UH[data-property=answers] .UHCol1,*/\r\n" + 
				"#UH[data-property=groups] .UHCol1 {\r\n" + 
				"  width: 190px;\r\n" + 
				"}\r\n" + 
				"#UH #Eyebrow a:link,\r\n" + 
				"#UH #Eyebrow a:visited {\r\n" + 
				"    -moz-osx-font-smoothing: grayscale;\r\n" + 
				"}</style>  <div id=\"yucs-disclaimer\" class=\"yucs-disclaimer yucs-activate yucs-hide yucs-property-sports yucs-fcb- \" data-cobrand=\"standard\" data-cu = \"0\" data-dsstext=\"Want a better search experience? {dssLink}Set your Search to Yahoo{linkEnd}\" data-dsstext-mobile=\"Search Less, Find More\" data-dsstext-mobile-ok=\"OK\" data-dsstext-mobile-set-search=\"Set Search to Yahoo\" data-dssstbtext=\"Yahoo is the preferred search engine for Firefox. Switch now.\" data-dssstb-ok=\"Yes\" data-dssstb-no=\"Not Now\" data-ylt-link=\"https://search.yahoo.com/searchset;_ylt=AuHZoKO..CRg99Cr0CqUrHFKcJ8u?pn=\" data-ylt-dssbarclose=\"/;_ylt=AqAAANUhTEeA12XySttCy0pKcJ8u\" data-ylt-dssbaropen=\"/;_ylt=AisbAYYzLO4EVnmAWf4AKcNKcJ8u\" data-ylt-dssstb-link=\"https://downloads.yahoo.com/sp-firefox;_ylt=ArJv3MI1CE1A8Is6QYJvjzlKcJ8u\" data-ylt-dssstbbarclose=\"/;_ylt=AqHqhxW96dbjOLNQjdYxvsVKcJ8u\" data-ylt-dssstbbaropen=\"/;_ylt=AuecTQkWZdHu6j.SpZwajUlKcJ8u\" data-ylt-dssCookieCleanedSuccess=\"/;_ylt=ArNLUtTfICJFPiY4WZ0PFP5KcJ8u\" data-ylt-dssCookieCleanedFailed=\"/;_ylt=AjUm0xOIUue4nO4yjj.nkkJKcJ8u\" data-linktarget=\"_top\" data-lang=\"en-us\" data-property=\"sports\" data-device=\"Desktop\" data-close-txt=\"Close this window\" data-maybelater-txt = \"Maybe Later\" data-killswitch = \"0\" data-host=\"football.fantasysports.yahoo.com\" data-spaceid=\"782200906\" data-pn=\"igsxS30IHbW\" data-dss-cookie-cleanup=\"Jys5CgB1dez\" data-pn-en-ca-mobile-frontpage=\"0SM9JZBIho6\" data-pn-de-de-mobile-frontpage=\"v7NK5OIZywI\" data-pn-es-es-mobile-frontpage=\"e185tSBP0SO\" data-pn-fr-fr-mobile-frontpage=\"Kaqh7gImwX8\" data-pn-en-in-mobile-frontpage=\"fuAahBP0TA8\" data-pn-it-it-mobile-frontpage=\"mKKJ24HiqKM\" data-pn-en-us-mobile-frontpage=\"igsxS30IHbW\" data-pn-en-sg-mobile-frontpage=\"UzTUyFPonnP\" data-pn-en-gb-mobile-frontpage=\"JRsfyRQOdlo\" data-pn-en-us-mobile-mail=\"5c8.hbak6Bd\" data-pn-en-ca-mobile-mail=\"fPOtgtMTX0x\" data-pn-de-de-mobile-mail=\"2sbM2imUxpX\" data-pn-es-es-mobile-mail=\"YbGEsfXpxA3\" data-pn-fr-fr-mobile-mail=\"X9kARRj4EXc\" data-pn-en-in-mobile-mail=\"4xf5omZFobn\" data-pn-it-it-mobile-mail=\"ZYQGcImd5qu\" data-pn-en-sg-mobile-mail=\"hG70Gz7nU8i\" data-pn-en-gb-mobile-mail=\"hYJpW.CNmB9\" data-pn-pt-br-mobile-mail=\"m3eW6Tb6VVd\" data-pn-en-us-tablet-frontpage=\"G/8O1voLSaR\" data-pn-en-us-tablet-mail=\"ieoMEU6DUPs\" data-pn-en-ca-tablet-mail=\"lZE/6fHwYIZ\" data-pn-de-de-tablet-mail=\"GSN8uA.FffW\" data-pn-es-es-tablet-mail=\"5zbUpczpn1H\" data-pn-fr-fr-tablet-mail=\"u2n/tKasGtp\" data-pn-en-in-tablet-mail=\"HvJ4v3oa/9y\" data-pn-it-it-tablet-mail=\"G.2GSvesrsH\" data-pn-en-sg-tablet-mail=\"Ff1.IkmNtT1\" data-pn-en-gb-tablet-mail=\".QcAUKbghOU\" data-pn-pt-br-tablet-mail=\"fC7EPA44Ps9\" data-news-search-yahoo-com=\"Lu2k6KKjTQf\" data-answers-search-yahoo-com=\"saMshTVEL/J\" data-finance-search-yahoo-com=\"s2vyUibyLfS\" data-images-search-yahoo-com=\"GFIU110Zrn8\" data-video-search-yahoo-com=\"H4wd2nTSgMo\" data-sports-search-yahoo-com=\"Cm.XC/nsuiX\" data-shopping-search-yahoo-com=\"CLLztPx9VG.\" data-shopping-yahoo-com=\"CLLztPx9VG.\" data-us-qa-trunk-news-search-yahoo-com =\"Lu2k6KKjTQf\" data-dss=\"1\"></div>     <div id=\"masterNav\" class='yucs-ps Bg(#2d1152)' data-ylk=\"rspns:nav;act:click;t1:a1;t2:uh-d;t3:tb;t5:pty;slk:pty;elm:itm;elmt:pty;itc:0;\"><ul id=\"Eyebrow\" class=\"Mb(12px)! Mx(0)! Mt(0)! Lh(1.7) NavLinks Z(3) H(22px) Pos(r) P(0) Whs(nw)\" role=\"navigation\"><li id=\"yucs-top-home\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(10px)\"><a href=\"https://www.yahoo.com/\" data-ylk=\"t5:home;slk:home;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\"><i id=\"my-home\" class=\"Fl(start) NavLinks_Lh(1.7) Mend(6px) Ycon YconHome Fz(13px) Mt(-1px) Td(n)! Td(n)!:h C(#fff)!\">&#x2302;</i><b class=\"Mstart(-1px) Fw(400) C(#fff)!\">Home</b></a></li><li id=\"yucs-top-mail\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://mail.yahoo.com/?.src=ym\" data-ylk=\"t5:mail;slk:mail;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Mail</a></li><li id=\"yucs-top-flickr\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.flickr.com/\" data-ylk=\"t5:flickr;slk:flickr;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Flickr</a></li><li id=\"yucs-top-tumblr\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.tumblr.com\" data-ylk=\"t5:tumblr;slk:tumblr;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Tumblr</a></li><li id=\"yucs-top-news\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.yahoo.com/news\" data-ylk=\"t5:news;slk:news;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">News</a></li><li id=\"yucs-top-sports\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"http://sports.yahoo.com/\" data-ylk=\"t5:sports;slk:sports;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Sports</a></li><li id=\"yucs-top-finance\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"http://finance.yahoo.com/\" data-ylk=\"t5:finance;slk:finance;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Finance</a></li><li id=\"yucs-top-entertainment\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.yahoo.com/entertainment/\" data-ylk=\"t5:entertainment;slk:entertainment;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Entertainment</a></li><li id=\"yucs-top-style\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.yahoo.com/lifestyle\" data-ylk=\"t5:style;slk:style;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Lifestyle</a></li><li id=\"yucs-top-answers\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://answers.yahoo.com/\" data-ylk=\"t5:answers;slk:answers;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Answers</a></li><li id=\"yucs-top-groups\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://groups.yahoo.com/\" data-ylk=\"t5:groups;slk:groups;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Groups</a></li><li id=\"yucs-top-mobile\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://mobile.yahoo.com/\" data-ylk=\"t5:mobile;slk:mobile;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Mobile</a></li><li id='yucs-more' class='D(ib) Zoom Va(t) Pos(r) Z(1) Pstart(10px) Pend(6px) MoreDropDown yucs-menu yucs-more-activate' data-ylt=\"\"><a href=\"http://everything.yahoo.com/\" role=\"button\" id='yucs-more-link' class='Pos(r) Z(1) rapidnofollow D(b) Cf P(0)!' data-ylk=\"rspns:op;t5:more;slk:more;elmt:mu;itc:1;\"><b class=\"Fl(start) Lh(1.7) Td(u):h MoreDropDown_C(#fff) MoreDropDown-on_C(#1d1da3)!\">More</b><i class=\"Fz(15px) Va(m) Lh(1) C(#fff) Mstart(2px) Ycon YconArrowDown Ta(c) Td(n) Td(n):h Fl(end) Mt(4px) MoreDropDown-on_C(#1d1da3)!\">&#x22c1;</i></a><div id='yucs-top-menu'><div class=\"Pos(a) Start(0) T(100%) MoreDropDown-Box Bdbc(#d9d9d9) Bdbs(s) Bdbw(1px) Miw(6em) Mstart(-1px) Bg(#fff) Bdstartc(#d9d9d9) Bdstarts(s) Bdstartw(1px) Bdendc(#d9d9d9) Bdends(s) Bdendw(1px) Bxsh(moresh) D(n) yui3-menu-content\"><iframe frameborder=\"0\" class=\"Pos(a) Start(0) W(100%) H(100%) Bd(0)\" src=\"https://s.yimg.com/os/mit/media/m/base/images/transparent-95031.png\"></iframe><ul class=\"yucs-leavable Pos(r) Px(10px)! My(.55em)\"><li id=\"yucs-top-weather\" ><a href=\"https://www.yahoo.com/news/weather\" data-ylk=\"t5:weather;slk:weather;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Weather</a></li><li id=\"yucs-top-politics\" ><a href=\"https://www.yahoo.com/politics\" data-ylk=\"t5:politics;slk:politics;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Politics</a></li><li id=\"yucs-top-tech\" ><a href=\"https://www.yahoo.com/tech\" data-ylk=\"t5:tech;slk:tech;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Tech</a></li><li id=\"yucs-top-shopping\" ><a href=\"http://shopping.yahoo.com/\" data-ylk=\"t5:shopping;slk:shopping;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Shopping</a></li></ul></div></div></li> </ul></div> <div id=\"uhWrapper\" class=\"Mx(a) Z(1) Pos(r) Zoom\" data-ylk=\"rspns:nav;act:click;t1:a1;t2:uh-d;itc:0;\"> <div class=\"UHCol1 Pos(a) Start(0)\" role=\"presentation\"> <style>/** * IE7+ and non-retina display */.YLogoMY { background-repeat: no-repeat; background-image: url(https://s.yimg.com/rz/d/yahoo_fantasy_en-US_s_f_pw_351x40_sports-fantasy.png); _background-image: url(https://s.yimg.com/rz/d/yahoo_fantasy_en-US_s_f_pw_351x40_sports-fantasy.gif); /* IE6 */ width: 94px !important; }.DarkTheme .YLogoMY { background-position: -352px 0px !important;}/** * For 'retina' display */@media only screen and (-webkit-min-device-pixel-ratio: 2), only screen and ( min--moz-device-pixel-ratio: 2), only screen and ( -o-min-device-pixel-ratio: 2/1), only screen and ( min-device-pixel-ratio: 2), only screen and ( min-resolution: 192dpi), only screen and ( min-resolution: 2dppx) { .YLogoMY { background-image: url(https://s.yimg.com/rz/d/yahoo_fantasy_en-US_s_f_pw_351x40_sports-fantasy_2x.png) !important; background-size: 702px 40px !important; }}</style><a class=\"YLogoMY D(b) Ov(h) Ti(-20em) Zoom Darktheme_Bgp(b_t) W(137px) H(34px) Mx(a)! \" data-ylk=\"slk:logo;t3:logo;t5:logo;elm:img;elmt:logo;\" href=\"https://sports.yahoo.com/fantasy/\" target=\"_top\" >Yahoo Fantasy</a> </div> <div class=\"UHCol2 Pos(a) Bxz(bb)\" role=\"presentation\"> <form id=\"UHSearch\" target=\"_top\" autocomplete=\"off\" data-vfr=\"uh3_sports_vert_gs\"data-webaction=\"https://search.yahoo.com/search\" action=\"https://sports.search.yahoo.com/search\" data-webaction-tar=\"search.yahoo.com\" data-verticalaction-tar=\"sports.search.yahoo.com\"  method=\"get\"class=\"M(0) P(0) UHSearch-Init\"><table class=\"W(100%) M(0)! P(0) H(100%)\"> <tbody> <tr> <td class='W(100%) W-100 Va(t) Px(0)'><input id=\"UHSearchBox\" type=\"text\" class=\"yucs_W(100%) Ff(ss)! Fz(18px)! O(n):f Fw(200)! Bxz(bb) M(0)! Py(4px)! Bdrs(0)! Bxsh(n) yucs-clear-padding_Pend(35px)\" style=\"border-color:#7590f5;\" name=\"p\" aria-describedby=\"UHSearchBox\" data-ylk=\"slk:srchinpt-hddn;itc:1;\" data-yltvsearch=\"https://sports.search.yahoo.com/search\" data-yltvsearchsugg=\"/\" data-satype=\"mini\" data-gosurl=\"https://search.yahoo.com/sugg/ss/gossip-us_ss/\" data-pubid=\"102\" data-appid=\"\" data-maxresults=\"10\" data-resize=\" \"> <div id=\"yucs-satray\" class=\"sa-tray D(n) Fz(13px) uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) Bdrstend(0) Bdrststart(0) Lh(1.5) C(#000) Td(n) Td(n):h\" data-wstext=\"Search Web for: \" data-wsearch=\"https://search.yahoo.com/search\" data-vfr=\"uh3_sports_vert_gs\" data-vsearch=\"https://sports.search.yahoo.com/search\" data-vstext= \"Search News for: \" > </div></td> <!-- \".Grid' is used here to kill white-space -->   <td class=\"Va(t) Tren(os) W(10%) Whs(nw) Pstart(4px) Pend(0) Bdcl(s)\"><style type=\"text/css\">#UH #UHSearchWeb { font-size:13px !important; border-radius:3px!important;}#UHSearchWeb, #UHSearchProperty{ height: 30px; min-width: 120px;} .ua-ie8 #UHSearchWeb, .ua-ie8 #UHSearchProperty, .ua-ie9 #UHSearchWeb, .ua-ie9 #UHSearchProperty{ height: 32px; min-width: 120px;}#UHSearchProperty, .Themable .ThemeReset #UHSearchProperty { background: #4d4946 !important; border: 0 !important; box-shadow: 0 2px #2d2b29 !important;}</style><input id=\"UHSearchProperty\" class=\"D(ib) Fz(13px) Zoom Va(t) uhBtn Ff(ss) Fw(40) Bxz(bb) Td(n) D(ib) Zoom Va(m) Ta(c) Bgr(rx) Bdrs(3px) Bdw(1px) M(0)! C(#fff) Cur(p)\" type=\"submit\" data-vfr=\"uh3_sports_vert_gs\"data-vsearch=\"https://sports.search.yahoo.com/search;_ylt=AramI3weLcVpfkkZVdtyP.xKcJ8u\"value=\"Search Sports\" data-ylk=\"t3:srch;t5:srchvert;slk:srchvert;elm:btn;elmt:srch;tar:sports.search.yahoo.com;\"></td> <td class=\"Va(t) Tren(os) W(10%) Whs(nw) fp-default_Pstart(5px) Pstart(4px) Pend(0) Bdcl(s)\"><input id=\"UHSearchWeb\" class=\"D(ib) Py(0) Zoom Va(t) uhBtn Ff(ss)! Fw(40) Bxz(bb) Td(n) D(ib) Zoom Va(m) Ta(c) Bgr(rx) Bdrs(3px) Bdw(1px) M(0)! C(#fff) uh-ignore-rapid Cur(p)\" type=\"submit\" value=\"Search Web\" data-ylk=\"t3:srch;t5:srchweb;slk:srchweb;elm:btn;elmt:srch;itc=0;tar:search.yahoo.com;\"></td> <style type=\"text/css\"> #UHSearchWeb { font-size:15px !important; border-radius:4px!important; } #UHSearchWeb, #UHSearchProperty{ height: 30px; } .ua-ie8 #UHSearchWeb, .ua-ie8 #UHSearchProperty, .ua-ie9 #UHSearchWeb, .ua-ie9 #UHSearchProperty{ height: 32px; } #UHSearchWeb, .Themable .ThemeReset #UHSearchWeb { background: #3775dd; border: 0; box-shadow: 0 2px #21487f; } </style>  </tr> </tbody> </table>  <input type=\"hidden\" data-sa=\"0\" id=\"fr\" name=\"fr\" data-ylk=\"slk:frcode-hddn;itc:1;\" value=\"uh3_sports_web_gs\" /> <input id=\"yucs-fr2\" type=\"hidden\" name=\"fr2\" value=\"p:sprt,m:sb\" data-ylk=\"slk:fr2code-hddn;itc:1;\">   </form> <!-- /#uhSearchForm --> </div> <div class=\"UHCol3 Pos(a) End(0)\" role=\"presentation\" id=\"uhNavWrapper\">  <ul class=\"Fl(end) Mend(10px)! My(6px)! Lts(-0.31em) Tren(os) Whs(nw)\"> <li class=\"D(ib) Zoom Va(t) Pos(r) Pstart(4px) Mend(20px) Lts(n)\" id=\"yucs-profile\" data-yltmenushown=\"/;_ylt=AvJlRP.05mw4TQnUEOvA.OpKcJ8u\"> <style>#yucs-profile-panel .BackgroundChange:hover{background-color:#f4f6fd} div#yucs-profile-panel{ width: 256px !important}</style><a class=\"D(ib) MouseOver Td(n) Td(n):h yucs-trigger Lts($ws) M(-10px) P(10px)\" data-ylk=\"t3:tl-lst;t5:usersigninst;slk:usersigninst;elm:tl;elmt:usr;\" href=\"javascript:void(0);\" target=\"_top\" rel=\"nofollow\" aria-label=\"Profile\" aria-haspopup=\"true\" role=\"button\" id=\"yui_3_10_3_1_1375219693637_127\"><i class=\"Va(m) W(1em) yucs-avatar yucs-menu_anchor Ycon YconProfile Fz(22px) Lh(1) C(#32007f) V(h) Mend(7px) Lts(n)\"data-avatar='{\"size\": \"32x32\", \"style\":{\"width\": 22, \"height\": 22}, \"alt\": \"Avatar\", \"bucket\": \"0\"}'>&#x1f464;</i><!-- UHC Notifications Count --><b class=\"Lh(1.8) Va(m) yucs-trigger:h_Td(u) Lts(n) Fz(13px)\" title=\"Hi, bball4ever714\">bball4ever714</b></a><noscript class=\"yucs-noscript\"><a class=\"Va(m) Td(u):h Fz(12px) Mstart(10px)\" target=\"_top\" rel=\"nofollow\" data-ylk=\"t3:tl-lst;t4:usr-mu;t5:usersigno;slk:usersigno;elm:itm;elmt:lgo;\" href=\"https://login.yahoo.com/config/login/?.crumb=vLSheczoKN0&logout=1&.direct=1&.done=https://www.yahoo.com/&logout_all=1\">Sign out</a></noscript> <style>#Stencil #yucs-profile-panel .YconPositive{font-size:38px;}#Stencil #yucs-profile-panel .Td(n) C(#324fe1), #Stencil #yucs-profile-panel .Td(n) C(#324fe1) i{color:#0078ff}#yucs-profile-panel .BackgroundChange:hover{background-color:#f2f4fe}div#yucs-profile-panel{width: 270px !important}#yucs-notifications .NotifDescription{color:#abaeb7}#yucs-acct-list.Bgc(#f5f5f5), #yucs-fs-add-acct{background-color:#f7f8ff}#yucs-fs-footer.Bgc(#f5f5f5) {background-color:#ffffff}#Stencil #yucs-profile-panel .C-grey,#Stencil #yucs-profile #yucs-signout {color:#8d919d}#Stencil #yucs-profile-panel .Bd-t{border-color:#ffffff}#Stencil #yucs-profile-panel .YconProfile{text-indent:-2px;font-size:50px}#yucs-profile-panel .Ycon{width:48px}#yucs-user-info{height:50px}</style><div id=\"yucs-profile-panel\" class=\"uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) uhArrow NorthWest Px(10px) Mt(10px) Pos(a) Lh(1.4) Start(0) Mstart(-20px) Whs(nw) D(n) C(#000)\" aria-hidden=\"true\" style=\"width: 270px!important; max-width: none !important;\" data-uh-test=\"acctswitch\"> <div id='yucs-fs-msg' class=\"Pstart(10px) Pend(30px) Mx(-10px) D(n) yucs-fs-m Whs(n) Bgc(#fcf8e3) Ov(h) Pos(r)\"><button class='Pos(a) End(0) T(0) P(0) Ta(c) Fz(18px)' style='background: none; border: 0;width: 30px; height: 38px' onclick='window.ucs.fastSwitch.hideMessage();'>&times;</button><div class='Py(16px)'>Easily switch between multiple Yahoo accounts using the new <a href='https://login.yahoo.com/manage_account'>Account Manager</a>.<br>Click &quot;Add account&quot; below to get started!</div></div> <div id='yucs-fs-acct' class='Pos(r) Mx(-10px) Pt(10px) Cf yucs-fs-m' data-grp=\"\" data-done=\"https://football.fantasysports.yahoo.com/f1/686943/11/team%3f%26week=2\" data-login=\"login.yahoo.com\" data-jsonp=\"jsapi.login.yahoo.com\" data-crumb=\"vLSheczoKN0\" data-welcome=\"Easily switch between multiple Yahoo accounts using the new <a href='https://login.yahoo.com/manage_account'>Account Manager</a>.<br>Click &quot;Add account&quot; below to get started!\" data-err=\"\" data-err-crumb=\"Your account data may be out of sync.<br>Refresh the page to see your accounts.\" data-err-user=\"It looks like you switched accounts. Refresh the browser to view your personalized page.\" data-welcomeTimeout=\"\" data-signout=\"Sign out all\" data-errTimeout='10000' data-add-mng-txt=\"Add or Manage accounts\"><div id=\"yucs-fs-loading\" class=\"yucs-mail-loading Pos(a) End(0) T(0)\" style=\"background-size:15px 15px; background-position:50%; width: 40px; height: 40px; padding: 0\"></div><div class=\"D(ib) Zoom Va(t)\"><i class=\"Va(m) W(a) Ycon YconProfile Lh(1) Mx(10px) C(#8d919d)\" data-avatar='{\"size\": \"64x64\", \"style\": {\"width\": 48, \"height\": 48, \"verticalAlign\": \"top\",\"position\":\"relative\", \"top\":1}, \"loadOnResponse\":0}'>&#x1f464;</i></div><div class=\"Lh(1.3) W(2/3) D(ib) Zoom Lts(n) Tren(a) Va(t) Ov(v)\" id=\"yucs-user-info\"><div class=\"Fw(b) Fz(15px) Ell\" id=\"yucs-fs-name\">bball4ever714</div><div class=\"Fz(13px) Ell\" id=\"yucs-fs-email\">bball4ever714</div><div class='Pt(2px)' id=\"yucs-acct-info-wrap\"><a href=\"https://login.yahoo.com/account/personalinfo?.intl=us&.lang=en-US&.done=https://football.fantasysports.yahoo.com/f1/686943/11/team%3f%26week=2&.src=fantasy&specId=usernameRegWithName\" target=\"_top\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:acctinfo;slk:acctinfo;elm:itm;elmt:acctinfo;\" class=\"Td(n) Td(u)!:h C(#0078ff)! Fz(13px)\">Account Info</a></div></div></div> <div class=\"Pt(10px) Mx(-10px) yucs-spacing\"></div> <!-- UHC Notifications --> <div id='yucs-fs-acct-wrap'></div> <div id='yucs-fs-add-acct' class=\"Mx(-10px) Bdw(0) Bgc(#f7f8ff) Bdtw(1px)! Bds(s) Bdc(#fff) ThemeReset\"><a data-ylk=\"t3:tl-lst;t4:usr-mu;slk:addacct;elm:btn;elmt:usr;\" href=\"https://login.yahoo.com/manage_account?.crumb=vLSheczoKN0&.done=https://football.fantasysports.yahoo.com/f1/686943/11/team%3f%26week=2\" class=\"Td(n) C(#0078ff)! D(b) Py(8px) Bgc(#f2f4fe):h Td(n)\"><i class='Ycon YconPositive Ta(c) C(#0078ff)! Mx(10px) D(ib) Zoom Va(t)'>&#x2a01;</i><span class=\"Fz(13px) D(ib) Zoom Va(t) Va(t) C(#0078ff)! Py(10px)\">Add account</span></a></div> <ul class=\"Pos(r) Mx(-10px) My(0)! P(0)! Bgc(#fff)\" id=\"yucs-fs-footer\"> <li class=\"Py(8px) Px(10px)\"><a id=\"yucs-signout\" class=\"W(50%) D(b) Mx(a) C(#000) Bgc(t) Td(n):h Py(6px) Px(8px) Bdrs(3px) Ta(c) Td(n) Fz(13px)\" style='border: 1px solid #cccccc; min-width: 90px' target=\"_top\" rel=\"nofollow\" href=\"https://login.yahoo.com/config/login/?.crumb=vLSheczoKN0&logout=1&.direct=1&.done=https://www.yahoo.com/&logout_all=1\" data-ylk=\"t3:tl-lst;t4:usr-mu;t5:usersigno;slk:usersigno;elm:itm;elmt:lgo;\">Sign out</a> </li> </ul></div></li> <li class=\"D(ib) Zoom Va(t) Mend(20px) Pos(r) yucs-mail_link yucs-mailpreview-ancestor\" id=\"yucs-mail\"> <a id=\"yucs-mail_link_id\" class=\"D(ib) sp yltasis yucs-fc Pos(r) MouseOver Td(n) Td(n)!:h yucs-menu-link yucs-trigger Lh(1) Lts($ws) Mx(-10px) My(-10px) Px(10px) Py(10px)\" href=\"https://mail.yahoo.com/?.src=ym\" data-ylk=\"t3:tl-lst;t5:mailsigninst;slk:mailsigninst;elm:tl;elmt:mail;\"> <b class=\"MailBadge yucs-activate Fz(11px) Pos(a) Pt(3px)! Pend(6px)! Pb(2px)! Pstart(6px)! Miw(6px)! Mah(16px)! Mt(-6px)! Mstart(-13px) Bdrs(100px) Bg($bdgc) yucs-trigger_C(#fff)! yucs-mail-count D(n) Lts(n)\" data-uri-scheme=\"https\" data-uri-path=\"mg.mail.yahoo.com/mailservices/v1/newmailcount\" data-authstate=\"signedin\" data-crumb=\"pf3K2M0a2eL\" data-mc-crumb=\"iCxzglp8bb/\"></b> <i class=\"Va(m) W(a) Mend(7px) Ycon YconMail Lh(1) Fz(22px) Lts(n)\">&#x2709;</i> <b class=\"Va(m) yucs-trigger:h_Td(u) Lts(n) Fz(13px)\" title=\"Mail\">Mail</b> </a> <div id=\"yucs-mail-panel\" class=\"uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) uhArrow NorthEast Mt(10px) Pos(a) Lh(1.4) End(0) Whs(nw) D(n)\" aria-hidden=\"true\" data-mail-txt=\"Mail\" data-uri-scheme=\"https\" data-uri-path=\"ucs.query.yahoo.com/v1/console/yql\" data-mail-view=\"Go to Mail\" data-mail-help-txt=\"Help\" data-mail-help-url=\"http://help.yahoo.com/l/us/yahoo/mail/ymail/\" data-mail-loading-txt=\"Loading...\" data-languagetag=\"en-us\" data-authstate=\"signedin\" data-middleauth-signin-text=\"Click here to view your mail\" data-popup-login-url=\"https://login.yahoo.com/config/login_verify2?.pd=c%3DOIVaOGq62e5hAP8Tv..nr5E3&.src=sc\" data-middleauthtext=\"You have {count} new messages.\" data-yltmessage-link=\"https://mrd.mail.yahoo.com/msg?mid={msgID}&fid=Inbox\" data-yltviewall-link=\"https://mail.yahoo.com/\" data-yltpanelshown=\"/\" data-ylterror=\"/\" data-ylttimeout=\"/\" data-generic-error=\"We're unable to preview your mail.<br>Go to Mail.\" data-err-style=\"D(b) Ta(c) Fw(b) Whs(n) P(10px) Fz(13px) Bgc(#f5f5f5):h Td(n) Td(n):h MouseOver\" data-nosubject=\"[No Subject]\" data-timestamp='short'><div class=\"yucs-mail-loading\"></div></div></li> <li id=\"yucs-help\" class=\" yucs-activate yucs-help yucs-menu_nav D(ib) Zoom Va(t) Pos(r)\"> <a id=\"yucs-help_button\" class=\"D(ib) yltasis yucs-trigger Lh(1) Td(n) Td(n):h\" href=\"#\" title=\"Help\" aria-haspopup=\"true\" role=\"button\" data-ylk=\"rspns:op;t3:tl-lst;t4:cog-mu;t5:cogop;slk:cogop;elm:tl;elmt:cog;itc:1;\"> <i class=\"Va(m) W(a)! Fz(22px) Ycon YconSettings C(#32007f) Lts(n) M(-10px) P(10px)\">&#x2699;</i> <b class=\"Hidden\">Help</b> </a> <div id=\"yucs-help_inner\" class=\"uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) uhArrow Mt(10px) Px(10px) Pos(a) Lh(1.4) End(0) Mend(-8px) Whs(nw) D(n) yucs-menu yucs-hm-activate\" data-yltmenushown=\"/\" aria-hidden=\"true\"> <ul id=\"yuhead-help-panel\" class=\"Mx(-10px)! Pos(r) My(0)! P(0) C(#000)\"> <li class=\"Py(8px) Px(10px)\"><a class=\"yucs-acct-link Td(n)! Td(u)!:h D(b) C(#000)!\" href=\"https://login.yahoo.com/account/personalinfo?.intl=us&.lang=en-US&.done=https://football.fantasysports.yahoo.com/f1/686943/11/team%3f%26week=2&amp;.src=fantasy&specId=usernameRegWithName\" target=\"_top\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:acctinfo;slk:acctinfo;elm:itm;elmt:acctinfo;\">Account Info</a></li> <li class=\"Pb(8px) Px(10px)\"><a id=\"yhelp-link\" data-inproducthelp=\"sports\" class=\"D(b) C(#000)! Td(n)! Td(u)!:h Fz(13px)\" href=\"javascript:void(0);\" rel=\"nofollow\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:hlp;slk:hlp;elm:itm;elmt:hlp;\">Help</a></li>  <li class=\"Px(10px) Py(8px) Bdw(0) Bdtw(1px) Bds(s) Bdc(#e2e2e6)\"><a class=\"D(b) C(#000)! Td(n)! Td(u)!:h Fz(13px)\" href=\"http://feedback.yahoo.com/forums/169858-us-sports\" rel=\"nofollow\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:sggstn;slk:sggstn;elm:itm;elmt:sggstn;\">Suggestions</a></li>   </ul> </div></li>  </ul> </div> </div> <div id=\"yhelp_container\" class=\"yui3-skin-sam\"> </div><!-- /#UH --></div><!-- alert --><!-- /alert --><!-- polyfills --><!-- /polyfills --><div id=\"yucs-location-js\" class=\"yucs-hide yucs-offscreen yucs-location-activate\" data-appid=\"yahoo.locdrop.ucs.desktop\" data-crumb=\"2nPTqm5kcYR\"><!-- empty for ie --></div>  </div>        </div>\r\n" + 
				"        <div class=\"ct-box-bd yui-sv-bd\">\r\n" + 
				"          <div style=\"overflow-x:hidden;\"></div>\r\n" + 
				"          <div class=\"yui-sv-content Ta-c\">\r\n" + 
				"            <div class=\"Page-wrap\">\r\n" + 
				"              <div class=\"Page  Phone-fill-x Tablet-fill-x\">\r\n" + 
				"                <script src=\"https://sp.yimg.com/ua/assets/js/html5shiv.iM_eFQs6MM_aR.js?m\" type=\"text/javascript\" ></script><script src=\"https://sp.yimg.com/ua/assets/js/react_bundle/common.hkDhyQeZo_ATy;js/react_bundle/react_fantasy_playersearch.v1n64u9zzHMQJ;js/react_bundle/react_fantasy_featurecue.KQOxbyn2AUKgL.js\" type=\"text/javascript\" ></script><script src=\"https://yep.video.yahoo.com/js/3/videoplayer-min.js?r=nextgen-desktop\" type=\"text/javascript\"></script><div style=\"\" id=\"yspcontentbg\" class=\"Thm-snow Page-wrap-sm\"></div><header style=\"\" id=\"yspcontentheader\" class=\"Page-hd Thm-snow Tablet-no-mtop Phone-no-mtop Page-wrap-sm\">\r\n" + 
				"    \r\n" + 
				"    <div class=\"Tst-smart-ad\">\r\n" + 
				"    <script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"    <!--\r\n" + 
				"\r\n" + 
				"    YUI().use( function (Y) {\r\n" + 
				"    \r\n" + 
				"        var SmartAd = {\r\n" + 
				"            \"varPRLeague\" : \"SZYFG1\",\r\n" + 
				"\"varPRCurrTeamID\" : 93686943,\r\n" + 
				"\"varPRCurrTeamName\" : \"Mooresville Bombers\",\r\n" + 
				"\"varPRCurrTeamRank\" : 10,\r\n" + 
				"\"varPRCurrTeamRankInBottomHalfOfLeague\" : \"True\",\r\n" + 
				"\"varPRCurrTeamScoreInBottomHalfOfLeague\" : \"True\",\r\n" + 
				"\"varPRCurrTeamWeekScore\" : 0.00,\r\n" + 
				"\"varPRCurrTeamLastWeekScore\" : 195.33,\r\n" + 
				"\"varPRCurrTeamOverallScore\" : 912.44,\r\n" + 
				"\"varPROppTeamID\" : 96686943,\r\n" + 
				"\"varPROppTeamLastWeekID\" : 95686943,\r\n" + 
				"\"varPROppTeamName\" : \"Sun Ferretts\",\r\n" + 
				"\"varPROppTeamLastWeekName\" : \"DMan\\'s GMen\",\r\n" + 
				"\"varPROppTeamRank\" : 4,\r\n" + 
				"\"varPROppTeamWeekScore\" : 0.00,\r\n" + 
				"\"varPROppTeamLastWeekScore\" : 138.97,\r\n" + 
				"\"varPROppTeamOverallScore\" : 1261.19,\r\n" + 
				"\"varPRLeagueTeams\" : {\"11686943\" : \"The Jirky Boys\", \"10686943\" : \"BigPimpin Dragons\", \"12686943\" : \"GOAT MILK\", \"96686943\" : \"Sun Ferretts\", \"92686943\" : \"G-ville GdoGGs\", \"97686943\" : \"Carolina Snoozers\", \"91686943\" : \"Binghamton BullMoose\", \"95686943\" : \"DMan\\'s GMen\", \"99686943\" : \"The K&C Gargoyles\", \"93686943\" : \"Mooresville Bombers\", \"98686943\" : \"Da Raiders\", \"94686943\" : \"TheDarkKnights\"},\r\n" + 
				"\"varPROppWonLastWeek\" : \"True\",\r\n" + 
				"\"varPRRosterChange\" : \"False\",\r\n" + 
				"\"varPRRosterAdds\" : \"False\",\r\n" + 
				"\"varPREmptyRosterSpot\" : \"True\",\r\n" + 
				"\"varPRLeagueNumTeams\" : 12,\r\n" + 
				"\"varPRLeagueScoringType\" : \"head\",\r\n" + 
				"\"varPRLeagueInPlayoffs\" : \"False\",\r\n" + 
				"\"varPRCurrTeamPlayoffChampionshipContention\" : \"False\",\r\n" + 
				"\"varPRTopScoringPlayer1Points\" : \"47.00\",\r\n" + 
				"\"varPRTopScoringPlayer1Position\" : \"DEF\",\r\n" + 
				"\"varPRTopScoringPlayer2Points\" : \"38.75\",\r\n" + 
				"\"varPRTopScoringPlayer2Position\" : \"QB\",\r\n" + 
				"\"varPRAaronRodgers\" : \"False\",\r\n" + 
				"\"varPRAaronRodgersLastWeekPoints\" : \"False\",\r\n" + 
				"\"varPRNewPlayerTD\" : \"False\",\r\n" + 
				"\"varPRNewPlayerTDPosition\" : \"False\",\r\n" + 
				"\"varPRCurrTeamWeekProjectedPts\" : 158.02,\r\n" + 
				"\"varPROppTeamWeekProjectedPts\" : 196.88,\r\n" + 
				"\"varPRMyWinsInRow\" : 1,\r\n" + 
				"\"varPRMyLossesInRow\" : 0,\r\n" + 
				"\"varPRCurrTeamWeeklyPointRank\" : 1,\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        YUI.Fantasy.SmartAdValues = function() {\r\n" + 
				"            return SmartAd;\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        YUI.Fantasy.SmartAd = function() {\r\n" + 
				"            return YUI.Fantasy.SmartAdValues();\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        YUI.Fantasy.SmartAd.get = function(value) {\r\n" + 
				"            return SmartAd[value];\r\n" + 
				"        };\r\n" + 
				"        \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    });\r\n" + 
				"    //-->\r\n" + 
				"    </script>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"      <section class=\"Thm-inherit No-bg\">\r\n" + 
				"                  \r\n" + 
				"            <div class=\"Hidden\">\r\n" + 
				"               <hr/>\r\n" + 
				"               <strong>Note:</strong> You are reading this message either because you do not have a standards-compliant browser, or because you can not see our css files.\r\n" + 
				"               <hr/>\r\n" + 
				"               <strong>Welcome to Yahoo Fantasy Sports:</strong>\r\n" + 
				"               <a href=\"#maincontent\">Skip to Content</a>\r\n" + 
				"                <a href=\"#subnav\">Skip to Section Navigation</a>\r\n" + 
				"               <hr/>\r\n" + 
				"            </div>\r\n" + 
				"\r\n" + 
				"<div class=\"Masthead Relative\"><h2 class=\"Fill-y\"><a class=\"Blocklink\" href=\"/f1\" title=\"Yahoo Sports Fantasy Football\">Yahoo Sports Fantasy Football</a></h2></div><div id=\"yspmh\" class=\"Page-masthead\"><div class=\"Tst-adlocation-MAST\"></div><div class=\"Tst-adlocation-FSRVY\"></div><div class=\"Tst-adlocation-LDRB\"><section class=\"Ad H-fixed\" id=\"yspadLDRB\"><div id=\"yspadLDRBDest\"><!-- darla ad LDRB goes here --></div></section><script type=\"text/javascript\">\r\n" + 
				";(function(){\r\n" + 
				"    var adparams = {\r\n" + 
				"        \"position\": \"LDRB\",\r\n" + 
				"        \"spaceid\":  '782200906',\r\n" + 
				"        \"rotate\": 10000,\r\n" + 
				"        \"w\": '728',\r\n" + 
				"        \"h\": '90',\r\n" + 
				"        \"spaceid\": 782200906    },\r\n" + 
				"    adContainer, \r\n" + 
				"    posCfg, \r\n" + 
				"    adCfg,\r\n" + 
				"    eventName = \"load\" + adparams.position,\r\n" + 
				"    meta = null;\r\n" + 
				"\r\n" + 
				"    adContainer = \"yspad\" + adparams.position + \"Dest\";\r\n" + 
				"\r\n" + 
				"    if (YUI && YUI.Fantasy && typeof YUI.Fantasy.SmartAdValues === \"function\") {\r\n" + 
				"      meta = YUI.Fantasy.SmartAdValues();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    posCfg = {\r\n" + 
				"        \"pos\": adparams.position, \r\n" + 
				"        \"dest\": adContainer,\r\n" + 
				"        \"fr\": \"ajax_exp\",\r\n" + 
				"        \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    adCfg = {\r\n" + 
				"        \"name\": eventName, \r\n" + 
				"        \"ps\": adparams.position, \r\n" + 
				"        \"sp\": adparams.spaceid,\r\n" + 
				"        \"ssl\": 1,\r\n" + 
				"        \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if(adparams.w) {\r\n" + 
				"        posCfg.w = adparams.w;\r\n" + 
				"        posCfg.h = adparams.h;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    DARLA_CONFIG.positions[adparams.position] = {\r\n" + 
				"      \"id\": adparams.position,\r\n" + 
				"      \"pos\": adparams.position, \r\n" + 
				"      \"dest\": adContainer,\r\n" + 
				"      \"fr\": \"ajax_exp\",\r\n" + 
				"      \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if (adparams.position === 'MAST') {\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fclose = 2;\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].metaSize = true;\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fdb = { \r\n" + 
				"        on: 1, \r\n" + 
				"        where: 'inside'\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].supports = { \r\n" + 
				"        'exp-ovr': 1, \r\n" + 
				"        'exp-push': 1, \r\n" + 
				"        'resize-to': 1 \r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].closeBtn = {\r\n" + 
				"        mode: 2,\r\n" + 
				"        useShow: 1,\r\n" + 
				"        adc: 0\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if(adparams.rotate && \"auto\" !== \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.AUTO.ps[adparams.position] = { \r\n" + 
				"        \"autoRT\": adparams.rotate,\r\n" + 
				"        \"autoIV\": 1 \r\n" + 
				"      };\r\n" + 
				"    }\r\n" + 
				"    if(adparams.rotate && \"auto\" === \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.MANUAL_ROTATION.ps[adparams.position] = {};\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"})();\r\n" + 
				"</script>\r\n" + 
				"</div></div>            <div id=\"league-info\" style=\"z-index:100005;\" class=\"Pos-r Grid-h-mid Bg-transparent Fz-xxs F-shade2 Mtop-med\">\r\n" + 
				"                <div class=\"Grid-u-1-2 Mbot-xs\">\r\n" + 
				"                     <span class=\"Ta-end Mend-sm\"><span class=\"Hidden\">Viewing Info for League:</span> SZYFG1 (ID# 686943)</span>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Grid-u-1-2 Ta-end Mbot-xs\"><script type=\"text/javascript\">\r\n" + 
				"            document.addEventListener('DOMContentLoaded', function() {\r\n" + 
				"                window.ScriptRunner.runScript('playersearch', {\"leagueId\":\"686943\",\"gameUri\":\"\\/f1\"});\r\n" + 
				"            });\r\n" + 
				"        </script><div id=\"league-info-playersearch\" class=\"D-ib\" style=\"margin-top:-13px;margin-right:-7px;margin-bottom:-12px;height:44px;vertical-align:bottom;\">\r\n" + 
				"                            <span class=\"F-icon Fz-sm C-w D-ib Cur-w\" style=\"margin:15px 15px 12px 0;opacity:0.5;\">&#xe01b;</span>\r\n" + 
				"                        </div>                    <a id=\"league-iris-chat\" href=\"https://fantasy.messenger.yahoo.com/group/UPQCOCYTEJGHROJLGEG3IX5LWA\" class=\"F-icon F-bright Fz-sm P-2 open-smack-talk\" title=\"Chat\" target=\"_blank\">&#xe015;</a>\r\n" + 
				"                    <a class=\"F-icon Fz-sm F-bright Mx-sm P-2\" id=\"In-product-help\" data-inproducthelp=\"SLN26267\" data-tst title=\"Help\" href=\"https://help.yahoo.com/kb/SLN26267.html?impressions=true\">&#xe03f;</a>\r\n" + 
				"                </div>\r\n" + 
				"            </div>    <nav class=\"Nav-main-wrap Tst-site-mainnav\">\r\n" + 
				"        <div class=\"Page-wrap-sm\">            <ul id=\"sitenav\" data-game=\"nfl\" class=\"Nav-h Nav-main\"><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1?lid=686943\" data-sec=\"MainNav\" data-slk=\"Football\">Football '17</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1?lid=686943\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/reg/joinleague/competitive\">Add Team</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/game_message_boards\">Community Forums</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/leaderboard?lid=686943\">Leaders</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/features?lid=686943\">What's New</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"https://profiles.sports.yahoo.com\">Profile</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"https://mobile.yahoo.com/fantasy/\" target=\"mobileapps\">Mobile</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/proleagues?lid=686943\">Pro Leagues</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/wallet\">Wallet</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/shop\">Fantasy Shop</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943\" data-sec=\"MainNav\" data-slk=\"League\">League</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/messages\">Message Board</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/emailleague\">Email League</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/teams\">Managers</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/starters\">Rosters</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/transactions\">Transactions</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/tradingblock\">Trading Block</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/recordbook\">Record Book</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/finances\">Dues</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/settings\">Settings</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/pickem\">League Pick'em</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/3\" data-sec=\"MainNav\" data-slk=\"MyTeam\">My Team</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3\">Roster</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/playernotes\">Player Updates</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/playerswatch\">Watch List</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/teamlog\">Team Log</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/editteaminfo\">Edit Team Info</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/matchup\" data-sec=\"MainNav\" data-slk=\"Matchups\">Matchups</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/recap?week=6&mid1=3&mid2=5\">Last Week's Recap</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/players\" data-sec=\"MainNav\" data-slk=\"Players\">Players</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/players\">Player List</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/viewkeepers\">Protected Keepers</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/leaders\">League Leaders</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/injuries\">Injury Reports</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/playerchanges\">NFL Roster Changes</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/statcorrections\">Stat Corrections</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/research\" data-sec=\"MainNav\" data-slk=\"Research\">Research</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/research\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/buzzindex\">Transaction Trends</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/playertrades\">Trade Market</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/whoshot\">Who's Hot</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/playermatchups\">Matchup Ratings</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/keystosuccess\">MVPs</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/pointsagainst\">Fantasy Points Against</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/weather\">Weather</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/ffl\">Fantasy Football Live</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"https://www.fantasypros.com/nfl/rankings/qb.php?partner=yahoo_dropdown\" target=\"_blank\">Consensus Ranks</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/draft\" data-sec=\"MainNav\" data-slk=\"Draft\">Draft</a></li><li class=\"Navitem Navitem-main stattracker has-live-games\" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/loadstattracker\" target=\"stattracker_686943\" data-sec=\"MainNav\" data-slk=\"StatTracker\">StatTracker <em class=\"Fz-xxs\">1</em> </a></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/shop\" data-sec=\"MainNav\" data-slk=\"FantasyShop\">Fantasy Shop</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=baseball\">Baseball</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=basketball\">Basketball</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=football\">Football</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=hockey\">Hockey</a></li>\r\n" + 
				"                        </ul></li>            \r\n" + 
				"  <li class=\"Navitem Navitem-main Navitem-fantasy Va-top Fl-start Topstart\" >                  <a class=\"Navtarget Fantasy-item Va-mid Py-lg Miwpx-150 Mawpx-200\" href=\"https://sports.yahoo.com/fantasy\" >\r\n" + 
				"                      <div class=\"Grid-h-mid Nowrap Relative Ptop-xs Pbot-xxs\">\r\n" + 
				"                                              <div class=\"Grid-u F-icon Fz-xl Pstart-med Wpx-30 F-shade3 F-bright\">\r\n" + 
				"                        &#xe204;\r\n" + 
				"                    </div>\r\n" + 
				"                          <div class=\"Grid-u Px-sm Fz-sm F-bright\">\r\n" + 
				"                              <span>Yahoo Fantasy</span>\r\n" + 
				"                              <span class=\"F-icon Fz-xs F-bright\">\r\n" + 
				"                                &#xe002;\r\n" + 
				"                              </span>\r\n" + 
				"                          </div>\r\n" + 
				"                      </div>\r\n" + 
				"                  </a>\r\n" + 
				"  <div class=\"Dropdown Dropdown-med Nav-fantasy Hidden No-p Ptop-med\">\r\n" + 
				"      <div class=\"Fantasy-flyout-items Px-lg\">\r\n" + 
				"        \r\n" + 
				"                <div class=\"Grid-spread-mid Section\">\r\n" + 
				"          <div class=\"Grid-u Fz-lg Ptop-lg Pbot-med\">My Teams &amp; Leagues</div>\r\n" + 
				"          <div class=\"Grid-u\">\r\n" + 
				"            <a href=\"https://fantasysports.yahoo.com/edit/usergames\" class=\"F-shade Fz-xxs\" title=\"Edit My Teams and Leagues Order\">Edit order</a>\r\n" + 
				"          </div>\r\n" + 
				"        </div><div class=\"Pbot-lg No-px Fz-xxs No-ptop\">  <div class=\"Py-med Section\">\r\n" + 
				"      <h5 class=\"Fz-med No-py Grid-h-mid\">\r\n" + 
				"        <span class=\"F-icon F-shade F-bright Grid-u Wpx-30 Fz-2xl F-positive\">&#xe220;</span>\r\n" + 
				"        <a href=\"https://sports.yahoo.com/dailyfantasy\" class=\"F-header F-bright Grid-u\">Daily Fantasy</a>\r\n" + 
				"      </h5>\r\n" + 
				"\r\n" + 
				"      <div class=\"Pstart-30 Py-sm Grid-spread-mid\">\r\n" + 
				"        <a href=\"https://sports.yahoo.com/dailyfantasy/contest/create\" class=\"Btn Btn-short Fz-xxs Grid-u\">Create a contest</a>\r\n" + 
				"        <a href=\"https://sports.yahoo.com/dailyfantasy\" class=\"Btn-primary Btn-short Fz-xxs Grid-u\">View today's contests</a>\r\n" + 
				"      </div>\r\n" + 
				"  </div>        <div class=\"Py-med Section\">\r\n" + 
				"            <h5 class=\"Fz-med No-py Grid-h-mid\"><span class=\"F-icon F-shade F-bright Grid-u Wpx-30 Fz-2xl\">&#xe204;</span><a href=\"https://football.fantasysports.yahoo.com/f1\" class=\"F-shade Grid-u\">Football</a></h5>\r\n" + 
				"                  <div class=\"Pstart-30 Py-med\"><a class=\"Fz-sm F-header F-bright\" href=\"https://football.fantasysports.yahoo.com/f1/686943/3\">Mooresville Bombers</a><div class=\"Fz-xs\"><a href=\"https://football.fantasysports.yahoo.com/f1/686943\" class=\"F-shade Fz-xxs Block\">SZYFG1</a></div></div>\r\n" + 
				"        </div></div>\r\n" + 
				"        <div class=\"Pstart-30 Ptop-med\">\r\n" + 
				"            <h3 class=\"Fz-med\">Other fantasy games</h3>\r\n" + 
				"            <div class=\"Pbot-lg No-px Fz-xxs\"><ul class=\"Grid-h-mid Grid-2col Py-sm\"><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://tournament.fantasysports.yahoo.com\">Tourney Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://baseball.fantasysports.yahoo.com\">Baseball</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://hockey.fantasysports.yahoo.com\">Hockey</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://basketball.fantasysports.yahoo.com\">Basketball</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com\">Football</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/pickem\">Pro Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/survival\">Survival Football</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/college\">College Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/bowl\">College Bowl Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://golf.fantasysports.yahoo.com/\">Golf</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://racing.fantasysports.yahoo.com/\">Auto Racing</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://fantasysports.yahoo.com/moregames\">More Games &raquo;</a></li></ul></div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"  </div>\r\n" + 
				"</li><li class='Navitem Navitem-main Fl-end'></li>            </ul>\r\n" + 
				"        </div>\r\n" + 
				"    </nav><div class=\"Subnav-main-wrap\">\r\n" + 
				"<ul id=\"sitenavsub\" class=\"Nav-h Page-wrap-sm Thm-inverse Subnav-main Fz-s Pstart-xxl Py-xs\">\r\n" + 
				"	<li class=\"Navitem first  Selected\"><a class=\"Navtarget \" href=\"/f1/686943/3\">Roster</a></li>\r\n" + 
				"	<li class=\"Navitem\"><a class=\"Navtarget \" href=\"/f1/686943/3/playernotes\">Player Updates</a></li>\r\n" + 
				"	<li class=\"Navitem\"><a class=\"Navtarget \" href=\"/f1/686943/3/playerswatch\">Watch List</a></li>\r\n" + 
				"	<li class=\"Navitem\"><a class=\"Navtarget \" href=\"/f1/686943/3/teamlog\">Team Log</a></li>\r\n" + 
				"	<li class=\"Navitem last \"><a class=\"Navtarget \" href=\"/f1/686943/3/editteaminfo\">Edit Team Info</a></li>\r\n" + 
				"</ul>\r\n" + 
				"</div>                \r\n" + 
				"</section>\r\n" + 
				"</header><div style=\"\" class=\"Page-bd Page-wrap-sm\"><div id=\"fantasyhero\" class=\"RailWrap Page-herocontentwrap\"><section class=\"Rail\"><div class=\"RailFull\"><div style=\"\" id=\"yspcontenthero\" class=\"Thm-snow Page-herocontent\"><div><div class=\"df-ad\" data-dfadposition=\"top\" data-dfadexclusive=\"1\"></div></div></div></div></section></div><div id=\"fantasy\" class=\"RailWrap Page-maincontent\"><section class=\"Rail\"><div class=\"RailFull\"><div style=\"\" id=\"yspmain\" class=\"\"><div style=\"\" id=\"ysppageheader\" class=\"Thm-snow\"></div><div style=\"\" id=\"yspcontentmainhero\" class=\"Thm-snow\"><div id=\"Alerts\" class=\"AlertsMod Thm-inherit\">\r\n" + 
				"\r\n" + 
				"<div id=\"Alert-critical-block\" class=\"Alert Alert-critical Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe046;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-critical-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div>\r\n" + 
				"<div id=\"Alert-confirmation-block\" class=\"Alert Alert-confirmation Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe032;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-success-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div>\r\n" + 
				"<div id=\"Alert-info-block\" class=\"Alert Alert-info Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe013;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-info-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div>\r\n" + 
				"<div id=\"Alert-warning-block\" class=\"Alert Alert-warning Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe046;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-warning-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div></div>\r\n" + 
				"\r\n" + 
				"<section id=\"team-card\" class=\"Mod Thm-inherit Min-height No-mx Pbot-xl Mbot-lg Ptop-xs Fz-sm F-page-header\">\r\n" + 
				"  <div class=\"Bd No-p  Grid-h-top \">\r\n" + 
				"    <div id=\"team-card-info\" class=\"Grid-u-3-8 Min-height Pend-med Pstart-xs Grid-h-top No-ptop\">\r\n" + 
				"        <div class=\"Grid-u Relative\">\r\n" + 
				"            \r\n" + 
				"            <div class=\"Mstart-lg\">\r\n" + 
				"                <img class=\"Avatar-lg Tst-teamcard-img Avatar-lg Mtop-sm\" src=\"https://s.yimg.com/dh/ap/fantasy/nfl/img/icon_10_100.png\" alt=\"avatar\">             </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-u Ptop-sm\">\r\n" + 
				"            <ul class=\"Nav-h Nav-main No-bdrbot Fz-lg Bg-transparent No-boxshadow Phone-fz-med\">\r\n" + 
				"                <li class=\"Navitem Navitem-main Wordwrap-bw\">\r\n" + 
				"                    <a class=\"Navtarget Py-sm Pstart-lg F-reset Wordwrap-bw No-case\" href=\"/f1/686943/11/team\">The Jirky Boys  <span class=\"F-icon Fz-xxs\">&#xe002;</span></a>    \r\n" + 
				"                            <ul class=\"Nav-v Dropdown Nowrap Nav-main No-mtop Fz-xxs Hidden\"><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/10/team?date=2017-10-19&week=2\">BigPimpin Dragons </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/1/team?date=2017-10-19&week=2\">Binghamton BullMoose </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/7/team?date=2017-10-19&week=2\">Carolina Snoozers </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/8/team?date=2017-10-19&week=2\">Da Raiders </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/5/team?date=2017-10-19&week=2\">DMan's GMen </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/2/team?date=2017-10-19&week=2\">G-ville GdoGGs </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/12/team?date=2017-10-19&week=2\">GOAT MILK </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/team?date=2017-10-19&week=2\">Mooresville Bombers </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/6/team?date=2017-10-19&week=2\">Sun Ferretts </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/9/team?date=2017-10-19&week=2\">The K&C Gargoyles </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/4/team?date=2017-10-19&week=2\">TheDarkKnights </a></li></ul>                </li>\r\n" + 
				"            </ul>\r\n" + 
				"\r\n" + 
				"            <ul class=\"Pstart-lg Mtop-sm Mbot-med Phone-hidden\">\r\n" + 
				"                <li><a href=\"http://profiles.sports.yahoo.com/user/5OLXT6XB3CIA2M76FBR6SRKJGU\">knz</a> <span class=\"Fz-xxs Bg-shade2 Bdrs Fw-b P-xs\" title=\"Playing Fantasy Football since 2016\">Since '16</span></li>\r\n" + 
				"                            </ul>\r\n" + 
				"            <ul class=\"team-card-stats\">\r\n" + 
				"\r\n" + 
				"                                    <li class=\"Inlineblock Mend-lg Pstart-lg Phone-ptop-lg\">\r\n" + 
				"                        <em class=\"Block F-shade Fz-xxs Mtop-xxs Uppercase\">1<sup>st</sup> Place</em>\r\n" + 
				"                        <span>5-1-0</span>\r\n" + 
				"                    </li>\r\n" + 
				"                \r\n" + 
				"                                    <li class=\"Inlineblock Mend-lg   Phone-pstart-lg Phone-ptop-lg\">\r\n" + 
				"\r\n" + 
				"                                                    <em class=\"Block F-shade Fz-xxs Mtop-xxs Uppercase\">Total Points</em>\r\n" + 
				"                            <span>1,185.07</span>\r\n" + 
				"                        \r\n" + 
				"                    </li>\r\n" + 
				"                                        <li class=\"Inlineblock Mend-lg Phone-pstart-lg Phone-ptop-lg\">\r\n" + 
				"                        <em class=\"Block F-shade Fz-xxs Cur-h Mtop-xxs Uppercase\" title=\"Average is calculated by counting completed weeks only.\">Points/Week</em>\r\n" + 
				"                        <span>197.51</span>\r\n" + 
				"                    </li>\r\n" + 
				"                                                        \r\n" + 
				"            </ul>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"            <style type=\"text/css\">\r\n" + 
				"            #tooltip .yui3-widget-bd {\r\n" + 
				"                max-width: 500px !important;\r\n" + 
				"                padding-bottom: 0px;\r\n" + 
				"            }\r\n" + 
				"            #tooltip .yui3-widget-bd p{\r\n" + 
				"                padding-bottom: 5px;\r\n" + 
				"            }\r\n" + 
				"        </style>\r\n" + 
				"        <div id=\"team-card-felo\" class=\"Grid-u-1-5 Min-height Px-lg Bdrstart Ptop-med\">\r\n" + 
				"            <div class=\"Block Fz-xxs\">\r\n" + 
				"\r\n" + 
				"                            <div class=\"F-icon Inlineblock Fz-sm Mend-xs \">&#xe204;</div>\r\n" + 
				"                            <span class=\"F-shade Uppercase \">Skill Level</span>\r\n" + 
				"                <span class=\"tooltip Wpx-500\" data-tooltip='<p>Your football skill level counts record, winning %, teams managed, and trophies won from 2009 and forward.</p><p>Trophies include 1st, 2nd and 3rd place finishes.</p>'><span class=\"Inlineblock T-hidden\">(help)</span><span aria-role=\"hidden\" class=\"F-icon Fz-xxs Mstart-sm Va-base\">&#xe013;</span></span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Teams Managed: </span>\r\n" + 
				"                <span>2</span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Record: </span>\r\n" + 
				"                <span>15-7-1</span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Winning %: </span>\r\n" + 
				"                <span>.674</span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Trophies Won: </span>\r\n" + 
				"                <span>1</span>\r\n" + 
				"            </div>\r\n" + 
				"                    </div>\r\n" + 
				"    \r\n" + 
				"            <div id=\"team-card-matchup\" class=\"Grid-u-1-4 Min-height Px-lg Ta-c Bdrstart Ptop-med\">\r\n" + 
				"            <span class=\"Block Mbot-xs Fz-xxs F-shade Uppercase\">Week 2 Matchup</span>\r\n" + 
				"            <ul>\r\n" + 
				"                <li class='Linkable Listitem No-p ' data-linkable='true' data-target='/f1/686943/matchup?week=2&mid1=11&mid2=4'>\r\n" + 
				"          <div class='Ta-c Js-hidden'><a href='/f1/686943/matchup?week=2&mid1=11&mid2=4'>View Matchup</a></div>\r\n" + 
				"          <div class='Grid-table Phone-px-med'>\r\n" + 
				"\r\n" + 
				"            <div class='Grid-u-1-2 Py-xs '>\r\n" + 
				"              <div class='Grid-bind-end Grid-h-mid Nowrap'>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u'>\r\n" + 
				"                  <div class='Ta-end Pend-xl Phone-ta-c Phone-no-p'>\r\n" + 
				"                      <div class='Fz-lg  Fw-b Ptop-lg Phone-ptop-med'>207.54</div>\r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u Phone-grid-u-2-3'>\r\n" + 
				"                  <div class='Ta-end Grid-h-top Mstart-sm Phone-ta-start Phone-no-mstart'>\r\n" + 
				"                    \r\n" + 
				"                    <span class='Grid-u Pend-lg Phone-grid-u-1-5 Phone-no-px Phone-ptop-med'><a class='Grid-u' href='/f1/686943/11'><img class=\"Avatar-med Grid-u Mend-med\" src=\"https://s.yimg.com/dh/ap/fantasy/nfl/img/icon_10_100.png\" alt=\"avatar\"> </a></span>\r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class='Grid-u-1-2 Py-xs'>\r\n" + 
				"              <div class='Grid-bind-start Grid-h-mid Nowrap'>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u'>\r\n" + 
				"                  <div class='Pstart-xl Ta-start Phone-ta-c Phone-no-p'>\r\n" + 
				"                      <div class='Fz-lg  Ptop-lg Phone-ptop-med'>203.48</div>\r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u Phone-grid-u-2-3'>\r\n" + 
				"                  <div class='Grid-h-top Ta-start Mend-sm Phone-no-mend'>\r\n" + 
				"                    <span class='Grid-u Fl-start Phone-grid-u-1-5 Phone-ptop-med'><a class='Grid-u' href='/f1/686943/4'><img class=\"Avatar-med Grid-u Mstart-med\" src=\"https://ct.yimg.com/cy/1627/24665968893_329fe082a3_90sq.jpg?ct=fantasy\" alt=\"avatar\"> </a></span>\r\n" + 
				"                    \r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </li>            </ul>\r\n" + 
				"                <ul>\r\n" + 
				"                <li class=\"Inlineblock Fz-xxs Pend-sm\">vs <a  href=\"/f1/686943/4\">TheDarkKnights</a> 1-5-0</li>\r\n" + 
				"                                    <li class=\"Inlineblock Fz-xxs Bdrstart Pstart-sm\">12<sup>th</sup></li>\r\n" + 
				"                                </ul>\r\n" + 
				"            </div>\r\n" + 
				"    \r\n" + 
				"            <div id=\"team-card-recap\" class=\"Grid-u-1-6 Min-height Px-lg Ta-c Bdrstart Ptop-med\">\r\n" + 
				"                            <div id=\"previousmatchupresult\" class=\"Linkable No-p\" data-linkable=\"true\" data-target=\"/f1/686943/matchup?week=6&mid1=11&mid2=8\" >\r\n" + 
				"                <ul>\r\n" + 
				"                    <span class=\"Block\">Week 6 Results</span>\r\n" + 
				"                    <li class=\"Block Fz-xxs Fw-b\">\r\n" + 
				"                        <span class=\"F-positive\">Won</span> <strong>152.10</strong> - 116.89                    </li>\r\n" + 
				"                </ul>\r\n" + 
				"                </div>\r\n" + 
				"                <ul>\r\n" + 
				"                    <li class=\"Fz-xxs\">vs <a href=\"/f1/686943/8\">Da Raiders</a></li>\r\n" + 
				"                    <li><img title=\"C Grade\" width=\"32\" height=\"32\" class=\"Mtop-med\" src=\"https://s.yimg.com/dh/ap/fantasy/img/C_grade@3x.png?v=1\" /></li><li class=\"Ptop-sm Fz-xxs\"><a class=\"Btn Btn-short\" href=\"/f1/686943/recap?week=6&mid1=11&mid2=8\">View Recap</a></li>                </ul>\r\n" + 
				"\r\n" + 
				"                    </div>\r\n" + 
				"          </div>\r\n" + 
				"</section>\r\n" + 
				"</div><div style=\"\" id=\"yspmaincontent\" class=\"Thm-snow\"><section class=\"Mod Thm-inherit No-m\" id=\"team-roster\">\r\n" + 
				"<header class=\"Bd No-p Bdrbot\">\r\n" + 
				"\r\n" + 
				"<div id=\"full_stat_nav\" class=\"Ptop-xs Bdrbot\">\r\n" + 
				"<div class=\"Inlineblock yfa-week-nav Grid-u Mstart-lg Mend-lg\">\r\n" + 
				"  <div class=\"Grid-h-mid Inlineblock Nowrap\">\r\n" + 
				"        <span id='selectlist_nav' class='Flyoutselectbox Grid-h-mid Flyoutselect' title='Week 2' data-uselink>\r\n" + 
				"        <a href='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=1' class='Js-prev Grid-u No-bdr-radius-end No-bdrend Pend-med Td-n Fz-xs '><span class='F-icon Fz-xs'>&#xe003;</span></a>\r\n" + 
				"        <a class='flyout_trigger No-bdr-radius Fz-xs Grid-u No-Hover-Underline' href='#'>\r\n" + 
				"            <span class='flyout-title'>\r\n" + 
				"                Week 2\r\n" + 
				"            </span>\r\n" + 
				"            \r\n" + 
				"        </a>\r\n" + 
				"        <form class='Selectbox Js-hidden' autocomplete=\"off\">\r\n" + 
				"            <select name='week' class='Mod-select'  >\r\n" + 
				"                <option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=1'    prev >Week 1</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=2' selected    >Week 2</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=3'   next  >Week 3</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=4'     >Week 4</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=5'     >Week 5</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=6'     >Week 6</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=7&stat1=S&stat2=W'     >Week 7</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=8&stat1=S&stat2=W'     >Week 8</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=9&stat1=S&stat2=W'     >Week 9</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=10&stat1=S&stat2=W'     >Week 10</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=11&stat1=S&stat2=W'     >Week 11</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=12&stat1=S&stat2=W'     >Week 12</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=13&stat1=S&stat2=W'     >Week 13</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=14&stat1=S&stat2=W'     >Week 14</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=15&stat1=S&stat2=W'     >Week 15</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=16&stat1=S&stat2=W'     >Week 16</option><option value='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=17&stat1=S&stat2=W'     >Week 17</option>\r\n" + 
				"            </select>\r\n" + 
				"        </form>\r\n" + 
				"        <a href='https://football.fantasysports.yahoo.com/f1/686943/11/team?&week=3' class='Js-next Grid-u No-bdr-radius-start No-bdrstart Pstart-med Td-n Fz-xs '><span class='F-icon Fz-xs'>&#xe005;</span></a>\r\n" + 
				"    </span>  </div>\r\n" + 
				"</div>\r\n" + 
				"<div class=\" navlist Inlineblock No-px No-mx Grid-u Nowrap My-sm Py-xxs\">\r\n" + 
				"  <ul data-dynamic=\"true\" data-target=\".stat-target\" data-nocache=\"true\" data-subnav-targets=\"#statsubnav\" class=\"Nav-h Nav-bot-pointers-north No-bdr\" id=\"statnav\" default>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c Selected\">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/11?week=2&amp;stat1=S\" class=\"Navtarget No-p\" id=\"S\" has-sub data-subnav-target=\"#subnav_S\">Stats</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  </ul>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"  <div id=\"statsubnav\" class=\"navlist statsubnav Bdr-top Mtop-sm\">\r\n" + 
				"    <div class=\" Subnav-main navlist No-p No-m Grid-full Bg-shade2\">\r\n" + 
				"        </div>\r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div class=\"Grid-table W-100 Fz-xs Py-lg\">\r\n" + 
				"    <div class=\"Grid-u Px-med Fz-sm Va-mid\">\r\n" + 
				"            <p class=\"Inlineblock\">Week 2 Total: 207.54 pts <span class=\"F-shade\">(<span class=\"proj-pts-week\">216.86</span> Projected)</span></p>\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"    <div class=\"Grid-u Ta-end Nowrap\">\r\n" + 
				"                                    <a class=\"Btn Btn-short Mend-med\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11\">Create Trade</a>\r\n" + 
				"                <a class=\"Btn Btn-short\" href=\"/f1/686943/players?myteam=1&status=11\">Compare My Team</a>\r\n" + 
				"    </div>\r\n" + 
				"</div>\r\n" + 
				"</header>\r\n" + 
				"<div class=\"Bd No-p\">\r\n" + 
				"<section class=\"stat-target\">\r\n" + 
				"<div id=\"statTable0-wrap\" class=\"tablewrap\" data-pos-type=\"O\">  <table class=\"Table-plain Table Table-px-med Table-mid Datatable Ta-center Tz-xxs ysf-rosterswapper table-scroll\" id=\"statTable0\">\r\n" + 
				"    <caption class=\"Hidden-accessible\"><span class=\"Hidden-accessible\">The Jirky Boys's Offense roster for week 2.</span></caption><thead><tr class=\"First\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >&nbsp;</div></th><th style=\"width: 230px;\" class=\"Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">&nbsp;</div></th><th title=\"Action\" colspan=\"2\" style=\"width: 20px;\" class=\"Alt\"><div >&nbsp;</div></th><th style=\"width: 14px;\" class=\"Alt Ta-c\"><div >&nbsp;</div></th><th title=\"Bye\" class=\"\"><div >&nbsp;</div></th><th title=\"\" colspan=\"3\" class=\"Alt\"><div >Fantasy</div></th><th title=\"\" colspan=\"4\" class=\"\"><div >Passing</div></th><th title=\"\" colspan=\"3\" class=\"\"><div >Rushing</div></th><th title=\"\" colspan=\"4\" class=\"Alt\"><div >Receiving</div></th><th title=\"Return\" class=\"Alt\"><div >Ret</div></th><th title=\"Miscellaneous\" class=\"\"><div >Misc</div></th><th title=\"Fumbles\" class=\"Alt\"><div >Fum</div></th><th style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></th></tr><tr class=\"Alt Last\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >Pos</div></th><th style=\"width: 230px;\" class=\"Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">Offense</div></th><th colspan=\"2\" class=\"Alt\"><div >Action</div></th><th style=\"width: 14px;\" class=\"Alt Ta-c\"><div >Forecast</div></th><th title=\"\" class=\"Ta-c\"><div >Bye</div></th><th title=\"\" style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >Fan Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >Proj Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >% Start</div></th><th title=\"Completions\" class=\"Ta-end\"><div >Comp</div></th><th title=\"Passing Yards\" class=\"Alt Ta-end\"><div >Yds</div></th><th title=\"Passing Touchdowns\" class=\"Ta-end\"><div >TD</div></th><th title=\"Interceptions\" class=\"Alt Ta-end\"><div >Int</div></th><th title=\"Rushing Attempts\" class=\"Ta-end\"><div >Att</div></th><th title=\"Rushing Yards\" class=\"Alt Ta-end\"><div >Yds</div></th><th title=\"Rushing Touchdowns\" class=\"Ta-end\"><div >TD</div></th><th title=\"Targets\" class=\"Alt Ta-end\"><div >Tgt</div></th><th title=\"Receptions\" class=\"Ta-end\"><div >Rec</div></th><th title=\"Receiving Yards\" class=\"Alt Ta-end\"><div >Yds</div></th><th title=\"Receiving Touchdowns\" class=\"Ta-end\"><div >TD</div></th><th title=\"Return Touchdowns\" class=\"Alt Ta-end\"><div >TD</div></th><th title=\"2-Point Conversions\" class=\"Last Ta-end\"><div >2PT</div></th><th title=\"Fumbles Lost\" class=\"Alt Ta-end\"><div >Lost</div></th><th style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></th></tr></thead><tbody><tr class=\"First\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"QB\">QB</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/8780/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"8780\" data-ys-playernote-view=\"notes\" id=\"playernote-8780\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/8780\" target=\"_blank\">Matt Ryan</a> <span class=\"Fz-xxs\">Atl - QB</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/green-bay-packers-atlanta-falcons-20170917001/\" target=\"sports\">Final (W) 34-23            vs  <a class=\"Inline F-rank-neutral\" title=\"GB gives up the 11th fewest fantasy points to the QB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=QB&ntid=9\">GB</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=8780\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=8780&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-8780\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-8780-video\" data-video-id=\"d72c934d-f5aa-3125-b2f0-bb7045c57fe6\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-8780\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-8780\" >25.24</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >43.41</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >90%</div></td><td class=\"Ta-end\"><div >19</div></td><td class=\"Alt Ta-end\"><div >252</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div >8</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"WR\">WR</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/24171/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"24171\" data-ys-playernote-view=\"notes\" id=\"playernote-24171\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/24171\" target=\"_blank\">Antonio Brown</a> <span class=\"Fz-xxs\">Pit - WR</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/minnesota-vikings-pittsburgh-steelers-20170917023/\" target=\"sports\">Final (W) 26-9            vs  <a class=\"Inline F-rank-neutral\" title=\"MIN gives up the 12th most fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=16\">Min</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=24171\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=24171&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-24171\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-24171-video\" data-video-id=\"a84d2ac8-dbcf-3898-9cd8-020dd3b20d74\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >9</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-24171\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-24171\" >15.11</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >25.62</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >100%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >11</div></td><td class=\"Ta-end\"><div >5</div></td><td class=\"Alt Ta-end\"><div >62</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"RB\">RB</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/29238/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-new\" data-ys-playerid=\"29238\" data-ys-playernote-view=\"notes\" id=\"playernote-29238\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-new\" title=\"New player notes\" aria-label=\"button\">New Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/29238\" target=\"_blank\">Ezekiel Elliott</a> <span class=\"Fz-xxs\">Dal - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/dallas-cowboys-denver-broncos-20170917007/\" target=\"sports\">Final (L) 42-17            @  <a class=\"Inline F-rank-bad\" title=\"DEN gives up the fewest fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=7\">Den</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=29238\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=29238&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-29238\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-29238-video\" data-video-id=\"f538f360-0133-30f2-aa02-f6a725c0782e\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >6</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-29238\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-29238\" >10.03</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >33.94</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >98%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >9</div></td><td class=\"Alt Ta-end\"><div >8</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >5</div></td><td class=\"Ta-end\"><div >4</div></td><td class=\"Alt Ta-end\"><div >14</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"TE\">TE</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/8838/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"8838\" data-ys-playernote-view=\"notes\" id=\"playernote-8838\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/8838\" target=\"_blank\">Martellus Bennett</a> <span class=\"Fz-xxs\">GB - TE</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/green-bay-packers-atlanta-falcons-20170917001/\" target=\"sports\">Final (L) 34-23            @  <a class=\"Inline F-rank-neutral\" title=\"ATL gives up the 13th fewest fantasy points to the TE position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=TE&ntid=1\">Atl</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=8838\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=8838&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-8838\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-8838-video\" data-video-id=\"c94683e4-108c-37a6-a53b-daec509c5e1c\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >8</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-8838\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-8838\" >12.96</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >15.80</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >75%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >11</div></td><td class=\"Ta-end\"><div >5</div></td><td class=\"Alt Ta-end\"><div >47</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Fz-xxs Px-xxs\" data-pos=\"W/R/T\">W/R/T</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/29281/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"29281\" data-ys-playernote-view=\"notes\" id=\"playernote-29281\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/29281\" target=\"_blank\">Michael Thomas</a> <span class=\"Fz-xxs\">NO - WR</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/new-england-patriots-new-orleans-saints-20170917018/\" target=\"sports\">Final (L) 36-20            vs  <a class=\"Inline F-rank-good\" title=\"NE gives up the 3rd most fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=17\">NE</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=29281\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=29281&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-29281\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ></div></td><td class=\"Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-29281\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-29281\" >18.96</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >22.98</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >97%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >10</div></td><td class=\"Ta-end\"><div >5</div></td><td class=\"Alt Ta-end\"><div >89</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Fz-xxs Px-xxs\" data-pos=\"W/R/T\">W/R/T</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/25681/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"25681\" data-ys-playernote-view=\"notes\" id=\"playernote-25681\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/25681\" target=\"_blank\">Terrelle Pryor Sr.</a> <span class=\"Fz-xxs\">Was - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/washington-redskins-los-angeles-rams-20170917014/\" target=\"sports\">Final (W) 27-20            @  <a class=\"Inline F-rank-bad\" title=\"LAR gives up the 8th fewest fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=14\">LAR</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=25681\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=25681&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-25681\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-25681-video\" data-video-id=\"3358dbc9-13c5-3519-b0b3-f5b6cf11e7fe\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-25681\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-25681\" >6.93</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >20.02</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >90%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >4</div></td><td class=\"Ta-end\"><div >2</div></td><td class=\"Alt Ta-end\"><div >31</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Fz-xxs Ptop-sm Lh-1 Px-xxs\" data-pos=\"Q/W/R/T\">Q/W<br/>R/T</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/28482/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"28482\" data-ys-playernote-view=\"notes\" id=\"playernote-28482\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/28482\" target=\"_blank\">Ty Montgomery</a> <span class=\"Fz-xxs\">GB - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/green-bay-packers-atlanta-falcons-20170917001/\" target=\"sports\">Final (L) 34-23            @  <a class=\"Inline F-rank-neutral\" title=\"ATL gives up the 12th most fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=1\">Atl</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=28482\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=28482&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-28482\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-28482-video\" data-video-id=\"7832d1ce-f778-3a32-a935-03df037f70b1\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >8</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-28482\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-28482\" >37.31</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >22.46</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >89%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >10</div></td><td class=\"Alt Ta-end\"><div >35</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div >7</div></td><td class=\"Ta-end\"><div >6</div></td><td class=\"Alt Ta-end\"><div >75</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/6760/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"6760\" data-ys-playernote-view=\"notes\" id=\"playernote-6760\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/6760\" target=\"_blank\">Eli Manning</a> <span class=\"Fz-xxs\">NYG - QB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/detroit-lions-new-york-giants-20170918019/\" target=\"sports\">Final (L) 24-10            vs  <a class=\"Inline F-rank-bad\" title=\"DET gives up the 8th fewest fantasy points to the QB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=QB&ntid=8\">Det</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=6760\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=6760&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-6760\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-6760-video\" data-video-id=\"7a45f4a2-27f7-3056-8784-73136e8b3155\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >8</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-6760\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-6760\" >20.35</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >25.77</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >13%</div></td><td class=\"Ta-end\"><div >22</div></td><td class=\"Alt Ta-end\"><div >239</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div >1</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/27538/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"27538\" data-ys-playernote-view=\"notes\" id=\"playernote-27538\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/27538\" target=\"_blank\">Eric Ebron</a> <span class=\"Fz-xxs\">Det - TE</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/detroit-lions-new-york-giants-20170918019/\" target=\"sports\">Final (W) 24-10            @  <a class=\"Inline F-rank-good\" title=\"NYG gives up the most fantasy points to the TE position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=TE&ntid=19\">NYG</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Add Player\" href=\"/f1/686943/addplayer?apid=27538\" class=\" F-icon Fz-xs F-positive T-action-icon-add\">&#xe035;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=27538&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-27538\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ></div></td><td class=\"Ta-c Bdrstart\"><div >7</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-27538\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-27538\" >18.25</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >13.54</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >13%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >5</div></td><td class=\"Ta-end\"><div >5</div></td><td class=\"Alt Ta-end\"><div >42</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/25741/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"25741\" data-ys-playernote-view=\"notes\" id=\"playernote-25741\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/25741\" target=\"_blank\">Doug Martin</a> <span class=\"Fz-xxs\">TB - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/chicago-bears-tampa-bay-buccaneers-20170917027/\" target=\"sports\">Final (W) 29-7            vs  <a class=\"Inline F-rank-neutral\" title=\"CHI gives up the 15th fewest fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=3\">Chi</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=25741\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=25741&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-25741\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-25741-video\" data-video-id=\"54f5d94e-0b33-3189-8fe7-1e2b6b90f2ef\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >1</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-25741\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-25741\" >0.00</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >0%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/25876/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"25876\" data-ys-playernote-view=\"notes\" id=\"playernote-25876\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/25876\" target=\"_blank\">Marvin Jones Jr.</a> <span class=\"Fz-xxs\">Det - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/detroit-lions-new-york-giants-20170918019/\" target=\"sports\">Final (W) 24-10            @  <a class=\"Inline F-rank-bad\" title=\"NYG gives up the 9th fewest fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=19\">NYG</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Add Player\" href=\"/f1/686943/addplayer?apid=25876\" class=\" F-icon Fz-xs F-positive T-action-icon-add\">&#xe035;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=25876&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-25876\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ></div></td><td class=\"Ta-c Bdrstart\"><div >7</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-25876\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-25876\" >11.11</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >14.09</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >11%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >5</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div >27</div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/9037/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"9037\" data-ys-playernote-view=\"notes\" id=\"playernote-9037\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/9037\" target=\"_blank\">Danny Amendola</a> <span class=\"Fz-xxs\">NE - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/new-england-patriots-new-orleans-saints-20170917018/\" target=\"sports\">Final (W) 36-20            @  <a class=\"Inline F-rank-good\" title=\"NO gives up the 6th most fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=18\">NO</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=9037\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=9037&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-9037\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-9037-video\" data-video-id=\"bc15e48a-71e2-3c18-9632-2ec7c5968e13\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >9</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-9037\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-9037\" >0.00</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >1%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Last bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/30232/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"30232\" data-ys-playernote-view=\"notes\" id=\"playernote-30232\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/30232\" target=\"_blank\">Tarik Cohen</a> <span class=\"Fz-xxs\">Chi - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/chicago-bears-tampa-bay-buccaneers-20170917027/\" target=\"sports\">Final (L) 29-7            @  <a class=\"Inline F-rank-neutral\" title=\"TB gives up the 16th most fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=27\">TB</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=30232\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=30232&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-30232\">&#xe061;</a></div></td><td style=\"width: 14px;\" class=\"Alt Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-30232-video\" data-video-id=\"30f0c646-84c2-336b-bb81-ba415aaedacf\">Video Forecast</a></span></div></td><td class=\"Ta-c Bdrstart\"><div >9</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div ><a href=\"#pps-30232\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-30232\" >18.18</a></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >15.20</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >37%</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >7</div></td><td class=\"Alt Ta-end\"><div >13</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div >9</div></td><td class=\"Ta-end\"><div >8</div></td><td class=\"Alt Ta-end\"><div >55</div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Last Ta-end\"><div >1</div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr></tbody></table></div><div id=\"statTable1-wrap\" class=\"tablewrap\" data-pos-type=\"DT\">  <table class=\"Table-plain Table Table-px-med Table-mid Datatable Ta-center Tz-xxs ysf-rosterswapper table-scroll\" id=\"statTable1\">\r\n" + 
				"    <caption class=\"Hidden-accessible\"><span class=\"Hidden-accessible\">The Jirky Boys's Defense/Special Teams roster for week 2.</span></caption><thead><tr class=\"First\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >&nbsp;</div></th><th style=\"width: 230px;\" class=\"Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">&nbsp;</div></th><th title=\"Action\" colspan=\"2\" style=\"width: 20px;\" class=\"Alt\"><div >&nbsp;</div></th><th title=\"Bye\" class=\"Alt\"><div >&nbsp;</div></th><th title=\"\" colspan=\"3\" class=\"\"><div >Fantasy</div></th><th title=\"\" class=\"Alt\"><div >&nbsp;</div></th><th title=\"\" colspan=\"2\" class=\"\"><div >Tackles</div></th><th title=\"\" colspan=\"2\" class=\"\"><div >Turnovers</div></th><th title=\"Touchdowns\" class=\"\"><div >TD</div></th><th title=\"Miscellaneous\" colspan=\"2\" class=\"Alt\"><div >Misc</div></th><th title=\"Return\" class=\"Alt\"><div >Ret</div></th><th style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></th></tr><tr class=\"Alt Last\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >Pos</div></th><th style=\"width: 230px;\" class=\"Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">Defense/Special Teams</div></th><th colspan=\"2\" class=\"Alt\"><div >Action</div></th><th title=\"\" class=\"Alt Ta-c\"><div >Bye</div></th><th title=\"\" style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >Fan Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >Proj Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >% Start</div></th><th title=\"Points Allowed\" class=\"Alt Ta-end\"><div >Pts vs.</div></th><th title=\"Sack\" class=\"Ta-end\"><div >Sack</div></th><th title=\"Safety\" class=\"Alt Ta-end\"><div >Safe</div></th><th title=\"Interception\" class=\"Ta-end\"><div >Int</div></th><th title=\"Fumble Recovery\" class=\"Alt Ta-end\"><div >Fum Rec</div></th><th title=\"Touchdown\" class=\"Ta-end\"><div >TD</div></th><th title=\"Block Kick\" class=\"Alt Ta-end\"><div >Blk Kick</div></th><th title=\"Defensive Yards Allowed\" class=\"Last Ta-end\"><div >Yds Allow</div></th><th title=\"Kickoff and Punt Return Touchdowns\" class=\"Alt Ta-end\"><div >TD</div></th><th style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></th></tr></thead><tbody><tr class=\"First\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"DEF\">DEF</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/teams/car/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-old\" data-ys-playerid=\"100029\" data-ys-playernote-view=\"notes\" id=\"playernote-100029\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/teams/car\" target=\"_blank\">Carolina</a> <span class=\"Fz-xxs\">Car - DEF</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/buffalo-bills-carolina-panthers-20170917029/\" target=\"sports\">Final (W) 9-3            vs  <a class=\"Inline F-rank-good\" title=\"BUF gives up the 5th most fantasy points to the DEF position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=DEF&ntid=2\">Buf</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=100029\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=100029&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-100029\">&#xe061;</a></div></td><td class=\"Alt Ta-c Bdrstart\"><div >11</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div ><a href=\"#pps-100029\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-100029\" >51.00</a></div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >32.63</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >73%</div></td><td class=\"Alt Ta-end\"><div >3</div></td><td class=\"Ta-end\"><div >3</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >176</div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"DEF\">DEF</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><div class=\"Nowrap emptyplayer Inlineblock\"><span>(Empty)</span></div>  </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"> </span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><img src=\"https://s.yimg.com/lq/i/us/sp/fn/default/full/1x1clear.gif\" width=\"14\" height=\"14\" alt=\"Actions are not available\"></div></td><td style=\"width: 20px;\" class=\"\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div ></div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >0%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr><tr class=\"Last bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"width: 230px;\" class=\"Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/teams/den/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-old\" data-ys-playerid=\"100007\" data-ys-playernote-view=\"notes\" id=\"playernote-100007\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/teams/den\" target=\"_blank\">Denver</a> <span class=\"Fz-xxs\">Den - DEF</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status Fw-b\"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/dallas-cowboys-denver-broncos-20170917007/\" target=\"sports\">Final (W) 42-17            vs  <a class=\"Inline F-rank-bad\" title=\"DAL gives up the 9th fewest fantasy points to the DEF position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=DEF&ntid=6\">Dal</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 20px;\" class=\"Alt Bdrstart\"><div ><a title=\"Propose Trade\" href=\"/f1/686943/3/proposetrade?stage=1&mid2=11&tpids2[]=100007\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></div></td><td style=\"width: 20px;\" class=\"\"><div ><a title =\"Add to Watch List\" href=\"/f1/686943/addplayerwatch?mid=3&apid=100007&crumb=4G1FWojSeD9&done=https%3A%2F%2Ffootball.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3Fweek%3D2\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-686943-100007\">&#xe061;</a></div></td><td class=\"Alt Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div ><a href=\"#pps-100007\" title=\"Show Points Per Stat Breakdown\" data-stat-note-x-offset=\"-305\" class=\"pps Fw-b has-stat-note \"  data-stat-note-id=\"pps-100007\" >40.00</a></div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >22.19</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >78%</div></td><td class=\"Alt Ta-end\"><div >17</div></td><td class=\"Ta-end\"><div >2</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >2</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >1</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td class=\"Ta-end\"><div >268</div></td><td class=\"Alt Last Ta-end\"><div ><span class=\"F-faded\">0</span></div></td><td style=\"padding-left: 5px;\" class=\"No-p Spacer\"><div ></div></td></tr></tbody></table></div></section><div class=\"Ov-h\">\r\n" + 
				"<div class=\"Fl-start\">\r\n" + 
				"  <span class=\"Ta-end P-med Fz-sm Inlineblock Va-base\" style=\"width: 350px\">\r\n" + 
				"    Total Week 2 Fantasy Points:    <strong class=\"Pstart-lg\">177.54</strong>\r\n" + 
				"  </span>\r\n" + 
				"  <span class=\"Inlineblock Py-med Px-lg Fz-sm Va-base\">\r\n" + 
				"        <span class=\"proj-pts-week\">216.86</span> (Projected)  </span>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"    </div>\r\n" + 
				"    </div>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"\r\n" + 
				".ysf-stat-note {\r\n" + 
				"    z-index: 10000;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<section class=\"Thm-inherit\">\r\n" + 
				"<div id=\"ysf-stat-notes\">\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-8780\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-8780\"></a>\r\n" + 
				"                    <h2>Matt Ryan Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">19 Completions</span></td><td class=\"Ta-end\">0.11</td><td class=\"Ta-end\"><span>2.09</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">252 Passing Yards</span></td><td class=\"Ta-end\">0.07</td><td class=\"Ta-end\"><span>16.80</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Passing Touchdowns</span></td><td class=\"Ta-end\">5.00</td><td class=\"Ta-end\"><span>5.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Rushing Attempts</span></td><td class=\"Ta-end\">0.21</td><td class=\"Ta-end\"><span>0.21</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">8 Rushing Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>1.14</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-24171\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-24171\"></a>\r\n" + 
				"                    <h2>Antonio Brown Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">5 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>6.25</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">62 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>8.86</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-29238\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-29238\"></a>\r\n" + 
				"                    <h2>Ezekiel Elliott Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">9 Rushing Attempts</span></td><td class=\"Ta-end\">0.21</td><td class=\"Ta-end\"><span>1.89</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">8 Rushing Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>1.14</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">4 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>5.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">14 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>2.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-8838\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-8838\"></a>\r\n" + 
				"                    <h2>Martellus Bennett Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">5 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>6.25</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">47 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>6.71</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-29281\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-29281\"></a>\r\n" + 
				"                    <h2>Michael Thomas Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">5 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>6.25</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">89 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>12.71</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-25681\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-25681\"></a>\r\n" + 
				"                    <h2>Terrelle Pryor Sr. Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">2 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>2.50</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">31 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>4.43</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-28482\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-28482\"></a>\r\n" + 
				"                    <h2>Ty Montgomery Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">10 Rushing Attempts</span></td><td class=\"Ta-end\">0.21</td><td class=\"Ta-end\"><span>2.10</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">35 Rushing Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>5.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Rushing Touchdowns</span></td><td class=\"Ta-end\">6.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">6 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>7.50</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">75 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>10.71</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Receiving Touchdowns</span></td><td class=\"Ta-end\">6.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-6760\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-6760\"></a>\r\n" + 
				"                    <h2>Eli Manning Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">22 Completions</span></td><td class=\"Ta-end\">0.11</td><td class=\"Ta-end\"><span>2.42</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">239 Passing Yards</span></td><td class=\"Ta-end\">0.07</td><td class=\"Ta-end\"><span>15.93</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Passing Touchdowns</span></td><td class=\"Ta-end\">5.00</td><td class=\"Ta-end\"><span>5.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Interceptions</span></td><td class=\"Ta-end\">-3.00</td><td class=\"Ta-end\"><span>-3.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-27538\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-27538\"></a>\r\n" + 
				"                    <h2>Eric Ebron Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">5 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>6.25</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">42 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>6.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Receiving Touchdowns</span></td><td class=\"Ta-end\">6.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-25741\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-25741\"></a>\r\n" + 
				"                    <h2>Doug Martin Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-25876\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-25876\"></a>\r\n" + 
				"                    <h2>Marvin Jones Jr. Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>1.25</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">27 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>3.86</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Receiving Touchdowns</span></td><td class=\"Ta-end\">6.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-9037\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-9037\"></a>\r\n" + 
				"                    <h2>Danny Amendola Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-30232\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-30232\"></a>\r\n" + 
				"                    <h2>Tarik Cohen Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">7 Rushing Attempts</span></td><td class=\"Ta-end\">0.21</td><td class=\"Ta-end\"><span>1.47</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">13 Rushing Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>1.86</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">8 Receptions</span></td><td class=\"Ta-end\">1.25</td><td class=\"Ta-end\"><span>10.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">55 Receiving Yards</span></td><td class=\"Ta-end\">0.14</td><td class=\"Ta-end\"><span>7.86</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Fumbles Lost</span></td><td class=\"Ta-end\">-3.00</td><td class=\"Ta-end\"><span>-3.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-100029\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-100029\"></a>\r\n" + 
				"                    <h2>Carolina Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">3 Sack</span></td><td class=\"Ta-end\">3.00</td><td class=\"Ta-end\"><span>9.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Points Allowed 1-6 points</span></td><td class=\"Ta-end\">24.00</td><td class=\"Ta-end\"><span>24.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Defensive Yards Allowed 100-199</span></td><td class=\"Ta-end\">18.00</td><td class=\"Ta-end\"><span>18.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-0_DEF\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-0_DEF\"></a>\r\n" + 
				"                    <h2>--empty-- Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-100007\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-100007\"></a>\r\n" + 
				"                    <h2>Denver Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                                            <table class=\"Table\">\r\n" + 
				"                            <thead>\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <th class=\"ysf-stat-name\">Stat</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Points Per</th>\r\n" + 
				"                                    <th class=\"Ta-end\">Fantasy Points</th>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </thead>\r\n" + 
				"                            <tbody>\r\n" + 
				"                                <tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">2 Sack</span></td><td class=\"Ta-end\">3.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">2 Interception</span></td><td class=\"Ta-end\">3.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Touchdown</span></td><td class=\"Ta-end\">6.00</td><td class=\"Ta-end\"><span>6.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Points Allowed 14-20 points</span></td><td class=\"Ta-end\">12.00</td><td class=\"Ta-end\"><span>12.00</span></td></tr><tr><td class=\"ysf-stat-name Grid-h-mid\"><span class=\"Grid-u Pend-sm\">1 Defensive Yards Allowed 200-299</span></td><td class=\"Ta-end\">10.00</td><td class=\"Ta-end\"><span>10.00</span></td></tr>                                    </tbody>\r\n" + 
				"                                </table>\r\n" + 
				"\r\n" + 
				"                                \r\n" + 
				"                                        </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"    </div>\r\n" + 
				"</section>\r\n" + 
				"<section id=\"video-forecast\" class=\"Mod Overlay yui3-overlay-content-dark\" data-overlay-name=\"video-forecast\" data-overlay-width=\"1020px\"> \r\n" + 
				"    <header class=\"Hd Px-xxl Py-sm F-shade3\">\r\n" + 
				"        <div class=\"Grid-h-mid\">\r\n" + 
				"            <div class=\"Grid-u\">\r\n" + 
				"                <span class=\"Logo Block Wpx-90 T-hidden\">Yahoo Fantasy</span>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Grid-u F-header Fz-xl Fw-200 Mstart-lg C-w\">\r\n" + 
				"                <span>Fearless Forecast</span>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Grid-u Va-mid Ta-end Mstart-xxl\">\r\n" + 
				"                <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-med Mtop-sm\">&#xe009;</span>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </header>\r\n" + 
				"    <div class=\"Bd Player-bg Grid-h-top\">\r\n" + 
				"            <div id=\"video-forecast-container\" class=\"Grid-u\" style=\"width: 700px; height: 380px;\"></div>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"    YSF.use('event', 'ysf-video-player', function (Y) {\r\n" + 
				"      Y.Fantasy.VideoPlayer.init({\"video\":{\"width\":700,\"height\":380,\"config\":{\"site\":\"fantasy\",\"region\":\"US\",\"lang\":\"en-US\",\"autoplay\":true,\"pageSpaceId\":null,\"playlist\":{\"videoRecommendations\":false,\"mediaItems\":[]},\"playlistUI\":{\"show\":true,\"position\":\"bottom\",\"theme\":\"dark\"},\"YVAP\":{\"accountId\":\"82\",\"playContext\":\"nflfantasy\",\"timeout\":5000,\"adsReady\":true},\"logoOverlay\":\"bottomLeft\"}},\"id\":\"video-forecast\",\"overlay\":{\"width\":1020,\"title\":\"Fearless Forecast\"},\"meta\":{\"width\":300}});\r\n" + 
				"    });\r\n" + 
				"</script>        <div class=\"player-meta Grid-u Px-med F-bright\" style=\"width: 300px\">\r\n" + 
				"            <h2 class=\"player-meta-title No-mtop Fz-lg Mbot-lg\"></h2>\r\n" + 
				"            <p class=\"player-meta-provider Mbot-lg\">\r\n" + 
				"                by <a href=\"\" class=\"player-meta-provider-link F-bright\"></a>\r\n" + 
				"            </p>\r\n" + 
				"            <p class=\"player-meta-desc Fz-med\"></p>\r\n" + 
				"        </div>\r\n" + 
				"            </div>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<section class=\"Mod Thm-inherit tablelegend No-mend\" ><div class=\"Bd Grid-2col Grid-spread-mid Grid-full Bdrtop Mtop-xl\"><div class=\"Grid-u-1-4\">  <ul class=\"\" id=\"legend\">\r\n" + 
				"  <li class=\"Inlineblock Pend-xxl\">\r\n" + 
				"    <a href=\"#\" class=\" yfa-overlay-trigger\" data-overlay-name=\"legend\" id=\"0\">Legend</a>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Inlineblock Pend-xxl\">\r\n" + 
				"    <a href=\"#\" class=\" yfa-overlay-trigger\" data-overlay-name=\"stats_legend\" id=\"1\">Stats</a>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Inlineblock Pend-xxl\">\r\n" + 
				"    <a href=\"#\" class=\" yfa-overlay-trigger\" data-overlay-name=\"positions_legend\" id=\"2\">Positions</a>\r\n" + 
				"  </li>\r\n" + 
				"  </ul>\r\n" + 
				"</div> <div class=\"Grid-u-3-4 Ta-end\"><div class=\"official-stats Fz-xxs\">Week 2 stats may change if <a href=\"/f1/686943/statcorrections\">stat corrections</a> are applied by Thursday, Sep 21. All game times are shown in EDT.</div></div></div></section>\r\n" + 
				"<section class=\"Thm-override Thm-frosted-glass\">\r\n" + 
				"\r\n" + 
				"<section id=\"legend\" class=\"Mod No-m No-p yfa-overlay Bg-overlay\" data-overlay-name=\"legend\">\r\n" + 
				"     <header class=\"Hd Px-xxl Relative\">\r\n" + 
				"        <h2 class=\"F-header Ptop-xxl\">Details Legend</h2>\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\" href=\"\">&#xe009;</span>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <section class=\"Bd Thm-inherit Px-xxl Py-lg\" style=\"overflow-y: auto; height: 400px;\">\r\n" + 
				"        <table class=\"Table Table-plain Fz-xxs\" >\r\n" + 
				"<tr class=\"Bg-shade2\"><td colspan=\"2\" class=\"yspdetailttl\"><b>Notes</b></td></tr>\r\n" + 
				"<tr><td>Rank: Projected</td><td>Player's 2017 projected season rank. Projection data provided by Yahoo Sports.</td></tr>\r\n" + 
				"<tr><td>Rank: Actual</td><td>Player's ranking based on stat filter selected.</td></tr>\r\n" + 
				"<tr><td><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-new\" title=\"New player notes\" aria-label=\"button\">New Player Note</span></td><td>New player notes in the last 24 hours. Click to view notes and other information.</td></tr>\r\n" + 
				"<tr><td><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></td><td>Player notes available. Click to view notes and other information.</td></tr>\r\n" + 
				"<tr><td><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></td><td>No new player notes available. Click to view other information.</td></tr>\r\n" + 
				"<tr><td><span class=\"yfa-icon video-new\">Video Playlist</span></td><td>New Fantasy Forecast video. Click to view video.</td></tr>\r\n" + 
				"<tr><td class=\"Va-top\">*</td><td>This player's Fantasy Point total includes points not displayed on your roster page. These points come from categories not normally associated with this player's position (e.g., a kicker who throws a touchdown pass, a running back who blocks a kick, etc.)</td></tr>\r\n" + 
				"<tr class=\"Bg-shade2\"><td colspan=\"2\" class=\"yspdetailttl\"><b>Player Status</b></td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">D</td><td>Doubtful</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">NA</td><td>Inactive: Coach's Decision or Not on Roster</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">IR</td><td>Injured Reserve</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">IR-R</td><td>Injured Reserve - Designated for Return</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">O</td><td>Out</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">PUP-P</td><td>Physically Unable to Perform (Preseason)</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">PUP-R</td><td>Physically Unable to Perform (Regular-season)</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">P</td><td>Probable</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">Q</td><td>Questionable</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">SUSP</td><td>Suspended</td></tr>\r\n" + 
				"<tr class=\"Bg-shade2\"><td colspan=\"2\" class=\"yspdetailttl\"><b>Action</b></td></tr>\r\n" + 
				"<tr><td><a title=\"Add Player\" href=\"#\" class=\" F-icon Fz-xs F-positive T-action-icon-add\">&#xe035;</a></td><td>Add Player</td></tr>\r\n" + 
				"<tr><td><a title=\"The add action is disabled\" href=\"#\" class=\"noactionda-show F-icon Fz-xs F-disabled T-action-icon-disabled-add\">&#xe035;</a></td><td>Add Player functionality is disabled</td></tr>\r\n" + 
				"<tr><td><a title=\"No moves left\" href=\"#\" class=\"noactionna-show F-icon Fz-xs F-negative T-action-icon-no-add\">&#xe035;</a></td><td>No more roster moves available</td></tr>\r\n" + 
				"<tr><td><a title=\"Drop Player\" href=\"#\" class=\" F-icon Fz-xs F-negative T-action-icon-drop\">&#xe033;</a></td><td>Drop Player</td></tr>\r\n" + 
				"<tr><td><a title=\"Player is on can't cut list\" href=\"#\" class=\"noactioncc-show F-icon Fz-xs F-negative T-action-icon-cantcut\">&#xe038;</a></td><td>Player on Can't Cut list</td></tr>\r\n" + 
				"<tr><td><a title=\"Propose Trade\" href=\"#\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></td><td>Propose Trade</td></tr>\r\n" + 
				"<tr><td><a title=\"No trades left\" href=\"#\" class=\"noactionnt-show F-icon Fz-xs F-disabled T-action-icon-notrade\">&#xe037;</a></td><td>No more trades available</td></tr>\r\n" + 
				"<tr><td><a title=\"The trade action is disabled\" href=\"#\" class=\"noactiondt-show F-icon Fz-xs F-disabled T-action-icon-disabled-trade\">&#xe037;</a></td><td>Trade functionality is disabled</td></tr>\r\n" + 
				"<tr><td><a title=\"Actions locked by commissioner\" href=\"#\" class=\"noactionl-show F-icon Fz-xs F-disabled T-action-icon-locked\">&#xe046;</a></td><td>Actions locked by commissioner</td></tr>\r\n" + 
				"<tr><td><a title =\"Add to Watch List\" href=\"#\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-_0-0\">&#xe061;</a></td><td>Add player to Watch List</td></tr>\r\n" + 
				"<tr><td><a title =\"Remove from Watch List\" href=\"#\" class=\"watchw F-icon Fz-sm F-watch\"  name=\"w-0-0\">&#xe023;</a></td><td>Remove player from Watch List</td></tr>\r\n" + 
				"<tr><td><a title =\"Watch List is not available\" href=\"\" class=\"noactiondw-notinleague disabled F-icon Fz-sm F-disabled\"  name=\"w-0-0\">&#xe061;</a></td><td>Watch List is not available</td></tr>\r\n" + 
				"</table>\r\n" + 
				"    </section>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<section id=\"stats_legend\" class=\"Mod No-m No-p yfa-overlay Bg-overlay\" data-overlay-name=\"stats_legend\">\r\n" + 
				"     <header class=\"Hd Px-xxl Relative\">\r\n" + 
				"        <h2 class=\"F-header Ptop-xxl\">Stat Categories</h2>\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\" href=\"\">&#xe009;</span>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <section class=\"Bd Thm-inherit Px-xxl Py-lg\" style=\"overflow-y: auto; height: 400px;\">\r\n" + 
				"        <table class=\"Table Table-plain Fz-xxs\" >\r\n" + 
				"<tr class=\"Bg-shade Fz-xs\"><td colspan=\"2\">Offense &amp; Kickers:</td></tr>\r\n" + 
				"<tr class=\"Bg-shade\"><td><b>Abbreviation</b></td><td><b>What it Means</b></td></tr>\r\n" + 
				"<tr><td>Pass Att</td><td>Passing Attempts</td></tr>\r\n" + 
				"<tr><td>Comp</td><td>Completions</td></tr>\r\n" + 
				"<tr><td>Inc</td><td>Incomplete Passes</td></tr>\r\n" + 
				"<tr><td>Pass Yds</td><td>Passing Yards</td></tr>\r\n" + 
				"<tr><td>Pass TD</td><td>Passing Touchdowns</td></tr>\r\n" + 
				"<tr><td>Int</td><td>Interceptions Thrown</td></tr>\r\n" + 
				"<tr><td>Sack</td><td>Times Sacked</td></tr>\r\n" + 
				"<tr><td>Rush Att</td><td>Rushing Attempts</td></tr>\r\n" + 
				"<tr><td>Rush Yds</td><td>Rushing Yards</td></tr>\r\n" + 
				"<tr><td>Rush TD</td><td>Rushing Touchdowns</td></tr>\r\n" + 
				"<tr><td>Rec</td><td>Receptions</td></tr>\r\n" + 
				"<tr><td>Rec Yds</td><td>Receiving Yards</td></tr>\r\n" + 
				"<tr><td>Rec TD</td><td>Receiving Touchdowns</td></tr>\r\n" + 
				"<tr><td>Ret Yds</td><td>Return Yards</td></tr>\r\n" + 
				"<tr><td>Ret TD</td><td>Return Touchdowns</td></tr>\r\n" + 
				"<tr><td>Off Fum Ret TD</td><td>Offensive Fumble Return Touchdowns</td></tr>\r\n" + 
				"<tr><td>2-PT</td><td>Two-point Conversions</td></tr>\r\n" + 
				"<tr><td>Fum</td><td>Fumble</td></tr>\r\n" + 
				"<tr><td>Fum Lost</td><td>Fumble Lost</td></tr>\r\n" + 
				"<tr><td>FG</td><td>Field Goal</td></tr>\r\n" + 
				"<tr><td>FGM</td><td>Field Goal Missed</td></tr>\r\n" + 
				"<tr class=\"Bg-shade Fz-xs\"><td colspan=\"2\">Defense:</td></tr>\r\n" + 
				"<tr class=\"Bg-shade\"><td><b>Abbreviation</b></td><td><b>What it Means</b></td></tr>\r\n" + 
				"<tr><td>Pts Allow</td><td>Points Allowed</td></tr>\r\n" + 
				"<tr><td>Tack Solo</td><td>Solo Tackles</td></tr>\r\n" + 
				"<tr><td>Tack Ast</td><td>Assisted Tackles</td></tr>\r\n" + 
				"<tr><td>Pass Def</td><td>Passes Defended</td></tr>\r\n" + 
				"<tr><td>Sack</td><td>Sacks Recorded</td></tr>\r\n" + 
				"<tr><td>Int</td><td>Interceptions Made</td></tr>\r\n" + 
				"<tr><td>Fum Rec</td><td>Fumbles Recovered</td></tr>\r\n" + 
				"<tr><td>Fum Force</td><td>Fumbles Forced</td></tr>\r\n" + 
				"<tr><td>TD</td><td>Touchdowns</td></tr>\r\n" + 
				"<tr><td>Safe</td><td>Safeties</td></tr>\r\n" + 
				"<tr><td>Blk Kick</td><td>Blocked Kicks</td></tr>\r\n" + 
				"<tr><td>Ret Yds</td><td>Return Yards</td></tr>\r\n" + 
				"<tr><td>Ret TD</td><td>Return Touchdowns</td></tr>\r\n" + 
				"</table>    </section>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"<section id=\"positions_legend\" class=\"Mod No-m No-p yfa-overlay Bg-overlay\" data-overlay-name=\"positions_legend\">\r\n" + 
				"     <header class=\"Hd Px-xxl Relative\">\r\n" + 
				"        <h2 class=\"F-header Ptop-xxl\">Positions Legend</h2>\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\" href=\"\">&#xe009;</span>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <section class=\"Bd Thm-inherit Px-xxl Py-lg\" style=\"overflow-y: auto; height: 400px;\">\r\n" + 
				"        <table class=\"Table Table-plain Fz-xxs\" >\r\n" + 
				" <tr class=\"Bg-shade\">\r\n" + 
				"  <td ><b>Pos</b></td>\r\n" + 
				"  <td><b>What it Means</b></td>\r\n" + 
				"  <td><b>Who is Eligible</b></td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>QB</td>\r\n" + 
				"  <td>Quarterback</td>\r\n" + 
				"  <td>Only quarterbacks</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>RB</td>\r\n" + 
				"  <td>Running Back</td>\r\n" + 
				"  <td>Only running backs</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>WR</td>\r\n" + 
				"  <td>Wide Receiver</td>\r\n" + 
				"  <td>Only wide receivers</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>TE</td>\r\n" + 
				"  <td>Tight End</td>\r\n" + 
				"  <td>Only tight ends</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>W/R</td>\r\n" + 
				"  <td>Wide Receiver/Running Back</td>\r\n" + 
				"  <td>Any wide receiver or running back</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>W/T</td>\r\n" + 
				"  <td>Wide Receiver/Tight End</td>\r\n" + 
				"  <td>Any wide receiver or tight end</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>Q/WR/RB/TE</td>\r\n" + 
				"  <td>Quarterback/Wide Receiver/Running Back/Tight End</td>\r\n" + 
				"  <td>Any quarterback, wide receiver, running back or tight end</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>WR/RB/TE</td>\r\n" + 
				"  <td>Wide Receiver/Running Back/Tight End</td>\r\n" + 
				"  <td>Any wide receiver, running back or tight end</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>K</td>\r\n" + 
				"  <td>Kicker</td>\r\n" + 
				"  <td>Only kickers</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>DEF</td>\r\n" + 
				"  <td>Defensive Team</td>\r\n" + 
				"  <td>Only team defenses</td>\r\n" + 
				" </tr>\r\n" + 
				"\r\n" + 
				" <tr>\r\n" + 
				"  <td>D</td>\r\n" + 
				"  <td>Defensive Player</td>\r\n" + 
				"  <td>Any defensive player</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>DL</td>\r\n" + 
				"  <td>Defensive Lineman</td>\r\n" + 
				"  <td>Only defensive linemen</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>DB</td>\r\n" + 
				"  <td>Defensive Back</td>\r\n" + 
				"  <td>Only defensive backs</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>LB</td>\r\n" + 
				"  <td>Linebacker</td>\r\n" + 
				"  <td>Only linebackers</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>CB</td>\r\n" + 
				"  <td>Corner Back</td>\r\n" + 
				"  <td>Only corner backs</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>S</td>\r\n" + 
				"  <td>Safety</td>\r\n" + 
				"  <td>Only safties</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>BN</td>\r\n" + 
				"  <td>Bench</td>\r\n" + 
				"  <td>Any player</td>\r\n" + 
				" </tr>\r\n" + 
				" </table>\r\n" + 
				"    </section>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"YSF.use(\"node\", \"event\", \"ysf-overlay\", \"transition\", function(Y) {\r\n" + 
				"  var Att = false;\r\n" + 
				"\r\n" + 
				"  //have we seen before\r\n" + 
				"  var showHelp = Att ? Att : false;\r\n" + 
				"  //if so display it now\r\n" + 
				"  if(showHelp === true) {\r\n" + 
				"    Y.on(\"available\",  function(e) {\r\n" + 
				"      Y.fire(\"ysfoverlay:open\",{\"overlayname\": \"whats-this\"});\r\n" + 
				"    },\"#whats-this\");\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				" function hideEl(el) {\r\n" + 
				"  el.transition({\r\n" + 
				"    easing: \"linear\",\r\n" + 
				"    duration: 0.5,\r\n" + 
				"    opacity: 0\r\n" + 
				"  },function() {\r\n" + 
				"      this.hide();\r\n" + 
				"  });\r\n" + 
				" }\r\n" + 
				"\r\n" + 
				" function showEl(el) {\r\n" + 
				"  el.show();\r\n" + 
				"  el.transition({\r\n" + 
				"    easing: \"linear\",\r\n" + 
				"    duration: 0.5,\r\n" + 
				"    opacity: 100\r\n" + 
				"  });\r\n" + 
				"\r\n" + 
				" }\r\n" + 
				"\r\n" + 
				" var animEventHandle,\r\n" + 
				" carousel = Y.one(\".overlay-carousel\");\r\n" + 
				" if(carousel !== null) {\r\n" + 
				"   var items = carousel.all(\"div\"),\r\n" + 
				"   cur = items.item(0);\r\n" + 
				"\r\n" + 
				"  //init\r\n" + 
				"  items.each(function(e) {\r\n" + 
				"    items.setStyle(\"opacity\",0);\r\n" + 
				"  });\r\n" + 
				"  showEl(cur);\r\n" + 
				"\r\n" + 
				"   //EVENT shown\r\n" + 
				"   Y.on(\"ysfoverlay:overlayopened\", function(e) {\r\n" + 
				"    //start animation\r\n" + 
				"    Y.later(1000, this, function(e) {\r\n" + 
				"      animEventHandle = Y.later(3000, this, function(e) {\r\n" + 
				"        if(carousel !== null) {\r\n" + 
				"          var next = items.item((items.indexOf(cur)+1 >= items.size()) ? 0 : items.indexOf(cur)+1);\r\n" + 
				"          hideEl(cur);\r\n" + 
				"          showEl(next);\r\n" + 
				"          cur = next;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"      }, null, true);\r\n" + 
				"    }, null, false);\r\n" + 
				"   }, {\"overlayname\": \"whats-this\"});\r\n" + 
				"\r\n" + 
				"  //closed, remove dat animation\r\n" + 
				"  Y.on(\"ysfoverlay:overlayclosed\", function(e) {\r\n" + 
				"   //stop animation\r\n" + 
				"   animEventHandle.cancel();\r\n" + 
				"   //reset to first showing\r\n" + 
				"   if(carousel !== null) {\r\n" + 
				"    hideEl(cur);\r\n" + 
				"    cur = items.item(0);\r\n" + 
				"    showEl(cur);\r\n" + 
				"   }\r\n" + 
				"  }, {\"overlayname\": \"whats-this\"});\r\n" + 
				"}\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script></div></div></div></section><div style=\"\" id=\"yspsub\" class=\"Thm-snow\"></div></div><div style=\"\" id=\"yspfootercontent\" class=\" Page-footercontent\"></div></div><div style=\"\" id=\"yspcontentchangeview\" class=\"\"></div><footer style=\"\" id=\"yspcontentfooter\" class=\"Page-ft Thm-snow D-tb W-100 Page-wrap-sm\"><div class=\"Grid-h-top Grid-3col\"><div class=\"Grid-u-1-3\"><style type=\"text/css\">\r\n" + 
				"/* Medal-data hover */\r\n" + 
				" .Trophy-mount .medal-data {\r\n" + 
				"    display:none;\r\n" + 
				"}\r\n" + 
				".Trophy-mount:hover .medal-data {\r\n" + 
				"    display:block;\r\n" + 
				"    left: -73px;\r\n" + 
				"    top: -60px;\r\n" + 
				"    z-index: 100;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"<section class=\"Mod Thm-override Thm-inherit No-mx \" id=\"team-medals\">\r\n" + 
				"    <header class=\"Hd No-pbot\">\r\n" + 
				"        <h2 class=\"Grid-spread-bot F-mod-header\">\r\n" + 
				"            <span class=\"Grid-u\">My Team Medals</span>\r\n" + 
				"            <span class=\"spon-ad Grid-u\">\r\n" + 
				"                <div class=\"Tst-adlocation-SPON\"><div id=\"yspadSPON\"><div id=\"yspadSPONDest\"><!-- darla ad SPON goes here --></div></div><script type=\"text/javascript\">\r\n" + 
				";(function(){\r\n" + 
				"    var adparams = {\r\n" + 
				"        \"position\": \"SPON\",\r\n" + 
				"        \"spaceid\":  '782200906',\r\n" + 
				"        \"rotate\": 0,\r\n" + 
				"        \"w\": '120',\r\n" + 
				"        \"h\": '30',\r\n" + 
				"        \"spaceid\": 782200906    },\r\n" + 
				"    adContainer, \r\n" + 
				"    posCfg, \r\n" + 
				"    adCfg,\r\n" + 
				"    eventName = \"load\" + adparams.position,\r\n" + 
				"    meta = null;\r\n" + 
				"\r\n" + 
				"    adContainer = \"yspad\" + adparams.position + \"Dest\";\r\n" + 
				"\r\n" + 
				"    if (YUI && YUI.Fantasy && typeof YUI.Fantasy.SmartAdValues === \"function\") {\r\n" + 
				"      meta = YUI.Fantasy.SmartAdValues();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    posCfg = {\r\n" + 
				"        \"pos\": adparams.position, \r\n" + 
				"        \"dest\": adContainer,\r\n" + 
				"        \"fr\": \"ajax_exp\",\r\n" + 
				"        \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    adCfg = {\r\n" + 
				"        \"name\": eventName, \r\n" + 
				"        \"ps\": adparams.position, \r\n" + 
				"        \"sp\": adparams.spaceid,\r\n" + 
				"        \"ssl\": 1,\r\n" + 
				"        \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if(adparams.w) {\r\n" + 
				"        posCfg.w = adparams.w;\r\n" + 
				"        posCfg.h = adparams.h;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    DARLA_CONFIG.positions[adparams.position] = {\r\n" + 
				"      \"id\": adparams.position,\r\n" + 
				"      \"pos\": adparams.position, \r\n" + 
				"      \"dest\": adContainer,\r\n" + 
				"      \"fr\": \"ajax_exp\",\r\n" + 
				"      \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if (adparams.position === 'MAST') {\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fclose = 2;\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].metaSize = true;\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fdb = { \r\n" + 
				"        on: 1, \r\n" + 
				"        where: 'inside'\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].supports = { \r\n" + 
				"        'exp-ovr': 1, \r\n" + 
				"        'exp-push': 1, \r\n" + 
				"        'resize-to': 1 \r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].closeBtn = {\r\n" + 
				"        mode: 2,\r\n" + 
				"        useShow: 1,\r\n" + 
				"        adc: 0\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if(adparams.rotate && \"auto\" !== \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.AUTO.ps[adparams.position] = { \r\n" + 
				"        \"autoRT\": adparams.rotate,\r\n" + 
				"        \"autoIV\": 1 \r\n" + 
				"      };\r\n" + 
				"    }\r\n" + 
				"    if(adparams.rotate && \"auto\" === \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.MANUAL_ROTATION.ps[adparams.position] = {};\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"})();\r\n" + 
				"</script>\r\n" + 
				"</div>            </span>\r\n" + 
				"        </h2>\r\n" + 
				"    </header>\r\n" + 
				"    <div class=\"Bd Ta-c No-px No-ptop Pbot-xs\">\r\n" + 
				"    <ul class=\"Grid-h-top Mstart-lg\"><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=11&medal_id=80\"><img src=\"https://sp.yimg.com/j/assets/ipt/go_prius_mpg_long_bronze_75.png\" alt=\"Go &quot;Prius MPG&quot; Long (Bronze)\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"80\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">Go &quot;Prius MPG&quot; Long (Bronze)</h5><p class=\"My-med\">Your starters’ receiving yards are almost as impressive as the awe-inspiring range of the Prius. Hence, you&#39;re “receiving” this medal.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=80&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=80&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Oct 17, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=11&medal_id=39\"><img src=\"https://s.yimg.com/dh/ap/sports/fn/overall/2012/medals/winnerisyou_5_sm.png\" alt=\"A Winner Is You x5\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"39\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">A Winner Is You x5</h5><p class=\"My-med\">Win five regular season head-to-head matchups in your league.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=39&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=39&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Oct 16, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=11&medal_id=78\"><img src=\"https://sp.yimg.com/j/assets/ipt/rollin_with_toyota_silver_75.png\" alt=\"Rollin’ with Toyota x4\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"78\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">Rollin’ with Toyota x4</h5><p class=\"My-med\">You’re on a 4-win roll! Are there no limits to your win streaks? Maybe it’s time you consider nominating yourself for the Toyota Hall of Fame. You’ve earned it.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=78&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=78&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Oct 11, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=11&medal_id=41\"><img src=\"https://s.yimg.com/dh/ap/sports/fn/overall/2012/medals/colorcommentator_10_sm.png\" alt=\"Color Commentator x10\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"41\" data-medal-scope=\"371\"><h5 class=\"Fw-b Fz-xs\">Color Commentator x10</h5><p class=\"My-med\">Post 10 messages across all of your leagues.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=41&medal_scope=371&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/11/share_medal?medal_id=41&medal_scope=371&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017</em><time><em class=\"Block\">Earned Oct 01, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li></ul></div>\r\n" + 
				"            <div class=\"Ta-end Pend-lg My-lg\"><a class=\"view\" href=\"/f1/686943/medals?mid=11\">View all league medals &raquo;</a></div>\r\n" + 
				"    </section>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</div><div class=\"Grid-u-1-3 Pstart-xl\"><script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use(\"node-base\", \"event-key\", \"ysf-xhr\", \"ysf-tout\", 'ysf-tooltip', function(Y) { \r\n" + 
				"\r\n" + 
				"    var default_notetoself = 'Use the Note To Self area to jot player notes, write reminders, create lists, or store frequently used text.';\r\n" + 
				"\r\n" + 
				"    if(Y.one(\"#notetoself-form\")) {\r\n" + 
				"\r\n" + 
				"        var xhr = new Y.Fantasy.XHR({\r\n" + 
				"            \"form\": '#notetoself-form',\r\n" + 
				"            \"callbackObj\": {\r\n" + 
				"                \"success\": function(cId, response) {\r\n" + 
				"\r\n" + 
				"                    var respObj     = this.parseResponse( cId, response ),\r\n" + 
				"                        notetoself_node = Y.one('#notetoself-content'),\r\n" + 
				"                        tout,\r\n" + 
				"                        errors_array,\r\n" + 
				"                        error_string,\r\n" + 
				"                        x,\r\n" + 
				"                        response;\r\n" + 
				"                    \r\n" + 
				"                    if (respObj.errors.length > 0) {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                        errors_array = respObj.errors;\r\n" + 
				"                        error_string = '';\r\n" + 
				"                        \r\n" + 
				"                        for (x = 0; x < errors_array.length; x++) {\r\n" + 
				"                            error_string = error_string + errors_array[x].title + \"\\n\";\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        alert(error_string.replace(\"&nbsp;\", \" \"));\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                    } else if(respObj.content) {\r\n" + 
				"                        \r\n" + 
				"\r\n" + 
				"                        //Update Div that displays current notetoself and gets edited.\r\n" + 
				"                        var nl = '\\r\\n',\r\n" + 
				"                            response = respObj.content.replace( /\\<br(\\s*\\/|)\\>/g, nl );\r\n" + 
				"                        notetoself_node.set('value', response);\r\n" + 
				"\r\n" + 
				"                        //Most likely user cleared out the notetoself, change display to empty notetoself styling\r\n" + 
				"                        if(respObj.content === default_notetoself) {\r\n" + 
				"                            notetoself_node.addClass('notetoself-default'); //different styling\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        //Update Form variables for future edits\r\n" + 
				"                        Y.one('#notetoself-old').setAttribute('value', response);\r\n" + 
				"\r\n" + 
				"                        //Success message\r\n" + 
				"                        tout = new Y.Fantasy.Tout();\r\n" + 
				"                        tout.displayTout({\r\n" + 
				"                            \"message\": 'Your Note to Self was updated'\r\n" + 
				"                        });                    \r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"\r\n" + 
				"                },\r\n" + 
				"                \"failure\": function(cId) {\r\n" + 
				"     \r\n" + 
				"                    alert(\"An error has occured, please try again\");\r\n" + 
				"\r\n" + 
				"                    enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"triggerHandler\": function(e, obj) {\r\n" + 
				"                \r\n" + 
				"                //Form Submitted\r\n" + 
				"                e.preventDefault();\r\n" + 
				"\r\n" + 
				"                var notetoself_content = Y.one('#notetoself-content').get('value');\r\n" + 
				"\r\n" + 
				"                //Validate Slogan length\r\n" + 
				"                if(notetoself_content.length > 1000 ) {\r\n" + 
				"                    alert('Notes can not be longer than 1000 characters. Currently you are at ' + notetoself_content.length);\r\n" + 
				"                } else {\r\n" + 
				"\r\n" + 
				"                    //Hide Submit/Cancel\r\n" + 
				"                    toggle_form_buttons();\r\n" + 
				"                    temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"                    connection = obj.submit(this);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    var temporary_hover_disable = function() {\r\n" + 
				"\r\n" + 
				"        //After clicking Save the hover effect makes content look editable,  \r\n" + 
				"        //temporarily remove it hover\r\n" + 
				"        var notetoself_node = Y.one('#notetoself-content');\r\n" + 
				"\r\n" + 
				"        notetoself_node.removeClass('is-editable');\r\n" + 
				"        \r\n" + 
				"        Y.later(3000, this, function(){\r\n" + 
				"            notetoself_node.addClass('is-editable');\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    toggle_form_buttons = function() {\r\n" + 
				"\r\n" + 
				"        //user_is_editing_class maintains hover state look and feel even if user clicks outside textarea\r\n" + 
				"        Y.one('#notetoself-button-bar').toggleClass('yfa-js-hidden'); \r\n" + 
				"        Y.one('#notetoself-content').toggleClass('editing');\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_notetoself_form_listener = function(notetoself_node) {\r\n" + 
				"\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            if(notetoself_node.hasClass('notetoself-default')) {\r\n" + 
				"\r\n" + 
				"                //notetoself-default has different styling than a regular notetoself\r\n" + 
				"                notetoself_node.removeClass('notetoself-default');\r\n" + 
				"\r\n" + 
				"                //Remove default message\r\n" + 
				"                Y.one('#notetoself-content').set('value', '');\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            //Show Submit/Cancel\r\n" + 
				"            toggle_form_buttons();\r\n" + 
				"\r\n" + 
				"            //Only want this to run on first click\r\n" + 
				"            this.detach();\r\n" + 
				"           \r\n" + 
				"        }, '#notetoself-content');\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_cancel_form_listener = function(notetoself_node) {\r\n" + 
				"\r\n" + 
				"        //Event Handler for CANCEL button\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            e.preventDefault();\r\n" + 
				"\r\n" + 
				"            var old_notetoself = Y.one('#notetoself-old').getAttribute('value');\r\n" + 
				"            \r\n" + 
				"            temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"            if(old_notetoself === '' || old_notetoself === default_notetoself ) {\r\n" + 
				"                \r\n" + 
				"                old_notetoself = default_notetoself;\r\n" + 
				"\r\n" + 
				"                notetoself_node.addClass('notetoself-default');\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"            \r\n" + 
				"            notetoself_node.set('value', old_notetoself);\r\n" + 
				"            notetoself_node.removeClass('editing');\r\n" + 
				"\r\n" + 
				"            Y.one('#notetoself-button-bar').addClass('yfa-js-hidden');\r\n" + 
				"\r\n" + 
				"            enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"\r\n" + 
				"        }, '#notetoself-cancel');  \r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    initTextAreaCounter = function(container, textarea, maxlength, total) {\r\n" + 
				"        try {\r\n" + 
				"            var noteTextArea = document.getElementById(textarea),\r\n" + 
				"                noteContainer = document.getElementById(container);\r\n" + 
				"\r\n" + 
				"            if (!noteTextArea ) { return };\r\n" + 
				"\r\n" + 
				"            noteTextArea.onkeydown =  countStrokes; \r\n" + 
				"            noteTextArea.onkeyup =  countStrokes; \r\n" + 
				"            noteTextArea.maxlength = maxlength;\r\n" + 
				"            noteTextArea.outputLocation = noteContainer;\r\n" + 
				"            noteTextArea.countStrokes = countStrokes;\r\n" + 
				"            noteTextArea.total = total;\r\n" + 
				"            noteTextArea.countStrokes();\r\n" + 
				"\r\n" + 
				"        } catch(e) { \r\n" + 
				"            Y.log(e) \r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    countStrokes = function(e) {\r\n" + 
				"        var noteTextArea = (e) ? e.target : this;\r\n" + 
				"\r\n" + 
				"        var numStrokes = noteTextArea.value.length;\r\n" + 
				"        if ( (numStrokes) > (noteTextArea.maxlength )  && noteTextArea.maxlength > 0 ) {\r\n" + 
				"            if(noteTextArea.textNode) {\r\n" + 
				"                noteTextArea.textNode.nodeValue = \"0\";\r\n" + 
				"            }\r\n" + 
				"           noteTextArea.value = noteTextArea.value.substr(0, noteTextArea.maxlength);\r\n" + 
				"        }\r\n" + 
				"        if(noteTextArea.outputLocation) {\r\n" + 
				"            noteTextArea.outputLocation.innerHTML =  (!noteTextArea.total && noteTextArea.maxlength) ? Math.max(noteTextArea.maxlength - numStrokes, 0) : numStrokes;\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    init = function() {\r\n" + 
				"\r\n" + 
				"         var notetoself_node,\r\n" + 
				"             notetoself_node_tagName;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        notetoself_node         = Y.one('#notetoself-content');\r\n" + 
				"        \r\n" + 
				"        if(notetoself_node) {\r\n" + 
				"    \r\n" + 
				"            notetoself_node_tagName = notetoself_node.get('tagName');\r\n" + 
				"        \r\n" + 
				"            if(notetoself_node_tagName == 'TEXTAREA') {\r\n" + 
				"\r\n" + 
				"                notetoself_node.addClass('is-editable');\r\n" + 
				"\r\n" + 
				"                //Event handlers for showing form buttons/edit styling/cancel button\r\n" + 
				"                enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"                enable_cancel_form_listener(notetoself_node);\r\n" + 
				"                initTextAreaCounter('notecount', 'notetoself-content', 1000);\r\n" + 
				"                Y.Fantasy.ToolTip.init();\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    init();\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"</div><div class=\"Grid-u-1-3 Pstart-xl Ta-end Ptop-xl\"><div class=\"Tst-adlocation-LREC\"><div id=\"yspadLREC\"><div id=\"yspadLRECDest\"><!-- darla ad LREC goes here --></div></div><script type=\"text/javascript\">\r\n" + 
				";(function(){\r\n" + 
				"    var adparams = {\r\n" + 
				"        \"position\": \"LREC\",\r\n" + 
				"        \"spaceid\":  '782200906',\r\n" + 
				"        \"rotate\": 10000,\r\n" + 
				"        \"w\": '300',\r\n" + 
				"        \"h\": '250',\r\n" + 
				"        \"spaceid\": 782200906    },\r\n" + 
				"    adContainer, \r\n" + 
				"    posCfg, \r\n" + 
				"    adCfg,\r\n" + 
				"    eventName = \"load\" + adparams.position,\r\n" + 
				"    meta = null;\r\n" + 
				"\r\n" + 
				"    adContainer = \"yspad\" + adparams.position + \"Dest\";\r\n" + 
				"\r\n" + 
				"    if (YUI && YUI.Fantasy && typeof YUI.Fantasy.SmartAdValues === \"function\") {\r\n" + 
				"      meta = YUI.Fantasy.SmartAdValues();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    posCfg = {\r\n" + 
				"        \"pos\": adparams.position, \r\n" + 
				"        \"dest\": adContainer,\r\n" + 
				"        \"fr\": \"ajax_exp\",\r\n" + 
				"        \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    adCfg = {\r\n" + 
				"        \"name\": eventName, \r\n" + 
				"        \"ps\": adparams.position, \r\n" + 
				"        \"sp\": adparams.spaceid,\r\n" + 
				"        \"ssl\": 1,\r\n" + 
				"        \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if(adparams.w) {\r\n" + 
				"        posCfg.w = adparams.w;\r\n" + 
				"        posCfg.h = adparams.h;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    DARLA_CONFIG.positions[adparams.position] = {\r\n" + 
				"      \"id\": adparams.position,\r\n" + 
				"      \"pos\": adparams.position, \r\n" + 
				"      \"dest\": adContainer,\r\n" + 
				"      \"fr\": \"ajax_exp\",\r\n" + 
				"      \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if (adparams.position === 'MAST') {\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fclose = 2;\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].metaSize = true;\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fdb = { \r\n" + 
				"        on: 1, \r\n" + 
				"        where: 'inside'\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].supports = { \r\n" + 
				"        'exp-ovr': 1, \r\n" + 
				"        'exp-push': 1, \r\n" + 
				"        'resize-to': 1 \r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].closeBtn = {\r\n" + 
				"        mode: 2,\r\n" + 
				"        useShow: 1,\r\n" + 
				"        adc: 0\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if(adparams.rotate && \"auto\" !== \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.AUTO.ps[adparams.position] = { \r\n" + 
				"        \"autoRT\": adparams.rotate,\r\n" + 
				"        \"autoIV\": 1 \r\n" + 
				"      };\r\n" + 
				"    }\r\n" + 
				"    if(adparams.rotate && \"auto\" === \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.MANUAL_ROTATION.ps[adparams.position] = {};\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"})();\r\n" + 
				"</script>\r\n" + 
				"</div></div></div><div id=\"yspfooter\">\r\n" + 
				"	<div id=\"yspcopyright\" class=\"Thm-inherit Fz-xxs Ta-c\">\r\n" + 
				"        <div id=\"nfl-footer\" class=\"Bdrtop Py-xxl\">\r\n" + 
				"    <ul>\r\n" + 
				"        <li class=\"Inlineblock\">Yahoo! Sports - NBC Sports Network.</li>\r\n" + 
				"        <li class=\"Inlineblock\"><a href=\"http://info.yahoo.com/legal/us/yahoo/utos/terms/\">Terms</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"https://policies.yahoo.com/us/en/yahoo/terms/product-atos/fantasy-football/general/index.htm\">Additional Terms</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"https://yahoo.uservoice.com/forums/206158?auth=yahoo\">Feedback</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"http://help.yahoo.com/kb/index?page=product&amp;y=PROD_SPORTS_FAN_FOOTUS&amp;locale=en_US\">Help</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"http://info.yahoo.com/privacy/us/yahoo/sports/details.html\">Privacy</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"http://info.yahoo.com/privacy/us/yahoo/relevantads.html\">About Our Ads</a></li>\r\n" + 
				"    </ul>\r\n" + 
				"    <p>\r\n" + 
				"        Certain data by <a href=\"http://www.stats.com\">STATS LLC</a>\r\n" + 
				"    </p>\r\n" + 
				"</div>\r\n" + 
				"	</div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script src=\"//fc.yahoo.com/sdarla/php/client.php?d=0&l=LDRB{dest:yspadLDRBDest;asz:728x90},SPON{dest:yspadSPONDest;asz:120x30},LREC{dest:yspadLRECDest;asz:300x250}&f=782200906&rtype=boot\"></script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use('event-hover',  function(Y) {\r\n" + 
				"	var mainNavLis = Y.all('.Nav-h .Navitem, .Nav-h > ul > li');\r\n" + 
				"	mainNavLis.on('hover',\r\n" + 
				"		\r\n" + 
				"		// Mouseover\r\n" + 
				"		function(){\r\n" + 
				"		 	var li_subnav; \r\n" + 
				"\r\n" + 
				"		 	// Add Hover class to nav li\r\n" + 
				"		 	this.addClass('Hover');\r\n" + 
				"		 	\r\n" + 
				"		 	// Add class to li's subnav\r\n" + 
				"		 	li_subnav = this.one('.Dropdown');\r\n" + 
				"		 	if (li_subnav) {\r\n" + 
				"		 		li_subnav.replaceClass('Hidden', 'Hover');\r\n" + 
				"		 	}\r\n" + 
				"		}, \r\n" + 
				"\r\n" + 
				"		// Mouseout\r\n" + 
				"		function(){\r\n" + 
				"		 	var li_subnav;\r\n" + 
				"\r\n" + 
				"		 	// remove class from nav li\r\n" + 
				"		 	this.removeClass('Hover');\r\n" + 
				"			\r\n" + 
				"		 	// remove class from li's subnav\r\n" + 
				"		 	li_subnav = this.one('.Dropdown');\r\n" + 
				"			if (li_subnav) {\r\n" + 
				"		 		li_subnav.replaceClass('Hover', 'Hidden');\r\n" + 
				"		 	}\r\n" + 
				"		});\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script><script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\"><!--\r\n" + 
				"YSF.use(\"node\", function(Y) {\r\n" + 
				"    var PLAYERNOTE_AD_POS = \"LDRB2\";\r\n" + 
				"    YSF.use('media-playernotes', 'substitute', 'ysf-ads', function(Y) {\r\n" + 
				"        var registeredAds = [];\r\n" + 
				"        \r\n" + 
				"        Y.Sports.PlayerNotes.set('noteUrlFormatter', function() {\r\n" + 
				"            var oMod = this;\r\n" + 
				"            return Y.substitute('{league_url}/playernote?init={init}&view={type}&pid={pid}', {\r\n" + 
				"                league_url : YUI.Fantasy.League.get('url'),\r\n" + 
				"                init : (oMod.get('initialLoad')) ? 1 : 0,\r\n" + 
				"                type : oMod.get('currentView'),\r\n" + 
				"                pid : oMod.get('pid')\r\n" + 
				"            });\r\n" + 
				"        })\r\n" + 
				"        .set('comscoreUrlFormatter', function() {\r\n" + 
				"            var oMod = this;\r\n" + 
				"            return Y.substitute('{league_url}/playernote_dynamic_view?pid={pid}&rand={rand}', {\r\n" + 
				"                league_url : YUI.Fantasy.League.get('url'),\r\n" + 
				"                pid : oMod.get('pid'),\r\n" + 
				"                rand : Math.random()\r\n" + 
				"            });\r\n" + 
				"        })\r\n" + 
				"        .set('enumerate', true)\r\n" + 
				"        .set('zIndex', 9000);\r\n" + 
				"                \r\n" + 
				"        Y.Global.after('YSPlayerNote:initialLoad', function(e) {\r\n" + 
				"            \r\n" + 
				"            var oMod = e.target;\r\n" + 
				"            Y.Array.each(registeredAds, function(el) {\r\n" + 
				"                YUI.Sports.Ads.unregisterAd(\"LDRB\", el);\r\n" + 
				"            });\r\n" + 
				"            registeredAds = [];\r\n" + 
				"            if (YAHOO.Sports.PlayerNoteConfig.is_enabled('player_notes_FB')) {\r\n" + 
				"                oMod.set('footerContent', '<div id=\"playernote-LDRB-'+oMod.get('pid')+'\" class=\"playernote-LDRB\"></div>');\r\n" + 
				"                YUI.Sports.Ads.registerAd('LDRB', 'playernote-LDRB-'+oMod.get('pid'));\r\n" + 
				"            }\r\n" + 
				"            registeredAds.push('playernote-LDRB-'+oMod.get('pid'));\r\n" + 
				"            if (YAHOO.Sports.PlayerNoteConfig.is_enabled('player_notes_xfbml') && !Y.Lang.isUndefined(window.FB) && !Y.Lang.isUndefined(window.FB.XFBML)) {\r\n" + 
				"                FB.XFBML.parse(this.body);\r\n" + 
				"            }\r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"            Y.delegate('click', function(e) {\r\n" + 
				"                if (e.currentTarget && e.currentTarget.get('className').indexOf('noaction') !== -1) {\r\n" + 
				"                    e.preventDefault();\r\n" + 
				"                    Y.Fantasy.InitLinks.showNoActionPopup(e);\r\n" + 
				"                }\r\n" + 
				"                \r\n" + 
				"            },  oMod.get('contentBox'), 'a');\r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"        if(window.DARLA) {\r\n" + 
				"            //DARLA.add({\"name\": \"playernoteview\", \"ps\": \"LDRB2\", \"sp\": YUI.Fantasy.SpaceIds.getSpaceId(\"playernote_dynamic_notes\")});\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        Y.Global.after('YSPlayerNote:reveal', function(e) {\r\n" + 
				"            var oMod = e.target,\r\n" + 
				"                ps,\r\n" + 
				"                oldDarla = true,\r\n" + 
				"                pos_item;\r\n" + 
				"\r\n" + 
				"            Y.Fantasy.rapid.setRapidAttribute({\r\n" + 
				"                spaceid: 782204433            });\r\n" + 
				"            Y.Fantasy.rapid.beaconPageview();\r\n" + 
				"\r\n" + 
				"            if(window.DARLA) {\r\n" + 
				"                pos_item = $sf.host.get(PLAYERNOTE_AD_POS);\r\n" + 
				"\r\n" + 
				"                if (pos_item) { \r\n" + 
				"                    $sf.host.nuke(PLAYERNOTE_AD_POS);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                if (DARLA.hasPos(PLAYERNOTE_AD_POS)) { \r\n" + 
				"                    DARLA.delPos(PLAYERNOTE_AD_POS);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                DARLA.addPos({\"pos\": PLAYERNOTE_AD_POS, \"w\": \"728\", \"h\": \"90\", \"dest\": 'playernote-LDRB-'+oMod.get('pid'), \"supports\": {'exp-ovr': 1}});\r\n" + 
				"                DARLA.add({\r\n" + 
				"                    \"name\": \"playernoteview\", \r\n" + 
				"                    \"ps\": PLAYERNOTE_AD_POS, \r\n" + 
				"                    \"sp\": YUI.Fantasy.SpaceIds.getSpaceId(\"playernote_dynamic_\" + oMod.get('currentView')), \r\n" + 
				"                    \"ssl\": true,\r\n" + 
				"                    \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"                });\r\n" + 
				"                DARLA.event(\"playernoteview\");\r\n" + 
				"                oldDarla = false;\r\n" + 
				"            }    \r\n" + 
				"            if (YUI.Sports.Ads.showAds.playernoteFB && oldDarla) {\r\n" + 
				"                YUI.Sports.Ads.subscribe('playernote-LDRB-'+oMod.get('pid'), 'now', {'playernoteview' : { lv:1, npv:true, sp:YUI.Fantasy.SpaceIds.getSpaceId(\"playernote_dynamic_\" + oMod.get('currentView')), ps:PLAYERNOTE_AD_POS, em:{\"site-attribute\":\"content=no_expandable;\"} } });  \r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            //Comscore Beacon\r\n" + 
				"            YSF.use('ysp-i13n', function(Y) {\r\n" + 
				"                if(typeof(YSF.sendComscoreEvent) === 'function') {\r\n" + 
				"                 YSF.sendComscoreEvent(YUI.Fantasy.SpaceIds.getSpaceId(\"playernote\"), encodeURIComponent(document.location.href))\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"        Y.Global.after('YSPlayerNote:visibleChange', function(e) {\r\n" + 
				"            if(!e.newVal) {\r\n" + 
				"                Y.Fantasy.rapid.setRapidAttribute({\r\n" + 
				"                    spaceid: 782200906                });\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"        \r\n" + 
				"        Y.Global.after('DynaPlayers:refresh', function() {\r\n" + 
				"            Y.Sports.PlayerNotes.destroyAllNotes();\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    });\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"// -->\r\n" + 
				"</script>\r\n" + 
				"<script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"YUI.add('ysf-postload', function(Y) {\r\n" + 
				"\r\n" + 
				"    Y.namespace('Fantasy');\r\n" + 
				"\r\n" + 
				"    Y.Fantasy.PostLoad = {\r\n" + 
				"\r\n" + 
				"        initImages : function(id) {\r\n" + 
				"            var el = Y.one('#'+id);\r\n" + 
				"            if (!el) return;\r\n" + 
				"            var images = Y.all('#'+id+' img[realimg]');\r\n" + 
				"            Y.NodeList.each(images, function(node) {\r\n" + 
				"                var realimg = node.getAttribute('realimg');\r\n" + 
				"                if (realimg && node.src != realimg ) {\r\n" + 
				"                    node.src = realimg;\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        initOnlineImages : function() {\r\n" + 
				"            var links = Y.all('img.imimg');\r\n" + 
				"            Y.NodeList.each(links, function(curLink){\r\n" + 
				"                var classes = curLink.get('class').split(' ');\r\n" + 
				"                if ( classes[1].indexOf('http://') != -1 ) { \r\n" + 
				"                    curLink.set('src', classes[1]);\r\n" + 
				"                }   \r\n" + 
				"            });\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        initSelect : function(id) {\r\n" + 
				"            var el = Y.one('#'+id);\r\n" + 
				"            if (!el) return;\r\n" + 
				"            el.on('change', function() {\r\n" + 
				"                el.get('form').submit();\r\n" + 
				"            });\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"}, '', {'requires': ['node']});\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"YSF.use(\"yfa-module\",\"ysf-viewloader\",\"node\",\"ysf-formenhancer\",\"ysf-postload\",\"ysf-initlinks\",\"ysf-headshot\",\"ysf-overlay\",\"ysf-alerts\",\"ysf-sticky\",\"ysf-leaguecontests\",\"stencil\",\"stencil-selectbox\",\"af-applets\",\"ysf-tooltip\",\"ysf-iris-chat\",\"ysf-dfs-promos\",  function(Y) {\r\n" + 
				"    Y.on(\"domready\", function(e, obj) {\r\n" + 
				"        Y.Fantasy.FantasyFormEnhancer.init();\r\n" + 
				"        Y.Fantasy.PostLoad.initImages('fantasy');\r\n" + 
				"        Y.Fantasy.PostLoad.initImages('yspcontentfooter');\r\n" + 
				"        Y.Fantasy.PostLoad.initImages('yspcontenthero');\r\n" + 
				"        Y.Fantasy.PostLoad.initSelect('seasonspec');\r\n" + 
				"        Y.Fantasy.Headshot.init('#fantasy');\r\n" + 
				"        Y.Fantasy.InitLinks.init();\r\n" + 
				"        Y.Fantasy.Sticky.init();\r\n" + 
				"\r\n" + 
				"         \r\n" + 
				"            Y.Fantasy.IrisChat.init();\r\n" + 
				"        \r\n" + 
				"                Y.Fantasy.DailyFantasyPromos.init({\r\n" + 
				"            page: \"team\", \r\n" + 
				"            sport: \"nfl\"\r\n" + 
				"        });\r\n" + 
				"                \r\n" + 
				"                var ApeApp = Y.Base.create('apeApp', Y.Base, [Y.Af.Applets]);\r\n" + 
				"        YMedia.ApeApp = new ApeApp();\r\n" + 
				"                                        Y.Fantasy.LeagueContests.init();\r\n" + 
				"                        Y.Fantasy.ToolTip.init();\r\n" + 
				"                var bd = Y.one(\"body\"), mods;\r\n" + 
				"        if(bd) {\r\n" + 
				"            mods = bd.all(\".Mod, .AlertsMod\");\r\n" + 
				"            mods.each(function(mod) {\r\n" + 
				"                var module;\r\n" + 
				"                if(mod.getData(\"dynamic-viewload\") === \"true\") {\r\n" + 
				"                     module = new Y.Fantasy.ViewLoader({\r\n" + 
				"                        \"el\": mod,\r\n" + 
				"                        \"triggers\": Y.one(Y.config.win)\r\n" + 
				"                     });\r\n" + 
				"                }\r\n" + 
				"                else {\r\n" + 
				"                    module = new Y.Fantasy.Mod({\"el\": mod, \"triggers\": mod});\r\n" + 
				"                    module.on(\"yfamodule:displayudpate\", function(e) {} );\r\n" + 
				"                    module.on(\"yfamodule:displayudpate\", function(e) { \r\n" + 
				"                        Y.Fantasy.PostLoad.initImages(mod.get('id')); \r\n" + 
				"                    });\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        var linkableHandler = function(e, obj) {\r\n" + 
				"            var target_location, doc;\r\n" + 
				"            target_location = this.getData('target');\r\n" + 
				"            if(target_location && !e.target.test('a')) {\r\n" + 
				"                if(e.metaKey) {\r\n" + 
				"                        window.open(target_location,'_blank');\r\n" + 
				"                }else {\r\n" + 
				"                    doc = Y.one('document');\r\n" + 
				"                    doc.set('location', target_location);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        bd.delegate(\"click\", linkableHandler, \".Linkable\", null);\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    if(document.location.href.indexOf(\"layout=webview\") !== -1 || false) {\r\n" + 
				"        var body = Y.one(\"body\");\r\n" + 
				"        body.delegate(\"tap\", function(e){\r\n" + 
				"            var href = this.get(\"href\");\r\n" + 
				"            if(href.indexOf(document.location.protocol + \"//\" + document.location.host) === 0 && href.indexOf(\"layout=webview\") === -1) {\r\n" + 
				"                href += (href.indexOf(\"?\") !== -1) ? \"&\" : \"?\";\r\n" + 
				"                href += \"layout=webview\";\r\n" + 
				"                this.set(\"href\", href);\r\n" + 
				"            }\r\n" + 
				"        }, \"a[href]\");\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    Y.one(document.body).addClass('Js-yfa-init');\r\n" + 
				"    if(YAHOO.Sports.invitefriends) {\r\n" + 
				"        YAHOO.Sports.invitefriends.init();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use(\"ysf-xhr\", \"ysf-tout\", \"ysf-html\", function(Y) { \r\n" + 
				"\r\n" + 
				"    var default_slogan = 'Team Slogan...';\r\n" + 
				"\r\n" + 
				"    if(Y.one(\"#slogan-form\")) {\r\n" + 
				"\r\n" + 
				"        var xhr = new Y.Fantasy.XHR({\r\n" + 
				"            \"form\": '#slogan-form',\r\n" + 
				"            \"callbackObj\": {\r\n" + 
				"                \"success\": function(cId, response) {\r\n" + 
				"\r\n" + 
				"                    var respObj     = this.parseResponse( cId, response ),\r\n" + 
				"                        slogan_node = Y.one('#slogan-content'),\r\n" + 
				"                        tout,\r\n" + 
				"                        errors_array,\r\n" + 
				"                        error_string,\r\n" + 
				"                        x,\r\n" + 
				"                        response;\r\n" + 
				"                    \r\n" + 
				"                    if (respObj.errors.length > 0) {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                        errors_array = respObj.errors;\r\n" + 
				"                        error_string = '';\r\n" + 
				"                        \r\n" + 
				"                        for (x = 0; x < errors_array.length; x++) {\r\n" + 
				"                            error_string = error_string + errors_array[x].title + \"\\n\";\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        alert(error_string.replace(\"&nbsp;\", \" \"));\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                    } else if(respObj.content) {\r\n" + 
				"                        \r\n" + 
				"\r\n" + 
				"                        //Update Div that displays current slogan and gets edited.\r\n" + 
				"                        response = Y.Fantasy.html.htmlDecode(respObj.content);\r\n" + 
				"                        slogan_node.set('value', response);\r\n" + 
				"\r\n" + 
				"                        //Most likely user cleared out the slogan, change display to empty slogan styling\r\n" + 
				"                        if(respObj.content === default_slogan) {\r\n" + 
				"                            slogan_node.addClass('slogan-default'); //different styling\r\n" + 
				"                            Y.one('#slogan-default-label').removeClass('yfa-js-hidden');\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        //Update Form variables for future edits\r\n" + 
				"                        Y.one('#slogan-old').setAttribute('value', respObj.content);\r\n" + 
				"\r\n" + 
				"                        //Success message\r\n" + 
				"                        tout = new Y.Fantasy.Tout();\r\n" + 
				"                        tout.displayTout({\r\n" + 
				"                            \"message\": 'Your team slogan was updated'\r\n" + 
				"                        });                    \r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    enable_slogan_form_listener(slogan_node);\r\n" + 
				"\r\n" + 
				"                },\r\n" + 
				"                \"failure\": function(cId) {\r\n" + 
				"     \r\n" + 
				"                    alert(\"An error has occured, please try again\");\r\n" + 
				"\r\n" + 
				"                    enable_slogan_form_listener(slogan_node);\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"triggerHandler\": function(e, obj) {\r\n" + 
				"                \r\n" + 
				"                //Form Submitted\r\n" + 
				"                e.preventDefault();\r\n" + 
				"\r\n" + 
				"                var slogan_content = Y.one('#slogan-content').get('value');;\r\n" + 
				"\r\n" + 
				"                //Validate Slogan length\r\n" + 
				"                if(slogan_content.length > 150 ) {\r\n" + 
				"                    alert('Slogans can not be longer than 150 characters. Currently you are at ' + slogan_content.length);\r\n" + 
				"                } else {\r\n" + 
				"\r\n" + 
				"                    //Hide Submit/Cancel\r\n" + 
				"                    toggle_form_buttons();\r\n" + 
				"                    temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"                    connection = obj.submit(this);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    var temporary_hover_disable = function() {\r\n" + 
				"\r\n" + 
				"        //After clicking Save the hover effect makes content look editable,  \r\n" + 
				"        //temporarily remove it hover\r\n" + 
				"        var slogan_node = Y.one('#slogan-content');\r\n" + 
				"\r\n" + 
				"        slogan_node.removeClass('is-editable');\r\n" + 
				"        \r\n" + 
				"        Y.later(3000, this, function(){\r\n" + 
				"            slogan_node.addClass('is-editable');\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    toggle_form_buttons = function() {\r\n" + 
				"\r\n" + 
				"        //user_is_editing_class maintains hover state look and feel even if user clicks outside textarea\r\n" + 
				"        Y.one('#slogan-button-bar').toggleClass('yfa-js-hidden'); \r\n" + 
				"        Y.one('#slogan-content').toggleClass('editing');\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_slogan_form_listener = function(slogan_node) {\r\n" + 
				"\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            if(slogan_node.hasClass('slogan-default')) {\r\n" + 
				"\r\n" + 
				"                //slogan-default has different styling than a regular slogan\r\n" + 
				"                slogan_node.removeClass('slogan-default');\r\n" + 
				"\r\n" + 
				"                //Remove default message\r\n" + 
				"                Y.one('#slogan-content').set('value', '');\r\n" + 
				"\r\n" + 
				"                //Hide default lable used when there is no slogan\r\n" + 
				"                Y.one('#slogan-default-label').addClass('yfa-js-hidden');\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            //Show Submit/Cancel\r\n" + 
				"            toggle_form_buttons();\r\n" + 
				"\r\n" + 
				"            //Only want this to run on first click\r\n" + 
				"            this.detach();\r\n" + 
				"           \r\n" + 
				"        }, '#slogan-content');\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_cancel_form_listener = function(slogan_node) {\r\n" + 
				"\r\n" + 
				"        //Event Handler for CANCEL button\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            e.preventDefault();\r\n" + 
				"\r\n" + 
				"            var old_slogan = Y.one('#slogan-old').getAttribute('value');\r\n" + 
				"            \r\n" + 
				"            old_slogan = Y.Fantasy.html.htmlDecode(old_slogan) || \"\";\r\n" + 
				"\r\n" + 
				"            temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"            if(old_slogan === '' || old_slogan === default_slogan ) {\r\n" + 
				"                \r\n" + 
				"                old_slogan = default_slogan;\r\n" + 
				"\r\n" + 
				"                slogan_node.addClass('slogan-default');\r\n" + 
				"\r\n" + 
				"                Y.one('#slogan-default-label').removeClass('yfa-js-hidden');\r\n" + 
				"            }\r\n" + 
				"            \r\n" + 
				"            slogan_node.set('value', old_slogan);\r\n" + 
				"            slogan_node.removeClass('editing');\r\n" + 
				"\r\n" + 
				"            Y.one('#slogan-button-bar').addClass('yfa-js-hidden');\r\n" + 
				"\r\n" + 
				"            enable_slogan_form_listener(slogan_node);\r\n" + 
				"\r\n" + 
				"        }, '#slogan-cancel');  \r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    init = function() {\r\n" + 
				"\r\n" + 
				"         var slogan_node,\r\n" + 
				"             slogan_node_tagName;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        slogan_node         = Y.one('#slogan-content');\r\n" + 
				"        \r\n" + 
				"        if(slogan_node) {\r\n" + 
				"    \r\n" + 
				"            slogan_node_tagName = slogan_node.get('tagName');\r\n" + 
				"        \r\n" + 
				"            if(slogan_node_tagName == 'TEXTAREA') {\r\n" + 
				"\r\n" + 
				"                slogan_node.addClass('is-editable');\r\n" + 
				"\r\n" + 
				"                //Event handlers for showing form buttons/edit styling/cancel button\r\n" + 
				"                enable_slogan_form_listener(slogan_node);\r\n" + 
				"                enable_cancel_form_listener(slogan_node);\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    init();\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"YSF.use(\"node\", \"event\",\"hover-intent\", function(Y) {\r\n" + 
				"\r\n" + 
				"  function swapSubnav(newSelected, currentSelected, statsubnav) {\r\n" + 
				"    var currentSubnav = statsubnav.one(\"#subnav_\"+currentSelected.one(\".Navtarget\").get(\"id\")),\r\n" + 
				"    newSubnav = statsubnav.one(\"#subnav_\"+newSelected.one(\".Navtarget\").get(\"id\"));\r\n" + 
				"\r\n" + 
				"    if(newSelected.one(\".Navtarget\").hasAttribute(\"has-sub\")) {\r\n" + 
				"      if(currentSelected.hasClass(\"Hovered\")) {\r\n" + 
				"        currentSelected.removeClass(\"Hovered\");\r\n" + 
				"      }\r\n" + 
				"      newSelected.addClass(\"Hovered\");\r\n" + 
				"\r\n" + 
				"      //change subnav\r\n" + 
				"      if(currentSubnav !== null) {\r\n" + 
				"        currentSubnav.addClass(\"Hidden\");\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      if(newSubnav !== null) {\r\n" + 
				"        newSubnav.removeClass(\"Hidden\");\r\n" + 
				"        if(newSubnav.all(\"li\").size() == 1) {\r\n" + 
				"          newSubnav.addClass(\"Hidden\");\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  //Scroll over any stat nav, change the subnav to show that one... move the arrow to it.  Once off either. revert to normal\r\n" + 
				"  if(Y.one(\"#statnav\") !== null) {\r\n" + 
				"    var statnav = Y.one(\"#statnav\"),\r\n" + 
				"    statsubnav = Y.one(\"#statsubnav\"),\r\n" + 
				"    fullstatnav = Y.one(\"#full_stat_nav\"),\r\n" + 
				"    originalSelected = statnav.one(\".Selected\");\r\n" + 
				"\r\n" + 
				"    originalSelected.addClass(\"Hovered\");\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    //hover any stat nav, show their stat sub menu\r\n" + 
				"    Y.delegate([\"hover-intent\",\"focus\"], function(e) {\r\n" + 
				"      var currentSelected = statnav.one(\".Hovered\"),\r\n" + 
				"      newSelected = e.currentTarget.ancestor(\".Navitem\");\r\n" + 
				"\r\n" + 
				"      if(e.currentTarget.ancestor(\"#statnav\") !== null) { // make sure it's only in statnav\r\n" + 
				"        swapSubnav(newSelected, currentSelected, statsubnav);\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"    }, \".Navtarget\");\r\n" + 
				"\r\n" + 
				"    fullstatnav.on([\"mouseleave\",\"blur\"], function(e){\r\n" + 
				"      var el = e.currentTarget.ancestor(\"#full_stat_nav\"),\r\n" + 
				"      currentSelected = statnav.one(\".Hovered\");\r\n" + 
				"      originalSelected = statnav.one(\".Selected\");\r\n" + 
				"      swapSubnav(originalSelected, currentSelected, statsubnav);\r\n" + 
				"    });\r\n" + 
				"  }\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script><script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"<!--\r\n" + 
				"\r\n" + 
				"YUI.add(\"ysf-medal-notifications\", function(Y) {\r\n" + 
				"\r\n" + 
				"  if (!Y.Lang.isUndefined(YUI.Fantasy.MedalNotifications)) {\r\n" + 
				"    return;\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  var MedalNotifications = Y.Base.create('FantasyMedalNotifications', Y.Base, [], {\r\n" + 
				"\r\n" + 
				"    _handles : {},\r\n" + 
				"\r\n" + 
				"    initializer: function() {\r\n" + 
				"\r\n" + 
				"      var oMedalNotifications = this,\r\n" + 
				"        medalNode = Y.one('#ysf-medal-block'),\r\n" + 
				"        containerNode = Y.one('#ysf-medal-notifications'),\r\n" + 
				"        closeNode = Y.one('#ysf-medal-notifications a.close'),\r\n" + 
				"        uri = closeNode.getAttribute('data-href'),\r\n" + 
				"        requestData,\r\n" + 
				"        anim = new Y.Anim({ node: containerNode, to: { opacity: 0 }, duration: 0.5, easing: Y.Easing.easeOut }),\r\n" + 
				"        heightAnim = new Y.Anim({ node: containerNode, to: {height: 0}, duration: 0.2 });\r\n" + 
				"\r\n" + 
				"      anim.on('end', function() { heightAnim.run(); }, this);\r\n" + 
				"      heightAnim.on('end', function() { containerNode.setStyles({ 'display' : 'none', 'opacity' : '' }); }, this);\r\n" + 
				"      containerNode.delegate('click', oMedalNotifications.closeMedal, 'a');\r\n" + 
				"      containerNode.on('mouseenter', function() {\r\n" + 
				"        if(!containerNode.hasClass('no-autorun')) {\r\n" + 
				"          containerNode.addClass('no-autorun');\r\n" + 
				"        }\r\n" + 
				"      });\r\n" + 
				"\r\n" + 
				"      setTimeout(function() {\r\n" + 
				"        if(!containerNode.hasClass('in-progress')) {\r\n" + 
				"          if(!containerNode.hasClass('no-autorun')) {\r\n" + 
				"            anim.run();\r\n" + 
				"            Y.on('io:complete', function(){\r\n" + 
				"              oMedalNotifications.completeIO;\r\n" + 
				"              containerNode.remove();\r\n" + 
				"            }, Y, [closeNode, containerNode]);\r\n" + 
				"            requestData = Y.io(uri, {\"headers\": {\"Ajax-Request\": \"true\"}});\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"      }, 6000);\r\n" + 
				"\r\n" + 
				"      oMedalNotifications.set('medalNode', medalNode);\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    completeIO: function(id, o, args) {\r\n" + 
				"      var id = id,\r\n" + 
				"        data = o.responseText,\r\n" + 
				"        node = args[0];\r\n" + 
				"\r\n" + 
				"      return data;\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    closeMedal: function(e) {\r\n" + 
				"\r\n" + 
				"      if(e.currentTarget.hasClass('close')) {\r\n" + 
				"        e.preventDefault();\r\n" + 
				"      }\r\n" + 
				"      var oMedalNotifications = this,\r\n" + 
				"        containerNode = Y.one('#ysf-medal-notifications'),\r\n" + 
				"        uri = e.currentTarget.getAttribute('data-href'),\r\n" + 
				"        redirectUri = e.currentTarget.getAttribute('href'),\r\n" + 
				"        node = e.currentTarget,\r\n" + 
				"        requestData,\r\n" + 
				"        anim = new Y.Anim({ node: containerNode, to: { opacity: 0 }, duration: 0.5, easing: Y.Easing.easeOut }),\r\n" + 
				"        heightAnim = new Y.Anim({ node: containerNode, to: {height: 0}, duration: 0.2 });\r\n" + 
				"\r\n" + 
				"      anim.on('end', function() { heightAnim.run(); }, this);\r\n" + 
				"      heightAnim.on('end', function() { containerNode.setStyles({ 'display' : 'none', 'opacity' : '' }); }, this);\r\n" + 
				"\r\n" + 
				"      containerNode.addClass('in-progress');\r\n" + 
				"      anim.run();\r\n" + 
				"      Y.on('io:complete', function(){\r\n" + 
				"        oMedalNotifications.completeIO;\r\n" + 
				"        containerNode.remove();\r\n" + 
				"      }, Y, [node]);\r\n" + 
				"      requestData = Y.io(uri, {\"headers\": {\"Ajax-Request\": \"true\"}});\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    destructor : function() {\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    ATTRS : {\r\n" + 
				"\r\n" + 
				"      medalNode : {\r\n" + 
				"        value : null\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  });\r\n" + 
				"\r\n" + 
				"  YUI.Fantasy.MedalNotifications = new MedalNotifications();\r\n" + 
				"\r\n" + 
				"}, '', {\r\n" + 
				"  requires : ['base-build', 'node-event-delegate', 'anim-base', 'anim-easing', 'io-base']\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"YSF.use('event', function(Y) {\r\n" + 
				"    if (Y.UA.ie === 0 || Y.UA.ie > 7){\r\n" + 
				"	    Y.on('contentready', function() {\r\n" + 
				"  	        Y.use('ysf-medal-notifications', function(){});\r\n" + 
				"        }, '#ysf-medal-notifications');\r\n" + 
				"    }\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"// -->\r\n" + 
				"</script>\r\n" + 
				" <script charset=\"utf-8\" language=\"javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use('node', function(Y) {\r\n" + 
				"\r\n" + 
				"    var lastOpenedNote = '';\r\n" + 
				"\r\n" + 
				"    var showStatNote = function(e) {\r\n" + 
				"        e.halt();\r\n" + 
				"\r\n" + 
				"        var popupId     = e.currentTarget.getAttribute('data-stat-note-id'),\r\n" + 
				"            noteToShow  = Y.one('#' + popupId),\r\n" + 
				"            click_x     = e.currentTarget.getX(),\r\n" + 
				"            click_y     = e.currentTarget.getY();\r\n" + 
				"\r\n" + 
				"        noteToShow.removeClass('hidden');\r\n" + 
				"\r\n" + 
				"        click_x += 20;\r\n" + 
				"        if(click_x > (window.innerWidth - parseInt(noteToShow.getComputedStyle(\"width\")))){\r\n" + 
				"            click_x = window.innerWidth - 2 * parseInt(noteToShow.getComputedStyle(\"width\"));\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        click_y -= (parseInt(noteToShow.getComputedStyle(\"height\")) / 2) - 8;\r\n" + 
				"\r\n" + 
				"        noteToShow.setXY([click_x, click_y]);\r\n" + 
				"\r\n" + 
				"        var arrow = noteToShow.one(\".arrow\");\r\n" + 
				"        if(arrow && !arrow.hasClass(\"repositioned\")) {\r\n" + 
				"            arrow.setX(arrow.getX() + 6);\r\n" + 
				"            arrow.addClass(\"repositioned\");\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        //Make sure last one removed in case the use is\r\n" + 
				"        //opening a new note without closing the first\r\n" + 
				"        Y.detach(\"close|click\");\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        if(lastOpenedNote) {\r\n" + 
				"            /* Make sure the last note opened gets closed */\r\n" + 
				"            if(lastOpenedNote.getAttribute('id') != popupId && !lastOpenedNote.hasClass('hidden')) {\r\n" + 
				"                lastOpenedNote.addClass('hidden');\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        lastOpenedNote = noteToShow;\r\n" + 
				"        Y.later(5, window, function(){\r\n" + 
				"            Y.on(\"close|click\",  clickAnywhereToClose, document.body, null, noteToShow);\r\n" + 
				"        }, [], false);\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    var clickAnywhereToClose =  function(e, noteToClose) {\r\n" + 
				"\r\n" + 
				"        noteToClose.addClass('hidden');\r\n" + 
				"        Y.detach(\"close|click\");\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    var init = function(e) {\r\n" + 
				"\r\n" + 
				"        Y.delegate(\"click\",  showStatNote, \"body\", \".has-stat-note\");\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    Y.on('available', init, '#ysf-stat-notes', this);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script><script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"\r\n" + 
				"/*\r\n" + 
				" * YAFT [Yahoo above fold time] is a js performance library aims to measure mainly \r\n" + 
				" * user perceived performance [aft] by utilizing Navigation and Resource Timing APIs.\r\n" + 
				" * It returns following metrics via its callback function's first parameter object:\r\n" + 
				" * AFT ( above fold time )\r\n" + 
				" * VIC ( Visually Complete )\r\n" + 
				" * costlyResources \r\n" + 
				" * domElementsCount\r\n" + 
				" * ttbf: time to first byte\r\n" + 
				" * domInteractive: the time at which page is interactive\r\n" + 
				" * modulesReport: the details of each module’s loadTime, coveragePercentage, inViewPort, resources and start time\r\n" + 
				" * \r\n" + 
				" * Appending showaft=1 query param to main Fantasy pages in Chrome will allow you to see aft report visually on the page.\r\n" + 
				" * More at http://yo/yaft\r\n" + 
				" *\r\n" + 
				" */\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"YSF.use(\"node\", \"event\",\"event\",\"node-base\",\"event-base\", \"json\", \"cookie\",\"base\",\"jsonp\",\"querystring\", function(Y) {\r\n" + 
				"Y.later(10, this, function() {\r\n" + 
				"  if (window.LH !== undefined) {\r\n" + 
				"    if ( !window.LH.isInitialized) {\r\n" + 
				"	if (window.location.href.indexOf('showaft=') != -1 || Math.floor(Math.random()*100)<=3 || 0) {\r\n" + 
				"	    window.LH.init(\r\n" + 
				"	    {\r\n" + 
				"		spaceid: '782200906',\r\n" + 
				"		serverip:'', \r\n" + 
				"		pvid:'', \r\n" + 
				"		crumb:''\r\n" + 
				"	    });\r\n" + 
				"	}\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if (window.LH.isInitialized && window.YAFT !== undefined) {\r\n" + 
				"	var yaftCallback = function (data, error) {\r\n" + 
				"	    if (!error) {\r\n" + 
				"                \r\n" + 
				"               // AFT = Above Fold Time :  average time at which visible parts of the page are displayed. \r\n" + 
				"               // It is expressed in milliseconds and dependent on size of the view port.\r\n" + 
				"		window.LH.record('AFT', {\r\n" + 
				"		    name: 'AFT', type: 'mark', startTime: Math.round(data.aft), duration: 0\r\n" + 
				"		});\r\n" + 
				"\r\n" + 
				"               // VIC = Visually Complete :  the time at which everything in the viewport is visually loaded \r\n" + 
				"		window.LH.record('VIC', {\r\n" + 
				"		    name: 'VIC', type: 'mark', startTime: Math.round(data.visuallyComplete), duration: 0\r\n" + 
				"		});\r\n" + 
				"\r\n" + 
				"		if ( ___adLT___ !== undefined && ___adLT___.length && ___adLT___.length > 0) {\r\n" + 
				"		    for (var __i__ = 0; __i__ < ___adLT___.length; __i__++) {\r\n" + 
				"			window.LH.record(___adLT___[__i__][0], {\r\n" + 
				"			    name: ___adLT___[__i__][0], type: 'mark', startTime: ___adLT___[__i__][1], duration: 0\r\n" + 
				"			});\r\n" + 
				"		    }\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"		window.LH.beacon( {\r\n" + 
				"		    clearMarks:false, clearMeasures: false, clearCustomEntries: true, clearTags: false\r\n" + 
				"		});\r\n" + 
				"	    }\r\n" + 
				"	};\r\n" + 
				"	var modArray = ['sitenav','sitenavsub','yucsHead'];\r\n" + 
				"\r\n" + 
				"        [].slice.call(document.querySelectorAll(\".Mod\")).forEach(function(el,i){\r\n" + 
				"           modArray.push(el.getAttribute(\"id\"));\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"        [].slice.call(document.querySelectorAll(\".Ad\")).forEach(function(el,i){\r\n" + 
				"           modArray.push(el.getAttribute(\"id\"));\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"	window.YAFT.init(\r\n" + 
				"	{\r\n" + 
				"	   modules: modArray,\r\n" + 
				"           generateHAR: true,\r\n" + 
				"	    maxWaitTime: 2500\r\n" + 
				"	}, yaftCallback);\r\n" + 
				"\r\n" + 
				"	//Need to do this manually\r\n" + 
				"	//YAFT triggers this onLoad, but by this time onLoad has fired so YAFT misses it\r\n" + 
				"	 setTimeout(function () {\r\n" + 
				"	  YAFT.triggerPerf('custom', yaftCallback);\r\n" + 
				"	  }, 4000);\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"}});\r\n" + 
				"\r\n" + 
				"/*\r\n" + 
				" * Used to send User Timing Metrics beacons to Lighthouse for the following : \r\n" + 
				" * AD_LREC , AD_LREC2, AD_LN1, AD_LN1 etc. Darla ads fire a custom event.\r\n" + 
				" * YAFT hooks into onFinishPosRender to get a snapshot of performance (user timing metrics)\r\n" + 
				" * using the window.performance object. \r\n" + 
				" */\r\n" + 
				"\r\n" + 
				"var ___adLT___ = [];\r\n" + 
				"function onDarlaFinishPosRender(position) {\r\n" + 
				"  if (window.performance !== undefined && window.performance.now !== undefined) {\r\n" + 
				"    var ltime = window.performance.now();\r\n" + 
				"    ___adLT___.push(['AD-'+position, Math.round(ltime)]);\r\n" + 
				"    setTimeout(function () {\r\n" + 
				"        if (window.LH !== undefined && window.YAFT !== undefined && window.YAFT.isInitialized()) {\r\n" + 
				"          window.YAFT.triggerCustomTiming('yspad'+position, '', ltime);\r\n" + 
				"        }\r\n" + 
				"    },1000);\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"if (window.DARLA && (DARLA.config || window.DARLA_CONFIG)) {\r\n" + 
				"    var oldConf = DARLA.config() || DARLA_CONFIG || null;\r\n" + 
				"    if (oldConf) {\r\n" + 
				"        if (oldConf.onFinishPosRender) {\r\n" + 
				"            (function() {\r\n" + 
				"                var oldVersion = oldConf.onFinishPosRender;\r\n" + 
				"                oldConf.onFinishPosRender = function(position) {\r\n" + 
				"                    onDarlaFinishPosRender(position);\r\n" + 
				"                    return oldVersion.apply(me, arguments);\r\n" + 
				"                };\r\n" + 
				"            })();\r\n" + 
				"        } else {\r\n" + 
				"            oldConf.onFinishPosRender  = onDarlaFinishPosRender;\r\n" + 
				"        }\r\n" + 
				"        DARLA.config(oldConf);\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"</footer><div style=\"\" id=\"yspglobalcontentincludes\" class=\"Thm-snow\"><section id=\"ie8-warning\" class=\"Mod Thm-inherit Z-10 Fixed Botstart W-100 Ta-c Bdrtop-accent IE8-show\">\r\n" + 
				"	<div class=\"Bd Py-med No-px\">\r\n" + 
				"		<span>Internet Explorer 8 is no longer supported by Yahoo Fantasy.</span>\r\n" + 
				"		<a href=\"https://help.yahoo.com/kb/fantasy-football/yahoo-supported-web-browser-sln4556.html\" target=\"_blank\"> Please download a supported browser.</a>\r\n" + 
				"	</div>\r\n" + 
				"</section></div><div class=\"Tst-adlocation-Z\"></div><div id=\"comscore-beacon\" >\r\n" + 
				"    <!-- COMSCORE BEACON -->\r\n" + 
				"    <script>\r\n" + 
				"        /*\r\n" + 
				"         * YUI3 port of i13n.js\r\n" + 
				"         */\r\n" + 
				"        // construct comscore beacon Image\r\n" + 
				"        if(typeof(YUI) === 'function') {\r\n" + 
				"\r\n" + 
				"            YUI.add('ysp-i13n', function(Y) {\r\n" + 
				"\r\n" + 
				"                var comscore_image = new Image();\r\n" + 
				"\r\n" + 
				"                YSF.sendComscoreEvent = function (spaceid, uri) {\r\n" + 
				"\r\n" + 
				"                    var beacon_url     = '//sb.scorecardresearch.com/b?c1=2&c2=7241469&c7='+uri+'&c5='+spaceid;\r\n" + 
				"                    comscore_image.src = beacon_url;\r\n" + 
				"\r\n" + 
				"                };\r\n" + 
				"\r\n" + 
				"            }, '1.0', {});\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"            YSF.use('ysp-i13n', function(Y) {\r\n" + 
				"                if(typeof(YSF.sendComscoreEvent) === 'function') {\r\n" + 
				"                  YSF.sendComscoreEvent(YUI.Fantasy.SpaceIds.spaceid, encodeURIComponent(document.location.href));\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"\r\n" + 
				"        } else {\r\n" + 
				"                        document.write('<img src=\"https://sb.scorecardresearch.com/b?c1=2&c2=7241469&c7=football.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3F%26week%3D2&c5=782200906&cv=2.0&cj=1\" style=\"display:none\" width=\"0\" height=\"0\" alt=\"\">');\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"    </script>\r\n" + 
				"\r\n" + 
				"    <noscript>\r\n" + 
				"        <img src=\"https://sb.scorecardresearch.com/b?c1=2&c2=7241469&c7=football.fantasysports.yahoo.com%2Ff1%2F686943%2F11%2Fteam%3F%26week%3D2&c5=782200906&cv=2.0&cj=1\" style=\"display:none\" width=\"0\" height=\"0\" alt=\"\">    </noscript>\r\n" + 
				"    <!-- END OF COMSCORE BEACON -->\r\n" + 
				"</div>\r\n" + 
				"              </div> <!-- END .Page -->\r\n" + 
				"            </div> <!-- END .Page-wrap -->\r\n" + 
				"          </div> <!-- END .yui-sv-content -->\r\n" + 
				"        </div> <!-- END .ct-box-hd -->\r\n" + 
				"      </div> <!-- END .ct-box -->\r\n" + 
				"    </div><!-- END .outer-wrapper -->\r\n" + 
				"    <script>\r\n" + 
				"    if(YSF && YSF.exec) {\r\n" + 
				"      YFB = YMedia = YSF.getInstance();\r\n" + 
				"      YSF.exec();\r\n" + 
				"    }\r\n" + 
				"    </script>\r\n" + 
				"    	</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"<!-- fanos893.sports.bf1.yahoo.com Fri Oct 20 00:58:10 UTC 2017 -->\r\n" + 
				"";
		String inputLine1 = "\r\n" + 
				"<!DOCTYPE html>\r\n" + 
				"<html id=\"Stencil\" class=\"NoJs template-html5 Sticky-off Desktop\" lang=\"en-US\" xmlns:fb=\"https://www.facebook.com/2008/fbml\">\r\n" + 
				"	<head>\r\n" + 
				"        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EDGE\" />\r\n" + 
				"    <link rel=\"canonical\" href=\"https://football.fantasysports.yahoo.com/f1/686943/3\" />\r\n" + 
				"    <link rel=\"dns-prefetch\" href=\"https://s.yimg.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//csc.beap.bc.yahoo.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//geo.query.yahoo.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//y.analytics.yahoo.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//b.scorecardresearch.com\" />\r\n" + 
				"<link rel=\"dns-prefetch\" href=\"//l.yimg.com\" />\r\n" + 
				"    <!-- IMPORTANT: DON'T PUT ANYTHING THAT DOES STUFF (scripts, stylesheets, etc.) BEFORE THIS META TAG -->\r\n" + 
				"    <script>\r\n" + 
				"    (function(html){\r\n" + 
				"        var c = html.className;\r\n" + 
				"        c += \" JsEnabled\";\r\n" + 
				"        c = c.replace(\"NoJs\",\"\");\r\n" + 
				"        html.className = c;\r\n" + 
				"    })(document.documentElement);\r\n" + 
				"    </script>\r\n" + 
				"		<title>SZYFG1 - Mooresville Bombers | Fantasy Football | Yahoo! Sports</title>\r\n" + 
				"    <meta name=\"apple-mobile-web-app-title\" content=\"Y! Fantasy\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_57x57.jpg?v=1\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_72x72.jpg?v=1\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_114x114.jpg?v=1\" />\r\n" + 
				"<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://s.yimg.com/dh/ap/fantasy/img/app_icon_144x144.jpg?v=1\" />\r\n" + 
				"<link href=\"https://s.yimg.com/zz/combo?kx/yucs/uh3s/atomic/88/css/atomic-min.css&kx/yucs/uh_common/meta/3/css/meta-min.css&kx/yucs/uh3s/uh/410/css/uh-gs-grid-min.css&os/stencil/3.0.0-alpha7/desktop/styles-ltr.css\" type=\"text/css\" rel=\"stylesheet\" /><link href=\"https://sp.yimg.com/ua/assets/eJxdkVuTojAUhH-RGfCCWvsks-Dg4CguXl9SIQSM5MIkQcVfvwi7Uzv7lsrX6dPpg7V-0YYITFkvQZoAt7_sHyczncdlPvuBG1xXVBFNDICkvNflnK_9-aZuUYlyAlK56ZE0dSyYroP2mmIpQJTdQzSMguI8H3ZGulTUEIilIuDtnrsHDwdys3z3W2qkZIaW4ObaK2pXNJwFdNUSJChHhjaeGvOPdGqdRrnN3T-jqMivfVB7r4EwF3ZYO_uiy8ZQTZSQzcQSGXwG42Rl7aw4CXM2cb9ywi4VGJjoXnxuR3kKtddS_nxVlSDaYv9ozIDDh6paIqTQ6BnMSE4fRHUHDLjtO9aBO_3B57BrgsuUQJJSA7Y9ac-mRXbk1fXS1fEsIpFIpeBtnXyG8QrdoKiHLUwVygxMkSGG8uYHFBdEATy6hOu9DQtr6olWhyvdzIaGII6fTiQmM7pBFFe7JP9XoWSzZgWu-ykbB2VmDr3ttuVZxdiLyNhfYZYxcLr81N5ioZwoYl2bV5oSCZ-dMqoN8Ecujx819noVsr7b6FIqA__TH3eTgb2MAzMNXmW37jOHWsgbEGM_vksT_louwuV3q1bT2rXK64dI4PsQnxYPZ_RlYmQtDQLHiPSXQrK4ih_oNwYaB3g,.css?z&m\" type=\"text/css\" rel=\"stylesheet\" /><style type=\"text/css\" id=\"css-all\">\r\n" + 
				".ysf-medal{\r\n" + 
				"    width:280px;\r\n" + 
				"    background-color:#292929;\r\n" + 
				"    -moz-opacity: 0.8;\r\n" + 
				"    opacity:.80;\r\n" + 
				"    filter:alpha(opacity=80);\r\n" + 
				"    border-radius: 40px 10px 10px 40px;\r\n" + 
				"    position:fixed;\r\n" + 
				"    bottom:20px;\r\n" + 
				"    left:10%;\r\n" + 
				"    right:10%;\r\n" + 
				"    margin:0 auto;\r\n" + 
				"    z-index:2000;\r\n" + 
				"    *display:none;\r\n" + 
				"    -webkit-font-smoothing: antialiased;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".no-autorun .ysf-medal {\r\n" + 
				"    -moz-opacity: 0.85;\r\n" + 
				"    opacity:.85;\r\n" + 
				"    filter:alpha(opacity=85);\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".ysf-medal .hd h3{\r\n" + 
				"    text-indent:-999em;\r\n" + 
				"    height:5px;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd{\r\n" + 
				"    background-repeat:no-repeat;\r\n" + 
				"    padding-left:90px;\r\n" + 
				"    margin-left:5px;\r\n" + 
				"    height:76px;\r\n" + 
				"    color:#fff;\r\n" + 
				"    text-align:left;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd a.view{\r\n" + 
				"    color:#fff;\r\n" + 
				"    font-weight:bold;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd a.close{\r\n" + 
				"    float:right;\r\n" + 
				"    display:none;\r\n" + 
				"    text-indent:-999em;\r\n" + 
				"    background-image:url(https://s.yimg.com/dh/ap/us/sp/fn/default/circle_close.png);\r\n" + 
				"    width:22px;\r\n" + 
				"    height:22px;\r\n" + 
				"    position:relative;\r\n" + 
				"    top: -70px;\r\n" + 
				"    left: 10px;\r\n" + 
				"}\r\n" + 
				".no-autorun .ysf-medal .bd a.close {\r\n" + 
				"    display:inline;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".ysf-medal .bd .desc{\r\n" + 
				"    padding-top:11px;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd .desc strong{\r\n" + 
				"    font-weight:bold;\r\n" + 
				"}\r\n" + 
				".ysf-medal .bd .remaining{\r\n" + 
				"    font-size:11px;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				".ysf-medal .ft{\r\n" + 
				"    height:5px;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"</style><!--[if lte IE 8]>\r\n" + 
				"<script type=\"text/javascript\" src=\"https://s.yimg.com/zz/combo?yui-s:3.18.1/build/yui/yui-min.js&yui-s:3.18.1/build/oop/oop-min.js&yui-s:3.18.1/build/event-custom-base/event-custom-base-min.js&yui-s:3.18.1/build/event-base/event-base-min.js&yui-s:3.18.1/build/event-custom-complex/event-custom-complex-min.js&yui-s:3.18.1/build/attribute-core/attribute-core-min.js&yui-s:3.18.1/build/attribute-observable/attribute-observable-min.js&yui-s:3.18.1/build/attribute-extras/attribute-extras-min.js&yui-s:3.18.1/build/attribute-base/attribute-base-min.js&yui-s:3.18.1/build/base-core/base-core-min.js&yui-s:3.18.1/build/base-base/base-base-min.js&yui-s:3.18.1/build/base-build/base-build-min.js&yui-s:3.18.1/build/base-observable/base-observable-min.js&yui-s:3.18.1/build/pluginhost-base/pluginhost-base-min.js&yui-s:3.18.1/build/pluginhost-config/pluginhost-config-min.js&yui-s:3.18.1/build/dump/dump-min.js&ss/rapid-3.42.2.js&os/mit/td/asset-loader-s-65445b17.js&aj/lh-0.9.js&os/mit/media/p/content/content-aft-min-8acb8a6.js\"></script>\r\n" + 
				"<![endif]-->\r\n" + 
				"<!--[if gt IE 8]><!-->\r\n" + 
				"<script type=\"text/javascript\" src=\"https://s.yimg.com/zz/combo?yui-s:3.18.1/build/yui/yui-min.js&yui-s:3.18.1/build/oop/oop-min.js&yui-s:3.18.1/build/event-custom-base/event-custom-base-min.js&yui-s:3.18.1/build/event-base/event-base-min.js&yui-s:3.18.1/build/event-custom-complex/event-custom-complex-min.js&yui-s:3.18.1/build/attribute-core/attribute-core-min.js&yui-s:3.18.1/build/attribute-observable/attribute-observable-min.js&yui-s:3.18.1/build/attribute-extras/attribute-extras-min.js&yui-s:3.18.1/build/attribute-base/attribute-base-min.js&yui-s:3.18.1/build/base-core/base-core-min.js&yui-s:3.18.1/build/base-base/base-base-min.js&yui-s:3.18.1/build/base-build/base-build-min.js&yui-s:3.18.1/build/base-observable/base-observable-min.js&yui-s:3.18.1/build/pluginhost-base/pluginhost-base-min.js&yui-s:3.18.1/build/pluginhost-config/pluginhost-config-min.js&yui-s:3.18.1/build/dump/dump-min.js&ss/rapid-3.42.2.js&os/mit/td/asset-loader-s-65445b17.js&aj/lh-0.9.js&os/mit/media/p/content/content-aft-min-8acb8a6.js&yui-s:3.18.1/build/dom-core/dom-core-min.js&yui-s:3.18.1/build/dom-base/dom-base-min.js&yui-s:3.18.1/build/selector-native/selector-native-min.js&yui-s:3.18.1/build/selector/selector-min.js&yui-s:3.18.1/build/selector-css2/selector-css2-min.js&yui-s:3.18.1/build/selector-css3/selector-css3-min.js&yui-s:3.18.1/build/node-core/node-core-min.js&yui-s:3.18.1/build/node-base/node-base-min.js&yui-s:3.18.1/build/event-delegate/event-delegate-min.js&yui-s:3.18.1/build/event-synthetic/event-synthetic-min.js&yui-s:3.18.1/build/event-mousewheel/event-mousewheel-min.js&yui-s:3.18.1/build/event-mouseenter/event-mouseenter-min.js&yui-s:3.18.1/build/event-key/event-key-min.js&yui-s:3.18.1/build/event-focus/event-focus-min.js&yui-s:3.18.1/build/event-resize/event-resize-min.js&yui-s:3.18.1/build/event-hover/event-hover-min.js&yui-s:3.18.1/build/event-outside/event-outside-min.js&yui-s:3.18.1/build/event-touch/event-touch-min.js&yui-s:3.18.1/build/event-move/event-move-min.js&yui-s:3.18.1/build/event-flick/event-flick-min.js&yui-s:3.18.1/build/event-valuechange/event-valuechange-min.js&yui-s:3.18.1/build/event-tap/event-tap-min.js&yui-s:3.18.1/build/node-event-delegate/node-event-delegate-min.js&yui-s:3.18.1/build/node-pluginhost/node-pluginhost-min.js&yui-s:3.18.1/build/color-base/color-base-min.js&yui-s:3.18.1/build/dom-style/dom-style-min.js&yui-s:3.18.1/build/dom-screen/dom-screen-min.js&yui-s:3.18.1/build/node-screen/node-screen-min.js&yui-s:3.18.1/build/node-style/node-style-min.js&yui-s:3.18.1/build/querystring-stringify-simple/querystring-stringify-simple-min.js&yui-s:3.18.1/build/querystring-parse-simple/querystring-parse-simple-min.js&yui-s:3.18.1/build/io-base/io-base-min.js&yui-s:3.18.1/build/datatype-xml-parse/datatype-xml-parse-min.js&yui-s:3.18.1/build/io-xdr/io-xdr-min.js&yui-s:3.18.1/build/io-form/io-form-min.js&yui-s:3.18.1/build/io-upload-iframe/io-upload-iframe-min.js&yui-s:3.18.1/build/queue-promote/queue-promote-min.js&yui-s:3.18.1/build/io-queue/io-queue-min.js&yui-s:3.18.1/build/base-pluginhost/base-pluginhost-min.js&yui-s:3.18.1/build/json-parse/json-parse-min.js\"></script>\r\n" + 
				"<!--<![endif]-->\r\n" + 
				"<script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\"><!--\r\n" + 
				"// just to make sure YAHOO.namespace works, which allows us some flexibility.\r\n" + 
				"var YSF, YFB, YMedia;\r\n" + 
				"if(typeof YAHOO==\"undefined\"||!YAHOO){var YAHOO={};}\r\n" + 
				"YAHOO.namespace=function(){var b=arguments,g=null,e,c,f;for(e=0;e<b.length;e=e+1){f=(\"\"+b[e]).split(\".\");g=YAHOO;for(c=(f[0]==\"YAHOO\")?1:0;c<f.length;c=c+1){g[f[c]]=g[f[c]]||{};g=g[f[c]];}}return g;};\r\n" + 
				"(function() {\r\n" + 
				"YAHOO.namespace(\"YAHOO.Sports\");\r\n" + 
				"\r\n" + 
				"YAHOO.Sports.PlayerNoteConfig = {\r\n" + 
				"    cfg: {\r\n" + 
				"        player_notes_tabs_comscore: true,\r\n" + 
				"        player_notes_tabs_ads: true,\r\n" + 
				"        player_notes_xfbml: true,\r\n" + 
				"        player_notes_FB: true    },\r\n" + 
				"    is_enabled: function(feature) {\r\n" + 
				"\r\n" + 
				"        if (this.cfg[feature] !== 'undefined') {\r\n" + 
				"            return this.cfg[feature];\r\n" + 
				"        }\r\n" + 
				"        return false;\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"}());\r\n" + 
				"\r\n" + 
				"YUI.namespace('Fantasy');\r\n" + 
				"\r\n" + 
				"YUI.YUICfg = {\r\n" + 
				"    \r\n" + 
				"                'combine' : true,\r\n" + 
				"                'base' : 'https://s.yimg.com/',\r\n" + 
				"                'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                'root' : 'yui-s:3.18.1/build/',\r\n" + 
				"                'comboSep' : '&',\r\n" + 
				"                'filter': {\r\n" + 
				"                    'searchExp':';',\r\n" + 
				"                    'replaceStr': '&'\r\n" + 
				"                },    'groups' : {\r\n" + 
				"\r\n" + 
				"        'ysf-yui2' : {\r\n" + 
				"            'combine' : true,\r\n" + 
				"            'base' : 'https://s.yimg.com/d/lib/yui/',\r\n" + 
				"            'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"            'root' : '/d/lib/yui/2.9.0/build/',\r\n" + 
				"            'comboSep': '&',\r\n" + 
				"            'modules' :  {\r\n" + 
				"                'ysf-yui2-charts': {\r\n" + 
				"                    path: \"charts/charts.js\",\r\n" + 
				"                    requires: ['ysf-yui2-yde', 'ysf-yui2-element', 'ysf-yui2-datasource', 'ysf-yui2-json', 'ysf-yui2-swf']\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-datasource' : {\r\n" + 
				"                    path: \"datasource/datasource.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-carousel': {\r\n" + 
				"                    path: \"carousel/carousel.js\",\r\n" + 
				"                    requires: ['ysf-yui2-yde', 'ysf-yui2-element']\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-animation': {\r\n" + 
				"                    path: \"animation/animation.js\",\r\n" + 
				"                    requires: ['ysf-yui2-yde']\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-element': {\r\n" + 
				"                    path: \"element/element.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-json': {\r\n" + 
				"                    path: \"json/json.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-swf': {\r\n" + 
				"                    path: \"swf/swf.js\"\r\n" + 
				"                },\r\n" + 
				"                'ysf-yui2-yde': {\r\n" + 
				"                    path: \"yahoo-dom-event/yahoo-dom-event.js\"\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        'ysf' : {\r\n" + 
				"            'combine' : true,\r\n" + 
				"            'base' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'comboBase' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'root' : '',\r\n" + 
				"            'comboSep': ';',\r\n" + 
				"            'filter': {\r\n" + 
				"                'searchExp':\"\\\\.(js|css)[\\\\?\\\\&a-zA-Z0-9]*;\",\r\n" + 
				"                'replaceStr': \";\"\r\n" + 
				"            },\r\n" + 
				"            'modules': {\"ysf-xhr\":{\"path\":\"js\\/ysf-xhr.TjPB8xMDyXDGa.js?m\",\"requires\":[\"io-base\",\"io-form\",\"base\",\"node\",\"json-parse\",\"querystring-stringify-simple\",\"querystring-parse-simple\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-xhr.TjPB8xMDyXDGa.js?m\"},\"yfa-module\":{\"path\":\"js\\/yfa-module.Uap008-a90vqf.js?m\",\"requires\":[\"ysf-xhr\",\"node\",\"node-event-delegate\",\"selector-css3\",\"base\",\"ysf-flyout-select\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/yfa-module.Uap008-a90vqf.js?m\"},\"ysf-formenhancer\":{\"path\":\"js\\/ysf-formenhancer.NRy-3PKlWLfNw.js?m\",\"requires\":[\"event\",\"event-custom\",\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-formenhancer.NRy-3PKlWLfNw.js?m\"},\"ysf-initlinks\":{\"path\":\"js\\/ysf-initlinks.AvRvJo2Qg8CvI.js?m\",\"requires\":[\"node\",\"event\",\"ysf-watchlist\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-initlinks.AvRvJo2Qg8CvI.js?m\"},\"ysf-watchlist\":{\"path\":\"js\\/ysf-watchlist.JRrVyG0sumYWR.js?m\",\"requires\":[\"ysf-xhr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-watchlist.JRrVyG0sumYWR.js?m\"},\"ysf-activeform\":{\"path\":\"js\\/ysf-activeform.CJVtzbyJse3Dm.js?m\",\"requires\":[\"node\",\"event\",\"base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-activeform.CJVtzbyJse3Dm.js?m\"},\"ysf-bracket-manager\":{\"path\":\"js\\/ysf-bracket-manager.3sTP1-8P7EwCg.js?m\",\"requires\":[\"dd-drag\",\"dd-drop\",\"dd-delegate\",\"dd-proxy\",\"base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-bracket-manager.3sTP1-8P7EwCg.js?m\"},\"ysf-overlay\":{\"path\":\"js\\/ysf-overlay.94W6yWx4S7Hz5.js?m\",\"requires\":[\"event-custom\",\"node\",\"event\",\"overlay\",\"widget-anim\",\"gallery-overlay-extras\",\"gallery-outside-events\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-overlay.94W6yWx4S7Hz5.js?m\"},\"ysf-tooltip\":{\"path\":\"js\\/ysf-tooltip.tC7-HLsoYb3iD.js?m\",\"requires\":[\"node\",\"overlay\",\"event-outside\",\"widget-anim\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-tooltip.tC7-HLsoYb3iD.js?m\"},\"ysf-validator\":{\"path\":\"js\\/ysf-validator.DwFNLtH8pfbgr.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-validator.DwFNLtH8pfbgr.js?m\"},\"ysf-html\":{\"path\":\"js\\/ysf-html.JYxjQg1s9coJH.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-html.JYxjQg1s9coJH.js?m\"},\"media-playernote-views-history\":{\"path\":\"js\\/media-playernote-views-history.iqFrKY2lqlSIj.js?m\",\"requires\":\"media-playernote-view\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/media-playernote-views-history.iqFrKY2lqlSIj.js?m\"},\"ysf-reg-validation\":{\"path\":\"js\\/ysf-reg-validation.mIyX9kxPb3d5c.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-validation.mIyX9kxPb3d5c.js?m\"},\"ysf-reg-scoring\":{\"path\":\"js\\/ysf-reg-scoring.HV3b5CQnHj574.js?m\",\"requires\":[\"node\",\"css3-selector\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-scoring.HV3b5CQnHj574.js?m\"},\"ysf-reg-createleague\":{\"path\":\"js\\/ysf-reg-createleague.pw1tkuk6bHkqK.js?m\",\"requires\":[\"node\",\"event\",\"ysf-activeform\",\"ysf-draft-datetime-picker\",\"ysf-tooltip\",\"ysf-reg-validation\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-createleague.pw1tkuk6bHkqK.js?m\"},\"ysf-draft-datetime-picker\":{\"path\":\"js\\/ysf-draft-datetime-picker.lmX33GIiOTqM9.js?m\",\"requires\":[\"calendar\",\"overlay\",\"event-outside\",\"datatype-date\",\"ysf-alerts\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-draft-datetime-picker.lmX33GIiOTqM9.js?m\"},\"ysf-alerts\":{\"path\":\"js\\/ysf-alerts.ouByWLVrokr2O.js?m\",\"requires\":[\"base-build\",\"node-event-delegate\",\"anim-base\",\"anim-easing\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-alerts.ouByWLVrokr2O.js?m\"},\"css-animation-events\":{\"path\":\"js\\/css-animation-events.qXHssa39lCL-y.js?m\",\"requires\":[\"node-base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/css-animation-events.qXHssa39lCL-y.js?m\"},\"ysf-rosterslot\":{\"path\":\"js\\/ysf-rosterslot.Yl66im8SLj5Qe.js?m\",\"requires\":[\"node\",\"base\",\"css-animation-events\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-rosterslot.Yl66im8SLj5Qe.js?m\"},\"ysf-rosterswapper\":{\"path\":\"js\\/ysf-rosterswapper.29T5QyHdensdQ.js?m\",\"requires\":[\"base\",\"node\",\"event\",\"ysf-rosterslot\",\"css-animation-events\",\"event-outside\",\"event-focus\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-rosterswapper.29T5QyHdensdQ.js?m\"},\"ysf-rosterswap-manager\":{\"path\":\"js\\/ysf-rosterswap-manager.HmHklwGLj6wMs.js?m\",\"requires\":[\"ysf-rosterswapper\",\"ysf-xhr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-rosterswap-manager.HmHklwGLj6wMs.js?m\"},\"ysf-tout\":{\"path\":\"js\\/ysf-tout.MBF5Vyw5rJhWz.js?m\",\"requires\":[\"node\",\"base\",\"transition\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-tout.MBF5Vyw5rJhWz.js?m\"},\"hover-intent\":{\"path\":\"js\\/hover-intent.eW-JpYUqhl0WO.js?m\",\"requires\":[\"node\",\"base\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/hover-intent.eW-JpYUqhl0WO.js?m\"},\"ysf-flyout-select\":{\"path\":\"js\\/ysf-flyoutselect.iUYWiOD8TNQjI.js?m\",\"requires\":[\"node\",\"hover-intent\",\"event\",\"event-hover\",\"base\",\"event-outside\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-flyoutselect.iUYWiOD8TNQjI.js?m\"},\"ysf-invite-contacts\":{\"path\":\"js\\/ysf-invite-contacts.2Vv8G1tRjf9bs.js?m\",\"requires\":[\"ysf-cors\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-invite-contacts.2Vv8G1tRjf9bs.js?m\"},\"ysf-private-cash-league-form\":{\"path\":\"js\\/ysf-private-cash-league-form.SNIX0N_Pj4Wfy.js?m\",\"requires\":[\"node\",\"events\",\"datatype-number\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-private-cash-league-form.SNIX0N_Pj4Wfy.js?m\"},\"ysf-sticky\":{\"path\":\"js\\/ysf-sticky.VY8xY986pzMeR.js?m\",\"requires\":[\"node\",\"event\",\"base\",\"event-resize\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-sticky.VY8xY986pzMeR.js?m\"},\"ysf-flowtips\":{\"path\":\"js\\/ysf-flowtips.Q1Ynm_Yrx_3lT.js?m\",\"requires\":[\"node\",\"event\",\"base\",\"overlay\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-flowtips.Q1Ynm_Yrx_3lT.js?m\"},\"ysf-headshot\":{\"path\":\"js\\/ysf-headshot.7WoTsd1kEznhi.js?m\",\"requires\":[\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-headshot.7WoTsd1kEznhi.js?m\"},\"ysf-video-player\":{\"path\":\"js\\/ysf-video-player.5xEbovWw4s1lV.js?m\",\"requires\":[\"node\",\"event\",\"ysf-overlay\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-video-player.5xEbovWw4s1lV.js?m\"},\"ysf-ffl\":{\"path\":\"js\\/ysf-ffl.TIWUibNr_0lAE.js?m\",\"requires\":[\"node\",\"event\",\"ysf-overlay\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-ffl.TIWUibNr_0lAE.js?m\"},\"ysf-viewloader\":{\"path\":\"js\\/ysf-viewloader.FAr8p2kP28c3D.js?m\",\"requires\":[\"yfa-module\",\"ysf-xhr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-viewloader.FAr8p2kP28c3D.js?m\"},\"media-overlay-surround\":{\"path\":\"js\\/playernote-overlay-surround.-e7MqBU3HdnS9.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node-screen\",\"event-resize\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-overlay-surround.-e7MqBU3HdnS9.js?m\"},\"media-overlay-close\":{\"path\":\"js\\/playernote-overlay-close.5xPQCqLnuN984.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node-event-delegate\",\"event-key\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-overlay-close.5xPQCqLnuN984.js?m\"},\"media-playernote-view\":{\"path\":\"js\\/playernote-view.p_2NXTIrbFttJ.js?m\",\"requires\":[\"plugin\",\"base-build\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-view.p_2NXTIrbFttJ.js?m\"},\"media-playernote\":{\"path\":\"js\\/playernote.CEhf5k58_EbPO.js?m\",\"requires\":[\"overlay\",\"io-base\",\"json-parse\",\"media-overlay-surround\",\"media-overlay-close\",\"dd-plugin\",\"media-playernote-css\",\"substitute\",\"media-playernote-view\",\"media-playernote-tabs\",\"transition\",\"media-playernote-views-notes\",\"media-playernote-views-twitter\",\"media-playernote-views-availability\",\"media-playernote-views-history\",\"media-playernote-views-video\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote.CEhf5k58_EbPO.js?m\"},\"media-playernotes\":{\"path\":\"js\\/playernotes.CI12jMp3_agYd.js?m\",\"requires\":[\"node-event-delegate\",\"base-build\",\"selector-css3\",\"media-playernote\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernotes.CI12jMp3_agYd.js?m\"},\"media-playernote-views-notes\":{\"path\":\"js\\/playernote-views-notes.p1ZBPH1M9oTch.js?m\",\"requires\":[\"media-playernote-view\",\"media-playernote-views-notes-css\",\"node-event-delegate\",\"base-build\",\"tabview\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-notes.p1ZBPH1M9oTch.js?m\"},\"media-playernote-tabs\":{\"path\":\"js\\/playernote-tabs.32XiuOIHmSdVn.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node-event-delegate\",\"transition\",\"media-playernote-tabs-css\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-tabs.32XiuOIHmSdVn.js?m\"},\"media-playernote-views-twitter\":{\"path\":\"js\\/playernote-views-twitter.jiKjK7eRFeXPG.js?m\",\"requires\":[\"media-playernote-view\",\"media-playernote-views-twitter-css\",\"node-event-delegate\",\"node-style\",\"selector-css3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-twitter.jiKjK7eRFeXPG.js?m\"},\"media-playernote-views-video\":{\"path\":\"js\\/playernote-views-video.HYRWaPq1XSSY_.js?m\",\"requires\":[\"media-playernote-view\",\"media-playernote-views-video-css\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-video.HYRWaPq1XSSY_.js?m\"},\"media-playernote-views-availability\":{\"path\":\"js\\/playernote-views-player-availability.rFMvUB9EBGQQS.js?m\",\"requires\":[\"media-playernote-view\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/playernote-views-player-availability.rFMvUB9EBGQQS.js?m\"},\"gallery-outside-events\":{\"path\":\"js\\/gallery-outside-events.yIArplQdPlne5.js?m\",\"requires\":[\"event-focus\",\"event-synthetic\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-outside-events.yIArplQdPlne5.js?m\"},\"gallery-overlay-extras\":{\"path\":\"js\\/gallery-overlay-extras.rR-Cbh2yn72pC.js?m\",\"requires\":[\"overlay\",\"plugin\",\"event-resize\",\"gallery-outside-events\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-overlay-extras.rR-Cbh2yn72pC.js?m\"},\"gallery-node-tokeninput\":{\"path\":\"js\\/gallery-node-tokeninput.DE6_qbFxO3_20.js?m\",\"requires\":[\"array-extras\",\"classnamemanager\",\"event-focus\",\"event-valuechange\",\"node-event-delegate\",\"node-pluginhost\",\"node-style\",\"plugin\",\"gallery-node-tokeninput-css\"],\"skinnable\":true,\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-node-tokeninput.DE6_qbFxO3_20.js?m\"},\"gallery-event-pasted\":{\"path\":\"js\\/gallery-event-pasted.BIEUZxnSiF06-.js?m\",\"requires\":[\"event-synthetic\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-event-pasted.BIEUZxnSiF06-.js?m\"},\"gallery-textarea-autoheight\":{\"path\":\"js\\/gallery-textarea-autoheight.9F78arvTCYXsk.js?m\",\"requires\":[\"plugin\",\"base-build\",\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-textarea-autoheight.9F78arvTCYXsk.js?m\"},\"input-mask\":{\"path\":\"js\\/input-mask.k36gdGapEfHLK.js?m\",\"requires\":[\"event-valuechange\",\"gallery-event-pasted\",\"event-focus\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/input-mask.k36gdGapEfHLK.js?m\"},\"gallery-overlay-modal\":{\"path\":\"js\\/gallery-overlay-modal.t4Xzl_Jz4FEzx.js?m\",\"requires\":[\"overlay\",\"plugin\",\"event-focus\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/gallery-overlay-modal.t4Xzl_Jz4FEzx.js?m\"},\"ysf-reg-create-group-team\":{\"path\":\"js\\/ysf-reg-create-group-team.J_osWn9U_vAKu.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-reg-create-group-team.J_osWn9U_vAKu.js?m\"},\"ysf-datasource\":{\"path\":\"js\\/ysf-datasource.qQ5JVzb1lpZ5-.js?m\",\"requires\":[\"base\",\"datasource-io\",\"datasource-jsonschema\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-datasource.qQ5JVzb1lpZ5-.js?m\"},\"dd-drag-offset\":{\"path\":\"js\\/dd-drag-offset.QlzVJXWsTAmQE.js?m\",\"requires\":[\"plugin\",\"dom-screen\",\"dd-drag\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-drag-offset.QlzVJXWsTAmQE.js?m\"},\"dd-sanity\":{\"path\":\"js\\/dd-sanity.ovGTPes4Mm1tt.js?m\",\"requires\":[\"plugin\",\"dd-ddm-base\",\"dd-drag\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-sanity.ovGTPes4Mm1tt.js?m\"},\"dd-touch\":{\"path\":\"js\\/dd-touch.KdG_-IyjrgaJH.js?m\",\"requires\":[\"plugin\",\"node-event-touch\",\"synthetic-touch-events\",\"dd-ddm\",\"dd-drag\",\"dd-drop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-touch.KdG_-IyjrgaJH.js?m\"},\"dd-touch-delegate\":{\"path\":\"js\\/dd-touch-delegate.Uh271g2OmyXlc.js?m\",\"requires\":[\"plugin\",\"node-event-touch\",\"synthetic-touch-events\",\"dd-ddm\",\"dd-drag\",\"dd-drop\",\"dd-touch\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/dd-touch-delegate.Uh271g2OmyXlc.js?m\"},\"ysf-draftorder\":{\"path\":\"js\\/ysf-draftorder.5ot56ONHMyczE.js?m\",\"requires\":[\"widget\",\"dd-constrain\",\"dd-proxy\",\"dd-drop\",\"oop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-draftorder.5ot56ONHMyczE.js?m\"},\"ysf-drafttracker\":{\"path\":\"js\\/ysf-drafttracker._YynBSq4b2Q1w.js?m\",\"requires\":[\"widget\",\"oop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-drafttracker._YynBSq4b2Q1w.js?m\"},\"ysf-editdraftorder-observer\":{\"path\":\"js\\/ysf-editdraftorder-observer.94ULArkYk-PVu.js?m\",\"requires\":[\"ysf-formobserver\",\"ysf-draftorder\",\"io-form\",\"json\",\"selector-css3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-editdraftorder-observer.94ULArkYk-PVu.js?m\"},\"ysf-editdraftresults-observer\":{\"path\":\"js\\/ysf-editdraftresults-observer.4kLsN3lc-0ifI.js?m\",\"requires\":[\"ysf-formobserver\",\"ysf-draftcustomizer\",\"ysf-drafttracker\",\"ysf-playerpicker\",\"io-form\",\"json\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-editdraftresults-observer.4kLsN3lc-0ifI.js?m\"},\"ysf-iris-chat\":{\"path\":\"js\\/ysf-iris-chat.tqvMt87o3kMdf.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-iris-chat.tqvMt87o3kMdf.js?m\"},\"ysf-dfs-promos\":{\"path\":\"js\\/ysf-dfs-promos.MFq8uGuVlCcT8.js?m\",\"requires\":[\"node\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-dfs-promos.MFq8uGuVlCcT8.js?m\"},\"ysf-form\":{\"path\":\"js\\/ysf-form.jCf7FAoLG772g.js?m\",\"requires\":[\"widget\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-form.jCf7FAoLG772g.js?m\"},\"ysf-wcp-matchupdistchart\":{\"path\":\"js\\/ysf-wcp-matchupdistchart.ZqsttJiYTzcMZ.js?m\",\"requires\":[\"widget\",\"oop\",\"ysf-yui2-charts\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-wcp-matchupdistchart.ZqsttJiYTzcMZ.js?m\"},\"node-event-touch\":{\"path\":\"js\\/node-event-touch.GrAa0W5J9hoLv.js?m\",\"requires\":[\"node-base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/node-event-touch.GrAa0W5J9hoLv.js?m\"},\"ysf-formobserver\":{\"path\":\"js\\/ysf-formobserver.t9yrpgyoLqIsd.js?m\",\"requires\":[\"widget\",\"oop\",\"ysf-form\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-formobserver.t9yrpgyoLqIsd.js?m\"},\"ysf-pickem-picksnote\":{\"path\":\"js\\/ysf-pickem-picksnote.rzyLWbkej7bAK.js?m\",\"requires\":[\"oop\",\"io-base\",\"json\",\"ysf-smartpanel\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-pickem-picksnote.rzyLWbkej7bAK.js?m\"},\"ysf-playersearch-plugin\":{\"path\":\"js\\/ysf-playersearch-plugin.ixDhFqzXowRiK.js?m\",\"requires\":[\"node-base\",\"event-base\",\"base-build\",\"event-key\",\"autocomplete-sources\",\"autocomplete-plugin\",\"node-event-delegate\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-playersearch-plugin.ixDhFqzXowRiK.js?m\"},\"ysf-dynaplayers\":{\"path\":\"js\\/ysf-dynaplayers.8cKuCLw0Cp5FD.js?m\",\"requires\":[\"ysf-form\",\"ysf-ads\",\"base-build\",\"widget-base\",\"node-event-delegate\",\"io-form\",\"json-parse\",\"history\",\"ysf-initlinks\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-dynaplayers.8cKuCLw0Cp5FD.js?m\"},\"ysf-postload\":{\"path\":\"js\\/ysf-postload.9ibJkPNGYF_Zw.js?m\",\"requires\":[\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-postload.9ibJkPNGYF_Zw.js?m\"},\"ysf-preauctioncosts-playerdt\":{\"path\":\"js\\/ysf-preauctions-playerdt.o8NqOciJu5xTo.js?m\",\"requires\":[\"widget\",\"oop\",\"event-delegate\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-preauctions-playerdt.o8NqOciJu5xTo.js?m\"},\"ysf-preauctioncosts-observer\":{\"path\":\"js\\/ysf-preauctionscosts-observer.TJ6DCeWpIZMTC.js?m\",\"requires\":[\"ysf-formobserver\",\"ysf-preauctioncosts-playerdt\",\"io-form\",\"json\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-preauctionscosts-observer.TJ6DCeWpIZMTC.js?m\"},\"ysf-smartpanel\":{\"path\":\"js\\/ysf-smartpanel.8YgUg3KTbAmCN.js?m\",\"requires\":[],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-smartpanel.8YgUg3KTbAmCN.js?m\"},\"ysf-twitter-intelligence\":{\"path\":\"js\\/ysf-twitter-intelligence.BLhJUW3zf4W5h.js?m\",\"requires\":[\"io-xdr\",\"substitute\",\"json-parse\",\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-twitter-intelligence.BLhJUW3zf4W5h.js?m\"},\"bracket-map\":{\"path\":\"js\\/bracket-map.ec3-YVydkxycD.js?m\",\"requires\":[\"node\",\"event\",\"event-flick\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/bracket-map.ec3-YVydkxycD.js?m\"},\"ysf-ads\":{\"path\":\"js\\/ysf-sda.Rhmq_U0gTXFfV.js?m\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-sda.Rhmq_U0gTXFfV.js?m\"},\"io-upload-iframe\":{\"path\":\"js\\/io-upload-iframe.fqcrHH-wf_O7P.js?m\",\"requires\":[\"io-base\",\"node-base\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/io-upload-iframe.fqcrHH-wf_O7P.js?m\"},\"ysf-cors\":{\"path\":\"js\\/ysf-cors.9u4jsmph2dlAS.js?m\",\"requires\":[\"io-base\",\"io-xdr\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-cors.9u4jsmph2dlAS.js?m\"},\"ysf-editwaivers\":{\"path\":\"js\\/ysf-editwaivers.2iOnrluwEc9dR.js?m\",\"requires\":[\"dd-constrain\",\"dd-proxy\",\"dd-drop\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-editwaivers.2iOnrluwEc9dR.js?m\"},\"ysf-makepayment\":{\"path\":\"js\\/ysf-makepayment.YGCvhH-NQAzDi.js?m\",\"requires\":[\"epay_widget\",\"node\",\"selector-css3\",\"ysf-overlay\",\"ysf-alerts\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-makepayment.YGCvhH-NQAzDi.js?m\"},\"ysf-leaguecontests\":{\"path\":\"js\\/ysf-leaguecontests.fL3cAsZ7W1YKH.js?m\",\"requires\":[\"node\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-leaguecontests.fL3cAsZ7W1YKH.js?m\"},\"ysf-championchampions\":{\"path\":\"js\\/ysf-championchampions.zy9-TIYdELL1M.js?m\",\"requires\":[\"base\",\"ysf-cors\",\"event\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-championchampions.zy9-TIYdELL1M.js?m\"},\"ysf-reactinvites\":{\"path\":\"js\\/ysf-react-invites.MiWYyhSVgeFeN.js?m\",\"requires\":[\"node-base\",\"io-xdr\",\"json-stringify\",\"ysf-html\",\"ysf-cors\",\"ysf-flowtips\",\"ysf-tout\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-react-invites.MiWYyhSVgeFeN.js?m\"},\"ysf-d3\":{\"path\":\"js\\/d3.TvK0Kfo0At0Ao.js?m\",\"requires\":[],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/d3.TvK0Kfo0At0Ao.js?m\"},\"ysf-c3\":{\"path\":\"js\\/c3.Fq7YHbqxM_pCy.js?m\",\"requires\":[\"ysf-d3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/c3.Fq7YHbqxM_pCy.js?m\"},\"ysf-d3-standings-plot\":{\"path\":\"js\\/ysf-d3-standings-plot.IlbXb4hgpEJHU.js?m\",\"requires\":[\"base\",\"ysf-d3\"],\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/js\\/ysf-d3-standings-plot.IlbXb4hgpEJHU.js?m\"}}        },\r\n" + 
				"        'ysf-css' : {\r\n" + 
				"            'combine' : true,\r\n" + 
				"            'base' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'comboBase' : 'https://sp.yimg.com/ua/assets/',\r\n" + 
				"            'root' : '',\r\n" + 
				"            'comboSep': ';',\r\n" + 
				"            'filter': {\r\n" + 
				"                'searchExp':\"\\\\.(js|css)[\\\\?\\\\&a-zA-Z0-9]*;\",\r\n" + 
				"                'replaceStr': \";\"\r\n" + 
				"            },\r\n" + 
				"            'modules': {\"media-playernote-views-notes-css\":{\"path\":\"css\\/nonsass\\/playernote-views-notes.GdbNzHazXmry3.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-views-notes.GdbNzHazXmry3.css?m\"},\"media-playernote-tabs-css\":{\"path\":\"css\\/nonsass\\/playernote-tabs.4vgVG8tnX7t_g.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-tabs.4vgVG8tnX7t_g.css?m\"},\"media-playernote-css\":{\"path\":\"css\\/nonsass\\/playernote.PNQ08I-x9PQKE.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote.PNQ08I-x9PQKE.css?m\"},\"media-playernote-views-twitter-css\":{\"path\":\"css\\/nonsass\\/playernote-views-twitter.jV5gXgoJiFrgN.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-views-twitter.jV5gXgoJiFrgN.css?m\"},\"media-playernote-views-video-css\":{\"path\":\"css\\/nonsass\\/playernote-views-video.f-xx5zzcwInJs.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/playernote-views-video.f-xx5zzcwInJs.css?m\"},\"gallery-node-tokeninput-core\":{\"path\":\"css\\/nonsass\\/gallery-node-tokeninput-core.3n1lDg72nVCpW.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/gallery-node-tokeninput-core.3n1lDg72nVCpW.css?m\"},\"gallery-node-tokeninput-skin\":{\"path\":\"css\\/nonsass\\/gallery-node-tokeninput-skin.X_oDtZbWD9z8u.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/gallery-node-tokeninput-skin.X_oDtZbWD9z8u.css?m\"},\"gallery-node-tokeninput-css\":{\"path\":\"css\\/nonsass\\/gallery-node-tokeninput.PSfdVYvLiZUYE.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/gallery-node-tokeninput.PSfdVYvLiZUYE.css?m\"},\"team-logos-css\":{\"path\":\"css\\/nonsass\\/teamlogos.qS204j3tyXuq4.css?m\",\"type\":\"css\",\"directpath\":\"https:\\/\\/sp.yimg.com\\/ua\\/assets\\/css\\/nonsass\\/teamlogos.qS204j3tyXuq4.css?m\"}}        }\r\n" + 
				"        ,\r\n" + 
				"                    'yui2' : {\r\n" + 
				"                        'combine' : true,\r\n" + 
				"                        'base' : 'https://s.yimg.com/d/lib/yui/2in3.4/2.9.0/build/',\r\n" + 
				"                        'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                        'root' : '/d/lib/yui/2in3.4/2.9.0/build/',\r\n" + 
				"                        'patterns' :  {\r\n" + 
				"                            'yui2-': {\r\n" + 
				"                                configFn: function(me) {\r\n" + 
				"                                    if(/-skin|reset|fonts|grids|base/.test(me.name)) {\r\n" + 
				"                                        me.type = 'css';\r\n" + 
				"                                        me.path = me.path.replace(/\\.js/, '.css');\r\n" + 
				"                                        // this makes skins in builds earlier than 2.6.0 work as long as combine is false\r\n" + 
				"                                        me.path = me.path.replace(/\\/yui2-skin/, '/assets/skins/sam/yui2-skin');\r\n" + 
				"                                    }\r\n" + 
				"                                }\r\n" + 
				"                            }\r\n" + 
				"                        }\r\n" + 
				"                    },\r\n" + 
				"                    'yui2_8_paths': {\r\n" + 
				"                        'base' : 'https://s.yimg.com/d/lib/yui/2in3.4/2.8.2/build/',\r\n" + 
				"                        'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                        'root' :  '/d/lib/yui/2in3.4/2.8.2/build/'\r\n" + 
				"                    },\r\n" + 
				"                    'yui2_9_paths': {\r\n" + 
				"                        'base' : 'https://s.yimg.com/d/lib/yui/2in3.4/2.9.0/build/',\r\n" + 
				"                        'comboBase' : 'https://s.yimg.com/zz/combo?',\r\n" + 
				"                        'root' : '/d/lib/yui/2in3.4/2.9.0/build/'\r\n" + 
				"                    }    },\r\n" + 
				"    'modules' : {\r\n" + 
				"        \"swfplayer\" : {\r\n" + 
				"            fullpath: 'https://s.yimg.com/lq/lib/flash/swfobject/1.0/swfobject.js'\r\n" + 
				"        },\r\n" + 
				"        \"mobilizer\" : {\r\n" + 
				"            fullpath: 'https://s.yimg.com/lh/mbz/loader-min.js'\r\n" + 
				"        },\r\n" + 
				"        \"yos-widget-loader\" : {\r\n" + 
				"            fullpath: 'https://s.yimg.com/ly/widgetloader/1.0.1/js/widgetLoader.js'\r\n" + 
				"        },\r\n" + 
				"        \"twitter_widget\" : {\r\n" + 
				"            fullpath : \"https://platform.twitter.com/widgets.js\"\r\n" + 
				"        },\r\n" + 
				"        \"epay_widget\" : {\r\n" + 
				"            fullpath : \"https://s.yimg.com/av/yp/1.1.104/dist/payment_widget-min.js\"\r\n" + 
				"        },\r\n" + 
				"                    \"uh-js\" : {\r\n" + 
				"                        fullpath: \"https://s.yimg.com/zz/combo?kx/yucs/uh3s/uh/414/js/uh-min.js&kx/yucs/uh2/common/145/js/jsonp-super-cached-min.js&kx/yucs/uh3s/uh/379/js/escregex-min.js&kx/yucs/uh3s/uh/376/js/persistence-min.js&kx/yucs/uh3s/uh/401/js/menu_group_plugin-min.js&kx/yucs/uh3s/uh/430/js/menu-plugin-min.js&kx/yucs/uh3s/uh/463/js/menu_handler_v2-min.js&kx/yucs/uh3s/uh/376/js/gallery-jsonp-min.js&kx/yucs/uh3s/uh/408/js/logo_debug-min.js&kx/yucs/uh3/uh/js/958/localeDateFormat-min.js&kx/yucs/uh3s/uh/409/js/timestamp_library-min.js&kx/yucs/uh3s/uh/376/js/usermenu_v2-min.js&kx/yucs/uh3/signout-link/10/js/signout-min.js&kx/yucs/uhc/rapid/50/js/uh_rapid-min.js&kx/yucs/uhc/meta/71/js/meta-min.js&kx/yucs/uh3/disclaimer/388/js/disclaimer_seed-min.js&kx/yucs/uh3s/top-bar/137/js/top_bar_v2-min.js&kx/yucs/uh3s/top-bar/139/js/home_menu-min.js&kx/yucs/uh3s/search/379/js/search-min.js&kx/yucs/uh3/search/611/js/search_plugin-min.js&kx/yucs/uh3s/avatar/60/js/avatar-min.js&kx/yucs/uh3s/profile/167/js/fast-switch-min.js&kx/yucs/uh3s/mail-link/159/js/mailcount_ssl-min.js&pj/inproduct/v26s/js/yui/yhelp-bootstrap.js&kx/yucs/uh3s/help/81/js/help_menu_v4-min.js&kx/yucs/uh3/location/10/js/uh_locdrop-min.js\",\r\n" + 
				"                        requires: [\"node\",\"node-focusmanager\",\"event\",\"substitute\",\"cookie\",\"event-resize\",\"base\",\"event-hover\",\"event-mouseenter\",\"event-delegate\",\"oop\",\"dom-screen\",\"querystring-stringify\",\"event-custom\",\"event-move\",\"template-micro\",\"get\",\"anim\",\"jsonp\",\"json\",\"classnamemanager\",\"yql\",\"datatype-date\",\"event-focus\",\"plugin\",\"array-extras\",\"event-synthetic\",\"event-valuechange\",\"event-key\",\"querystring\",\"datatype-date-parse\",\"template\",\"view\",\"stencil\"]\r\n" + 
				"                    }\r\n" + 
				"     }\r\n" + 
				"     };\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var YSFOVERRIDE = {\r\n" + 
				"    \"use\": function() {\r\n" + 
				"        var func, args = [], useQueue;\r\n" + 
				"        for(var x=0; x<arguments.length; x++) {\r\n" + 
				"            args.push(arguments[x]);\r\n" + 
				"        }\r\n" + 
				"        if(args.length) {\r\n" + 
				"            useQueue = this.getUseQueue();\r\n" + 
				"            if(typeof args[args.length - 1] === \"function\") {\r\n" + 
				"                func = args.pop();\r\n" + 
				"                useQueue.funcs.push(func);\r\n" + 
				"            } \r\n" + 
				"            for(var x=0; x<args.length; x++) {\r\n" + 
				"                if(useQueue.requires.indexOf(args[x]) === -1) {\r\n" + 
				"                    useQueue.requires.push(args[x]);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"            if(this._INST) {\r\n" + 
				"                this.exec();\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"_currentUseQueue\": null,\r\n" + 
				"    \"getUseQueue\": function() {\r\n" + 
				"        if(this._currentUseQueue === null) {\r\n" + 
				"            this._currentUseQueue = {\r\n" + 
				"                \"funcs\": [],\r\n" + 
				"                \"requires\": []\r\n" + 
				"            };\r\n" + 
				"        }\r\n" + 
				"        return this._currentUseQueue;\r\n" + 
				"    },\r\n" + 
				"    \"resetUseQueue\": function() {\r\n" + 
				"        this._currentUseQueue = null;\r\n" + 
				"    },\r\n" + 
				"    \"rotateUseQueue\": function() {\r\n" + 
				"        var useQueue = this.getUseQueue();\r\n" + 
				"        this.resetUseQueue();\r\n" + 
				"        return useQueue;\r\n" + 
				"    },\r\n" + 
				"    \"_INST\": null,\r\n" + 
				"    \"requires\": [],\r\n" + 
				"    \"funcs\": [],\r\n" + 
				"    \"getInstance\": function() {\r\n" + 
				"        var _YSF;\r\n" + 
				"        if(this._INST) {\r\n" + 
				"            _YSF = this._INST;\r\n" + 
				"        }\r\n" + 
				"        else {\r\n" + 
				"            _YSF = YUI();\r\n" + 
				"            _YSF.applyConfig(YUI.YUICfg);\r\n" + 
				"            this._INST = _YSF;\r\n" + 
				"        }\r\n" + 
				"        return _YSF;\r\n" + 
				"    },\r\n" + 
				"    \"exec\": function() {\r\n" + 
				"        var _YSF, funcs, execFunc,\r\n" + 
				"            useQueue = this.rotateUseQueue(),\r\n" + 
				"            self = this;\r\n" + 
				"\r\n" + 
				"        execFunc = function(Y) {\r\n" + 
				"            var func;\r\n" + 
				"            //Y.log(useQueue.requires.join(\", \"));\r\n" + 
				"            while(useQueue.funcs.length) {\r\n" + 
				"                //Y.log(\"Executing use(). Remaining: \" + useQueue.funcs.length);\r\n" + 
				"                func = useQueue.funcs.shift();\r\n" + 
				"                func(Y);\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"        _YSF = this.getInstance();\r\n" + 
				"        _YSF.use.apply(_YSF, useQueue.requires.concat([execFunc]));\r\n" + 
				"        \r\n" + 
				"    }\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var useYSFOverride = true;\r\n" + 
				"YUI.YUICfg.root='yui:'+ YUI.version + '/';\r\n" + 
				"YUI.YUICfg.comboSep = '&';\r\n" + 
				"\r\n" + 
				"if(useYSFOverride) {\r\n" + 
				"    YSF = YSFOVERRIDE;\r\n" + 
				"}\r\n" + 
				"else {\r\n" + 
				"    YSF = YUI();\r\n" + 
				"    YSF.applyConfig(YUI.YUICfg);\r\n" + 
				"}\r\n" + 
				"YFB = YMedia = YSF;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.Af = window.Af || {};\r\n" + 
				"window.Af.config = window.Af.config || {};\r\n" + 
				"window.Af.config.transport = {\r\n" + 
				"    cors: true\r\n" + 
				"};\r\n" + 
				"window.Af.config.beacon = {\r\n" + 
				"    enable: true,\r\n" + 
				"    beaconUncaughtErr: true,\r\n" + 
				"    pathPrefix: '//beacon.fantasysports.yahoo.com/beacon',\r\n" + 
				"    sampleSize: 500,\r\n" + 
				"    batch: false,\r\n" + 
				"};\r\n" + 
				"YSF.Fantasy = {};\r\n" + 
				"YSF.Fantasy.League = {\r\n" + 
				"    \"id\": '686943',\r\n" + 
				"    \"uri\": \"/f1/686943\",\r\n" + 
				"};\r\n" + 
				"YSF.Fantasy.League.url = location.protocol + '//' + location.host + YSF.Fantasy.League.uri;\r\n" + 
				"\r\n" + 
				"YSF.use(\"node\", \"event\", \"base\", function(Y) {\r\n" + 
				"Y.log(\"Like poking around in code? Love fantasy sports? We're hiring stellar frontend, backend, devops, mobile, and data engineers ranging from interns to senior architects!  Let us know how you'd impact our products, share your sports related projects, or tell us why you should join our starting lineup!  Email us with a resume to sportsjobs@yahoo-inc.com.  See you on the field!\");\r\n" + 
				"\r\n" + 
				"YUI.namespace('Fantasy.ENV');\r\n" + 
				"YUI.Fantasy.ENV = { get: function() { return {}; } };\r\n" + 
				"YUI.Fantasy.adPath = 'https://s.yimg.com/lq/combo?darla/fc_0.3.1.js&darla/util_0.2.6.js&darla/renderers/complex_renderer_0.3.0.js';\r\n" + 
				"var League = function(config) {\r\n" + 
				"    League.superclass.constructor.apply(this, arguments);\r\n" + 
				"};\r\n" + 
				"League.NAME = \"ysf-League\";\r\n" + 
				"League.ATTRS = {\r\n" + 
				"\r\n" + 
				"    'id' : {\r\n" + 
				"        value : '686943',\r\n" + 
				"        readOnly : true\r\n" + 
				"    },\r\n" + 
				"    'uri' : {\r\n" + 
				"        valueFn : function() {\r\n" + 
				"\r\n" + 
				"            var uri = '/f1',\r\n" + 
				"                id = this.get('id');\r\n" + 
				"\r\n" + 
				"            if (uri !== '' && id) {\r\n" + 
				"                uri += '/' + id;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            return uri;\r\n" + 
				"\r\n" + 
				"        },\r\n" + 
				"        readOnly: true\r\n" + 
				"    },\r\n" + 
				"    'url' : {\r\n" + 
				"        valueFn : function() {\r\n" + 
				"\r\n" + 
				"            var url = '',\r\n" + 
				"                uri = this.get('uri');\r\n" + 
				"\r\n" + 
				"            if (uri !== '') {\r\n" + 
				"                url = location.protocol + '//' + location.host + uri;\r\n" + 
				"            }\r\n" + 
				"            return url;\r\n" + 
				"\r\n" + 
				"        },\r\n" + 
				"        readOnly: true\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"Y.extend(League, Y.Base);\r\n" + 
				"\r\n" + 
				"YUI.namespace('Fantasy.League');\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.League = new League();\r\n" + 
				"\r\n" + 
				"/*\r\n" + 
				"YSFGlobalPublisher\r\n" + 
				"Use YSFGlobalPublisher to publish global custom events on the\r\n" + 
				"Y.Global object.\r\n" + 
				"*/\r\n" + 
				"var YSFGlobalPublisher = new Y.EventTarget();\r\n" + 
				"YSFGlobalPublisher.name = 'YSFGlobalPublisher';\r\n" + 
				"YSFGlobalPublisher.publish('ysf:beforeunload', {\r\n" + 
				"    broadcast : 2\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"window.onbeforeunload = function(e) {\r\n" + 
				"\r\n" + 
				"    var beforeUnloadEvent = YUI.Env.globalEvents.getEvent('ysf:beforeunload'),\r\n" + 
				"        beforeUnloadSubscribers = (beforeUnloadEvent) ? beforeUnloadEvent.subscribers : {} ,\r\n" + 
				"        reason = null,\r\n" + 
				"        s=null;\r\n" + 
				"\r\n" + 
				"    for (s in beforeUnloadSubscribers) {\r\n" + 
				"        if (beforeUnloadSubscribers.hasOwnProperty(s)) {\r\n" + 
				"            reason = beforeUnloadSubscribers[s].fn();\r\n" + 
				"            if (Y.Lang.isString(reason)) {\r\n" + 
				"                break;\r\n" + 
				"            }\r\n" + 
				"            reason = null;\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    if (reason) {\r\n" + 
				"        if (e) {\r\n" + 
				"            e.preventDefault();\r\n" + 
				"            e.returnValue = reason;\r\n" + 
				"        }\r\n" + 
				"        return reason;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"YUI.namespace(\"Fantasy.SpaceIds\");\r\n" + 
				"YUI.Fantasy.SpaceIds.pathmap = {\r\n" + 
				"    'playernote': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782203655,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782203656,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782203657,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782203658,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204201,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204199\r\n" + 
				"    },\r\n" + 
				"    'playernote_dynamic_notes': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204439,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204441,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204433,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204435,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204431,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204437\r\n" + 
				"    },\r\n" + 
				"    'playernote_dynamic_video': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204438,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204440,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204432,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204434,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204430,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204436\r\n" + 
				"    },\r\n" + 
				"    'playernote_dynamic_twitter': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204837,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204838,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204839,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204840\r\n" + 
				"    },\r\n" + 
				"    'players': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782201687,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782201980,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782200994,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782201116,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782202612,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782202472\r\n" + 
				"    },\r\n" + 
				"    'playersearch': {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782201686,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782201939,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782200935,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782201255,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782202613,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782202473\r\n" + 
				"    },\r\n" + 
				"    'fb_like_league' : {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204622,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204624,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204618,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204620,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204626,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204628\r\n" + 
				"    },\r\n" + 
				"    'fb_like_team' : {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204623,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204625,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204619,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204621,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204627,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204629\r\n" + 
				"    },\r\n" + 
				"    'fb_like_player' : {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782204632,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     782204633,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782204630,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     782204631,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782204634,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782204635\r\n" + 
				"    },\r\n" + 
				"    'teamnews': {\r\n" + 
				"        'site/sports/fantasy_new/nascar/pickem':     782204349\r\n" + 
				"    },\r\n" + 
				"    'team': {\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     782202656,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     782201796,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     782200906,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     782202516,\r\n" + 
				"        'site/sports/fantasy_new/pga/pickem':        782201500,\r\n" + 
				"        'site/sports/fantasy_new/nascar/pickem':     782201582\r\n" + 
				"    },\r\n" + 
				"    'bracketwizard': {\r\n" + 
				"        'site/sports/fantasy_new/ncaab/pickem': 782204544,\r\n" + 
				"        'site/sports/fantasy_new/ncaab/secondchance': 782204502\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.SpaceIds.showAds = {\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/free':     true,\r\n" + 
				"        'site/sports/fantasy_new/mlb/full/plus':     true,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/free':     true,\r\n" + 
				"        'site/sports/fantasy_new/nfl/full/plus':     true,\r\n" + 
				"        'site/sports/fantasy/nhl/full/free':         true,\r\n" + 
				"        'site/sports/fantasy_new/nhl/full/free':     true,\r\n" + 
				"        'site/sports/fantasy/nba/full/free':         true,\r\n" + 
				"        'site/sports/fantasy_new/nba/full/free':     true,\r\n" + 
				"        'site/sports/fantasy_new/nascar/pickem':     true,\r\n" + 
				"        'site/sports/fantasy_new/ncaab/pickem':      true,\r\n" + 
				"        'site/sports/fantasy_new/ncaab/secondchance/': true\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.SpaceIds.spaceidpath = 'site/sports/fantasy_new/nfl/full/free';\r\n" + 
				"YUI.Fantasy.SpaceIds.spaceid     = '782200906';\r\n" + 
				"\r\n" + 
				"YUI.Fantasy.SpaceIds.getSpaceId = function(subpath) {\r\n" + 
				"    if(YUI.Fantasy.SpaceIds.pathmap[subpath]) {\r\n" + 
				"        return YUI.Fantasy.SpaceIds.pathmap[subpath][this.spaceidpath];\r\n" + 
				"    }\r\n" + 
				"    return YUI.Fantasy.SpaceIds.spaceid;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"YSF.use('event', function (Y) {\r\n" + 
				"\r\n" + 
				"    Y.on('domready', function (e) {\r\n" + 
				"\r\n" + 
				"            try {\r\n" + 
				"\r\n" + 
				"                YAHOO.i13n.SPACEID = '782200906';\r\n" + 
				"                YAHOO.i13n.TEST_ID = '3.RTgzMjExMQdzcGRtdGVzdAZfQ0hHAzgwODg0BF92ZXIDNC42BF9IA2Zhbm9zNTUwLnNwb3J0cy5iZjEueWFob28uY29tBF95YWYDMQJFODMzNDQwB3NwLXN0cm0tY29sbGVjdC0x';\r\n" + 
				"            \r\n" + 
				"                var conf = {\r\n" + 
				"                    use_rapid: true,\r\n" + 
				"                    yql_enabled: true,\r\n" + 
				"                    tracked_mods: [  ],\r\n" + 
				"                    spaceid: 782200906,\r\n" + 
				"                    nofollow_class: [\"yfa-link-tab\", \"ysf-cta-imgur\", \"yfa-rapid-nofollow\"],\r\n" + 
				"                    client_only: 1,\r\n" + 
				"                    test_id : \"3.RTgzMjExMQdzcGRtdGVzdAZfQ0hHAzgwODg0BF92ZXIDNC42BF9IA2Zhbm9zNTUwLnNwb3J0cy5iZjEueWFob28uY29tBF95YWYDMQJFODMzNDQwB3NwLXN0cm0tY29sbGVjdC0x\",\r\n" + 
				"                    keys: {\r\n" + 
				"                        \"pd\" : \"team\",\r\n" + 
				"                        \"chan\" : \"\",\r\n" + 
				"                        \"lang\": \"en-US\",\r\n" + 
				"                        \"mkrt\": \"US\",\r\n" + 
				"                        \"site\": \"fullfantasy\",\r\n" + 
				"                        \"pst\": \"football\",\r\n" + 
				"                        \"paid\": \"686943\",\r\n" + 
				"                        \"pstaid\": \"free\"\r\n" + 
				"                    }\r\n" + 
				"                };\r\n" + 
				"\r\n" + 
				"                YAHOO.i13n.ywa= conf.ywa;\r\n" + 
				"                YAHOO.i13n.WEBWORKER_FILE = '/rapidworker-1.1.js';\r\n" + 
				"\r\n" + 
				"                var ins = new YAHOO.i13n.Rapid(conf),\r\n" + 
				"                    body;\r\n" + 
				" \r\n" + 
				"                window.rapidInstance = ins;\r\n" + 
				"\r\n" + 
				"                /**\r\n" + 
				"                 * Sends a beacon-click: Use this to track clicks that can't be tracked with regular rapid tracking due to the rapid link hijacking.\r\n" + 
				"                 * How to use: Add this classname to your element: 'yfa-rapid-beacon' and then add your module name: 'yfa-rapid-module-your-module-name-here'\r\n" + 
				"                 * For example, 'yfa-rapid-module-yfa-reg-createleague'.  You can add this to parent elements, such as anchor tags with your custom 'span'-tag type styling inside these,\r\n" + 
				"                 * up to a nesting level five levels deep (the limit is five to ensure speed/responsiveness).\r\n" + 
				"                 * @param event {Event} A dom click event.\r\n" + 
				"                 */\r\n" + 
				"                function handleBeaconClick(event) {\r\n" + 
				"\r\n" + 
				"                    var DEFAULT_POS = 0,\r\n" + 
				"                        MAX_LEN = 30,\r\n" + 
				"                        clickParams = {},\r\n" + 
				"                        tg, tgD, tagName, moduleName, match, position, linkName;\r\n" + 
				"\r\n" + 
				"                    function getActionable(target) {\r\n" + 
				"                        var MAX_LOOKUPS = 5,\r\n" + 
				"                            el = target,\r\n" + 
				"                            i = 0;\r\n" + 
				"\r\n" + 
				"                        while(++i < MAX_LOOKUPS) {\r\n" + 
				"                            if (el.hasClass('yfa-rapid-beacon') || el.hasClass('Beacon')) {\r\n" + 
				"                                return el;\r\n" + 
				"                            }\r\n" + 
				"                            if (el.ancestor()) {\r\n" + 
				"                                el = el.ancestor();\r\n" + 
				"                            } else {\r\n" + 
				"                                return null;\r\n" + 
				"                            }\r\n" + 
				"                        }\r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    tg = getActionable(event.target);\r\n" + 
				"                    if (!tg) {\r\n" + 
				"                        return;\r\n" + 
				"                    }\r\n" + 
				"                    tgD = tg.getDOMNode();\r\n" + 
				"                    tagName = tgD.tagName.toLowerCase();\r\n" + 
				"                    match = tg.getAttribute('class').match(/yfa-rapid-module-([^\\s]+)/);\r\n" + 
				"                    moduleName = (match && match.length > 1) ? match[1] : '';\r\n" + 
				"                    match = tg.getAttribute('class').match(/yfa-rapid-link-pos-(\\d+)/);\r\n" + 
				"                    position = (match && match.length > 1) ? match[1] : 0;\r\n" + 
				"                    linkName = '';\r\n" + 
				"\r\n" + 
				"                    if ((/a|button/).test(tagName)) {\r\n" + 
				"                        if (tgD.innerText) {\r\n" + 
				"                            linkName = tgD.innerText;\r\n" + 
				"                        } else {\r\n" + 
				"                            linkName = tg.getHTML().replace(/<[^>]+>/g, '');\r\n" + 
				"                        }\r\n" + 
				"                    } else if ((/input/).test(tagName)) {\r\n" + 
				"                        linkName = tg.getAttribute('value');\r\n" + 
				"                    }\r\n" + 
				"                    linkName = linkName.replace(/[^\\w\\s!]/g, ''); // Clean out characters that will not be easily enterable by keyboard into the analytics tool.\r\n" + 
				"\r\n" + 
				"                    //Add New instrumentation here to keep backwards compatability for now.\r\n" + 
				"                    if(tg.getData('slk') || tg.getData('sec') || tg.getData('clickParams')) {\r\n" + 
				"                        moduleName  = tg.getData('sec') || '';\r\n" + 
				"                        linkName    = tg.getData('slk') || linkName;\r\n" + 
				"                        clickParams = tg.getData('clickParams') ? JSON.parse(tg.getData('clickParams')) : {};\r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    ins.beaconClick(moduleName.substring(0, MAX_LEN), linkName.substring(0, MAX_LEN), position, clickParams);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                ins.init();\r\n" + 
				"                if (Y.Fantasy && !Y.Fantasy.rapid) {\r\n" + 
				"                    Y.Fantasy.rapid = ins;\r\n" + 
				"                }\r\n" + 
				"                body = Y.one('body');\r\n" + 
				"                body.delegate('click', handleBeaconClick, 'button, input[type=button], a, .Beacon');\r\n" + 
				"                body.all('form input[type=submit]').on('click', handleBeaconClick); // Need separate listener since submit-button clicks don't bubble.\r\n" + 
				"\r\n" + 
				"                \r\n" + 
				"                //console.log('document_name: ' + \"team\");\r\n" + 
				"                //console.log('tracked mods: ' + [  ]);\r\n" + 
				"            } catch (error) {}\r\n" + 
				"    });\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"// Custom UH Help Link\r\n" + 
				"YSF.use('node', 'event', 'event-custom', function(Y) {\r\n" + 
				"\r\n" + 
				"    Y.on('contentready', function () {\r\n" + 
				"        Y.use(\"uh-js\", function () {\r\n" + 
				"            Y.Global.once(\r\n" + 
				"                'ucs:helpMenuShow',\r\n" + 
				"                function(e) {\r\n" + 
				"\r\n" + 
				"                    // fire an event black with the help menu items.\r\n" + 
				"                    var et = new Y.EventTarget();\r\n" + 
				"                    et.publish(\r\n" + 
				"                        'ucs:helpMenuItems',\r\n" + 
				"                        {\r\n" + 
				"                            broadcast: 2,\r\n" + 
				"                            emitFacade: true\r\n" + 
				"                        }\r\n" + 
				"                    );\r\n" + 
				"\r\n" + 
				"                    // additional menu items to be added.\r\n" + 
				"                    var menuGroupOne = [\r\n" + 
				"                        {\r\n" + 
				"                            menuText: \"Help\",\r\n" + 
				"                            actionType: \"link\",\r\n" + 
				"                            url: \"javascript:void(0);\",\r\n" + 
				"                            inProductHelp: \"PROD_SPORTS_FAN_FOOTUS\",                            target: \"_top\"\r\n" + 
				"                        }\r\n" + 
				"                    ];\r\n" + 
				"\r\n" + 
				"                    var menuGroupTwo = [\r\n" + 
				"                        {\r\n" + 
				"                            menuText: \"Suggestions\",\r\n" + 
				"                            actionType: \"link\",\r\n" + 
				"                            url: \"https://yahoo.uservoice.com/forums/206158?auth=yahoo\",\r\n" + 
				"                            target: \"_top\"\r\n" + 
				"                        }\r\n" + 
				"                    ];\r\n" + 
				"\r\n" + 
				"                    var menuGroups = [\r\n" + 
				"                        menuGroupOne,\r\n" + 
				"                        menuGroupTwo\r\n" + 
				"                    ];\r\n" + 
				"\r\n" + 
				"                    var eventData = {\r\n" + 
				"                        menuGroups: menuGroups\r\n" + 
				"                    };\r\n" + 
				"\r\n" + 
				"                    et.fire(\r\n" + 
				"                        'ucs:helpMenuItems',\r\n" + 
				"                        eventData\r\n" + 
				"                    );\r\n" + 
				"                }\r\n" + 
				"            );\r\n" + 
				"        });\r\n" + 
				"    }, \"#UH\");\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"YSF.use('node', 'event', function(Y) {\r\n" + 
				"    Y.on('click', function(e){\r\n" + 
				"        e.preventDefault();\r\n" + 
				"        YSF.use('yhelp-bootstrap', function(Y) {\r\n" + 
				"            if(YUI.YHELP.initiate){\r\n" + 
				"                var article = Y.one('#In-product-help').getAttribute('data-inproducthelp');\r\n" + 
				"                YUI.YHELP.initiate({'locale' : 'en-us', 'product' : 'PROD_SPORTS_FAN_FOOTUS', 'page': 'article', 'params': {'doc_id': article } });\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"    }, '#In-product-help');\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"var DARLA_CONFIG = {\r\n" + 
				"  positions: {},\r\n" + 
				"  events: {\r\n" + 
				"    \"AUTO\": {\r\n" + 
				"       name: \"AUTO\",\r\n" + 
				"       sp: YUI.Fantasy.SpaceIds.spaceid,\r\n" + 
				"       autoRT: 60000,\r\n" + 
				"       autoIV: 1,\r\n" + 
				"       autoStart: true,\r\n" + 
				"       ps: {}\r\n" + 
				"    },\r\n" + 
				"    \"MANUAL_ROTATION\": {\r\n" + 
				"        name: \"MANUAL_ROTATION\",\r\n" + 
				"        sp: YUI.Fantasy.SpaceIds.spaceid,\r\n" + 
				"        ps: {}\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  onSuccess: function(evt_name) {\r\n" + 
				"    var ps;\r\n" + 
				"    if(evt_name === \"MANUAL_ROTATION\" || evt_name === \"prefetched\") {\r\n" + 
				"        ps = DARLA.evtSetting(\"MANUAL_ROTATION\", \"ps\");\r\n" + 
				"        if(ps && Object.keys(ps).length) {\r\n" + 
				"            setTimeout(function() {\r\n" + 
				"                DARLA.event(\"MANUAL_ROTATION\");\r\n" + 
				"            }, 60000);\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"//-->\r\n" + 
				"</script>\r\n" + 
				"	</head>\r\n" + 
				"\r\n" + 
				"	<body class=\"Js-yfa DarkTheme\">\r\n" + 
				"    <div id=\"outer-wrapper\" class=\"outer-wrapper\">\r\n" + 
				"      <div id=\"yucs-sidebar\" class=\"ct-ct-wrap yucs-sidebar Ta-start\">\r\n" + 
				"        <div style=\"\" id=\"yspcontentuhsidenav\" class=\"\"></div>      </div>\r\n" + 
				"\r\n" + 
				"      <div class=\"ct-box yui-sv\">\r\n" + 
				"        <div class=\"ct-box-hd yui-sv-hd\">\r\n" + 
				"            <div style=\"\" id=\"yspcontentuh\" class=\"\"><style type=\"text/css\">@font-face{font-family:uh;src:url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.eot?);src:url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.eot?#iefix) format('embedded-opentype'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.woff2?) format('woff2'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.woff?) format('woff'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.ttf?) format('truetype'),url(https://s.yimg.com/os/uh-icons/0.1.16/uh/fonts/uh.svg?#uh) format('svg');font-weight:400;font-style:normal}[class^=Ycon],[class*=\" Ycon\"]{font-family:uh;speak:none;font-style:normal;font-weight:400;font-variant:normal;text-transform:none;line-height:1;-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale}</style><!-- empty --><!-- meta --><div id=\"yucs-meta\" data-authstate=\"signedin\" data-cobrand=\"standard\" data-crumb=\"pf3K2M0a2eL\" data-mc-crumb=\"iCxzglp8bb/\" data-gta=\"Xc/HNHQeyOM\" data-device=\"desktop\" data-experience=\"stencil-gs-grid\" data-firstname=\"bball4ever714\" data-style=\"fantasy\" data-flight=\"1508438565\" data-forcecobrand=\"standard\" data-guid=\"SOYUQYM66WFTSVMBSRPZFG3F2U\" data-host=\"football.fantasysports.yahoo.com\" data-https=\"1\" data-languagetag=\"en-us\" data-property=\"sports\" data-protocol=\"https\" data-shortfirstname=\"bball4ever714\" data-shortuserid=\"bball4ever714\" data-status=\"active\" data-spaceid=\"782200906\" data-test_id=\"\" data-userid=\"bball4ever714\" data-stickyheader=\"true\" data-headercollapse=\"\" data-uh-test=\"acctswitch\" data-beacon=\"0\" ></div><!-- /meta --> <div id=\"UH\" class=\"Row Pos(r) Start(0) T(0) End(0) Z(10) yucs \" role=\"banner\" data-protocol='https' data-property=\"sports\" data-spaceid=\"782200906\" data-stencil=\"true\"> <style>#yucs-profile {padding-left: 0!important;}\r\n" + 
				".yucs-trigger .Icon,\r\n" + 
				".yucs-trigger b {\r\n" + 
				"    line-height: 22px !important;\r\n" + 
				"    height: 22px !important;\r\n" + 
				"}\r\n" + 
				".yucs-trigger .Icon {\r\n" + 
				"   font-size: 22px !important;\r\n" + 
				"}\r\n" + 
				".yucs-trigger .AlertBadge,\r\n" + 
				".yucs-trigger .MailBadge {\r\n" + 
				"    line-height: 13px !important;\r\n" + 
				"    height: 13px !important;\r\n" + 
				"}\r\n" + 
				".yucs-mail_link_att.yucs-property-frontpage #yucs-mail_link_id i.Icon {\r\n" + 
				"    text-indent: -9999em;\r\n" + 
				"}\r\n" + 
				"/* mail badge */\r\n" + 
				".AlertBadge,\r\n" + 
				".MailBadge {\r\n" + 
				"    padding: 3px 6px 2px 6px;\r\n" + 
				"    min-width: 6px;\r\n" + 
				"    max-width: 16px;\r\n" + 
				"    margin-left: -13px;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"/* search box */\r\n" + 
				"\r\n" + 
				"#UHSearchBox {\r\n" + 
				"  border: 1px solid #ceced6 !important;\r\n" + 
				"  border-radius: 2px;\r\n" + 
				"  height: 34px;\r\n" + 
				"  *height: 18px;\r\n" + 
				"}\r\n" + 
				"#UHSearchBox:focus {\r\n" + 
				"border: 1px solid #7590f5 !important;\r\n" + 
				"  box-shadow: none !important;\r\n" + 
				"}\r\n" + 
				"/* buttons */\r\n" + 
				"#UHSearchWeb, #UHSearchProperty {\r\n" + 
				"  height: 32px !important;\r\n" + 
				"  line-height: 34px !important;\r\n" + 
				"-webkit-appearance: none;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#Stencil #UHSearchWeb,\r\n" + 
				"#Stencil #UHSearchProperty {\r\n" + 
				"    height: 30px;\r\n" + 
				"    box-sizing: content-box;\r\n" + 
				"    min-width: 92px;\r\n" + 
				"    padding-left: 14px;\r\n" + 
				"    padding-right: 14px;\r\n" + 
				"    *width: 100%;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#Stencil .UHCol1{\r\n" + 
				"z-index: 150;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"body {\r\n" + 
				"margin-top: 0px !important; \r\n" + 
				"}\r\n" + 
				".DarkTheme .yucs-trigger .Ycon {\r\n" + 
				"color: #fff;\r\n" + 
				"}\r\n" + 
				"#UH[data-property=groups] #uhWrapper {\r\n" + 
				"max-width: 1210px;\r\n" + 
				"margin: 0;\r\n" + 
				"min-width: 995px;\r\n" + 
				"}\r\n" + 
				"/*\r\n" + 
				"#UH[data-property=answers] #uhWrapper {\r\n" + 
				"max-width: 1260px;\r\n" + 
				"margin: 0;\r\n" + 
				"min-width: 1024px;\r\n" + 
				"}\r\n" + 
				"*/\r\n" + 
				"#UH[data-property=groups] .UHCol2{\r\n" + 
				"border-left: 190px solid transparent;\r\n" + 
				"padding-right: 335px;\r\n" + 
				"}\r\n" + 
				"/*\r\n" + 
				"#UH[data-property=answers] .UHCol2{\r\n" + 
				"border-left: 190px solid transparent;\r\n" + 
				"padding-right: 310px;\r\n" + 
				"}\r\n" + 
				"*/\r\n" + 
				"/*#UH[data-property=answers] .UHCol1,*/\r\n" + 
				"#UH[data-property=groups] .UHCol1 {\r\n" + 
				"  width: 190px;\r\n" + 
				"}\r\n" + 
				"#UH #Eyebrow a:link,\r\n" + 
				"#UH #Eyebrow a:visited {\r\n" + 
				"    -moz-osx-font-smoothing: grayscale;\r\n" + 
				"}</style>  <div id=\"yucs-disclaimer\" class=\"yucs-disclaimer yucs-activate yucs-hide yucs-property-sports yucs-fcb- \" data-cobrand=\"standard\" data-cu = \"0\" data-dsstext=\"Want a better search experience? {dssLink}Set your Search to Yahoo{linkEnd}\" data-dsstext-mobile=\"Search Less, Find More\" data-dsstext-mobile-ok=\"OK\" data-dsstext-mobile-set-search=\"Set Search to Yahoo\" data-dssstbtext=\"Yahoo is the preferred search engine for Firefox. Switch now.\" data-dssstb-ok=\"Yes\" data-dssstb-no=\"Not Now\" data-ylt-link=\"https://search.yahoo.com/searchset;_ylt=AuHZoKO..CRg99Cr0CqUrHFKcJ8u?pn=\" data-ylt-dssbarclose=\"/;_ylt=AqAAANUhTEeA12XySttCy0pKcJ8u\" data-ylt-dssbaropen=\"/;_ylt=AisbAYYzLO4EVnmAWf4AKcNKcJ8u\" data-ylt-dssstb-link=\"https://downloads.yahoo.com/sp-firefox;_ylt=ArJv3MI1CE1A8Is6QYJvjzlKcJ8u\" data-ylt-dssstbbarclose=\"/;_ylt=AqHqhxW96dbjOLNQjdYxvsVKcJ8u\" data-ylt-dssstbbaropen=\"/;_ylt=AuecTQkWZdHu6j.SpZwajUlKcJ8u\" data-ylt-dssCookieCleanedSuccess=\"/;_ylt=ArNLUtTfICJFPiY4WZ0PFP5KcJ8u\" data-ylt-dssCookieCleanedFailed=\"/;_ylt=AjUm0xOIUue4nO4yjj.nkkJKcJ8u\" data-linktarget=\"_top\" data-lang=\"en-us\" data-property=\"sports\" data-device=\"Desktop\" data-close-txt=\"Close this window\" data-maybelater-txt = \"Maybe Later\" data-killswitch = \"0\" data-host=\"football.fantasysports.yahoo.com\" data-spaceid=\"782200906\" data-pn=\"igsxS30IHbW\" data-dss-cookie-cleanup=\"Jys5CgB1dez\" data-pn-en-ca-mobile-frontpage=\"0SM9JZBIho6\" data-pn-de-de-mobile-frontpage=\"v7NK5OIZywI\" data-pn-es-es-mobile-frontpage=\"e185tSBP0SO\" data-pn-fr-fr-mobile-frontpage=\"Kaqh7gImwX8\" data-pn-en-in-mobile-frontpage=\"fuAahBP0TA8\" data-pn-it-it-mobile-frontpage=\"mKKJ24HiqKM\" data-pn-en-us-mobile-frontpage=\"igsxS30IHbW\" data-pn-en-sg-mobile-frontpage=\"UzTUyFPonnP\" data-pn-en-gb-mobile-frontpage=\"JRsfyRQOdlo\" data-pn-en-us-mobile-mail=\"5c8.hbak6Bd\" data-pn-en-ca-mobile-mail=\"fPOtgtMTX0x\" data-pn-de-de-mobile-mail=\"2sbM2imUxpX\" data-pn-es-es-mobile-mail=\"YbGEsfXpxA3\" data-pn-fr-fr-mobile-mail=\"X9kARRj4EXc\" data-pn-en-in-mobile-mail=\"4xf5omZFobn\" data-pn-it-it-mobile-mail=\"ZYQGcImd5qu\" data-pn-en-sg-mobile-mail=\"hG70Gz7nU8i\" data-pn-en-gb-mobile-mail=\"hYJpW.CNmB9\" data-pn-pt-br-mobile-mail=\"m3eW6Tb6VVd\" data-pn-en-us-tablet-frontpage=\"G/8O1voLSaR\" data-pn-en-us-tablet-mail=\"ieoMEU6DUPs\" data-pn-en-ca-tablet-mail=\"lZE/6fHwYIZ\" data-pn-de-de-tablet-mail=\"GSN8uA.FffW\" data-pn-es-es-tablet-mail=\"5zbUpczpn1H\" data-pn-fr-fr-tablet-mail=\"u2n/tKasGtp\" data-pn-en-in-tablet-mail=\"HvJ4v3oa/9y\" data-pn-it-it-tablet-mail=\"G.2GSvesrsH\" data-pn-en-sg-tablet-mail=\"Ff1.IkmNtT1\" data-pn-en-gb-tablet-mail=\".QcAUKbghOU\" data-pn-pt-br-tablet-mail=\"fC7EPA44Ps9\" data-news-search-yahoo-com=\"Lu2k6KKjTQf\" data-answers-search-yahoo-com=\"saMshTVEL/J\" data-finance-search-yahoo-com=\"s2vyUibyLfS\" data-images-search-yahoo-com=\"GFIU110Zrn8\" data-video-search-yahoo-com=\"H4wd2nTSgMo\" data-sports-search-yahoo-com=\"Cm.XC/nsuiX\" data-shopping-search-yahoo-com=\"CLLztPx9VG.\" data-shopping-yahoo-com=\"CLLztPx9VG.\" data-us-qa-trunk-news-search-yahoo-com =\"Lu2k6KKjTQf\" data-dss=\"1\"></div>     <div id=\"masterNav\" class='yucs-ps Bg(#2d1152)' data-ylk=\"rspns:nav;act:click;t1:a1;t2:uh-d;t3:tb;t5:pty;slk:pty;elm:itm;elmt:pty;itc:0;\"><ul id=\"Eyebrow\" class=\"Mb(12px)! Mx(0)! Mt(0)! Lh(1.7) NavLinks Z(3) H(22px) Pos(r) P(0) Whs(nw)\" role=\"navigation\"><li id=\"yucs-top-home\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(10px)\"><a href=\"https://www.yahoo.com/\" data-ylk=\"t5:home;slk:home;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\"><i id=\"my-home\" class=\"Fl(start) NavLinks_Lh(1.7) Mend(6px) Ycon YconHome Fz(13px) Mt(-1px) Td(n)! Td(n)!:h C(#fff)!\">&#x2302;</i><b class=\"Mstart(-1px) Fw(400) C(#fff)!\">Home</b></a></li><li id=\"yucs-top-mail\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://mail.yahoo.com/?.src=ym\" data-ylk=\"t5:mail;slk:mail;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Mail</a></li><li id=\"yucs-top-flickr\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.flickr.com/\" data-ylk=\"t5:flickr;slk:flickr;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Flickr</a></li><li id=\"yucs-top-tumblr\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.tumblr.com\" data-ylk=\"t5:tumblr;slk:tumblr;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Tumblr</a></li><li id=\"yucs-top-news\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.yahoo.com/news\" data-ylk=\"t5:news;slk:news;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">News</a></li><li id=\"yucs-top-sports\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"http://sports.yahoo.com/\" data-ylk=\"t5:sports;slk:sports;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Sports</a></li><li id=\"yucs-top-finance\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"http://finance.yahoo.com/\" data-ylk=\"t5:finance;slk:finance;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Finance</a></li><li id=\"yucs-top-entertainment\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.yahoo.com/entertainment/\" data-ylk=\"t5:entertainment;slk:entertainment;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Entertainment</a></li><li id=\"yucs-top-style\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://www.yahoo.com/lifestyle\" data-ylk=\"t5:style;slk:style;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Lifestyle</a></li><li id=\"yucs-top-answers\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://answers.yahoo.com/\" data-ylk=\"t5:answers;slk:answers;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Answers</a></li><li id=\"yucs-top-groups\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://groups.yahoo.com/\" data-ylk=\"t5:groups;slk:groups;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Groups</a></li><li id=\"yucs-top-mobile\" class=\"D(ib) Zoom Va(t) Lh(1.7) Mend(18px) Pstart(14px)\"><a href=\"https://mobile.yahoo.com/\" data-ylk=\"t5:mobile;slk:mobile;\"class=\"Td(n)! Td(u)!:h Fz(13px) C(#fff)!\">Mobile</a></li><li id='yucs-more' class='D(ib) Zoom Va(t) Pos(r) Z(1) Pstart(10px) Pend(6px) MoreDropDown yucs-menu yucs-more-activate' data-ylt=\"\"><a href=\"http://everything.yahoo.com/\" role=\"button\" id='yucs-more-link' class='Pos(r) Z(1) rapidnofollow D(b) Cf P(0)!' data-ylk=\"rspns:op;t5:more;slk:more;elmt:mu;itc:1;\"><b class=\"Fl(start) Lh(1.7) Td(u):h MoreDropDown_C(#fff) MoreDropDown-on_C(#1d1da3)!\">More</b><i class=\"Fz(15px) Va(m) Lh(1) C(#fff) Mstart(2px) Ycon YconArrowDown Ta(c) Td(n) Td(n):h Fl(end) Mt(4px) MoreDropDown-on_C(#1d1da3)!\">&#x22c1;</i></a><div id='yucs-top-menu'><div class=\"Pos(a) Start(0) T(100%) MoreDropDown-Box Bdbc(#d9d9d9) Bdbs(s) Bdbw(1px) Miw(6em) Mstart(-1px) Bg(#fff) Bdstartc(#d9d9d9) Bdstarts(s) Bdstartw(1px) Bdendc(#d9d9d9) Bdends(s) Bdendw(1px) Bxsh(moresh) D(n) yui3-menu-content\"><iframe frameborder=\"0\" class=\"Pos(a) Start(0) W(100%) H(100%) Bd(0)\" src=\"https://s.yimg.com/os/mit/media/m/base/images/transparent-95031.png\"></iframe><ul class=\"yucs-leavable Pos(r) Px(10px)! My(.55em)\"><li id=\"yucs-top-weather\" ><a href=\"https://www.yahoo.com/news/weather\" data-ylk=\"t5:weather;slk:weather;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Weather</a></li><li id=\"yucs-top-politics\" ><a href=\"https://www.yahoo.com/politics\" data-ylk=\"t5:politics;slk:politics;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Politics</a></li><li id=\"yucs-top-tech\" ><a href=\"https://www.yahoo.com/tech\" data-ylk=\"t5:tech;slk:tech;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Tech</a></li><li id=\"yucs-top-shopping\" ><a href=\"http://shopping.yahoo.com/\" data-ylk=\"t5:shopping;slk:shopping;\"class=\"Td(n)! Td(u)!:h Fz(13px) D(b) Zoom Py(6px) Lh(1.25) C(#1d1da3)!\">Shopping</a></li></ul></div></div></li><style>#yucs-top-ff-promo { position:absolute; right:0; right:auto\\9; left:950px\\9; right:0\\9\\0; left:auto\\9\\0; margin-left:18px;}#yucs-top-ff-promo a span { text-decoration: none; display: inline-block;}@media screen and (max-width: 1124px) { #UH.yucs-mail #yucs-top-ff-promo { display:none; }}@media screen and (max-width:1150px) { #yucs-top-ff-promo { right:auto; }}</style><li id='yucs-top-ff-promo' class=\"D(ib) Zoom Va(t) Mend(18px) Pstart(14px) D(n)\"><a class=\"D(b) C(#fff)! Pstart(4px) Td(n)! Td(u)!:h Fz(13px)\" href=\"https://www.mozilla.org/firefox/new/?utm_source=yahoo&utm_medium=referral&utm_campaign=y-uh&utm_content=y-sports-try\" data-ylk=\"t5:ff-promo;slk:ff-promo;t4:pty-mu;\" target=\"_blank\"><img id=\"yucs-ff-img\" class=\"Pend(4px) yucs_Va(m)\" src='https://s.yimg.com/kx/yucs/uh3s/promo-ff/1/images/ff_icon-compressed.png' width=\"15\" height=\"15\" alt=\"Firefox\" />Try Yahoo Sports on Firefox<span>&nbsp;&raquo;</span></a></li><script> var s = false, ts,re2,sdts,v2= null, cookies = \"; \" + document.cookie, dss = cookies.split(\"; DSS=\"), m, ua = window.navigator.userAgent.toLowerCase(); m = ua.match(/firefox\\/(\\d+)/); if (!m || (m && m[1] && parseInt(m[1]) < 34)) { if (ua.indexOf('version') >= 0 && ua.indexOf('crios') < 0) { s = true; } if (!!window.opera || navigator.userAgent.indexOf(' OPR/') >= 0) { s = true; } if (dss && dss.length === 2) { re2 = new RegExp('sdts=(\\\\d+)'); v2 = re2.exec(dss[1]); if (v2 && v2.length === 2) { sdts = v2[1]; } if (sdts && (parseInt(new Date().getTime()/1000) - sdts) < 604800) { s = true; } } if (!s) { m = document.getElementById('yucs-top-ff-promo'); m.className = m.className.replace(/D\\(n\\)/g,''); } }</script></ul></div> <div id=\"uhWrapper\" class=\"Mx(a) Z(1) Pos(r) Zoom\" data-ylk=\"rspns:nav;act:click;t1:a1;t2:uh-d;itc:0;\"> <div class=\"UHCol1 Pos(a) Start(0)\" role=\"presentation\"> <style>/** * IE7+ and non-retina display */.YLogoMY { background-repeat: no-repeat; background-image: url(https://s.yimg.com/rz/d/yahoo_fantasy_en-US_s_f_pw_351x40_sports-fantasy.png); _background-image: url(https://s.yimg.com/rz/d/yahoo_fantasy_en-US_s_f_pw_351x40_sports-fantasy.gif); /* IE6 */ width: 94px !important; }.DarkTheme .YLogoMY { background-position: -352px 0px !important;}/** * For 'retina' display */@media only screen and (-webkit-min-device-pixel-ratio: 2), only screen and ( min--moz-device-pixel-ratio: 2), only screen and ( -o-min-device-pixel-ratio: 2/1), only screen and ( min-device-pixel-ratio: 2), only screen and ( min-resolution: 192dpi), only screen and ( min-resolution: 2dppx) { .YLogoMY { background-image: url(https://s.yimg.com/rz/d/yahoo_fantasy_en-US_s_f_pw_351x40_sports-fantasy_2x.png) !important; background-size: 702px 40px !important; }}</style><a class=\"YLogoMY D(b) Ov(h) Ti(-20em) Zoom Darktheme_Bgp(b_t) W(137px) H(34px) Mx(a)! \" data-ylk=\"slk:logo;t3:logo;t5:logo;elm:img;elmt:logo;\" href=\"https://sports.yahoo.com/fantasy/\" target=\"_top\" >Yahoo Fantasy</a> </div> <div class=\"UHCol2 Pos(a) Bxz(bb)\" role=\"presentation\"> <form id=\"UHSearch\" target=\"_top\" autocomplete=\"off\" data-vfr=\"uh3_sports_vert_gs\"data-webaction=\"https://search.yahoo.com/search\" action=\"https://sports.search.yahoo.com/search\" data-webaction-tar=\"search.yahoo.com\" data-verticalaction-tar=\"sports.search.yahoo.com\"  method=\"get\"class=\"M(0) P(0) UHSearch-Init\"><table class=\"W(100%) M(0)! P(0) H(100%)\"> <tbody> <tr> <td class='W(100%) W-100 Va(t) Px(0)'><input id=\"UHSearchBox\" type=\"text\" class=\"yucs_W(100%) Ff(ss)! Fz(18px)! O(n):f Fw(200)! Bxz(bb) M(0)! Py(4px)! Bdrs(0)! Bxsh(n) yucs-clear-padding_Pend(35px)\" style=\"border-color:#7590f5;\" name=\"p\" aria-describedby=\"UHSearchBox\" data-ylk=\"slk:srchinpt-hddn;itc:1;\" data-yltvsearch=\"https://sports.search.yahoo.com/search\" data-yltvsearchsugg=\"/\" data-satype=\"mini\" data-gosurl=\"https://search.yahoo.com/sugg/ss/gossip-us_ss/\" data-pubid=\"102\" data-appid=\"\" data-maxresults=\"10\" data-resize=\" \"> <div id=\"yucs-satray\" class=\"sa-tray D(n) Fz(13px) uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) Bdrstend(0) Bdrststart(0) Lh(1.5) C(#000) Td(n) Td(n):h\" data-wstext=\"Search Web for: \" data-wsearch=\"https://search.yahoo.com/search\" data-vfr=\"uh3_sports_vert_gs\" data-vsearch=\"https://sports.search.yahoo.com/search\" data-vstext= \"Search News for: \" > </div></td> <!-- \".Grid' is used here to kill white-space -->   <td class=\"Va(t) Tren(os) W(10%) Whs(nw) Pstart(4px) Pend(0) Bdcl(s)\"><style type=\"text/css\">#UH #UHSearchWeb { font-size:13px !important; border-radius:3px!important;}#UHSearchWeb, #UHSearchProperty{ height: 30px; min-width: 120px;} .ua-ie8 #UHSearchWeb, .ua-ie8 #UHSearchProperty, .ua-ie9 #UHSearchWeb, .ua-ie9 #UHSearchProperty{ height: 32px; min-width: 120px;}#UHSearchProperty, .Themable .ThemeReset #UHSearchProperty { background: #4d4946 !important; border: 0 !important; box-shadow: 0 2px #2d2b29 !important;}</style><input id=\"UHSearchProperty\" class=\"D(ib) Fz(13px) Zoom Va(t) uhBtn Ff(ss) Fw(40) Bxz(bb) Td(n) D(ib) Zoom Va(m) Ta(c) Bgr(rx) Bdrs(3px) Bdw(1px) M(0)! C(#fff) Cur(p)\" type=\"submit\" data-vfr=\"uh3_sports_vert_gs\"data-vsearch=\"https://sports.search.yahoo.com/search;_ylt=AramI3weLcVpfkkZVdtyP.xKcJ8u\"value=\"Search Sports\" data-ylk=\"t3:srch;t5:srchvert;slk:srchvert;elm:btn;elmt:srch;tar:sports.search.yahoo.com;\"></td> <td class=\"Va(t) Tren(os) W(10%) Whs(nw) fp-default_Pstart(5px) Pstart(4px) Pend(0) Bdcl(s)\"><input id=\"UHSearchWeb\" class=\"D(ib) Py(0) Zoom Va(t) uhBtn Ff(ss)! Fw(40) Bxz(bb) Td(n) D(ib) Zoom Va(m) Ta(c) Bgr(rx) Bdrs(3px) Bdw(1px) M(0)! C(#fff) uh-ignore-rapid Cur(p)\" type=\"submit\" value=\"Search Web\" data-ylk=\"t3:srch;t5:srchweb;slk:srchweb;elm:btn;elmt:srch;itc=0;tar:search.yahoo.com;\"></td> <style type=\"text/css\"> #UHSearchWeb { font-size:15px !important; border-radius:4px!important; } #UHSearchWeb, #UHSearchProperty{ height: 30px; } .ua-ie8 #UHSearchWeb, .ua-ie8 #UHSearchProperty, .ua-ie9 #UHSearchWeb, .ua-ie9 #UHSearchProperty{ height: 32px; } #UHSearchWeb, .Themable .ThemeReset #UHSearchWeb { background: #3775dd; border: 0; box-shadow: 0 2px #21487f; } </style>  </tr> </tbody> </table>  <input type=\"hidden\" data-sa=\"0\" id=\"fr\" name=\"fr\" data-ylk=\"slk:frcode-hddn;itc:1;\" value=\"uh3_sports_web_gs\" /> <input id=\"yucs-fr2\" type=\"hidden\" name=\"fr2\" value=\"p:sprt,m:sb\" data-ylk=\"slk:fr2code-hddn;itc:1;\">   </form> <!-- /#uhSearchForm --> </div> <div class=\"UHCol3 Pos(a) End(0)\" role=\"presentation\" id=\"uhNavWrapper\">  <ul class=\"Fl(end) Mend(10px)! My(6px)! Lts(-0.31em) Tren(os) Whs(nw)\"> <li class=\"D(ib) Zoom Va(t) Pos(r) Pstart(4px) Mend(20px) Lts(n)\" id=\"yucs-profile\" data-yltmenushown=\"/;_ylt=AvJlRP.05mw4TQnUEOvA.OpKcJ8u\"> <style>#yucs-profile-panel .BackgroundChange:hover{background-color:#f4f6fd} div#yucs-profile-panel{ width: 256px !important}</style><a class=\"D(ib) MouseOver Td(n) Td(n):h yucs-trigger Lts($ws) M(-10px) P(10px)\" data-ylk=\"t3:tl-lst;t5:usersigninst;slk:usersigninst;elm:tl;elmt:usr;\" href=\"javascript:void(0);\" target=\"_top\" rel=\"nofollow\" aria-label=\"Profile\" aria-haspopup=\"true\" role=\"button\" id=\"yui_3_10_3_1_1375219693637_127\"><i class=\"Va(m) W(1em) yucs-avatar yucs-menu_anchor Ycon YconProfile Fz(22px) Lh(1) C(#32007f) V(h) Mend(7px) Lts(n)\"data-avatar='{\"size\": \"32x32\", \"style\":{\"width\": 22, \"height\": 22}, \"alt\": \"Avatar\", \"bucket\": \"0\"}'>&#x1f464;</i><!-- UHC Notifications Count --><b class=\"Lh(1.8) Va(m) yucs-trigger:h_Td(u) Lts(n) Fz(13px)\" title=\"Hi, bball4ever714\">bball4ever714</b></a><noscript class=\"yucs-noscript\"><a class=\"Va(m) Td(u):h Fz(12px) Mstart(10px)\" target=\"_top\" rel=\"nofollow\" data-ylk=\"t3:tl-lst;t4:usr-mu;t5:usersigno;slk:usersigno;elm:itm;elmt:lgo;\" href=\"https://login.yahoo.com/config/login/?.crumb=vLSheczoKN0&logout=1&.direct=1&.done=https://www.yahoo.com/&logout_all=1\">Sign out</a></noscript> <style>#Stencil #yucs-profile-panel .YconPositive{font-size:38px;}#Stencil #yucs-profile-panel .Td(n) C(#324fe1), #Stencil #yucs-profile-panel .Td(n) C(#324fe1) i{color:#0078ff}#yucs-profile-panel .BackgroundChange:hover{background-color:#f2f4fe}div#yucs-profile-panel{width: 270px !important}#yucs-notifications .NotifDescription{color:#abaeb7}#yucs-acct-list.Bgc(#f5f5f5), #yucs-fs-add-acct{background-color:#f7f8ff}#yucs-fs-footer.Bgc(#f5f5f5) {background-color:#ffffff}#Stencil #yucs-profile-panel .C-grey,#Stencil #yucs-profile #yucs-signout {color:#8d919d}#Stencil #yucs-profile-panel .Bd-t{border-color:#ffffff}#Stencil #yucs-profile-panel .YconProfile{text-indent:-2px;font-size:50px}#yucs-profile-panel .Ycon{width:48px}#yucs-user-info{height:50px}</style><div id=\"yucs-profile-panel\" class=\"uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) uhArrow NorthWest Px(10px) Mt(10px) Pos(a) Lh(1.4) Start(0) Mstart(-20px) Whs(nw) D(n) C(#000)\" aria-hidden=\"true\" style=\"width: 270px!important; max-width: none !important;\" data-uh-test=\"acctswitch\"> <div id='yucs-fs-msg' class=\"Pstart(10px) Pend(30px) Mx(-10px) D(n) yucs-fs-m Whs(n) Bgc(#fcf8e3) Ov(h) Pos(r)\"><button class='Pos(a) End(0) T(0) P(0) Ta(c) Fz(18px)' style='background: none; border: 0;width: 30px; height: 38px' onclick='window.ucs.fastSwitch.hideMessage();'>&times;</button><div class='Py(16px)'>Easily switch between multiple Yahoo accounts using the new <a href='https://login.yahoo.com/manage_account'>Account Manager</a>.<br>Click &quot;Add account&quot; below to get started!</div></div> <div id='yucs-fs-acct' class='Pos(r) Mx(-10px) Pt(10px) Cf yucs-fs-m' data-grp=\"\" data-done=\"https://football.fantasysports.yahoo.com/f1/686943/3\" data-login=\"login.yahoo.com\" data-jsonp=\"jsapi.login.yahoo.com\" data-crumb=\"vLSheczoKN0\" data-welcome=\"Easily switch between multiple Yahoo accounts using the new <a href='https://login.yahoo.com/manage_account'>Account Manager</a>.<br>Click &quot;Add account&quot; below to get started!\" data-err=\"\" data-err-crumb=\"Your account data may be out of sync.<br>Refresh the page to see your accounts.\" data-err-user=\"It looks like you switched accounts. Refresh the browser to view your personalized page.\" data-welcomeTimeout=\"\" data-signout=\"Sign out all\" data-errTimeout='10000' data-add-mng-txt=\"Add or Manage accounts\"><div id=\"yucs-fs-loading\" class=\"yucs-mail-loading Pos(a) End(0) T(0)\" style=\"background-size:15px 15px; background-position:50%; width: 40px; height: 40px; padding: 0\"></div><div class=\"D(ib) Zoom Va(t)\"><i class=\"Va(m) W(a) Ycon YconProfile Lh(1) Mx(10px) C(#8d919d)\" data-avatar='{\"size\": \"64x64\", \"style\": {\"width\": 48, \"height\": 48, \"verticalAlign\": \"top\",\"position\":\"relative\", \"top\":1}, \"loadOnResponse\":0}'>&#x1f464;</i></div><div class=\"Lh(1.3) W(2/3) D(ib) Zoom Lts(n) Tren(a) Va(t) Ov(v)\" id=\"yucs-user-info\"><div class=\"Fw(b) Fz(15px) Ell\" id=\"yucs-fs-name\">bball4ever714</div><div class=\"Fz(13px) Ell\" id=\"yucs-fs-email\">bball4ever714</div><div class='Pt(2px)' id=\"yucs-acct-info-wrap\"><a href=\"https://login.yahoo.com/account/personalinfo?.intl=us&.lang=en-US&.done=https://football.fantasysports.yahoo.com/f1/686943/3&.src=fantasy&specId=usernameRegWithName\" target=\"_top\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:acctinfo;slk:acctinfo;elm:itm;elmt:acctinfo;\" class=\"Td(n) Td(u)!:h C(#0078ff)! Fz(13px)\">Account Info</a></div></div></div> <div class=\"Pt(10px) Mx(-10px) yucs-spacing\"></div> <!-- UHC Notifications --> <div id='yucs-fs-acct-wrap'></div> <div id='yucs-fs-add-acct' class=\"Mx(-10px) Bdw(0) Bgc(#f7f8ff) Bdtw(1px)! Bds(s) Bdc(#fff) ThemeReset\"><a data-ylk=\"t3:tl-lst;t4:usr-mu;slk:addacct;elm:btn;elmt:usr;\" href=\"https://login.yahoo.com/manage_account?.crumb=vLSheczoKN0&.done=https://football.fantasysports.yahoo.com/f1/686943/3\" class=\"Td(n) C(#0078ff)! D(b) Py(8px) Bgc(#f2f4fe):h Td(n)\"><i class='Ycon YconPositive Ta(c) C(#0078ff)! Mx(10px) D(ib) Zoom Va(t)'>&#x2a01;</i><span class=\"Fz(13px) D(ib) Zoom Va(t) Va(t) C(#0078ff)! Py(10px)\">Add account</span></a></div> <ul class=\"Pos(r) Mx(-10px) My(0)! P(0)! Bgc(#fff)\" id=\"yucs-fs-footer\"> <li class=\"Py(8px) Px(10px)\"><a id=\"yucs-signout\" class=\"W(50%) D(b) Mx(a) C(#000) Bgc(t) Td(n):h Py(6px) Px(8px) Bdrs(3px) Ta(c) Td(n) Fz(13px)\" style='border: 1px solid #cccccc; min-width: 90px' target=\"_top\" rel=\"nofollow\" href=\"https://login.yahoo.com/config/login/?.crumb=vLSheczoKN0&logout=1&.direct=1&.done=https://www.yahoo.com/&logout_all=1\" data-ylk=\"t3:tl-lst;t4:usr-mu;t5:usersigno;slk:usersigno;elm:itm;elmt:lgo;\">Sign out</a> </li> </ul></div></li> <li class=\"D(ib) Zoom Va(t) Mend(20px) Pos(r) yucs-mail_link yucs-mailpreview-ancestor\" id=\"yucs-mail\"> <a id=\"yucs-mail_link_id\" class=\"D(ib) sp yltasis yucs-fc Pos(r) MouseOver Td(n) Td(n)!:h yucs-menu-link yucs-trigger Lh(1) Lts($ws) Mx(-10px) My(-10px) Px(10px) Py(10px)\" href=\"https://mail.yahoo.com/?.src=ym\" data-ylk=\"t3:tl-lst;t5:mailsigninst;slk:mailsigninst;elm:tl;elmt:mail;\"> <b class=\"MailBadge yucs-activate Fz(11px) Pos(a) Pt(3px)! Pend(6px)! Pb(2px)! Pstart(6px)! Miw(6px)! Mah(16px)! Mt(-6px)! Mstart(-13px) Bdrs(100px) Bg($bdgc) yucs-trigger_C(#fff)! yucs-mail-count D(n) Lts(n)\" data-uri-scheme=\"https\" data-uri-path=\"mg.mail.yahoo.com/mailservices/v1/newmailcount\" data-authstate=\"signedin\" data-crumb=\"pf3K2M0a2eL\" data-mc-crumb=\"iCxzglp8bb/\"></b> <i class=\"Va(m) W(a) Mend(7px) Ycon YconMail Lh(1) Fz(22px) Lts(n)\">&#x2709;</i> <b class=\"Va(m) yucs-trigger:h_Td(u) Lts(n) Fz(13px)\" title=\"Mail\">Mail</b> </a> <div id=\"yucs-mail-panel\" class=\"uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) uhArrow NorthEast Mt(10px) Pos(a) Lh(1.4) End(0) Whs(nw) D(n)\" aria-hidden=\"true\" data-mail-txt=\"Mail\" data-uri-scheme=\"https\" data-uri-path=\"ucs.query.yahoo.com/v1/console/yql\" data-mail-view=\"Go to Mail\" data-mail-help-txt=\"Help\" data-mail-help-url=\"http://help.yahoo.com/l/us/yahoo/mail/ymail/\" data-mail-loading-txt=\"Loading...\" data-languagetag=\"en-us\" data-authstate=\"signedin\" data-middleauth-signin-text=\"Click here to view your mail\" data-popup-login-url=\"https://login.yahoo.com/config/login_verify2?.pd=c%3DOIVaOGq62e5hAP8Tv..nr5E3&.src=sc\" data-middleauthtext=\"You have {count} new messages.\" data-yltmessage-link=\"https://mrd.mail.yahoo.com/msg?mid={msgID}&fid=Inbox\" data-yltviewall-link=\"https://mail.yahoo.com/\" data-yltpanelshown=\"/\" data-ylterror=\"/\" data-ylttimeout=\"/\" data-generic-error=\"We're unable to preview your mail.<br>Go to Mail.\" data-err-style=\"D(b) Ta(c) Fw(b) Whs(n) P(10px) Fz(13px) Bgc(#f5f5f5):h Td(n) Td(n):h MouseOver\" data-nosubject=\"[No Subject]\" data-timestamp='short'><div class=\"yucs-mail-loading\"></div></div></li> <li id=\"yucs-help\" class=\" yucs-activate yucs-help yucs-menu_nav D(ib) Zoom Va(t) Pos(r)\"> <a id=\"yucs-help_button\" class=\"D(ib) yltasis yucs-trigger Lh(1) Td(n) Td(n):h\" href=\"#\" title=\"Help\" aria-haspopup=\"true\" role=\"button\" data-ylk=\"rspns:op;t3:tl-lst;t4:cog-mu;t5:cogop;slk:cogop;elm:tl;elmt:cog;itc:1;\"> <i class=\"Va(m) W(a)! Fz(22px) Ycon YconSettings C(#32007f) Lts(n) M(-10px) P(10px)\">&#x2699;</i> <b class=\"Hidden\">Help</b> </a> <div id=\"yucs-help_inner\" class=\"uhFancyBox Bg(#fff) Bd(ttbd) Bxsh(ttsh) Bdrs(3px) uhArrow Mt(10px) Px(10px) Pos(a) Lh(1.4) End(0) Mend(-8px) Whs(nw) D(n) yucs-menu yucs-hm-activate\" data-yltmenushown=\"/\" aria-hidden=\"true\"> <ul id=\"yuhead-help-panel\" class=\"Mx(-10px)! Pos(r) My(0)! P(0) C(#000)\"> <li class=\"Py(8px) Px(10px)\"><a class=\"yucs-acct-link Td(n)! Td(u)!:h D(b) C(#000)!\" href=\"https://login.yahoo.com/account/personalinfo?.intl=us&.lang=en-US&.done=https://football.fantasysports.yahoo.com/f1/686943/3&amp;.src=fantasy&specId=usernameRegWithName\" target=\"_top\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:acctinfo;slk:acctinfo;elm:itm;elmt:acctinfo;\">Account Info</a></li> <li class=\"Pb(8px) Px(10px)\"><a id=\"yhelp-link\" data-inproducthelp=\"sports\" class=\"D(b) C(#000)! Td(n)! Td(u)!:h Fz(13px)\" href=\"javascript:void(0);\" rel=\"nofollow\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:hlp;slk:hlp;elm:itm;elmt:hlp;\">Help</a></li>  <li class=\"Px(10px) Py(8px) Bdw(0) Bdtw(1px) Bds(s) Bdc(#e2e2e6)\"><a class=\"D(b) C(#000)! Td(n)! Td(u)!:h Fz(13px)\" href=\"http://feedback.yahoo.com/forums/169858-us-sports\" rel=\"nofollow\" data-ylk=\"t3:tl-lst;t4:cog-mu;t5:sggstn;slk:sggstn;elm:itm;elmt:sggstn;\">Suggestions</a></li>   </ul> </div></li>  </ul> </div> </div> <div id=\"yhelp_container\" class=\"yui3-skin-sam\"> </div><!-- /#UH --></div><!-- alert --><!-- /alert --><!-- polyfills --><!-- /polyfills --><div id=\"yucs-location-js\" class=\"yucs-hide yucs-offscreen yucs-location-activate\" data-appid=\"yahoo.locdrop.ucs.desktop\" data-crumb=\"2nPTqm5kcYR\"><!-- empty for ie --></div>  </div>        </div>\r\n" + 
				"        <div class=\"ct-box-bd yui-sv-bd\">\r\n" + 
				"          <div style=\"overflow-x:hidden;\"></div>\r\n" + 
				"          <div class=\"yui-sv-content Ta-c\">\r\n" + 
				"            <div class=\"Page-wrap\">\r\n" + 
				"              <div class=\"Page  Phone-fill-x Tablet-fill-x\">\r\n" + 
				"                <script src=\"https://sp.yimg.com/ua/assets/js/html5shiv.iM_eFQs6MM_aR.js?m\" type=\"text/javascript\" ></script><script src=\"https://sp.yimg.com/ua/assets/js/react_bundle/common.hkDhyQeZo_ATy;js/react_bundle/react_fantasy_playersearch.v1n64u9zzHMQJ;js/react_bundle/react_fantasy_featurecue.KQOxbyn2AUKgL.js\" type=\"text/javascript\" ></script><script src=\"https://yep.video.yahoo.com/js/3/videoplayer-min.js?r=nextgen-desktop\" type=\"text/javascript\"></script><div style=\"\" id=\"yspcontentbg\" class=\"Thm-snow Page-wrap-sm\"></div><header style=\"\" id=\"yspcontentheader\" class=\"Page-hd Thm-snow Tablet-no-mtop Phone-no-mtop Page-wrap-sm\">\r\n" + 
				"    \r\n" + 
				"    <div class=\"Tst-smart-ad\">\r\n" + 
				"    <script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"    <!--\r\n" + 
				"\r\n" + 
				"    YUI().use( function (Y) {\r\n" + 
				"    \r\n" + 
				"        var SmartAd = {\r\n" + 
				"            \"varPRLeague\" : \"SZYFG1\",\r\n" + 
				"\"varPRCurrTeamID\" : 93686943,\r\n" + 
				"\"varPRCurrTeamName\" : \"Mooresville Bombers\",\r\n" + 
				"\"varPRCurrTeamRank\" : 10,\r\n" + 
				"\"varPRCurrTeamRankInBottomHalfOfLeague\" : \"True\",\r\n" + 
				"\"varPRCurrTeamScoreInBottomHalfOfLeague\" : \"True\",\r\n" + 
				"\"varPRCurrTeamWeekScore\" : 0.00,\r\n" + 
				"\"varPRCurrTeamLastWeekScore\" : 195.33,\r\n" + 
				"\"varPRCurrTeamOverallScore\" : 912.44,\r\n" + 
				"\"varPROppTeamID\" : 96686943,\r\n" + 
				"\"varPROppTeamLastWeekID\" : 95686943,\r\n" + 
				"\"varPROppTeamName\" : \"Sun Ferretts\",\r\n" + 
				"\"varPROppTeamLastWeekName\" : \"DMan\\'s GMen\",\r\n" + 
				"\"varPROppTeamRank\" : 4,\r\n" + 
				"\"varPROppTeamWeekScore\" : 0.00,\r\n" + 
				"\"varPROppTeamLastWeekScore\" : 138.97,\r\n" + 
				"\"varPROppTeamOverallScore\" : 1261.19,\r\n" + 
				"\"varPRLeagueTeams\" : {\"11686943\" : \"The Jirky Boys\", \"10686943\" : \"BigPimpin Dragons\", \"12686943\" : \"GOAT MILK\", \"96686943\" : \"Sun Ferretts\", \"92686943\" : \"G-ville GdoGGs\", \"97686943\" : \"Carolina Snoozers\", \"91686943\" : \"Binghamton BullMoose\", \"95686943\" : \"DMan\\'s GMen\", \"99686943\" : \"The K&C Gargoyles\", \"93686943\" : \"Mooresville Bombers\", \"98686943\" : \"Da Raiders\", \"94686943\" : \"TheDarkKnights\"},\r\n" + 
				"\"varPROppWonLastWeek\" : \"True\",\r\n" + 
				"\"varPRRosterChange\" : \"False\",\r\n" + 
				"\"varPRRosterAdds\" : \"False\",\r\n" + 
				"\"varPREmptyRosterSpot\" : \"True\",\r\n" + 
				"\"varPRLeagueNumTeams\" : 12,\r\n" + 
				"\"varPRLeagueScoringType\" : \"head\",\r\n" + 
				"\"varPRLeagueInPlayoffs\" : \"False\",\r\n" + 
				"\"varPRCurrTeamPlayoffChampionshipContention\" : \"False\",\r\n" + 
				"\"varPRTopScoringPlayer1Points\" : \"47.00\",\r\n" + 
				"\"varPRTopScoringPlayer1Position\" : \"DEF\",\r\n" + 
				"\"varPRTopScoringPlayer2Points\" : \"38.75\",\r\n" + 
				"\"varPRTopScoringPlayer2Position\" : \"QB\",\r\n" + 
				"\"varPRAaronRodgers\" : \"False\",\r\n" + 
				"\"varPRAaronRodgersLastWeekPoints\" : \"False\",\r\n" + 
				"\"varPRNewPlayerTD\" : \"False\",\r\n" + 
				"\"varPRNewPlayerTDPosition\" : \"False\",\r\n" + 
				"\"varPRCurrTeamWeekProjectedPts\" : 158.02,\r\n" + 
				"\"varPROppTeamWeekProjectedPts\" : 196.88,\r\n" + 
				"\"varPRMyWinsInRow\" : 1,\r\n" + 
				"\"varPRMyLossesInRow\" : 0,\r\n" + 
				"\"varPRCurrTeamWeeklyPointRank\" : 1,\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        YUI.Fantasy.SmartAdValues = function() {\r\n" + 
				"            return SmartAd;\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        YUI.Fantasy.SmartAd = function() {\r\n" + 
				"            return YUI.Fantasy.SmartAdValues();\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        YUI.Fantasy.SmartAd.get = function(value) {\r\n" + 
				"            return SmartAd[value];\r\n" + 
				"        };\r\n" + 
				"        \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    });\r\n" + 
				"    //-->\r\n" + 
				"    </script>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"      <section class=\"Thm-inherit No-bg\">\r\n" + 
				"                  \r\n" + 
				"            <div class=\"Hidden\">\r\n" + 
				"               <hr/>\r\n" + 
				"               <strong>Note:</strong> You are reading this message either because you do not have a standards-compliant browser, or because you can not see our css files.\r\n" + 
				"               <hr/>\r\n" + 
				"               <strong>Welcome to Yahoo Fantasy Sports:</strong>\r\n" + 
				"               <a href=\"#maincontent\">Skip to Content</a>\r\n" + 
				"                <a href=\"#subnav\">Skip to Section Navigation</a>\r\n" + 
				"               <hr/>\r\n" + 
				"            </div>\r\n" + 
				"\r\n" + 
				"<div class=\"Masthead Relative\"><h2 class=\"Fill-y\"><a class=\"Blocklink\" href=\"/f1\" title=\"Yahoo Sports Fantasy Football\">Yahoo Sports Fantasy Football</a></h2></div><div id=\"yspmh\" class=\"Page-masthead\"><div class=\"Tst-adlocation-MAST\"></div><div class=\"Tst-adlocation-FSRVY\"></div><div class=\"Tst-adlocation-LDRB\"><section class=\"Ad H-fixed\" id=\"yspadLDRB\"><div id=\"yspadLDRBDest\"><!-- darla ad LDRB goes here --></div></section><script type=\"text/javascript\">\r\n" + 
				";(function(){\r\n" + 
				"    var adparams = {\r\n" + 
				"        \"position\": \"LDRB\",\r\n" + 
				"        \"spaceid\":  '782200906',\r\n" + 
				"        \"rotate\": 10000,\r\n" + 
				"        \"w\": '728',\r\n" + 
				"        \"h\": '90',\r\n" + 
				"        \"spaceid\": 782200906    },\r\n" + 
				"    adContainer, \r\n" + 
				"    posCfg, \r\n" + 
				"    adCfg,\r\n" + 
				"    eventName = \"load\" + adparams.position,\r\n" + 
				"    meta = null;\r\n" + 
				"\r\n" + 
				"    adContainer = \"yspad\" + adparams.position + \"Dest\";\r\n" + 
				"\r\n" + 
				"    if (YUI && YUI.Fantasy && typeof YUI.Fantasy.SmartAdValues === \"function\") {\r\n" + 
				"      meta = YUI.Fantasy.SmartAdValues();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    posCfg = {\r\n" + 
				"        \"pos\": adparams.position, \r\n" + 
				"        \"dest\": adContainer,\r\n" + 
				"        \"fr\": \"ajax_exp\",\r\n" + 
				"        \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    adCfg = {\r\n" + 
				"        \"name\": eventName, \r\n" + 
				"        \"ps\": adparams.position, \r\n" + 
				"        \"sp\": adparams.spaceid,\r\n" + 
				"        \"ssl\": 1,\r\n" + 
				"        \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if(adparams.w) {\r\n" + 
				"        posCfg.w = adparams.w;\r\n" + 
				"        posCfg.h = adparams.h;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    DARLA_CONFIG.positions[adparams.position] = {\r\n" + 
				"      \"id\": adparams.position,\r\n" + 
				"      \"pos\": adparams.position, \r\n" + 
				"      \"dest\": adContainer,\r\n" + 
				"      \"fr\": \"ajax_exp\",\r\n" + 
				"      \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if (adparams.position === 'MAST') {\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fclose = 2;\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].metaSize = true;\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fdb = { \r\n" + 
				"        on: 1, \r\n" + 
				"        where: 'inside'\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].supports = { \r\n" + 
				"        'exp-ovr': 1, \r\n" + 
				"        'exp-push': 1, \r\n" + 
				"        'resize-to': 1 \r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].closeBtn = {\r\n" + 
				"        mode: 2,\r\n" + 
				"        useShow: 1,\r\n" + 
				"        adc: 0\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if(adparams.rotate && \"auto\" !== \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.AUTO.ps[adparams.position] = { \r\n" + 
				"        \"autoRT\": adparams.rotate,\r\n" + 
				"        \"autoIV\": 1 \r\n" + 
				"      };\r\n" + 
				"    }\r\n" + 
				"    if(adparams.rotate && \"auto\" === \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.MANUAL_ROTATION.ps[adparams.position] = {};\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"})();\r\n" + 
				"</script>\r\n" + 
				"</div></div>            <div id=\"league-info\" style=\"z-index:100005;\" class=\"Pos-r Grid-h-mid Bg-transparent Fz-xxs F-shade2 Mtop-med\">\r\n" + 
				"                <div class=\"Grid-u-1-2 Mbot-xs\">\r\n" + 
				"                     <span class=\"Ta-end Mend-sm\"><span class=\"Hidden\">Viewing Info for League:</span> SZYFG1 (ID# 686943)</span>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Grid-u-1-2 Ta-end Mbot-xs\"><script type=\"text/javascript\">\r\n" + 
				"            document.addEventListener('DOMContentLoaded', function() {\r\n" + 
				"                window.ScriptRunner.runScript('playersearch', {\"leagueId\":\"686943\",\"gameUri\":\"\\/f1\"});\r\n" + 
				"            });\r\n" + 
				"        </script><div id=\"league-info-playersearch\" class=\"D-ib\" style=\"margin-top:-13px;margin-right:-7px;margin-bottom:-12px;height:44px;vertical-align:bottom;\">\r\n" + 
				"                            <span class=\"F-icon Fz-sm C-w D-ib Cur-w\" style=\"margin:15px 15px 12px 0;opacity:0.5;\">&#xe01b;</span>\r\n" + 
				"                        </div>                    <a id=\"league-iris-chat\" href=\"https://fantasy.messenger.yahoo.com/group/UPQCOCYTEJGHROJLGEG3IX5LWA\" class=\"F-icon F-bright Fz-sm P-2 open-smack-talk\" title=\"Chat\" target=\"_blank\">&#xe015;</a>\r\n" + 
				"                    <a class=\"F-icon Fz-sm F-bright Mx-sm P-2\" id=\"In-product-help\" data-inproducthelp=\"SLN26267\" data-tst title=\"Help\" href=\"https://help.yahoo.com/kb/SLN26267.html?impressions=true\">&#xe03f;</a>\r\n" + 
				"                </div>\r\n" + 
				"            </div>    <nav class=\"Nav-main-wrap Tst-site-mainnav\">\r\n" + 
				"        <div class=\"Page-wrap-sm\">            <ul id=\"sitenav\" data-game=\"nfl\" class=\"Nav-h Nav-main\"><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1?lid=686943\" data-sec=\"MainNav\" data-slk=\"Football\">Football '17</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1?lid=686943\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/reg/joinleague/competitive\">Add Team</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/game_message_boards\">Community Forums</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/leaderboard?lid=686943\">Leaders</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/features?lid=686943\">What's New</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"https://profiles.sports.yahoo.com\">Profile</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"https://mobile.yahoo.com/fantasy/\" target=\"mobileapps\">Mobile</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/proleagues?lid=686943\">Pro Leagues</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/wallet\">Wallet</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/shop\">Fantasy Shop</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943\" data-sec=\"MainNav\" data-slk=\"League\">League</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/messages\">Message Board</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/emailleague\">Email League</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/teams\">Managers</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/starters\">Rosters</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/transactions\">Transactions</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/tradingblock\">Trading Block</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/recordbook\">Record Book</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/finances\">Dues</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/settings\">Settings</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/pickem\">League Pick'em</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main Selected\" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/3\" data-sec=\"MainNav\" data-slk=\"MyTeam\">My Team</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3\">Roster</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/playernotes\">Player Updates</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/playerswatch\">Watch List</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/teamlog\">Team Log</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/editteaminfo\">Edit Team Info</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/matchup\" data-sec=\"MainNav\" data-slk=\"Matchups\">Matchups</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/recap?week=6&mid1=3&mid2=5\">Last Week's Recap</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/players\" data-sec=\"MainNav\" data-slk=\"Players\">Players</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/players\">Player List</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/viewkeepers\">Protected Keepers</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/leaders\">League Leaders</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/injuries\">Injury Reports</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/playerchanges\">NFL Roster Changes</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/statcorrections\">Stat Corrections</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/research\" data-sec=\"MainNav\" data-slk=\"Research\">Research</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/research\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/buzzindex\">Transaction Trends</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/playertrades\">Trade Market</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/whoshot\">Who's Hot</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/playermatchups\">Matchup Ratings</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/keystosuccess\">MVPs</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/pointsagainst\">Fantasy Points Against</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/weather\">Weather</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/ffl\">Fantasy Football Live</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"https://www.fantasypros.com/nfl/rankings/qb.php?partner=yahoo_dropdown\" target=\"_blank\">Consensus Ranks</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/draft\" data-sec=\"MainNav\" data-slk=\"Draft\">Draft</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/draft\">Overview</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/mock_lobby\">Mock Drafts</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/draftresults\">Draft Results</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/draftrecap\">Draft Grades</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/draftanalysis\">Draft Analysis</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/3/prerank\">Pre-Draft Rankings</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/showtradedpicks\">Draft Picks</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/mockdraftgrades\">Mock Draft Report Card</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/lastseason\">Last Season</a></li>\r\n" + 
				"                        </ul></li><li class=\"Navitem Navitem-main stattracker\" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/loadstattracker\" target=\"stattracker_686943\" data-sec=\"MainNav\" data-slk=\"StatTracker\">StatTracker</a></li><li class=\"Navitem Navitem-main \" ><a class=\"Navtarget yfa-rapid-beacon\" href=\"/f1/686943/shop\" data-sec=\"MainNav\" data-slk=\"FantasyShop\">Fantasy Shop</a>\r\n" + 
				"                        <ul class=\"Nav-v Dropdown Nowrap Hidden Nav-main\">\r\n" + 
				"                                        <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=baseball\">Baseball</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=basketball\">Basketball</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=football\">Football</a></li>            <li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/shop?sport=hockey\">Hockey</a></li>\r\n" + 
				"                        </ul></li>            \r\n" + 
				"  <li class=\"Navitem Navitem-main Navitem-fantasy Va-top Fl-start Topstart\" >                  <a class=\"Navtarget Fantasy-item Va-mid Py-lg Miwpx-150 Mawpx-200\" href=\"https://sports.yahoo.com/fantasy\" >\r\n" + 
				"                      <div class=\"Grid-h-mid Nowrap Relative Ptop-xs Pbot-xxs\">\r\n" + 
				"                                              <div class=\"Grid-u F-icon Fz-xl Pstart-med Wpx-30 F-shade3 F-bright\">\r\n" + 
				"                        &#xe204;\r\n" + 
				"                    </div>\r\n" + 
				"                          <div class=\"Grid-u Px-sm Fz-sm F-bright\">\r\n" + 
				"                              <span>Yahoo Fantasy</span>\r\n" + 
				"                              <span class=\"F-icon Fz-xs F-bright\">\r\n" + 
				"                                &#xe002;\r\n" + 
				"                              </span>\r\n" + 
				"                          </div>\r\n" + 
				"                      </div>\r\n" + 
				"                  </a>\r\n" + 
				"  <div class=\"Dropdown Dropdown-med Nav-fantasy Hidden No-p Ptop-med\">\r\n" + 
				"      <div class=\"Fantasy-flyout-items Px-lg\">\r\n" + 
				"        \r\n" + 
				"                <div class=\"Grid-spread-mid Section\">\r\n" + 
				"          <div class=\"Grid-u Fz-lg Ptop-lg Pbot-med\">My Teams &amp; Leagues</div>\r\n" + 
				"          <div class=\"Grid-u\">\r\n" + 
				"            <a href=\"https://fantasysports.yahoo.com/edit/usergames\" class=\"F-shade Fz-xxs\" title=\"Edit My Teams and Leagues Order\">Edit order</a>\r\n" + 
				"          </div>\r\n" + 
				"        </div><div class=\"Pbot-lg No-px Fz-xxs No-ptop\">  <div class=\"Py-med Section\">\r\n" + 
				"      <h5 class=\"Fz-med No-py Grid-h-mid\">\r\n" + 
				"        <span class=\"F-icon F-shade F-bright Grid-u Wpx-30 Fz-2xl F-positive\">&#xe220;</span>\r\n" + 
				"        <a href=\"https://sports.yahoo.com/dailyfantasy\" class=\"F-header F-bright Grid-u\">Daily Fantasy</a>\r\n" + 
				"      </h5>\r\n" + 
				"\r\n" + 
				"      <div class=\"Pstart-30 Py-sm Grid-spread-mid\">\r\n" + 
				"        <a href=\"https://sports.yahoo.com/dailyfantasy/contest/create\" class=\"Btn Btn-short Fz-xxs Grid-u\">Create a contest</a>\r\n" + 
				"        <a href=\"https://sports.yahoo.com/dailyfantasy\" class=\"Btn-primary Btn-short Fz-xxs Grid-u\">View today's contests</a>\r\n" + 
				"      </div>\r\n" + 
				"  </div>        <div class=\"Py-med Section\">\r\n" + 
				"            <h5 class=\"Fz-med No-py Grid-h-mid\"><span class=\"F-icon F-shade F-bright Grid-u Wpx-30 Fz-2xl\">&#xe204;</span><a href=\"https://football.fantasysports.yahoo.com/f1\" class=\"F-shade Grid-u\">Football</a></h5>\r\n" + 
				"                  <div class=\"Pstart-30 Py-med\"><a class=\"Fz-sm F-header F-bright\" href=\"https://football.fantasysports.yahoo.com/f1/686943/3\">Mooresville Bombers</a><div class=\"Fz-xs\"><a href=\"https://football.fantasysports.yahoo.com/f1/686943\" class=\"F-shade Fz-xxs Block\">SZYFG1</a></div></div>\r\n" + 
				"        </div></div>\r\n" + 
				"        <div class=\"Pstart-30 Ptop-med\">\r\n" + 
				"            <h3 class=\"Fz-med\">Other fantasy games</h3>\r\n" + 
				"            <div class=\"Pbot-lg No-px Fz-xxs\"><ul class=\"Grid-h-mid Grid-2col Py-sm\"><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://tournament.fantasysports.yahoo.com\">Tourney Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://baseball.fantasysports.yahoo.com\">Baseball</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://hockey.fantasysports.yahoo.com\">Hockey</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://basketball.fantasysports.yahoo.com\">Basketball</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com\">Football</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/pickem\">Pro Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/survival\">Survival Football</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/college\">College Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://football.fantasysports.yahoo.com/bowl\">College Bowl Pick'em</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://golf.fantasysports.yahoo.com/\">Golf</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://racing.fantasysports.yahoo.com/\">Auto Racing</a></li><li class=\"Grid-u Ptop-sm\"><a class=\"F-shade\" href=\"https://fantasysports.yahoo.com/moregames\">More Games &raquo;</a></li></ul></div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"  </div>\r\n" + 
				"</li><li class='Navitem Navitem-main Fl-end'></li>            </ul>\r\n" + 
				"        </div>\r\n" + 
				"    </nav><div class=\"Subnav-main-wrap\">\r\n" + 
				"<ul id=\"sitenavsub\" class=\"Nav-h Page-wrap-sm Thm-inverse Subnav-main Fz-s Pstart-xxl Py-xs\">\r\n" + 
				"	<li class=\"Navitem first  Selected\"><a class=\"Navtarget \" href=\"/f1/686943/3\">Roster</a></li>\r\n" + 
				"	<li class=\"Navitem\"><a class=\"Navtarget \" href=\"/f1/686943/3/playernotes\">Player Updates</a></li>\r\n" + 
				"	<li class=\"Navitem\"><a class=\"Navtarget \" href=\"/f1/686943/3/playerswatch\">Watch List</a></li>\r\n" + 
				"	<li class=\"Navitem\"><a class=\"Navtarget \" href=\"/f1/686943/3/teamlog\">Team Log</a></li>\r\n" + 
				"	<li class=\"Navitem last \"><a class=\"Navtarget \" href=\"/f1/686943/3/editteaminfo\">Edit Team Info</a></li>\r\n" + 
				"</ul>\r\n" + 
				"</div>                \r\n" + 
				"</section>\r\n" + 
				"</header><div style=\"\" class=\"Page-bd Page-wrap-sm\"><div id=\"fantasyhero\" class=\"RailWrap Page-herocontentwrap\"><section class=\"Rail\"><div class=\"RailFull\"><div style=\"\" id=\"yspcontenthero\" class=\"Thm-snow Page-herocontent\"><div><div class=\"df-ad\" data-dfadposition=\"top\" data-dfadexclusive=\"1\"></div></div></div></div></section></div><div id=\"fantasy\" class=\"RailWrap Page-maincontent\"><section class=\"Rail\"><div class=\"RailFull\"><div style=\"\" id=\"yspmain\" class=\"\"><div style=\"\" id=\"ysppageheader\" class=\"Thm-snow\"></div><div style=\"\" id=\"yspcontentmainhero\" class=\"Thm-snow\"><div id=\"Alerts\" class=\"AlertsMod Thm-inherit\">\r\n" + 
				"\r\n" + 
				"<div id=\"Alert-critical-block\" class=\"Alert Alert-critical Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe046;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-critical-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div>\r\n" + 
				"<div id=\"Alert-confirmation-block\" class=\"Alert Alert-confirmation Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe032;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-success-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div>\r\n" + 
				"<div id=\"Alert-info-block\" class=\"Alert Alert-info Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe013;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-info-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div>\r\n" + 
				"<div id=\"Alert-warning-block\" class=\"Alert Alert-warning Hidden\">\r\n" + 
				"<!-- TEMPLATE \r\n" + 
				"<div class=\"Grid-table\"><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-40 Ta-c\"><span class=\"F-icon Fz-xs\">&#xe046;</span></div><div class=\"Grid-u Message Py-med Pstart-lg Bdrstart\"><p></p></div><div class=\"Grid-u Va-mid Py-med Px-lg Wpx-20 Ta-end\"><a id=\"Alert-warning-close\" class=\"Hidden Close F-icon Fz-xxs\" href=\"#\">&#xe009;</a></div></div>\r\n" + 
				"TEMPLATE -->\r\n" + 
				"</div></div>\r\n" + 
				"\r\n" + 
				"<section id=\"team-card\" class=\"Mod Thm-inherit Min-height No-mx Pbot-xl Mbot-lg Ptop-xs Fz-sm F-page-header\">\r\n" + 
				"  <div class=\"Bd No-p  Grid-h-top \">\r\n" + 
				"    <div id=\"team-card-info\" class=\"Grid-u-3-8 Min-height Pend-med Pstart-xs Grid-h-top No-ptop\">\r\n" + 
				"        <div class=\"Grid-u Relative\">\r\n" + 
				"                            <div class=\"Absolute Top Left\">\r\n" + 
				"                    <a class=\"Tst-editteaminfo Inlineblock Td-n Fl-start Mend-sm F-shade F-icon Fz-xxs F-shade\" href=\"/f1/686943/3/editteaminfo\" title=\"Edit Team Settings\">&#xe00c;</a>\r\n" + 
				"                </div>\r\n" + 
				"            \r\n" + 
				"            <div class=\"Mstart-lg\">\r\n" + 
				"                <a class='Grid-u' href='/f1/686943/3/editteaminfo'><img class=\"Avatar-lg Tst-teamcard-img Avatar-lg Mtop-sm\" src=\"https://s.yimg.com/dh/ap/fantasy/nfl/img/icon_01_100.png\" alt=\"avatar\"> </a>            </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-u Ptop-sm\">\r\n" + 
				"            <ul class=\"Nav-h Nav-main No-bdrbot Fz-lg Bg-transparent No-boxshadow Phone-fz-med\">\r\n" + 
				"                <li class=\"Navitem Navitem-main Wordwrap-bw\">\r\n" + 
				"                    <a class=\"Navtarget Py-sm Pstart-lg F-reset Wordwrap-bw No-case\" href=\"/f1/686943/3/team\">Mooresville Bombers  <span class=\"F-icon Fz-xxs\">&#xe002;</span></a>    \r\n" + 
				"                            <ul class=\"Nav-v Dropdown Nowrap Nav-main No-mtop Fz-xxs Hidden\"><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/10/team?date=2017-10-19&week=7\">BigPimpin Dragons </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/1/team?date=2017-10-19&week=7\">Binghamton BullMoose </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/7/team?date=2017-10-19&week=7\">Carolina Snoozers </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/8/team?date=2017-10-19&week=7\">Da Raiders </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/5/team?date=2017-10-19&week=7\">DMan's GMen </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/2/team?date=2017-10-19&week=7\">G-ville GdoGGs </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/12/team?date=2017-10-19&week=7\">GOAT MILK </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/6/team?date=2017-10-19&week=7\">Sun Ferretts </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/11/team?date=2017-10-19&week=7\">The Jirky Boys </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/9/team?date=2017-10-19&week=7\">The K&C Gargoyles </a></li><li class=\"Navitem Navitem-main\"><a class=\"I Navtarget\" href=\"/f1/686943/4/team?date=2017-10-19&week=7\">TheDarkKnights </a></li></ul>                </li>\r\n" + 
				"            </ul>\r\n" + 
				"\r\n" + 
				"            <ul class=\"Pstart-lg Mtop-sm Mbot-med Phone-hidden\">\r\n" + 
				"                <li><a href=\"http://profiles.sports.yahoo.com/user/SOYUQYM66WFTSVMBSRPZFG3F2U\">ce</a> <span class=\"Fz-xxs Bg-shade2 Bdrs Fw-b P-xs\" title=\"Playing Fantasy Football since 2007\">Since '07</span></li>\r\n" + 
				"                            </ul>\r\n" + 
				"            <ul class=\"team-card-stats\">\r\n" + 
				"\r\n" + 
				"                                    <li class=\"Inlineblock Mend-lg Pstart-lg Phone-ptop-lg\">\r\n" + 
				"                        <em class=\"Block F-shade Fz-xxs Mtop-xxs Uppercase\">10<sup>th</sup> Place</em>\r\n" + 
				"                        <span>2-4-0</span>\r\n" + 
				"                    </li>\r\n" + 
				"                \r\n" + 
				"                                    <li class=\"Inlineblock Mend-lg   Phone-pstart-lg Phone-ptop-lg\">\r\n" + 
				"\r\n" + 
				"                                                    <em class=\"Block F-shade Fz-xxs Mtop-xxs Uppercase\">Total Points</em>\r\n" + 
				"                            <span>912.44</span>\r\n" + 
				"                        \r\n" + 
				"                    </li>\r\n" + 
				"                                        <li class=\"Inlineblock Mend-lg Phone-pstart-lg Phone-ptop-lg\">\r\n" + 
				"                        <em class=\"Block F-shade Fz-xxs Cur-h Mtop-xxs Uppercase\" title=\"Average is calculated by counting completed weeks only.\">Points/Week</em>\r\n" + 
				"                        <span>152.07</span>\r\n" + 
				"                    </li>\r\n" + 
				"                                                        \r\n" + 
				"            </ul>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"            <style type=\"text/css\">\r\n" + 
				"            #tooltip .yui3-widget-bd {\r\n" + 
				"                max-width: 500px !important;\r\n" + 
				"                padding-bottom: 0px;\r\n" + 
				"            }\r\n" + 
				"            #tooltip .yui3-widget-bd p{\r\n" + 
				"                padding-bottom: 5px;\r\n" + 
				"            }\r\n" + 
				"        </style>\r\n" + 
				"        <div id=\"team-card-felo\" class=\"Grid-u-1-5 Min-height Px-lg Bdrstart Ptop-med\">\r\n" + 
				"            <div class=\"Block Fz-xxs\">\r\n" + 
				"\r\n" + 
				"                            <div class=\"F-icon Inlineblock Fz-sm Mend-xs \">&#xe204;</div>\r\n" + 
				"                            <span class=\"F-shade Uppercase \">Skill Level</span>\r\n" + 
				"                <span class=\"tooltip Wpx-500\" data-tooltip='<p>Your football skill level counts record, winning %, teams managed, and trophies won from 2009 and forward.</p><p>Trophies include 1st, 2nd and 3rd place finishes.</p>'><span class=\"Inlineblock T-hidden\">(help)</span><span aria-role=\"hidden\" class=\"F-icon Fz-xxs Mstart-sm Va-base\">&#xe013;</span></span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Teams Managed: </span>\r\n" + 
				"                <span>13</span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Record: </span>\r\n" + 
				"                <span>85-104-7</span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Winning %: </span>\r\n" + 
				"                <span>.452</span>\r\n" + 
				"            </div>\r\n" + 
				"                        <div class=\"Ptop-med Fz-xxs\">\r\n" + 
				"                <span class=\"F-shade\">Trophies Won: </span>\r\n" + 
				"                <span>3</span>\r\n" + 
				"            </div>\r\n" + 
				"                    </div>\r\n" + 
				"    \r\n" + 
				"            <div id=\"team-card-matchup\" class=\"Grid-u-1-4 Min-height Px-lg Ta-c Bdrstart Ptop-med\">\r\n" + 
				"            <span class=\"Block Mbot-xs Fz-xxs F-shade Uppercase\">Week 7 Matchup</span>\r\n" + 
				"            <ul>\r\n" + 
				"                <li class='Linkable Listitem No-p ' data-linkable='true' data-target='/f1/686943/matchup?week=7&mid1=3&mid2=6'>\r\n" + 
				"          <div class='Ta-c Js-hidden'><a href='/f1/686943/matchup?week=7&mid1=3&mid2=6'>View Matchup</a></div>\r\n" + 
				"          <div class='Grid-table Phone-px-med'>\r\n" + 
				"\r\n" + 
				"            <div class='Grid-u-1-2 Py-xs '>\r\n" + 
				"              <div class='Grid-bind-end Grid-h-mid Nowrap'>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u'>\r\n" + 
				"                  <div class='Ta-end Pend-xl Phone-ta-c Phone-no-p'>\r\n" + 
				"                      <div class='Fz-lg'>0.00</div>  <div class='F-shade  proj-pts-matchup'>158.02</div>\r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u Phone-grid-u-2-3'>\r\n" + 
				"                  <div class='Ta-end Grid-h-top Mstart-sm Phone-ta-start Phone-no-mstart'>\r\n" + 
				"                    \r\n" + 
				"                    <span class='Grid-u Pend-lg Phone-grid-u-1-5 Phone-no-px Phone-ptop-med'><a class='Grid-u' href='/f1/686943/3'><img class=\"Avatar-med Grid-u Mend-med\" src=\"https://s.yimg.com/dh/ap/fantasy/nfl/img/icon_01_100.png\" alt=\"avatar\"> </a></span>\r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class='Grid-u-1-2 Py-xs'>\r\n" + 
				"              <div class='Grid-bind-start Grid-h-mid Nowrap'>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u'>\r\n" + 
				"                  <div class='Pstart-xl Ta-start Phone-ta-c Phone-no-p'>\r\n" + 
				"                      <div class='Fz-lg'>0.00</div>  <div class='F-shade  '>196.88</div>\r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"                <div class='Grid-u Phone-grid-u-2-3'>\r\n" + 
				"                  <div class='Grid-h-top Ta-start Mend-sm Phone-no-mend'>\r\n" + 
				"                    <span class='Grid-u Fl-start Phone-grid-u-1-5 Phone-ptop-med'><a class='Grid-u' href='/f1/686943/6'><img class=\"Avatar-med Grid-u Mstart-med\" src=\"https://s.yimg.com/dh/ap/fantasy/nfl/img/icon_01_100.png\" alt=\"avatar\"> </a></span>\r\n" + 
				"                    \r\n" + 
				"                  </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </li>            </ul>\r\n" + 
				"                <ul>\r\n" + 
				"                <li class=\"Inlineblock Fz-xxs Pend-sm\">vs <a  href=\"/f1/686943/6\">Sun Ferretts</a> 4-2-0</li>\r\n" + 
				"                                    <li class=\"Inlineblock Fz-xxs Bdrstart Pstart-sm\">4<sup>th</sup></li>\r\n" + 
				"                                </ul>\r\n" + 
				"            </div>\r\n" + 
				"    \r\n" + 
				"            <div id=\"team-card-recap\" class=\"Grid-u-1-6 Min-height Px-lg Ta-c Bdrstart Ptop-med\">\r\n" + 
				"                            <div id=\"previousmatchupresult\" class=\"Linkable No-p\" data-linkable=\"true\" data-target=\"/f1/686943/matchup?week=6&mid1=3&mid2=5\" >\r\n" + 
				"                <ul>\r\n" + 
				"                    <span class=\"Block\">Week 6 Results</span>\r\n" + 
				"                    <li class=\"Block Fz-xxs Fw-b\">\r\n" + 
				"                        <span class=\"F-positive\">Won</span> <strong>195.33</strong> - 138.97                    </li>\r\n" + 
				"                </ul>\r\n" + 
				"                </div>\r\n" + 
				"                <ul>\r\n" + 
				"                    <li class=\"Fz-xxs\">vs <a href=\"/f1/686943/5\">DMan's GMen</a></li>\r\n" + 
				"                    <li><img title=\"A- Grade\" width=\"32\" height=\"32\" class=\"Mtop-med\" src=\"https://s.yimg.com/dh/ap/fantasy/img/A-_grade@3x.png?v=1\" /></li><li class=\"Ptop-sm Fz-xxs\"><a class=\"Btn Btn-short\" href=\"/f1/686943/recap?week=6&mid1=3&mid2=5\">View Recap</a></li>                </ul>\r\n" + 
				"\r\n" + 
				"                    </div>\r\n" + 
				"          </div>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"<section id=\"teamnotes\" class=\"Mod Thm-inherit Mbot-lg No-mtop No-mx No-bdry\" data-loco-ignore>\r\n" + 
				"    <div class=\"Bd Bdrtop No-p yfa-dynamic teamnotes-content\" data-unused-roster-spots=\"1\" data-href=\"/f1/686943/3/teamnotes\" data-target=\".teamnotes-content\">\r\n" + 
				"                   <div class=\"Ov-h W-100 Px-lg Py-sm Bdrbot Linkable \"  data-target=\"https://football.fantasysports.yahoo.com/f1/686943/statcorrections?week=6\">\r\n" + 
				"              <div class=\"Fl-start Bdrend Pend-lg Fz-xxs Ta-c\">\r\n" + 
				"                <span class=\"F-icon Fz-xs\" title=\"Information\">&#xe013;</span>              </div>\r\n" + 
				"              <div class=\"Fz-xs Bfc Pstart-lg Ptop-xxs\">\r\n" + 
				"                A stat correction was applied to <a  href=\"https://sports.yahoo.com/nfl/players/26804\" target=\"_blank\" >Latavius Murray</a> on Monday, Oct 16.                <div class=\"Fl-end Fz-xxs\">\r\n" + 
				"                                <a href=\"https://football.fantasysports.yahoo.com/f1/686943/statcorrections?week=6\" class=\"F-reset\">View Details</a> <span class=\"F-icon Fz-xxs Mstart-sm\">&#xe005;</span>                </div>\r\n" + 
				"              </div>\r\n" + 
				"           </div>\r\n" + 
				"                       <div class=\"Ov-h W-100 Px-lg Py-sm Bdrbot Linkable \"  data-target=\"/f1/686943/players\">\r\n" + 
				"              <div class=\"Fl-start Bdrend Pend-lg Fz-xxs Ta-c\">\r\n" + 
				"                <span class=\"F-icon Fz-xs F-negative\" title=\"Alert\">&#xe046;</span>              </div>\r\n" + 
				"              <div class=\"Fz-xs Bfc Pstart-lg Ptop-xxs\">\r\n" + 
				"                You have <span class='Fw-b'>1 empty spot</span> on your roster.                <div class=\"Fl-end Fz-xxs\">\r\n" + 
				"                                <a href=\"/f1/686943/players\" class=\"F-reset\">Add a player</a> <span class=\"F-icon Fz-xxs Mstart-sm\">&#xe005;</span>                </div>\r\n" + 
				"              </div>\r\n" + 
				"           </div>\r\n" + 
				"                </div>\r\n" + 
				"</section>\r\n" + 
				"</div><div style=\"\" id=\"yspmaincontent\" class=\"Thm-snow\"><section class=\"Mod Thm-inherit No-m\" id=\"team-roster\">\r\n" + 
				"<header class=\"Bd No-p Bdrbot\">\r\n" + 
				"\r\n" + 
				"<div id=\"full_stat_nav\" class=\"Ptop-xs Bdrbot\">\r\n" + 
				"<div class=\"Inlineblock yfa-week-nav Grid-u Mstart-lg Mend-lg\">\r\n" + 
				"  <div class=\"Grid-h-mid Inlineblock Nowrap\">\r\n" + 
				"        <span id='selectlist_nav' class='Flyoutselectbox Grid-h-mid Flyoutselect' title='Week 7' data-uselink>\r\n" + 
				"        <a href='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=6' class='Js-prev Grid-u No-bdr-radius-end No-bdrend Pend-med Td-n Fz-xs '><span class='F-icon Fz-xs'>&#xe003;</span></a>\r\n" + 
				"        <a class='flyout_trigger No-bdr-radius Fz-xs Grid-u No-Hover-Underline' href='#'>\r\n" + 
				"            <span class='flyout-title'>\r\n" + 
				"                Week 7\r\n" + 
				"            </span>\r\n" + 
				"            \r\n" + 
				"        </a>\r\n" + 
				"        <form class='Selectbox Js-hidden' autocomplete=\"off\">\r\n" + 
				"            <select name='week' class='Mod-select'  >\r\n" + 
				"                <option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=1'     >Week 1</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=2'     >Week 2</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=3'     >Week 3</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=4'     >Week 4</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=5'     >Week 5</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=6'    prev >Week 6</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=7&stat1=S&stat2=W' selected    >Week 7</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=8&stat1=S&stat2=W'   next  >Week 8</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=9&stat1=S&stat2=W'     >Week 9</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=10&stat1=S&stat2=W'     >Week 10</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=11&stat1=S&stat2=W'     >Week 11</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=12&stat1=S&stat2=W'     >Week 12</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=13&stat1=S&stat2=W'     >Week 13</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=14&stat1=S&stat2=W'     >Week 14</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=15&stat1=S&stat2=W'     >Week 15</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=16&stat1=S&stat2=W'     >Week 16</option><option value='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=17&stat1=S&stat2=W'     >Week 17</option>\r\n" + 
				"            </select>\r\n" + 
				"        </form>\r\n" + 
				"        <a href='https://football.fantasysports.yahoo.com/f1/686943/3/team?&week=8&stat1=S&stat2=W' class='Js-next Grid-u No-bdr-radius-start No-bdrstart Pstart-med Td-n Fz-xs '><span class='F-icon Fz-xs'>&#xe005;</span></a>\r\n" + 
				"    </span>  </div>\r\n" + 
				"</div>\r\n" + 
				"<div class=\" navlist Inlineblock No-px No-mx Grid-u Nowrap My-sm Py-xxs\">\r\n" + 
				"  <ul data-dynamic=\"true\" data-target=\".stat-target\" data-nocache=\"true\" data-subnav-targets=\"#statsubnav\" class=\"Nav-h Nav-bot-pointers-north No-bdr\" id=\"statnav\" default>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c Selected\">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=S\" class=\"Navtarget No-p\" id=\"S\" has-sub data-subnav-target=\"#subnav_S\">Stats</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c \">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=P&amp;ssort=W\" class=\"Navtarget No-p\" id=\"P\" has-sub data-subnav-target=\"#subnav_P\">Projected Stats</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c \">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=GDD&amp;ssort=W\" class=\"Navtarget No-p\" id=\"GDD\" has-sub data-subnav-target=\"#subnav_GDD\">Game Day Decision</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c \">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;ssort=W\" class=\"Navtarget No-p\" id=\"SPS\" has-sub data-subnav-target=\"#subnav_SPS\">Split Stats</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c \">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=K&amp;ssort=W\" class=\"Navtarget No-p\" id=\"K\" has-sub data-subnav-target=\"#subnav_K\">Ranks</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c \">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=O&amp;ssort=W\" class=\"Navtarget No-p\" id=\"O\" has-sub data-subnav-target=\"#subnav_O\">Opponents</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Navitem Mstart-xxl Ta-c \">\r\n" + 
				"    <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=R&amp;ssort=W\" class=\"Navtarget No-p\" id=\"R\" has-sub data-subnav-target=\"#subnav_R\">Research</a>\r\n" + 
				"    <span class=\"Navpointer\"></span>\r\n" + 
				"  </li>\r\n" + 
				"  </ul>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"  <div id=\"statsubnav\" class=\"navlist statsubnav Bdr-top Mtop-sm\">\r\n" + 
				"    <div class=\" Subnav-main navlist No-p No-m Grid-full Bg-shade2\">\r\n" + 
				"             <ul data-dynamic=\"true\" data-target=\".stat-target\" data-nocache=\"true\" data-supernav-target=\"#S\" class=\"Nav-h Pstart-lg Pend-lg Grid-full \" id=\"subnav_S\">\r\n" + 
				"                   <li class=\"Navitem Default-selected Selected\">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=S&amp;stat2=W\" class=\"Navtarget\">Week 7</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=S&amp;stat2=L4W\" class=\"Navtarget\">Week 3  - Week 6</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=S&amp;stat2=S_2017\" class=\"Navtarget\">This Season</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=S&amp;stat2=S_2016\" class=\"Navtarget\">Last Season</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=S&amp;stat2=S_2015\" class=\"Navtarget\">2015-16</a>\r\n" + 
				"       </li>\r\n" + 
				"                 </ul>\r\n" + 
				"                 <ul data-dynamic=\"true\" data-target=\".stat-target\" data-nocache=\"true\" data-supernav-target=\"#P\" class=\"Nav-h Pstart-lg Pend-lg Grid-full Hidden\" id=\"subnav_P\">\r\n" + 
				"                   <li class=\"Navitem Default-selected \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=P&amp;stat2=PW\" class=\"Navtarget\">Week 7</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=P&amp;stat2=PN4W\" class=\"Navtarget\">Weeks 7-10</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=P&amp;stat2=PSR_2017\" class=\"Navtarget\">Remaining Games</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=P&amp;stat2=PS_2017\" class=\"Navtarget\">Season Total</a>\r\n" + 
				"       </li>\r\n" + 
				"        <li class=\"Navitem Fl-end Px-xxl Mtop-med Fz-xs\">\r\n" + 
				"Projections Powered by <a  target=\"_new\" href=\"http://www.rotowire.com/\">Rotowire</a>\r\n" + 
				"</li>         </ul>\r\n" + 
				"                 <ul data-dynamic=\"true\" data-target=\".stat-target\" data-nocache=\"true\" data-supernav-target=\"#GDD\" class=\"Nav-h Pstart-lg Pend-lg Grid-full Hidden\" id=\"subnav_GDD\">\r\n" + 
				"                   <li class=\"Navitem Default-selected \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=GDD&amp;stat2=D\" class=\"Navtarget\">Overall</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=GDD&amp;stat2=M\" class=\"Navtarget\">Fantasy Matchups</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=GDD&amp;stat2=G\" class=\"Navtarget\">Game Day Calls</a>\r\n" + 
				"       </li>\r\n" + 
				"                 </ul>\r\n" + 
				"                 <ul data-dynamic=\"true\" data-target=\".stat-target\" data-nocache=\"true\" data-supernav-target=\"#SPS\" class=\"Nav-h Pstart-lg Pend-lg Grid-full Hidden\" id=\"subnav_SPS\">\r\n" + 
				"                   <li class=\"Navitem Default-selected \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=9_2017\" class=\"Navtarget\">Grass</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=10_2017\" class=\"Navtarget\">Turf</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=11_2017\" class=\"Navtarget\">Outdoors</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=12_2017\" class=\"Navtarget\">Indoors</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=13_2017\" class=\"Navtarget\">Home</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=14_2017\" class=\"Navtarget\">Away</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=36_2017\" class=\"Navtarget\">Day</a>\r\n" + 
				"       </li>\r\n" + 
				"                   <li class=\"Navitem  \">\r\n" + 
				"         <a href=\"https://football.fantasysports.yahoo.com/f1/686943/3?stat1=SPS&amp;stat2=37_2017\" class=\"Navtarget\">Night</a>\r\n" + 
				"       </li>\r\n" + 
				"                 </ul>\r\n" + 
				"            </div>\r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div class=\"Grid-table W-100 Fz-xs Py-lg\">\r\n" + 
				"    <div class=\"Grid-u Px-med Fz-sm Va-mid\">\r\n" + 
				"            <p class=\"Inlineblock\">Week 7 Total: 0.00 pts <span class=\"F-shade\">(<span class=\"proj-pts-week\">158.02</span> Projected)</span></p>\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"    <div class=\"Grid-u Ta-end Nowrap\">\r\n" + 
				"                            <a class=\"Btn Btn-short Mend-med\" href=\"/f1/686943/players?refteam=3\">Add Player</a>\r\n" + 
				"            <a class=\"Btn Btn-short Mend-med\" href=\"/f1/686943/3/dropplayer\">Drop Player</a>\r\n" + 
				"                            <a class=\"Btn Btn-short Mend-med\" href=\"/f1/686943/3/proposetrade\">Create Trade</a>\r\n" + 
				"                <a class=\"Btn Btn-short\" href=\"/f1/686943/players?myteam=1\">Compare My Team</a>\r\n" + 
				"    </div>\r\n" + 
				"</div>\r\n" + 
				"</header>\r\n" + 
				"<div class=\"Bd No-p\">\r\n" + 
				"<form method=\"post\" action=\"/f1/686943/3/editroster\" id=\"roster-edit-form\" class=\"mode-swap\">\r\n" + 
				"<section class=\"ysf-rosterswap-manager stat-target\" role=\"group\">\r\n" + 
				"  <p id=\"top-rostersave-msg\" class=\"rostersave-msg Block Px-med Fz-xs Va-mid Ta-start Ptop-med\"> </p>\r\n" + 
				"<div id=\"statTable0-wrap\" class=\"tablewrap\" data-pos-type=\"O\">  <table class=\"Table-plain Table Table-px-med Table-mid Datatable Ta-center Tz-xxs ysf-rosterswapper table-scroll\" id=\"statTable0\">\r\n" + 
				"    <caption class=\"Hidden-accessible\"><span class=\"Hidden-accessible\">Mooresville Bombers's Offense roster for week 7. <details>To edit your roster using the keyboard, press tab to select an editable row, enter to edit the row, and use the up and down arrows to select an available destination.</details></span></caption><thead><tr class=\"First\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >&nbsp;</div></th><th style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden\"><div >&nbsp;</div></th><th style=\"width: 230px;\" class=\"Alt Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">&nbsp;</div></th><th style=\"width: 14px;\" class=\"Ta-c\"><div >&nbsp;</div></th><th title=\"Bye\" class=\"Alt\"><div >&nbsp;</div></th><th title=\"\" colspan=\"3\" class=\"\"><div >Fantasy</div></th><th title=\"\" colspan=\"4\" class=\"Alt\"><div >Passing</div></th><th title=\"\" colspan=\"3\" class=\"Alt\"><div >Rushing</div></th><th title=\"\" colspan=\"4\" class=\"\"><div >Receiving</div></th><th title=\"Return\" class=\"\"><div >Ret</div></th><th title=\"Miscellaneous\" class=\"Alt\"><div >Misc</div></th><th title=\"Fumbles\" class=\"\"><div >Fum</div></th><th style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></th></tr><tr class=\"Alt Last\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >Pos</div></th><th style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden\"><div >Edit</div></th><th style=\"width: 230px;\" class=\"Alt Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">Offense</div></th><th style=\"width: 14px;\" class=\"Ta-c\"><div >Forecast</div></th><th title=\"\" class=\"Alt Ta-c\"><div >Bye</div></th><th title=\"\" style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >Fan Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >Proj Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >% Start</div></th><th title=\"Completions\" class=\"Alt Ta-end\"><div >Comp</div></th><th title=\"Passing Yards\" class=\"Ta-end\"><div >Yds</div></th><th title=\"Passing Touchdowns\" class=\"Alt Ta-end\"><div >TD</div></th><th title=\"Interceptions\" class=\"Ta-end\"><div >Int</div></th><th title=\"Rushing Attempts\" class=\"Alt Ta-end\"><div >Att</div></th><th title=\"Rushing Yards\" class=\"Ta-end\"><div >Yds</div></th><th title=\"Rushing Touchdowns\" class=\"Alt Ta-end\"><div >TD</div></th><th title=\"Targets\" class=\"Ta-end\"><div >Tgt</div></th><th title=\"Receptions\" class=\"Alt Ta-end\"><div >Rec</div></th><th title=\"Receiving Yards\" class=\"Ta-end\"><div >Yds</div></th><th title=\"Receiving Touchdowns\" class=\"Alt Ta-end\"><div >TD</div></th><th title=\"Return Touchdowns\" class=\"Ta-end\"><div >TD</div></th><th title=\"2-Point Conversions\" class=\"Alt Ta-end\"><div >2PT</div></th><th title=\"Fumbles Lost\" class=\"Last Ta-end\"><div >Lost</div></th><th style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></th></tr></thead><tbody><tr class=\"First\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"QB\">QB</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"28638\"><option value=\"QB\" selected>QB</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/28638/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"28638\" data-ys-playernote-view=\"notes\" id=\"playernote-28638\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/28638\" target=\"_blank\">Trevor Siemian</a> <span class=\"Fz-xxs\">Den - QB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/denver-broncos-los-angeles-chargers-20171022024/\" target=\"sports\">Sun 4:25 pm            @  <a class=\"Inline F-rank-bad\" title=\"LAC gives up the 9th fewest fantasy points to the QB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=QB&ntid=24\">LAC</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-28638-video\" data-video-id=\"6b4a3477-8a99-349e-8fdf-b784bef15747\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >23.80</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >13%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"WR\">WR</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"9274\"><option value=\"WR\" selected>WR</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/9274/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"9274\" data-ys-playernote-view=\"notes\" id=\"playernote-9274\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/9274\" target=\"_blank\">Michael Crabtree</a> <span class=\"Fz-xxs\">Oak - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/kansas-city-chiefs-oakland-raiders-20171019013/\" target=\"sports\">Thu 8:25 pm            vs  <a class=\"Inline F-rank-good\" title=\"KC gives up the 4th most fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=12\">KC</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"<table class='Tst-current Tst-weather-table'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Mostly Cloudy</td>\r\n" + 
				"                            </tr>                                <tr>\r\n" + 
				"                                    <td class='Pend-sm Va-top Nowrap'>Temperature:</td>\r\n" + 
				"                                    <td>62&deg;F</td>\r\n" + 
				"                                </tr>                                <tr>\r\n" + 
				"                                    <td class='Pend-sm Va-top'>Humidity:</td>\r\n" + 
				"                                    <td>71%</td>\r\n" + 
				"                                </tr>                                <tr>\r\n" + 
				"                                    <td class='Pend-sm Va-top Nowrap'>Precipitation:</td>\r\n" + 
				"                                    <td>0%</td>\r\n" + 
				"                                </tr>                                <tr>\r\n" + 
				"                                    <td class='Pend-sm Va-top Nowrap'>Wind Speed:</td>\r\n" + 
				"                                    <td>9mph</td>\r\n" + 
				"                                </tr>                                <tr>\r\n" + 
				"                                    <td class='Pend-sm Va-top Nowrap'>Wind Direction:</td>\r\n" + 
				"                                    <td>West South West</td>\r\n" + 
				"                                </tr></table>\" />&#xe230;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-9274-video\" data-video-id=\"3767824d-d842-30ce-a1e1-4c3b3bf8f9b8\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >10</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >18.12</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >90%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"RB\">RB</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"26777\"><option value=\"RB\" selected>RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/26777/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"26777\" data-ys-playernote-view=\"notes\" id=\"playernote-26777\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/26777\" target=\"_blank\">Chris Thompson</a> <span class=\"Fz-xxs\">Was - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/washington-redskins-philadelphia-eagles-20171023021/\" target=\"sports\">Mon 8:30 pm            @  <a class=\"Inline F-rank-bad\" title=\"PHI gives up the 3rd fewest fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=21\">Phi</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"<table class='Tst-forecast'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Mostly cloudy with a high of 75 °F (23.9 °C) and a low of 58 °F (14.4 °C).</td>\r\n" + 
				"                            </tr></table>\" />&#xe230;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >16.37</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >49%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"TE\">TE</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"24830\"><option value=\"TE\" selected>TE</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/24830/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"24830\" data-ys-playernote-view=\"notes\" id=\"playernote-24830\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/24830\" target=\"_blank\">Kyle Rudolph</a> <span class=\"Fz-xxs\">Min - TE</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/baltimore-ravens-minnesota-vikings-20171022016/\" target=\"sports\">Sun 1:00 pm            vs  <a class=\"Inline F-rank-good\" title=\"BAL gives up the 7th most fantasy points to the TE position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=TE&ntid=33\">Bal</a></a><span class=\"tooltip Tst-dome Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"                    <p>This game is inside a dome stadium.</p>\" />&#xe231;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div >9</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >15.00</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >74%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Fz-xxs Px-xxs\" data-pos=\"W/R/T\">W/R/T</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"23997\"><option value=\"WR\">WR</option><option value=\"W/R/T\" selected>W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/23997/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"23997\" data-ys-playernote-view=\"notes\" id=\"playernote-23997\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/23997\" target=\"_blank\">Demaryius Thomas</a> <span class=\"Fz-xxs\">Den - WR</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\">Questionable</span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/denver-broncos-los-angeles-chargers-20171022024/\" target=\"sports\">Sun 4:25 pm            @  <a class=\"Inline F-rank-good\" title=\"LAC gives up the 9th most fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=24\">LAC</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-23997-video\" data-video-id=\"0f4f570e-6c57-3ec0-8422-daf0565412cd\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >5</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >21.18</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >86%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Fz-xxs Px-xxs\" data-pos=\"W/R/T\">W/R/T</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"28429\"><option value=\"WR\">WR</option><option value=\"W/R/T\" selected>W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/28429/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"28429\" data-ys-playernote-view=\"notes\" id=\"playernote-28429\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/28429\" target=\"_blank\">Devin Funchess</a> <span class=\"Fz-xxs\">Car - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/carolina-panthers-chicago-bears-20171022003/\" target=\"sports\">Sun 1:00 pm            @  <a class=\"Inline F-rank-neutral\" title=\"CHI gives up the 15th fewest fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=3\">Chi</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-negative\" data-tooltip=\"<table class='Tst-forecast'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Scattered showers with a high of 65 °F (18.3 °C) and a low of 61 °F (16.1 °C).  There is a 45% chance of precipitation.</td>\r\n" + 
				"                            </tr></table>\" />&#xe232;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-28429-video\" data-video-id=\"43dfedbf-fe53-3ab9-a770-0f14dcf43e9b\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >11</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >15.60</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >54%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Fz-xxs Ptop-sm Lh-1 Px-xxs\" data-pos=\"Q/W/R/T\">Q/W<br/>R/T</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"24967\"><option value=\"QB\">QB</option><option value=\"Q/W/R/T\" selected>Q/W/R/T</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/24967/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"24967\" data-ys-playernote-view=\"notes\" id=\"playernote-24967\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/24967\" target=\"_blank\">Tyrod Taylor</a> <span class=\"Fz-xxs\">Buf - QB</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/tampa-bay-buccaneers-buffalo-bills-20171022002/\" target=\"sports\">Sun 1:00 pm            vs  <a class=\"Inline F-rank-good\" title=\"TB gives up the 2nd most fantasy points to the QB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=QB&ntid=27\">TB</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"<table class='Tst-forecast'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Mostly cloudy with a high of 74 °F (23.3 °C) and a low of 56 °F (13.3 °C).</td>\r\n" + 
				"                            </tr></table>\" />&#xe230;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-24967-video\" data-video-id=\"2864d510-b425-39b8-a6cc-a5b62160c9bb\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >6</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >26.44</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >22%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"26804\"><option value=\"RB\">RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\" selected>BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/26804/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"26804\" data-ys-playernote-view=\"notes\" id=\"playernote-26804\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/26804\" target=\"_blank\">Latavius Murray</a> <span class=\"Fz-xxs\">Min - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/baltimore-ravens-minnesota-vikings-20171022016/\" target=\"sports\">Sun 1:00 pm            vs  <a class=\"Inline F-rank-good\" title=\"BAL gives up the 7th most fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=33\">Bal</a></a><span class=\"tooltip Tst-dome Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"                    <p>This game is inside a dome stadium.</p>\" />&#xe231;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-26804-video\" data-video-id=\"22d3ecf1-6c6b-31f9-905c-8566afbfd661\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >9</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >13.51</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >9%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"25807\"><option value=\"RB\">RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\" selected>BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/25807/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"25807\" data-ys-playernote-view=\"notes\" id=\"playernote-25807\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/25807\" target=\"_blank\">Lamar Miller</a> <span class=\"Fz-xxs\">Hou - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"> Bye</span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div >7</div></td><td colspan=\"3\" style=\"text-align: center;\" style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >Bye</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"28691\"><option value=\"WR\">WR</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\" selected>BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/28691/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"28691\" data-ys-playernote-view=\"notes\" id=\"playernote-28691\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/28691\" target=\"_blank\">Tyrell Williams</a> <span class=\"Fz-xxs\">LAC - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/denver-broncos-los-angeles-chargers-20171022024/\" target=\"sports\">Sun 4:25 pm            vs  <a class=\"Inline F-rank-bad\" title=\"DEN gives up the 6th fewest fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=7\">Den</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-28691-video\" data-video-id=\"a8a52e04-fb52-39d3-8bd2-02d207f5df88\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >9</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >12.45</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >23%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"30182\"><option value=\"WR\">WR</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\" selected>BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/30182/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"30182\" data-ys-playernote-view=\"notes\" id=\"playernote-30182\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/30182\" target=\"_blank\">Cooper Kupp</a> <span class=\"Fz-xxs\">LAR - WR</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/arizona-cardinals-los-angeles-rams-20171022014/\" target=\"sports\">Sun 1:00 pm            vs  <a class=\"Inline F-rank-good\" title=\"ARI gives up the 5th most fantasy points to the WR position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=WR&ntid=22\">Ari</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-30182-video\" data-video-id=\"41e4e31e-fc8d-3359-80d0-d7bacb9bf6fc\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >8</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >12.78</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >12%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"24932\"><option value=\"RB\">RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\" selected>BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/24932/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-old\" data-ys-playerid=\"24932\" data-ys-playernote-view=\"notes\" id=\"playernote-24932\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/24932\" target=\"_blank\">Jacquizz Rodgers</a> <span class=\"Fz-xxs\">TB - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/tampa-bay-buccaneers-buffalo-bills-20171022002/\" target=\"sports\">Sun 1:00 pm            @  <a class=\"Inline F-rank-bad\" title=\"BUF gives up the 8th fewest fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=2\">Buf</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"<table class='Tst-forecast'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Mostly cloudy with a high of 74 °F (23.3 °C) and a low of 56 °F (13.3 °C).</td>\r\n" + 
				"                            </tr></table>\" />&#xe230;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ><span class=\"ysf-player-video-link\"><a href=\"#\" class=\"Overlay-trigger yfa-icon yfa-video-forecast video-new Mend-xs\" data-overlay-name=\"video-forecast\" data-video-url=\"/f1/video_forecast_dynamic\" id=\"player-24932-video\" data-video-id=\"aeb14520-9112-3973-9417-b13dac4157a5\">Video Forecast</a></span></div></td><td class=\"Alt Ta-c Bdrstart\"><div >1</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >7.28</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >2%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"IR\">IR</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"30362\"><option value=\"RB\">RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option><option value=\"IR\" selected>IR</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/30362/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-old\" data-ys-playerid=\"30362\" data-ys-playernote-view=\"notes\" id=\"playernote-30362\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/30362\" target=\"_blank\">Chris Carson</a> <span class=\"Fz-xxs\">Sea - RB</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\">IR</span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/seattle-seahawks-new-york-giants-20171022019/\" target=\"sports\">Sun 4:25 pm            @  <a class=\"Inline F-rank-neutral\" title=\"NYG gives up the 17th most fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=19\">NYG</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"<table class='Tst-forecast'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Mostly cloudy with a high of 73 °F (22.8 °C) and a low of 54 °F (12.2 °C).</td>\r\n" + 
				"                            </tr></table>\" />&#xe230;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div >6</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >0%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"IR\">IR</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"28474\"><option value=\"RB\">RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option><option value=\"IR\" selected>IR</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/28474/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"28474\" data-ys-playernote-view=\"notes\" id=\"playernote-28474\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/28474\" target=\"_blank\">David Johnson</a> <span class=\"Fz-xxs\">Ari - RB</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\">IR</span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/arizona-cardinals-los-angeles-rams-20171022014/\" target=\"sports\">Sun 1:00 pm            @  <a class=\"Inline F-rank-good\" title=\"LAR gives up the most fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=14\">LAR</a></a></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div >8</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >8%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Last bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"IR\">IR</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"9560\"><option value=\"RB\">RB</option><option value=\"W/R/T\">W/R/T</option><option value=\"Q/W/R/T\">Q/W/R/T</option><option value=\"BN\">BN</option><option value=\"IR\" selected>IR</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/players/9560/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-recent\" data-ys-playerid=\"9560\" data-ys-playernote-view=\"notes\" id=\"playernote-9560\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/players/9560\" target=\"_blank\">Danny Woodhead</a> <span class=\"Fz-xxs\">Bal - RB</span> <span class=\"F-icon Fz-xs Cur-p\" title=\"This player is a keeper.\">&#xe03e;</span></div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\">IR</span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/baltimore-ravens-minnesota-vikings-20171022016/\" target=\"sports\">Sun 1:00 pm            @  <a class=\"Inline F-rank-bad\" title=\"MIN gives up the 2nd fewest fantasy points to the RB position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=RB&ntid=16\">Min</a></a><span class=\"tooltip Tst-dome Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"                    <p>This game is inside a dome stadium.</p>\" />&#xe231;</span></span></div>\r\n" + 
				"        </div></div></td><td style=\"width: 14px;\" class=\"Ta-c Bdrstart\"><div ></div></td><td class=\"Alt Ta-c Bdrstart\"><div >10</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >1%</div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr></tbody></table></div><div id=\"statTable1-wrap\" class=\"tablewrap\" data-pos-type=\"DT\">  <table class=\"Table-plain Table Table-px-med Table-mid Datatable Ta-center Tz-xxs ysf-rosterswapper table-scroll\" id=\"statTable1\">\r\n" + 
				"    <caption class=\"Hidden-accessible\"><span class=\"Hidden-accessible\">Mooresville Bombers's Defense/Special Teams roster for week 7. <details>To edit your roster using the keyboard, press tab to select an editable row, enter to edit the row, and use the up and down arrows to select an available destination.</details></span></caption><thead><tr class=\"First\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >&nbsp;</div></th><th style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden\"><div >&nbsp;</div></th><th style=\"width: 230px;\" class=\"Alt Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">&nbsp;</div></th><th title=\"Bye\" class=\"\"><div >&nbsp;</div></th><th title=\"\" colspan=\"3\" class=\"Alt\"><div >Fantasy</div></th><th title=\"\" class=\"\"><div >&nbsp;</div></th><th title=\"\" colspan=\"2\" class=\"Alt\"><div >Tackles</div></th><th title=\"\" colspan=\"2\" class=\"Alt Last\"><div >Turnovers</div></th><th title=\"Touchdowns\" class=\"Alt\"><div >TD</div></th><th title=\"Miscellaneous\" colspan=\"2\" class=\"\"><div >Misc</div></th><th title=\"Return\" class=\"\"><div >Ret</div></th><th style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></th></tr><tr class=\"Alt Last\"><th style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div >Pos</div></th><th style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden\"><div >Edit</div></th><th style=\"width: 230px;\" class=\"Alt Ta-start player\"><div  style=\"width: 230px;\" class=\"Ov-h\">Defense/Special Teams</div></th><th title=\"\" class=\"Ta-c\"><div >Bye</div></th><th title=\"\" style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >Fan Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >Proj Pts</div></th><th title=\"\" style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >% Start</div></th><th title=\"Points Allowed\" class=\"Ta-end\"><div >Pts vs.</div></th><th title=\"Sack\" class=\"Alt Ta-end\"><div >Sack</div></th><th title=\"Safety\" class=\"Ta-end\"><div >Safe</div></th><th title=\"Interception\" class=\"Alt Ta-end\"><div >Int</div></th><th title=\"Fumble Recovery\" class=\"Ta-end\"><div >Fum Rec</div></th><th title=\"Touchdown\" class=\"Alt Ta-end\"><div >TD</div></th><th title=\"Block Kick\" class=\"Ta-end\"><div >Blk Kick</div></th><th title=\"Defensive Yards Allowed\" class=\"Alt Ta-end\"><div >Yds Allow</div></th><th title=\"Kickoff and Punt Return Touchdowns\" class=\"Last Ta-end\"><div >TD</div></th><th style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></th></tr></thead><tbody><tr class=\"First\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"DEF\">DEF</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"100014\"><option value=\"DEF\" selected>DEF</option><option value=\"BN\">BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/teams/lar/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-old\" data-ys-playerid=\"100014\" data-ys-playernote-view=\"notes\" id=\"playernote-100014\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/teams/lar\" target=\"_blank\">Los Angeles</a> <span class=\"Fz-xxs\">LAR - DEF</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/arizona-cardinals-los-angeles-rams-20171022014/\" target=\"sports\">Sun 1:00 pm            vs  <a class=\"Inline F-rank-neutral\" title=\"ARI gives up the 14th most fantasy points to the DEF position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=DEF&ntid=22\">Ari</a></a></span></div>\r\n" + 
				"        </div></div></td><td class=\"Ta-c Bdrstart\"><div >8</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >21.51</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >37%</div></td><td class=\"Ta-end Bdrstart\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Alt\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"DEF\">DEF</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div >&nbsp;<input type=hidden name=\"0_DEF\" value=\"DEF\"><span class=\"pos-label\">DEF</span></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><div class=\"Nowrap emptyplayer Inlineblock\"><span>(Empty)</span></div>  </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"> </span></div>\r\n" + 
				"        </div></div></td><td class=\"Ta-c Bdrstart\"><div ></div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >0.00</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >0%</div></td><td class=\"Ta-end Bdrstart\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr><tr class=\"Last bench\"><td style=\"min-width: 42px; width: 42px;\" class=\"Alt Ta-c pos headcol\"><div ><span class=\"pos-label Btn-primary Miwpx-40 Mawpx-40 Px-sm\" data-pos=\"BN\">BN</span></div></td><td style=\"min-width: 60px; width: 60px;\" class=\"Ta-start edit Js-hidden Bdrstart\"><div ><select name=\"100004\"><option value=\"DEF\">DEF</option><option value=\"BN\" selected>BN</option></select></div></td><td style=\"width: 230px;\" class=\"Alt Ta-start player Bdrstart\"><div  style=\"width: 230px;\" class=\"Ov-h\">        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"player-status Grid-u Lh-xs Mend-xs\"><a href=\"https://sports.yahoo.com/nfl/teams/cin/news\" target=\"_blank\" class=\"playernote Ta-start yfa-icon Z-1 yfa-rapid-beacon yfa-rapid-module-playernotes playernote-old\" data-ys-playerid=\"100004\" data-ys-playernote-view=\"notes\" id=\"playernote-100004\"><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></a></span>\r\n" + 
				"          <div class=\"ysf-player-name Nowrap Grid-u Relative Lh-xs Ta-start\"><a class=\"Nowrap name F-link\" href=\"https://sports.yahoo.com/nfl/teams/cin\" target=\"_blank\">Cincinnati</a> <span class=\"Fz-xxs\">Cin - DEF</span> </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"Grid-bind-end\">\r\n" + 
				"          <span class=\"ysf-player-status F-injury Fz-xxs Grid-u Lh-xs Mend-xs\"></span>\r\n" + 
				"          <div class=\"ysf-player-detail Nowrap Grid-u Fz-xxs Lh-xs Ta-start\"><span class=\"ysf-game-status \"><a class=\"F-reset\" href=\"https://sports.yahoo.com/nfl/cincinnati-bengals-pittsburgh-steelers-20171022023/\" target=\"sports\">Sun 4:25 pm            @  <a class=\"Inline F-rank-neutral\" title=\"PIT gives up the 13th fewest fantasy points to the DEF position.\" target=\"_blank\" href=\"/f1/686943/pointsagainst?pos=DEF&ntid=23\">Pit</a></a><span class=\"tooltip Tst-weather Inlineblock Va-mid Mstart-sm Fz-sm F-icon F-shade2\" data-tooltip=\"<table class='Tst-forecast'>                            <tr>\r\n" + 
				"                                <td class='Pend-sm Va-top Nowrap'>Forecast:</td>\r\n" + 
				"                                <td>Mostly cloudy with a high of 75 °F (23.9 °C) and a low of 52 °F (11.1 °C).</td>\r\n" + 
				"                            </tr></table>\" />&#xe230;</span></span></div>\r\n" + 
				"        </div></div></td><td class=\"Ta-c Bdrstart\"><div >6</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap Bdrstart\"><div >&#8211;</div></td><td style=\"width: 30px;\" class=\"Ta-end Nowrap\"><div >19.91</div></td><td style=\"width: 30px;\" class=\"Alt Ta-end Nowrap\"><div >6%</div></td><td class=\"Ta-end Bdrstart\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Alt Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td class=\"Last Ta-end\"><div ><span class=\"F-faded\">-</span></div></td><td style=\"padding-left: 5px;\" class=\"Alt No-p Spacer\"><div ></div></td></tr></tbody></table></div></section><div class=\"Ov-h\">\r\n" + 
				"<div class=\"Fl-start\">\r\n" + 
				"  <span class=\"Ta-end P-med Fz-sm Inlineblock Va-base\" style=\"width: 350px\">\r\n" + 
				"    Total Week 7 Fantasy Points:    <strong class=\"Pstart-lg\">0.00</strong>\r\n" + 
				"  </span>\r\n" + 
				"  <span class=\"Inlineblock Py-med Px-lg Fz-sm Va-base\">\r\n" + 
				"        <span class=\"proj-pts-week\">158.02</span> (Projected)  </span>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"    <div id=\"dnd-status\" class=\"Fl-end P-med Fz-sm\">\r\n" + 
				"  Roster Edit Mode:\r\n" + 
				"  <label id=\"dnd\"><input type=\"radio\" name=\"ret\" value=\"swap\"  checked> Swap Mode </label>\r\n" + 
				"  <label id=\"classic\"><input type=\"radio\" name=\"ret\" value=\"classic\" > Classic Mode</label>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div class=\"ysf-buttonbar Px-lg Py-med Cl-start\" id=\"buttonbar\">\r\n" + 
				" <input type=\"hidden\" name=\"week\" value=\"7\">\r\n" + 
				" <input type=\"hidden\" name=\"stat1\" value=\"S\">\r\n" + 
				" <input type=\"hidden\" name=\"stat2\" value=\"W\">\r\n" + 
				" <input type=\"hidden\" name=\"crumb\" value=\"fcUJCglfW8q\">\r\n" + 
				" <input type=\"submit\" name=\"jsubmit\" value=\"Save Changes\" class=\"Btn Btn-primary roster-save-btn\">\r\n" + 
				" <input type=\"reset\" name=\"cancel\" value=\"Cancel\" class=\"Btn roster-cancel-btn\">\r\n" + 
				"  <p class=\"rostersave-msg Inlineblock Px-med Fz-xs Va-mid Ta-start\"> </p>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"    </form>\r\n" + 
				"</div>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"\r\n" + 
				".ysf-stat-note {\r\n" + 
				"    z-index: 10000;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<section class=\"Thm-inherit\">\r\n" + 
				"<div id=\"ysf-stat-notes\">\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-28638\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-28638\"></a>\r\n" + 
				"                    <h2>Trevor Siemian Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-9274\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-9274\"></a>\r\n" + 
				"                    <h2>Michael Crabtree Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-26777\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-26777\"></a>\r\n" + 
				"                    <h2>Chris Thompson Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-24830\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-24830\"></a>\r\n" + 
				"                    <h2>Kyle Rudolph Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-23997\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-23997\"></a>\r\n" + 
				"                    <h2>Demaryius Thomas Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-28429\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-28429\"></a>\r\n" + 
				"                    <h2>Devin Funchess Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-24967\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-24967\"></a>\r\n" + 
				"                    <h2>Tyrod Taylor Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-26804\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-26804\"></a>\r\n" + 
				"                    <h2>Latavius Murray Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-25807\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-25807\"></a>\r\n" + 
				"                    <h2>Lamar Miller Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-28691\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-28691\"></a>\r\n" + 
				"                    <h2>Tyrell Williams Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-30182\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-30182\"></a>\r\n" + 
				"                    <h2>Cooper Kupp Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-24932\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-24932\"></a>\r\n" + 
				"                    <h2>Jacquizz Rodgers Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-30362\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-30362\"></a>\r\n" + 
				"                    <h2>Chris Carson Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-28474\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-28474\"></a>\r\n" + 
				"                    <h2>David Johnson Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-9560\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-9560\"></a>\r\n" + 
				"                    <h2>Danny Woodhead Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-100014\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-100014\"></a>\r\n" + 
				"                    <h2>Los Angeles Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-0_DEF\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-0_DEF\"></a>\r\n" + 
				"                    <h2>--empty-- Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Thm-inherit Tooltip No-m No-p ysf-stat-note pps hidden Grid-u-1-3 Absolute Grid-h-mid\" id=\"pps-100004\">\r\n" + 
				"            <div class=\"F-icon Fz-xxl Grid-u F-overlay arrow F-shade2\">\r\n" + 
				"                &#xe006;            </div>\r\n" + 
				"            <div class=\"Bg-overlay Bdr-radius Grid-u-11-12 Box-shadow P-med\">\r\n" + 
				"                <div class=\"Hd\">\r\n" + 
				"                    <a name=\"pps-100004\"></a>\r\n" + 
				"                    <h2>Cincinnati Stat Breakdown</h2>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"Bd No-p\">\r\n" + 
				"                    <p>No stats for this player.</p>                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"    </div>\r\n" + 
				"</section>\r\n" + 
				"<section id=\"video-forecast\" class=\"Mod Overlay yui3-overlay-content-dark\" data-overlay-name=\"video-forecast\" data-overlay-width=\"1020px\"> \r\n" + 
				"    <header class=\"Hd Px-xxl Py-sm F-shade3\">\r\n" + 
				"        <div class=\"Grid-h-mid\">\r\n" + 
				"            <div class=\"Grid-u\">\r\n" + 
				"                <span class=\"Logo Block Wpx-90 T-hidden\">Yahoo Fantasy</span>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Grid-u F-header Fz-xl Fw-200 Mstart-lg C-w\">\r\n" + 
				"                <span>Fearless Forecast</span>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"Grid-u Va-mid Ta-end Mstart-xxl\">\r\n" + 
				"                <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-med Mtop-sm\">&#xe009;</span>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </header>\r\n" + 
				"    <div class=\"Bd Player-bg Grid-h-top\">\r\n" + 
				"            <div id=\"video-forecast-container\" class=\"Grid-u\" style=\"width: 700px; height: 380px;\"></div>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"    YSF.use('event', 'ysf-video-player', function (Y) {\r\n" + 
				"      Y.Fantasy.VideoPlayer.init({\"video\":{\"width\":700,\"height\":380,\"config\":{\"site\":\"fantasy\",\"region\":\"US\",\"lang\":\"en-US\",\"autoplay\":true,\"pageSpaceId\":null,\"playlist\":{\"videoRecommendations\":false,\"mediaItems\":[]},\"playlistUI\":{\"show\":true,\"position\":\"bottom\",\"theme\":\"dark\"},\"YVAP\":{\"accountId\":\"82\",\"playContext\":\"nflfantasy\",\"timeout\":5000,\"adsReady\":true},\"logoOverlay\":\"bottomLeft\"}},\"id\":\"video-forecast\",\"overlay\":{\"width\":1020,\"title\":\"Fearless Forecast\"},\"meta\":{\"width\":300}});\r\n" + 
				"    });\r\n" + 
				"</script>        <div class=\"player-meta Grid-u Px-med F-bright\" style=\"width: 300px\">\r\n" + 
				"            <h2 class=\"player-meta-title No-mtop Fz-lg Mbot-lg\"></h2>\r\n" + 
				"            <p class=\"player-meta-provider Mbot-lg\">\r\n" + 
				"                by <a href=\"\" class=\"player-meta-provider-link F-bright\"></a>\r\n" + 
				"            </p>\r\n" + 
				"            <p class=\"player-meta-desc Fz-med\"></p>\r\n" + 
				"        </div>\r\n" + 
				"            </div>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<section class=\"Mod Thm-inherit tablelegend No-mend\" ><div class=\"Bd Grid-2col Grid-spread-mid Grid-full Bdrtop Mtop-xl\"><div class=\"Grid-u-1-4\">  <ul class=\"\" id=\"legend\">\r\n" + 
				"  <li class=\"Inlineblock Pend-xxl\">\r\n" + 
				"    <a href=\"#\" class=\" yfa-overlay-trigger\" data-overlay-name=\"legend\" id=\"0\">Legend</a>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Inlineblock Pend-xxl\">\r\n" + 
				"    <a href=\"#\" class=\" yfa-overlay-trigger\" data-overlay-name=\"stats_legend\" id=\"1\">Stats</a>\r\n" + 
				"  </li>\r\n" + 
				"  <li class=\"Inlineblock Pend-xxl\">\r\n" + 
				"    <a href=\"#\" class=\" yfa-overlay-trigger\" data-overlay-name=\"positions_legend\" id=\"2\">Positions</a>\r\n" + 
				"  </li>\r\n" + 
				"  </ul>\r\n" + 
				"</div> <div class=\"Grid-u-3-4 Ta-end\"><div class=\"official-stats Fz-xxs\">Week 7 stats may change if <a href=\"/f1/686943/statcorrections\">stat corrections</a> are applied by Thursday, Oct 26. All game times are shown in EDT.</div></div></div></section>\r\n" + 
				"<section class=\"Thm-override Thm-frosted-glass\">\r\n" + 
				"\r\n" + 
				"<section id=\"legend\" class=\"Mod No-m No-p yfa-overlay Bg-overlay\" data-overlay-name=\"legend\">\r\n" + 
				"     <header class=\"Hd Px-xxl Relative\">\r\n" + 
				"        <h2 class=\"F-header Ptop-xxl\">Details Legend</h2>\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\" href=\"\">&#xe009;</span>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <section class=\"Bd Thm-inherit Px-xxl Py-lg\" style=\"overflow-y: auto; height: 400px;\">\r\n" + 
				"        <table class=\"Table Table-plain Fz-xxs\" >\r\n" + 
				"<tr class=\"Bg-shade2\"><td colspan=\"2\" class=\"yspdetailttl\"><b>Notes</b></td></tr>\r\n" + 
				"<tr><td>Rank: Projected</td><td>Player's 2017 projected season rank. Projection data provided by Yahoo Sports.</td></tr>\r\n" + 
				"<tr><td>Rank: Actual</td><td>Player's ranking based on stat filter selected.</td></tr>\r\n" + 
				"<tr><td><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-new\" title=\"New player notes\" aria-label=\"button\">New Player Note</span></td><td>New player notes in the last 24 hours. Click to view notes and other information.</td></tr>\r\n" + 
				"<tr><td><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-recent\" title=\"Player notes\" aria-label=\"button\">Player Note</span></td><td>Player notes available. Click to view notes and other information.</td></tr>\r\n" + 
				"<tr><td><span class=\"ysf-player-icon ysf-player-icon-notes yfa-icon playernote-old\" title=\"No new player Notes\" aria-label=\"button\">No new player Notes</span></td><td>No new player notes available. Click to view other information.</td></tr>\r\n" + 
				"<tr><td><span class=\"yfa-icon video-new\">Video Playlist</span></td><td>New Fantasy Forecast video. Click to view video.</td></tr>\r\n" + 
				"<tr><td class=\"Va-top\">*</td><td>This player's Fantasy Point total includes points not displayed on your roster page. These points come from categories not normally associated with this player's position (e.g., a kicker who throws a touchdown pass, a running back who blocks a kick, etc.)</td></tr>\r\n" + 
				"<tr class=\"Bg-shade2\"><td colspan=\"2\" class=\"yspdetailttl\"><b>Player Status</b></td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">D</td><td>Doubtful</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">NA</td><td>Inactive: Coach's Decision or Not on Roster</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">IR</td><td>Injured Reserve</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">IR-R</td><td>Injured Reserve - Designated for Return</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">O</td><td>Out</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">PUP-P</td><td>Physically Unable to Perform (Preseason)</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">PUP-R</td><td>Physically Unable to Perform (Regular-season)</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">P</td><td>Probable</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">Q</td><td>Questionable</td></tr>\r\n" + 
				"<tr><td class=\"F-injury\">SUSP</td><td>Suspended</td></tr>\r\n" + 
				"<tr class=\"Bg-shade2\"><td colspan=\"2\" class=\"yspdetailttl\"><b>Action</b></td></tr>\r\n" + 
				"<tr><td><a title=\"Add Player\" href=\"#\" class=\" F-icon Fz-xs F-positive T-action-icon-add\">&#xe035;</a></td><td>Add Player</td></tr>\r\n" + 
				"<tr><td><a title=\"The add action is disabled\" href=\"#\" class=\"noactionda-show F-icon Fz-xs F-disabled T-action-icon-disabled-add\">&#xe035;</a></td><td>Add Player functionality is disabled</td></tr>\r\n" + 
				"<tr><td><a title=\"No moves left\" href=\"#\" class=\"noactionna-show F-icon Fz-xs F-negative T-action-icon-no-add\">&#xe035;</a></td><td>No more roster moves available</td></tr>\r\n" + 
				"<tr><td><a title=\"Drop Player\" href=\"#\" class=\" F-icon Fz-xs F-negative T-action-icon-drop\">&#xe033;</a></td><td>Drop Player</td></tr>\r\n" + 
				"<tr><td><a title=\"Player is on can't cut list\" href=\"#\" class=\"noactioncc-show F-icon Fz-xs F-negative T-action-icon-cantcut\">&#xe038;</a></td><td>Player on Can't Cut list</td></tr>\r\n" + 
				"<tr><td><a title=\"Propose Trade\" href=\"#\" class=\" F-icon Fz-xs F-trade T-action-icon-trade\">&#xe037;</a></td><td>Propose Trade</td></tr>\r\n" + 
				"<tr><td><a title=\"No trades left\" href=\"#\" class=\"noactionnt-show F-icon Fz-xs F-disabled T-action-icon-notrade\">&#xe037;</a></td><td>No more trades available</td></tr>\r\n" + 
				"<tr><td><a title=\"The trade action is disabled\" href=\"#\" class=\"noactiondt-show F-icon Fz-xs F-disabled T-action-icon-disabled-trade\">&#xe037;</a></td><td>Trade functionality is disabled</td></tr>\r\n" + 
				"<tr><td><a title=\"Actions locked by commissioner\" href=\"#\" class=\"noactionl-show F-icon Fz-xs F-disabled T-action-icon-locked\">&#xe046;</a></td><td>Actions locked by commissioner</td></tr>\r\n" + 
				"<tr><td><a title =\"Add to Watch List\" href=\"#\" class=\"watchn F-icon Fz-sm F-watch\"  name=\"w-_0-0\">&#xe061;</a></td><td>Add player to Watch List</td></tr>\r\n" + 
				"<tr><td><a title =\"Remove from Watch List\" href=\"#\" class=\"watchw F-icon Fz-sm F-watch\"  name=\"w-0-0\">&#xe023;</a></td><td>Remove player from Watch List</td></tr>\r\n" + 
				"<tr><td><a title =\"Watch List is not available\" href=\"\" class=\"noactiondw-notinleague disabled F-icon Fz-sm F-disabled\"  name=\"w-0-0\">&#xe061;</a></td><td>Watch List is not available</td></tr>\r\n" + 
				"</table>\r\n" + 
				"    </section>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<section id=\"stats_legend\" class=\"Mod No-m No-p yfa-overlay Bg-overlay\" data-overlay-name=\"stats_legend\">\r\n" + 
				"     <header class=\"Hd Px-xxl Relative\">\r\n" + 
				"        <h2 class=\"F-header Ptop-xxl\">Stat Categories</h2>\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\" href=\"\">&#xe009;</span>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <section class=\"Bd Thm-inherit Px-xxl Py-lg\" style=\"overflow-y: auto; height: 400px;\">\r\n" + 
				"        <table class=\"Table Table-plain Fz-xxs\" >\r\n" + 
				"<tr class=\"Bg-shade Fz-xs\"><td colspan=\"2\">Offense &amp; Kickers:</td></tr>\r\n" + 
				"<tr class=\"Bg-shade\"><td><b>Abbreviation</b></td><td><b>What it Means</b></td></tr>\r\n" + 
				"<tr><td>Pass Att</td><td>Passing Attempts</td></tr>\r\n" + 
				"<tr><td>Comp</td><td>Completions</td></tr>\r\n" + 
				"<tr><td>Inc</td><td>Incomplete Passes</td></tr>\r\n" + 
				"<tr><td>Pass Yds</td><td>Passing Yards</td></tr>\r\n" + 
				"<tr><td>Pass TD</td><td>Passing Touchdowns</td></tr>\r\n" + 
				"<tr><td>Int</td><td>Interceptions Thrown</td></tr>\r\n" + 
				"<tr><td>Sack</td><td>Times Sacked</td></tr>\r\n" + 
				"<tr><td>Rush Att</td><td>Rushing Attempts</td></tr>\r\n" + 
				"<tr><td>Rush Yds</td><td>Rushing Yards</td></tr>\r\n" + 
				"<tr><td>Rush TD</td><td>Rushing Touchdowns</td></tr>\r\n" + 
				"<tr><td>Rec</td><td>Receptions</td></tr>\r\n" + 
				"<tr><td>Rec Yds</td><td>Receiving Yards</td></tr>\r\n" + 
				"<tr><td>Rec TD</td><td>Receiving Touchdowns</td></tr>\r\n" + 
				"<tr><td>Ret Yds</td><td>Return Yards</td></tr>\r\n" + 
				"<tr><td>Ret TD</td><td>Return Touchdowns</td></tr>\r\n" + 
				"<tr><td>Off Fum Ret TD</td><td>Offensive Fumble Return Touchdowns</td></tr>\r\n" + 
				"<tr><td>2-PT</td><td>Two-point Conversions</td></tr>\r\n" + 
				"<tr><td>Fum</td><td>Fumble</td></tr>\r\n" + 
				"<tr><td>Fum Lost</td><td>Fumble Lost</td></tr>\r\n" + 
				"<tr><td>FG</td><td>Field Goal</td></tr>\r\n" + 
				"<tr><td>FGM</td><td>Field Goal Missed</td></tr>\r\n" + 
				"<tr class=\"Bg-shade Fz-xs\"><td colspan=\"2\">Defense:</td></tr>\r\n" + 
				"<tr class=\"Bg-shade\"><td><b>Abbreviation</b></td><td><b>What it Means</b></td></tr>\r\n" + 
				"<tr><td>Pts Allow</td><td>Points Allowed</td></tr>\r\n" + 
				"<tr><td>Tack Solo</td><td>Solo Tackles</td></tr>\r\n" + 
				"<tr><td>Tack Ast</td><td>Assisted Tackles</td></tr>\r\n" + 
				"<tr><td>Pass Def</td><td>Passes Defended</td></tr>\r\n" + 
				"<tr><td>Sack</td><td>Sacks Recorded</td></tr>\r\n" + 
				"<tr><td>Int</td><td>Interceptions Made</td></tr>\r\n" + 
				"<tr><td>Fum Rec</td><td>Fumbles Recovered</td></tr>\r\n" + 
				"<tr><td>Fum Force</td><td>Fumbles Forced</td></tr>\r\n" + 
				"<tr><td>TD</td><td>Touchdowns</td></tr>\r\n" + 
				"<tr><td>Safe</td><td>Safeties</td></tr>\r\n" + 
				"<tr><td>Blk Kick</td><td>Blocked Kicks</td></tr>\r\n" + 
				"<tr><td>Ret Yds</td><td>Return Yards</td></tr>\r\n" + 
				"<tr><td>Ret TD</td><td>Return Touchdowns</td></tr>\r\n" + 
				"</table>    </section>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"<section id=\"positions_legend\" class=\"Mod No-m No-p yfa-overlay Bg-overlay\" data-overlay-name=\"positions_legend\">\r\n" + 
				"     <header class=\"Hd Px-xxl Relative\">\r\n" + 
				"        <h2 class=\"F-header Ptop-xxl\">Positions Legend</h2>\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\" href=\"\">&#xe009;</span>\r\n" + 
				"    </header>\r\n" + 
				"\r\n" + 
				"    <section class=\"Bd Thm-inherit Px-xxl Py-lg\" style=\"overflow-y: auto; height: 400px;\">\r\n" + 
				"        <table class=\"Table Table-plain Fz-xxs\" >\r\n" + 
				" <tr class=\"Bg-shade\">\r\n" + 
				"  <td ><b>Pos</b></td>\r\n" + 
				"  <td><b>What it Means</b></td>\r\n" + 
				"  <td><b>Who is Eligible</b></td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>QB</td>\r\n" + 
				"  <td>Quarterback</td>\r\n" + 
				"  <td>Only quarterbacks</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>RB</td>\r\n" + 
				"  <td>Running Back</td>\r\n" + 
				"  <td>Only running backs</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>WR</td>\r\n" + 
				"  <td>Wide Receiver</td>\r\n" + 
				"  <td>Only wide receivers</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>TE</td>\r\n" + 
				"  <td>Tight End</td>\r\n" + 
				"  <td>Only tight ends</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>W/R</td>\r\n" + 
				"  <td>Wide Receiver/Running Back</td>\r\n" + 
				"  <td>Any wide receiver or running back</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>W/T</td>\r\n" + 
				"  <td>Wide Receiver/Tight End</td>\r\n" + 
				"  <td>Any wide receiver or tight end</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>Q/WR/RB/TE</td>\r\n" + 
				"  <td>Quarterback/Wide Receiver/Running Back/Tight End</td>\r\n" + 
				"  <td>Any quarterback, wide receiver, running back or tight end</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>WR/RB/TE</td>\r\n" + 
				"  <td>Wide Receiver/Running Back/Tight End</td>\r\n" + 
				"  <td>Any wide receiver, running back or tight end</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>K</td>\r\n" + 
				"  <td>Kicker</td>\r\n" + 
				"  <td>Only kickers</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>DEF</td>\r\n" + 
				"  <td>Defensive Team</td>\r\n" + 
				"  <td>Only team defenses</td>\r\n" + 
				" </tr>\r\n" + 
				"\r\n" + 
				" <tr>\r\n" + 
				"  <td>D</td>\r\n" + 
				"  <td>Defensive Player</td>\r\n" + 
				"  <td>Any defensive player</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>DL</td>\r\n" + 
				"  <td>Defensive Lineman</td>\r\n" + 
				"  <td>Only defensive linemen</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>DB</td>\r\n" + 
				"  <td>Defensive Back</td>\r\n" + 
				"  <td>Only defensive backs</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>LB</td>\r\n" + 
				"  <td>Linebacker</td>\r\n" + 
				"  <td>Only linebackers</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>CB</td>\r\n" + 
				"  <td>Corner Back</td>\r\n" + 
				"  <td>Only corner backs</td>\r\n" + 
				" </tr>\r\n" + 
				"  <tr>\r\n" + 
				"  <td>S</td>\r\n" + 
				"  <td>Safety</td>\r\n" + 
				"  <td>Only safties</td>\r\n" + 
				" </tr>\r\n" + 
				" <tr>\r\n" + 
				"  <td>BN</td>\r\n" + 
				"  <td>Bench</td>\r\n" + 
				"  <td>Any player</td>\r\n" + 
				" </tr>\r\n" + 
				" </table>\r\n" + 
				"    </section>\r\n" + 
				"</section>\r\n" + 
				"\r\n" + 
				"</section>\r\n" + 
				"<section id=\"roster-notice-overlay\" class=\"Thm-inherit Overlay P-xxl\" data-overlay-name=\"roster-notice-overlay\" data-overlay-width=\"350\">\r\n" + 
				"    <div class=\"No-p\">\r\n" + 
				"        <span class=\"ysf-overlay-close F-icon Fz-sm Cur-p Absolute Topend Mend-lg Mtop-lg\">&#xe009; </span>\r\n" + 
				"        <p id=\"roster-notice-overlay-text\"></p>\r\n" + 
				"    </div>\r\n" + 
				"</section>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"var canTime = window.console && console.time;\r\n" + 
				"if(canTime) { console.time(\"boot\"); }\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"YSF.use( \"node-base\", \"ysf-overlay\", \"ysf-rosterswap-manager\", \"ysf-tout\", \"ysf-xhr\", \"ysp-i13n\", \"ysf-ads\", function(Y) {\r\n" + 
				"    if(canTime) { console.time(\"init\"); }  \r\n" + 
				"\r\n" + 
				"    var EV_ROSTER_CHANGED = \"rosterswapmanager:modified\",\r\n" + 
				"        EV_ROSTER_SAVING = \"rostermanager:saving\",\r\n" + 
				"        EV_ROSTER_SAVED = \"rosterswapmanager:saved\",\r\n" + 
				"        EV_ROSTER_SAVE_ERROR = \"rosterswapmanager:saveerror\",\r\n" + 
				"        EV_ROSTER_SAVE_NOTICE = \"rosterswapmanager:savenotice\",\r\n" + 
				"        EV_DIRTY_CHANGE = \"rosterswapmanager:dirtyChange\",\r\n" + 
				"        EV_ROSTER_SAVE_DEFERRED = \"rosterswapmanager:savedeferred\";\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    Y.namespace(\"Roster\");\r\n" + 
				"\r\n" + 
				"    Y.Roster.adPositions = [];\r\n" + 
				"    Y.Roster.adsRegistered = false;\r\n" + 
				"    Y.Roster.saveBtns = Y.all(\".roster-save-btn\");\r\n" + 
				"    Y.Roster.cancelBtns = Y.all(\".roster-cancel-btn\");\r\n" + 
				"    Y.Roster.tout = new Y.Fantasy.Tout();\r\n" + 
				"    Y.Roster.dndStatusNode = Y.one(\"#dnd-status\");\r\n" + 
				"    Y.Roster.teamNotesNode = Y.one('#teamnotes .teamnotes-content');\r\n" + 
				"    Y.Roster.prevUnusedRosterSpots = Y.Roster.teamNotesNode ? (parseInt(Y.Roster.teamNotesNode.getData(\"unused-roster-spots\"), 10) || 0) : 0;\r\n" + 
				"\r\n" + 
				"        \r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"\r\n" + 
				"function nextUpdateInterval() {\r\n" + 
				"  var updateNodes = Y.all(\".rostersave-msg .countdown\"),\r\n" + 
				"      now;\r\n" + 
				"\r\n" + 
				"  if(updateNodes.size()) {\r\n" + 
				"     now = parseInt(updateNodes.item(0).getHTML(), 10);\r\n" + 
				"     now -= 1;\r\n" + 
				"     updateNodes.setHTML(now);\r\n" + 
				"  }\r\n" + 
				"  else {\r\n" + 
				"    stopUpdateInterval();\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function startUpdateInterval() {\r\n" + 
				"  stopUpdateInterval();\r\n" + 
				"  Y.Roster.updateInterval = Y.later(1000, this, nextUpdateInterval, null, true);\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function stopUpdateInterval() {\r\n" + 
				"  if(Y.Roster.updateInterval) {\r\n" + 
				"    Y.Roster.updateInterval.cancel();\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function getOldState() {\r\n" + 
				"  if(Y.Roster.manager && Y.Roster.manager.isDirty()) {\r\n" + 
				"    return Y.Roster.manager.getInternalState();\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function onReset(e) {\r\n" + 
				"  if(Y.Roster.manager && Y.Roster.manager.get(\"dnd\") === false) {\r\n" + 
				"    e.halt();\r\n" + 
				"    Y.Roster.manager.set(\"dirty\", false);\r\n" + 
				"    Y.Fantasy.Mod.reload( \"#team-roster\" );\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function getDndTypeFromDOM() {\r\n" + 
				"  var dndNode, dndType;\r\n" + 
				"\r\n" + 
				"  dndNode = Y.one(\"#dnd-status label#classic input\")\r\n" + 
				"  if(!dndNode || dndNode.get(\"checked\")) {\r\n" + 
				"    dndType = false;\r\n" + 
				"  }\r\n" + 
				"  else {\r\n" + 
				"    dndType = true;\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  return dndType;\r\n" + 
				"    \r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function changeBtnState( enabled ) {\r\n" + 
				"    if(enabled) {\r\n" + 
				"      Y.Roster.saveBtns.removeClass(\"Btn-disabled\");\r\n" + 
				"      Y.Roster.saveBtns.addClass(\"Btn-primary\");\r\n" + 
				"      Y.Roster.cancelBtns.removeClass(\"Btn-disabled\");\r\n" + 
				"    }\r\n" + 
				"    else {\r\n" + 
				"      Y.Roster.saveBtns.addClass(\"Btn-disabled\");\r\n" + 
				"      Y.Roster.saveBtns.removeClass(\"Btn-primary\");\r\n" + 
				"      Y.Roster.cancelBtns.addClass(\"Btn-disabled\");\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"function initRosterListeners() {\r\n" + 
				"    Y.on(EV_ROSTER_CHANGED, function(e) {\r\n" + 
				"      Y.log(\"handling \" + EV_ROSTER_CHANGED);\r\n" + 
				"      Y.Roster.tout.displayTout({\"message\": e.description});\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    Y.on(EV_ROSTER_SAVING, function(e) {\r\n" + 
				"      var messageNodes = Y.all(\".rostersave-msg\");\r\n" + 
				"      if(messageNodes) {\r\n" + 
				"        stopUpdateInterval();\r\n" + 
				"        messageNodes.removeClass(\"saved\");\r\n" + 
				"        messageNodes.removeClass(\"saved-error\");\r\n" + 
				"        messageNodes.setHTML(\"Saving...\");\r\n" + 
				"      }\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    Y.on(EV_ROSTER_SAVED, function(e) {\r\n" + 
				"      var messageNodes = Y.all(\".rostersave-msg\"),\r\n" + 
				"          projected_pts_week = e.projected_pts_week,\r\n" + 
				"          projected_pts_matchup = e.projected_pts_matchup,\r\n" + 
				"          unusedRosterSpots = e.unused_roster_spots || 0;\r\n" + 
				"      \r\n" + 
				"      if(messageNodes) {\r\n" + 
				"        stopUpdateInterval();\r\n" + 
				"        messageNodes.replaceClass(\"saved-error\", \"saved\");\r\n" + 
				"        messageNodes.setHTML(\"All changes saved\");\r\n" + 
				"        if(projected_pts_week) {\r\n" + 
				"          Y.all(\".proj-pts-week\").setHTML(projected_pts_week);\r\n" + 
				"        }\r\n" + 
				"        if(projected_pts_matchup) {\r\n" + 
				"          Y.all(\".proj-pts-matchup\").setHTML(projected_pts_matchup);\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"      \r\n" + 
				"      if(Y.Roster.teamNotesNode) {\r\n" + 
				"        if(Y.Roster.prevUnusedRosterSpots !== unusedRosterSpots) {\r\n" + 
				"          var teamModule = Y.Fantasy.Mod.getModule(\"#teamnotes\");\r\n" + 
				"          var fn = teamModule.get(\"triggerHandler\");\r\n" + 
				"          fn.apply(Y.Roster.teamNotesNode, [null, teamModule]);\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        Y.Roster.prevUnusedRosterSpots = unusedRosterSpots;\r\n" + 
				"      }\r\n" + 
				"      \r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    Y.on(EV_ROSTER_SAVE_ERROR, function(e) {\r\n" + 
				"      var messageNodes = Y.all(\".rostersave-msg\"),\r\n" + 
				"          text = e.title || \"Roster changes unsaved\";\r\n" + 
				"      if(messageNodes) {\r\n" + 
				"        stopUpdateInterval();\r\n" + 
				"        messageNodes.replaceClass(\"saved\", \"saved-error\");\r\n" + 
				"        messageNodes.setHTML(text);\r\n" + 
				"        if(e.code !== \"0\") {\r\n" + 
				"          Y.Roster.tout.displayTout({\"message\": text, \"error\": true});  \r\n" + 
				"        }\r\n" + 
				"        changeBtnState( true );\r\n" + 
				"      }\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    Y.on(EV_ROSTER_SAVE_NOTICE, function(e) {\r\n" + 
				"        Y.one(\"#roster-notice-overlay-text\").setHTML(e.title);\r\n" + 
				"        Y.fire(\"ysfoverlay:open\",{\"overlayname\": \"roster-notice-overlay\"});\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    Y.on(EV_ROSTER_SAVE_DEFERRED, function(e) {\r\n" + 
				"      var messageNodes = Y.all(\".rostersave-msg\"),\r\n" + 
				"          message = \"Saving in <span class='countdown'>{when}</span> seconds. Press Save to submit now.\";\r\n" + 
				"      \r\n" + 
				"      message = Y.Lang.sub(message, e);\r\n" + 
				"      if(messageNodes) {\r\n" + 
				"        messageNodes.removeClass(\"saved\");\r\n" + 
				"        messageNodes.removeClass(\"saved-error\");\r\n" + 
				"        messageNodes.setHTML(message);\r\n" + 
				"        startUpdateInterval();\r\n" + 
				"      }\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    Y.once(\"ysfoverlay:overlayclosed\", function(e) {\r\n" + 
				"      if(e.overlayname === \"whats-this\") {\r\n" + 
				"        if(Y.Roster.manager) {\r\n" + 
				"          Y.Roster.manager.save();\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    if(Y.one(\"#roster-edit-form\")) {\r\n" + 
				"      Y.one(\"#roster-edit-form\").on(\"reset\", onReset);\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function initRosterManager() {\r\n" + 
				"    var rosterState,\r\n" + 
				"        dndType,\r\n" + 
				"        managerNode = Y.one(\".ysf-rosterswap-manager\"),\r\n" + 
				"        rm;\r\n" + 
				"\r\n" + 
				"    managerNode.setAttribute(\"data-is-editable\", \"true\");\r\n" + 
				"\r\n" + 
				"    rosterState = getOldState();\r\n" + 
				"\r\n" + 
				"    if(Y.Roster.manager) {\r\n" + 
				"      \r\n" + 
				"      Y.Roster.manager.destroy();\r\n" + 
				"      Y.Roster.manager = null;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    if(rosterState && Y.Lang.isBoolean( rosterState.dnd) ) {\r\n" + 
				"      dndType = rosterState.dnd;\r\n" + 
				"    }\r\n" + 
				"    else {\r\n" + 
				"      dndType = getDndTypeFromDOM();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    Y.Roster.manager = new Y.Fantasy.RosterSwapManager({\r\n" + 
				"          \"container\": managerNode,\r\n" + 
				"          \"swapmethod\": \"target\",\r\n" + 
				"           \"dllabel\": \"\",\r\n" + 
				"           \"dllong\": \"\",\r\n" + 
				"           \"dlslots\": 0,\r\n" + 
				"           \"dnd\": dndType,\r\n" + 
				"           \"extra_pos\": {\"IR\":{\"label\":\"IR\",\"labelall\":\"IRall\",\"long\":\"Injured Reserve\"}},\r\n" + 
				"           \"useDelegate\": true,\r\n" + 
				"           \"autosave\": true,\r\n" + 
				"           \"throttle\": 0    }, rosterState);\r\n" + 
				"\r\n" + 
				"    Y.Roster.manager.on(EV_DIRTY_CHANGE, function(e) {\r\n" + 
				"      var messageNodes = Y.all(\".rostersave-msg\");\r\n" + 
				"      if(messageNodes && e.newVal ) {\r\n" + 
				"        messageNodes.removeClass(\"saved-error\").removeClass(\"saved\");\r\n" + 
				"        messageNodes.setHTML(\" \");\r\n" + 
				"      }\r\n" + 
				"      changeBtnState( e.newVal );\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    changeBtnState( Y.Roster.manager.get(\"dirty\") );\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function comscoreBeacon(space_id) {\r\n" + 
				"  if(Y.Lang.isFunction(Y.sendComscoreEvent)) {\r\n" + 
				"    Y.sendComscoreEvent(space_id, encodeURIComponent(document.location.href));\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function rotateDarlaAd(space_id) {\r\n" + 
				"  if(!Y.Roster.adPositions.length) {\r\n" + 
				"    return;\r\n" + 
				"  }\r\n" + 
				"  var positions = Y.Roster.adPositions.join(\",\");\r\n" + 
				"  if(!Y.Roster.adsRegistered) {\r\n" + 
				"    setupDarlaAds( Y.Roster.adPositions );\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  YUI.Sports.Ads.subscribe(null, \"now\", {'tablerefresh' : { lv:1, npv:true, sp: space_id, ps:positions } });\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function setupDarlaAds(adPositions) {\r\n" + 
				"  Y.Array.each(adPositions, function(adPos) {\r\n" + 
				"      YUI.Sports.Ads.registerAd(adPos, 'yspad'+adPos);\r\n" + 
				"  });\r\n" + 
				"  Y.Roster.adsRegistered = true;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"function initStatNavListeners() {\r\n" + 
				"    window.onbeforeunload = function(e) { \r\n" + 
				"      var reason = \"You roster contains unsaved changes. Press 'Stay on Page' if you'd like to save your changes before continuing.\";\r\n" + 
				"      if(Y.Roster.manager.get(\"dirty\") && Y.Roster.manager.get(\"nag\")) {\r\n" + 
				"        if (e) {\r\n" + 
				"            e.preventDefault();\r\n" + 
				"            e.returnValue = reason;\r\n" + 
				"        }\r\n" + 
				"        return reason;\r\n" + 
				"      }\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"  Y.on(\"yfamodule:displayudpate\", function(e) {\r\n" + 
				"    var rosterModule = Y.one(\"#team-roster\");\r\n" + 
				"\r\n" + 
				"    if(e.module === rosterModule) {\r\n" + 
				"        initRosterManager();\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    var space_id = YUI.Fantasy.SpaceIds.getSpaceId();\r\n" + 
				"    comscoreBeacon( space_id );\r\n" + 
				"    rotateDarlaAd( space_id );\r\n" + 
				"  });\r\n" + 
				"\r\n" + 
				"  Y.on(\"yfamodule:switchtab\", function(e) {\r\n" + 
				"    var execFunc,\r\n" + 
				"        manager = Y.Roster.manager,\r\n" + 
				"        doSave, doFunc, msHandler;\r\n" + 
				"\r\n" + 
				"    if(manager && Y.one(e.displayTarget) === manager.get(\"container\")) {\r\n" + 
				"      e.halt();\r\n" + 
				"      execFunc = e.func;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"      if(manager.get(\"dnd\")) {\r\n" + 
				"        doSave = manager.isDirty();\r\n" + 
				"        doFunc = !doSave;\r\n" + 
				"      }\r\n" + 
				"      else {\r\n" + 
				"        manager.saveInternalState();\r\n" + 
				"        doSave = false;\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      if(doSave) {\r\n" + 
				"\r\n" + 
				"        manager.once([EV_ROSTER_SAVED,EV_ROSTER_SAVE_ERROR], function() {\r\n" + 
				"          execFunc();\r\n" + 
				"        });\r\n" + 
				"        manager.save();\r\n" + 
				"\r\n" + 
				"      }\r\n" + 
				"      else {\r\n" + 
				"        execFunc();\r\n" + 
				"      }\r\n" + 
				"    } \r\n" + 
				"  });\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"function initDnDSwitch() {\r\n" + 
				"  var dndStatusNode = Y.Roster.dndStatusNode;\r\n" + 
				"\r\n" + 
				"  if (dndStatusNode) {\r\n" + 
				"    \r\n" + 
				"    dndStatusNode.setStyle(\"visibility\", \"visible\");\r\n" + 
				"    \r\n" + 
				"    dndStatusNode.delegate(\"click\", function(e) {\r\n" + 
				"      if(Y.Roster.manager) {\r\n" + 
				"        if(this.get(\"value\") === \"classic\") {\r\n" + 
				"            Y.log(\"switched to classic mode\");\r\n" + 
				"            Y.Roster.manager.set(\"dnd\", false);\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"        else {\r\n" + 
				"            Y.log(\"switched to dnd\");\r\n" + 
				"            Y.Roster.manager.set(\"dnd\", true);\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }, \"input[type=radio]\");\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    initRosterListeners();\r\n" + 
				"    initDnDSwitch();\r\n" + 
				"    initRosterManager();\r\n" + 
				"    initStatNavListeners();\r\n" + 
				"    \r\n" + 
				"    if(canTime) {\r\n" + 
				"      console.timeEnd(\"boot\");\r\n" + 
				"      console.timeEnd(\"init\");\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  });\r\n" + 
				" \r\n" + 
				"//Y.on(\"contentready\", init, \"#yspmain\");\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"YSF.use(\"node\", \"event\", \"ysf-overlay\", \"transition\", function(Y) {\r\n" + 
				"  var Att = false;\r\n" + 
				"\r\n" + 
				"  //have we seen before\r\n" + 
				"  var showHelp = Att ? Att : false;\r\n" + 
				"  //if so display it now\r\n" + 
				"  if(showHelp === true) {\r\n" + 
				"    Y.on(\"available\",  function(e) {\r\n" + 
				"      Y.fire(\"ysfoverlay:open\",{\"overlayname\": \"whats-this\"});\r\n" + 
				"    },\"#whats-this\");\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				" function hideEl(el) {\r\n" + 
				"  el.transition({\r\n" + 
				"    easing: \"linear\",\r\n" + 
				"    duration: 0.5,\r\n" + 
				"    opacity: 0\r\n" + 
				"  },function() {\r\n" + 
				"      this.hide();\r\n" + 
				"  });\r\n" + 
				" }\r\n" + 
				"\r\n" + 
				" function showEl(el) {\r\n" + 
				"  el.show();\r\n" + 
				"  el.transition({\r\n" + 
				"    easing: \"linear\",\r\n" + 
				"    duration: 0.5,\r\n" + 
				"    opacity: 100\r\n" + 
				"  });\r\n" + 
				"\r\n" + 
				" }\r\n" + 
				"\r\n" + 
				" var animEventHandle,\r\n" + 
				" carousel = Y.one(\".overlay-carousel\");\r\n" + 
				" if(carousel !== null) {\r\n" + 
				"   var items = carousel.all(\"div\"),\r\n" + 
				"   cur = items.item(0);\r\n" + 
				"\r\n" + 
				"  //init\r\n" + 
				"  items.each(function(e) {\r\n" + 
				"    items.setStyle(\"opacity\",0);\r\n" + 
				"  });\r\n" + 
				"  showEl(cur);\r\n" + 
				"\r\n" + 
				"   //EVENT shown\r\n" + 
				"   Y.on(\"ysfoverlay:overlayopened\", function(e) {\r\n" + 
				"    //start animation\r\n" + 
				"    Y.later(1000, this, function(e) {\r\n" + 
				"      animEventHandle = Y.later(3000, this, function(e) {\r\n" + 
				"        if(carousel !== null) {\r\n" + 
				"          var next = items.item((items.indexOf(cur)+1 >= items.size()) ? 0 : items.indexOf(cur)+1);\r\n" + 
				"          hideEl(cur);\r\n" + 
				"          showEl(next);\r\n" + 
				"          cur = next;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"      }, null, true);\r\n" + 
				"    }, null, false);\r\n" + 
				"   }, {\"overlayname\": \"whats-this\"});\r\n" + 
				"\r\n" + 
				"  //closed, remove dat animation\r\n" + 
				"  Y.on(\"ysfoverlay:overlayclosed\", function(e) {\r\n" + 
				"   //stop animation\r\n" + 
				"   animEventHandle.cancel();\r\n" + 
				"   //reset to first showing\r\n" + 
				"   if(carousel !== null) {\r\n" + 
				"    hideEl(cur);\r\n" + 
				"    cur = items.item(0);\r\n" + 
				"    showEl(cur);\r\n" + 
				"   }\r\n" + 
				"  }, {\"overlayname\": \"whats-this\"});\r\n" + 
				"}\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script></div></div></div></section><div style=\"\" id=\"yspsub\" class=\"Thm-snow\"></div></div><div style=\"\" id=\"yspfootercontent\" class=\" Page-footercontent\"></div></div><div style=\"\" id=\"yspcontentchangeview\" class=\"\"></div><footer style=\"\" id=\"yspcontentfooter\" class=\"Page-ft Thm-snow D-tb W-100 Page-wrap-sm\"><div class=\"Grid-h-top Grid-3col\"><div class=\"Grid-u-1-3\"><style type=\"text/css\">\r\n" + 
				"/* Medal-data hover */\r\n" + 
				" .Trophy-mount .medal-data {\r\n" + 
				"    display:none;\r\n" + 
				"}\r\n" + 
				".Trophy-mount:hover .medal-data {\r\n" + 
				"    display:block;\r\n" + 
				"    left: -73px;\r\n" + 
				"    top: -60px;\r\n" + 
				"    z-index: 100;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"<section class=\"Mod Thm-override Thm-inherit No-mx \" id=\"team-medals\">\r\n" + 
				"    <header class=\"Hd No-pbot\">\r\n" + 
				"        <h2 class=\"Grid-spread-bot F-mod-header\">\r\n" + 
				"            <span class=\"Grid-u\">My Team Medals</span>\r\n" + 
				"            <span class=\"spon-ad Grid-u\">\r\n" + 
				"                <div class=\"Tst-adlocation-SPON\"><div id=\"yspadSPON\"><div id=\"yspadSPONDest\"><!-- darla ad SPON goes here --></div></div><script type=\"text/javascript\">\r\n" + 
				";(function(){\r\n" + 
				"    var adparams = {\r\n" + 
				"        \"position\": \"SPON\",\r\n" + 
				"        \"spaceid\":  '782200906',\r\n" + 
				"        \"rotate\": 0,\r\n" + 
				"        \"w\": '120',\r\n" + 
				"        \"h\": '30',\r\n" + 
				"        \"spaceid\": 782200906    },\r\n" + 
				"    adContainer, \r\n" + 
				"    posCfg, \r\n" + 
				"    adCfg,\r\n" + 
				"    eventName = \"load\" + adparams.position,\r\n" + 
				"    meta = null;\r\n" + 
				"\r\n" + 
				"    adContainer = \"yspad\" + adparams.position + \"Dest\";\r\n" + 
				"\r\n" + 
				"    if (YUI && YUI.Fantasy && typeof YUI.Fantasy.SmartAdValues === \"function\") {\r\n" + 
				"      meta = YUI.Fantasy.SmartAdValues();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    posCfg = {\r\n" + 
				"        \"pos\": adparams.position, \r\n" + 
				"        \"dest\": adContainer,\r\n" + 
				"        \"fr\": \"ajax_exp\",\r\n" + 
				"        \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    adCfg = {\r\n" + 
				"        \"name\": eventName, \r\n" + 
				"        \"ps\": adparams.position, \r\n" + 
				"        \"sp\": adparams.spaceid,\r\n" + 
				"        \"ssl\": 1,\r\n" + 
				"        \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if(adparams.w) {\r\n" + 
				"        posCfg.w = adparams.w;\r\n" + 
				"        posCfg.h = adparams.h;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    DARLA_CONFIG.positions[adparams.position] = {\r\n" + 
				"      \"id\": adparams.position,\r\n" + 
				"      \"pos\": adparams.position, \r\n" + 
				"      \"dest\": adContainer,\r\n" + 
				"      \"fr\": \"ajax_exp\",\r\n" + 
				"      \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if (adparams.position === 'MAST') {\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fclose = 2;\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].metaSize = true;\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fdb = { \r\n" + 
				"        on: 1, \r\n" + 
				"        where: 'inside'\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].supports = { \r\n" + 
				"        'exp-ovr': 1, \r\n" + 
				"        'exp-push': 1, \r\n" + 
				"        'resize-to': 1 \r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].closeBtn = {\r\n" + 
				"        mode: 2,\r\n" + 
				"        useShow: 1,\r\n" + 
				"        adc: 0\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if(adparams.rotate && \"auto\" !== \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.AUTO.ps[adparams.position] = { \r\n" + 
				"        \"autoRT\": adparams.rotate,\r\n" + 
				"        \"autoIV\": 1 \r\n" + 
				"      };\r\n" + 
				"    }\r\n" + 
				"    if(adparams.rotate && \"auto\" === \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.MANUAL_ROTATION.ps[adparams.position] = {};\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"})();\r\n" + 
				"</script>\r\n" + 
				"</div>            </span>\r\n" + 
				"        </h2>\r\n" + 
				"    </header>\r\n" + 
				"    <div class=\"Bd Ta-c No-px No-ptop Pbot-xs\">\r\n" + 
				"    <ul class=\"Grid-h-top Mstart-lg\"><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=3&medal_id=71\"><img src=\"https://sp.yimg.com/j/assets/ipt/tank_bronze_75.png\" alt=\"Tacoma Tough Defense (Bronze)\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"71\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">Tacoma Tough Defense (Bronze)</h5><p class=\"My-med\">Your defense scored a TD. That&#39;s one solid pickup.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=71&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=71&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Oct 17, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=3&medal_id=31\"><img src=\"https://s.yimg.com/lq/p/sp/tools/med/2011/08/ipt/1314824495.png\" alt=\"Toyota Biggest Blowout\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"31\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">Toyota Biggest Blowout</h5><p class=\"My-med\">Toyota congratulates you on winning with the largest margin of victory. Enjoy this medal for your display of sheer dominance.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=31&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=31&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Oct 17, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=3&medal_id=84\"><img src=\"https://sp.yimg.com/j/assets/ipt/takeaway-bronze-75.png\" alt=\"Toyota Takeaway (Bronze)\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"84\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">Toyota Takeaway (Bronze)</h5><p class=\"My-med\">Your defense got a chance at greatness and took it. If there’s one thing you should take away from all those takeaways, it’s this: Seize your chance at greatness by becoming a Toyota Hall of Famer.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=84&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=84&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Sep 26, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li><li class=\"Grid-u-1-4 Hpx-70 Medal Relative Trophy-mount Py-xxl\"><div class=\"medal Absolute avatar-container Top Mtop-med Mstart-med unlocked\"><a href=\"/f1/686943/medals?mid=3&medal_id=53\"><img src=\"https://s.yimg.com/dh/ap/sports/fn/overall/2012/medals/theunderdog_sm.png\" alt=\"The Underdog\" border=\"0\" class=\"Avatar-med Wpx-60 Hpx-60\"></a></div>\r\n" + 
				"<div class=\"medal-data Absolute Bg-overlay F-reset P-med Bdr-radius Ta-start Fz-xxs\" data-medal-id=\"53\" data-medal-scope=\"371.686943\"><h5 class=\"Fw-b Fz-xs\">The Underdog</h5><p class=\"My-med\">According to the projected points, you were supposed to lose this week. Projections, schmojections! This little dog has a big bite.</p><p>Share your achievement:</p><ul class=\"Mbot-med\"><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=53&medal_scope=371.686943&network=facebook\" class=\"Grid-u yfa-rapid-beacon yfa-rapid-module-medal-share-facebook Mx-med Btn small fb-share Bg-facebook F-shade3 F-icon Fz-sm No-bry P-lg No-mstart\" target=\"_blank\">&#xe00d;</a></li><li class=\"Inlineblock\"><a href=\"/f1/686943/3/share_medal?medal_id=53&medal_scope=371.686943&network=twitter\" class=\"Btn Bg-twitter yfa-rapid-beacon yfa-rapid-module-medal-share-twitter small F-shade3 F-icon Fz-sm No-bdr P-lg\" target=\"_blank\">&#xe001;</a></ul><em class=\"Block\">Football 2017 - League 686943</em><time><em class=\"Block\">Earned Sep 21, 2017</em></time>\r\n" + 
				"</div>\r\n" + 
				"</li></ul></div>\r\n" + 
				"            <div class=\"Ta-end Pend-lg My-lg\"><a class=\"view\" href=\"/f1/686943/medals?mid=3\">View all 10 medals earned &raquo;</a></div>\r\n" + 
				"    </section>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</div><div class=\"Grid-u-1-3 Pstart-xl\">\r\n" + 
				"\r\n" + 
				"<section class=\"Mod Thm-inherit No-mx\" style=\"height: 250px;\">\r\n" + 
				"    <header class=\"Hd\">\r\n" + 
				"        <h2>Note To Self</h2>\r\n" + 
				"    </header>\r\n" + 
				"            <div id=\"notetoself\">\r\n" + 
				"            \r\n" + 
				"                <form class=\"Form Ta-c\" id=\"notetoself-form\" method=\"post\" action=\"/f1/3/editnote\">\r\n" + 
				"\r\n" + 
				"                    <textarea id=\"notetoself-content\" placeholder=\"Use the Note To Self area to jot player notes, write reminders, create lists, or store frequently used text.\" class=\"Fill-x Mtop-sm Ov-a Cur-p Bg-transparent F-reset Bdr-radius No-bdr Fz-xxs Mbot-lg P-sm notetoself-default\" style=\"height:135px; resize:none;\" name=\"note\" title=\"Click to edit Note To Self\" maxlength=\"1000\"></textarea>\r\n" + 
				"\r\n" + 
				"                    <input type=\"hidden\" name=\"oldnote\" id=\"notetoself-old\" value=\"\">\r\n" + 
				"                    <input type=\"hidden\" name=\"crumb\" value=\"fcUJCglfW8q\">\r\n" + 
				"                    <input type=\"hidden\" name=\"mid\" value=\"3\">\r\n" + 
				"                    <input type=\"hidden\" name=\"lid\" value=\"686943\">\r\n" + 
				"                    <input type=\"hidden\" name=\"stage\" value=\"1\">\r\n" + 
				"\r\n" + 
				"                    <div id=\"notetoself-button-bar\" class=\"Mbot-xs yfa-js-hidden Ta-c\">\r\n" + 
				"                        <p class=\"Ta-start Mbot-sm Fz-xxs\">Limit 1000 characters. <span id=\"notecount\" class=\"Fw-b\">1000</span> characters left.</p>\r\n" + 
				"                        <input type=\"submit\" class=\"Btn-primary Btn-short Py-sm Mend-lg\" value=\"Save\">\r\n" + 
				"                        <input type=\"reset\"  class=\"Btn Btn-short Py-sm\" value=\"Cancel\" id=\"notetoself-cancel\">\r\n" + 
				"                    </div>\r\n" + 
				"                </form>\r\n" + 
				"\r\n" + 
				"                    </div>\r\n" + 
				"    </section>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use(\"node-base\", \"event-key\", \"ysf-xhr\", \"ysf-tout\", 'ysf-tooltip', function(Y) { \r\n" + 
				"\r\n" + 
				"    var default_notetoself = 'Use the Note To Self area to jot player notes, write reminders, create lists, or store frequently used text.';\r\n" + 
				"\r\n" + 
				"    if(Y.one(\"#notetoself-form\")) {\r\n" + 
				"\r\n" + 
				"        var xhr = new Y.Fantasy.XHR({\r\n" + 
				"            \"form\": '#notetoself-form',\r\n" + 
				"            \"callbackObj\": {\r\n" + 
				"                \"success\": function(cId, response) {\r\n" + 
				"\r\n" + 
				"                    var respObj     = this.parseResponse( cId, response ),\r\n" + 
				"                        notetoself_node = Y.one('#notetoself-content'),\r\n" + 
				"                        tout,\r\n" + 
				"                        errors_array,\r\n" + 
				"                        error_string,\r\n" + 
				"                        x,\r\n" + 
				"                        response;\r\n" + 
				"                    \r\n" + 
				"                    if (respObj.errors.length > 0) {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                        errors_array = respObj.errors;\r\n" + 
				"                        error_string = '';\r\n" + 
				"                        \r\n" + 
				"                        for (x = 0; x < errors_array.length; x++) {\r\n" + 
				"                            error_string = error_string + errors_array[x].title + \"\\n\";\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        alert(error_string.replace(\"&nbsp;\", \" \"));\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                    } else if(respObj.content) {\r\n" + 
				"                        \r\n" + 
				"\r\n" + 
				"                        //Update Div that displays current notetoself and gets edited.\r\n" + 
				"                        var nl = '\\r\\n',\r\n" + 
				"                            response = respObj.content.replace( /\\<br(\\s*\\/|)\\>/g, nl );\r\n" + 
				"                        notetoself_node.set('value', response);\r\n" + 
				"\r\n" + 
				"                        //Most likely user cleared out the notetoself, change display to empty notetoself styling\r\n" + 
				"                        if(respObj.content === default_notetoself) {\r\n" + 
				"                            notetoself_node.addClass('notetoself-default'); //different styling\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        //Update Form variables for future edits\r\n" + 
				"                        Y.one('#notetoself-old').setAttribute('value', response);\r\n" + 
				"\r\n" + 
				"                        //Success message\r\n" + 
				"                        tout = new Y.Fantasy.Tout();\r\n" + 
				"                        tout.displayTout({\r\n" + 
				"                            \"message\": 'Your Note to Self was updated'\r\n" + 
				"                        });                    \r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"\r\n" + 
				"                },\r\n" + 
				"                \"failure\": function(cId) {\r\n" + 
				"     \r\n" + 
				"                    alert(\"An error has occured, please try again\");\r\n" + 
				"\r\n" + 
				"                    enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"triggerHandler\": function(e, obj) {\r\n" + 
				"                \r\n" + 
				"                //Form Submitted\r\n" + 
				"                e.preventDefault();\r\n" + 
				"\r\n" + 
				"                var notetoself_content = Y.one('#notetoself-content').get('value');\r\n" + 
				"\r\n" + 
				"                //Validate Slogan length\r\n" + 
				"                if(notetoself_content.length > 1000 ) {\r\n" + 
				"                    alert('Notes can not be longer than 1000 characters. Currently you are at ' + notetoself_content.length);\r\n" + 
				"                } else {\r\n" + 
				"\r\n" + 
				"                    //Hide Submit/Cancel\r\n" + 
				"                    toggle_form_buttons();\r\n" + 
				"                    temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"                    connection = obj.submit(this);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    var temporary_hover_disable = function() {\r\n" + 
				"\r\n" + 
				"        //After clicking Save the hover effect makes content look editable,  \r\n" + 
				"        //temporarily remove it hover\r\n" + 
				"        var notetoself_node = Y.one('#notetoself-content');\r\n" + 
				"\r\n" + 
				"        notetoself_node.removeClass('is-editable');\r\n" + 
				"        \r\n" + 
				"        Y.later(3000, this, function(){\r\n" + 
				"            notetoself_node.addClass('is-editable');\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    toggle_form_buttons = function() {\r\n" + 
				"\r\n" + 
				"        //user_is_editing_class maintains hover state look and feel even if user clicks outside textarea\r\n" + 
				"        Y.one('#notetoself-button-bar').toggleClass('yfa-js-hidden'); \r\n" + 
				"        Y.one('#notetoself-content').toggleClass('editing');\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_notetoself_form_listener = function(notetoself_node) {\r\n" + 
				"\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            if(notetoself_node.hasClass('notetoself-default')) {\r\n" + 
				"\r\n" + 
				"                //notetoself-default has different styling than a regular notetoself\r\n" + 
				"                notetoself_node.removeClass('notetoself-default');\r\n" + 
				"\r\n" + 
				"                //Remove default message\r\n" + 
				"                Y.one('#notetoself-content').set('value', '');\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            //Show Submit/Cancel\r\n" + 
				"            toggle_form_buttons();\r\n" + 
				"\r\n" + 
				"            //Only want this to run on first click\r\n" + 
				"            this.detach();\r\n" + 
				"           \r\n" + 
				"        }, '#notetoself-content');\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_cancel_form_listener = function(notetoself_node) {\r\n" + 
				"\r\n" + 
				"        //Event Handler for CANCEL button\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            e.preventDefault();\r\n" + 
				"\r\n" + 
				"            var old_notetoself = Y.one('#notetoself-old').getAttribute('value');\r\n" + 
				"            \r\n" + 
				"            temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"            if(old_notetoself === '' || old_notetoself === default_notetoself ) {\r\n" + 
				"                \r\n" + 
				"                old_notetoself = default_notetoself;\r\n" + 
				"\r\n" + 
				"                notetoself_node.addClass('notetoself-default');\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"            \r\n" + 
				"            notetoself_node.set('value', old_notetoself);\r\n" + 
				"            notetoself_node.removeClass('editing');\r\n" + 
				"\r\n" + 
				"            Y.one('#notetoself-button-bar').addClass('yfa-js-hidden');\r\n" + 
				"\r\n" + 
				"            enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"\r\n" + 
				"        }, '#notetoself-cancel');  \r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    initTextAreaCounter = function(container, textarea, maxlength, total) {\r\n" + 
				"        try {\r\n" + 
				"            var noteTextArea = document.getElementById(textarea),\r\n" + 
				"                noteContainer = document.getElementById(container);\r\n" + 
				"\r\n" + 
				"            if (!noteTextArea ) { return };\r\n" + 
				"\r\n" + 
				"            noteTextArea.onkeydown =  countStrokes; \r\n" + 
				"            noteTextArea.onkeyup =  countStrokes; \r\n" + 
				"            noteTextArea.maxlength = maxlength;\r\n" + 
				"            noteTextArea.outputLocation = noteContainer;\r\n" + 
				"            noteTextArea.countStrokes = countStrokes;\r\n" + 
				"            noteTextArea.total = total;\r\n" + 
				"            noteTextArea.countStrokes();\r\n" + 
				"\r\n" + 
				"        } catch(e) { \r\n" + 
				"            Y.log(e) \r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    countStrokes = function(e) {\r\n" + 
				"        var noteTextArea = (e) ? e.target : this;\r\n" + 
				"\r\n" + 
				"        var numStrokes = noteTextArea.value.length;\r\n" + 
				"        if ( (numStrokes) > (noteTextArea.maxlength )  && noteTextArea.maxlength > 0 ) {\r\n" + 
				"            if(noteTextArea.textNode) {\r\n" + 
				"                noteTextArea.textNode.nodeValue = \"0\";\r\n" + 
				"            }\r\n" + 
				"           noteTextArea.value = noteTextArea.value.substr(0, noteTextArea.maxlength);\r\n" + 
				"        }\r\n" + 
				"        if(noteTextArea.outputLocation) {\r\n" + 
				"            noteTextArea.outputLocation.innerHTML =  (!noteTextArea.total && noteTextArea.maxlength) ? Math.max(noteTextArea.maxlength - numStrokes, 0) : numStrokes;\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    init = function() {\r\n" + 
				"\r\n" + 
				"         var notetoself_node,\r\n" + 
				"             notetoself_node_tagName;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        notetoself_node         = Y.one('#notetoself-content');\r\n" + 
				"        \r\n" + 
				"        if(notetoself_node) {\r\n" + 
				"    \r\n" + 
				"            notetoself_node_tagName = notetoself_node.get('tagName');\r\n" + 
				"        \r\n" + 
				"            if(notetoself_node_tagName == 'TEXTAREA') {\r\n" + 
				"\r\n" + 
				"                notetoself_node.addClass('is-editable');\r\n" + 
				"\r\n" + 
				"                //Event handlers for showing form buttons/edit styling/cancel button\r\n" + 
				"                enable_notetoself_form_listener(notetoself_node);\r\n" + 
				"                enable_cancel_form_listener(notetoself_node);\r\n" + 
				"                initTextAreaCounter('notecount', 'notetoself-content', 1000);\r\n" + 
				"                Y.Fantasy.ToolTip.init();\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    init();\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"</div><div class=\"Grid-u-1-3 Pstart-xl Ta-end Ptop-xl\"><div class=\"Tst-adlocation-LREC\"><div id=\"yspadLREC\"><div id=\"yspadLRECDest\"><!-- darla ad LREC goes here --></div></div><script type=\"text/javascript\">\r\n" + 
				";(function(){\r\n" + 
				"    var adparams = {\r\n" + 
				"        \"position\": \"LREC\",\r\n" + 
				"        \"spaceid\":  '782200906',\r\n" + 
				"        \"rotate\": 10000,\r\n" + 
				"        \"w\": '300',\r\n" + 
				"        \"h\": '250',\r\n" + 
				"        \"spaceid\": 782200906    },\r\n" + 
				"    adContainer, \r\n" + 
				"    posCfg, \r\n" + 
				"    adCfg,\r\n" + 
				"    eventName = \"load\" + adparams.position,\r\n" + 
				"    meta = null;\r\n" + 
				"\r\n" + 
				"    adContainer = \"yspad\" + adparams.position + \"Dest\";\r\n" + 
				"\r\n" + 
				"    if (YUI && YUI.Fantasy && typeof YUI.Fantasy.SmartAdValues === \"function\") {\r\n" + 
				"      meta = YUI.Fantasy.SmartAdValues();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    posCfg = {\r\n" + 
				"        \"pos\": adparams.position, \r\n" + 
				"        \"dest\": adContainer,\r\n" + 
				"        \"fr\": \"ajax_exp\",\r\n" + 
				"        \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    adCfg = {\r\n" + 
				"        \"name\": eventName, \r\n" + 
				"        \"ps\": adparams.position, \r\n" + 
				"        \"sp\": adparams.spaceid,\r\n" + 
				"        \"ssl\": 1,\r\n" + 
				"        \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if(adparams.w) {\r\n" + 
				"        posCfg.w = adparams.w;\r\n" + 
				"        posCfg.h = adparams.h;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    DARLA_CONFIG.positions[adparams.position] = {\r\n" + 
				"      \"id\": adparams.position,\r\n" + 
				"      \"pos\": adparams.position, \r\n" + 
				"      \"dest\": adContainer,\r\n" + 
				"      \"fr\": \"ajax_exp\",\r\n" + 
				"      \"meta\": meta\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    if (adparams.position === 'MAST') {\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fclose = 2;\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].metaSize = true;\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].fdb = { \r\n" + 
				"        on: 1, \r\n" + 
				"        where: 'inside'\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].supports = { \r\n" + 
				"        'exp-ovr': 1, \r\n" + 
				"        'exp-push': 1, \r\n" + 
				"        'resize-to': 1 \r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      DARLA_CONFIG.positions[adparams.position].closeBtn = {\r\n" + 
				"        mode: 2,\r\n" + 
				"        useShow: 1,\r\n" + 
				"        adc: 0\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if(adparams.rotate && \"auto\" !== \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.AUTO.ps[adparams.position] = { \r\n" + 
				"        \"autoRT\": adparams.rotate,\r\n" + 
				"        \"autoIV\": 1 \r\n" + 
				"      };\r\n" + 
				"    }\r\n" + 
				"    if(adparams.rotate && \"auto\" === \"manual\") {\r\n" + 
				"      DARLA_CONFIG.events.MANUAL_ROTATION.ps[adparams.position] = {};\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"})();\r\n" + 
				"</script>\r\n" + 
				"</div></div></div><div id=\"yspfooter\">\r\n" + 
				"	<div id=\"yspcopyright\" class=\"Thm-inherit Fz-xxs Ta-c\">\r\n" + 
				"        <div id=\"nfl-footer\" class=\"Bdrtop Py-xxl\">\r\n" + 
				"    <ul>\r\n" + 
				"        <li class=\"Inlineblock\">Yahoo! Sports - NBC Sports Network.</li>\r\n" + 
				"        <li class=\"Inlineblock\"><a href=\"http://info.yahoo.com/legal/us/yahoo/utos/terms/\">Terms</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"https://policies.yahoo.com/us/en/yahoo/terms/product-atos/fantasy-football/general/index.htm\">Additional Terms</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"https://yahoo.uservoice.com/forums/206158?auth=yahoo\">Feedback</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"http://help.yahoo.com/kb/index?page=product&amp;y=PROD_SPORTS_FAN_FOOTUS&amp;locale=en_US\">Help</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"http://info.yahoo.com/privacy/us/yahoo/sports/details.html\">Privacy</a></li>\r\n" + 
				"        <li class=\"Inlineblock\">- <a href=\"http://info.yahoo.com/privacy/us/yahoo/relevantads.html\">About Our Ads</a></li>\r\n" + 
				"    </ul>\r\n" + 
				"    <p>\r\n" + 
				"        Certain data by <a href=\"http://www.stats.com\">STATS LLC</a>\r\n" + 
				"    </p>\r\n" + 
				"</div>\r\n" + 
				"	</div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script src=\"//fc.yahoo.com/sdarla/php/client.php?d=0&l=LDRB{dest:yspadLDRBDest;asz:728x90},SPON{dest:yspadSPONDest;asz:120x30},LREC{dest:yspadLRECDest;asz:300x250}&f=782200906&rtype=boot\"></script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use('event-hover',  function(Y) {\r\n" + 
				"	var mainNavLis = Y.all('.Nav-h .Navitem, .Nav-h > ul > li');\r\n" + 
				"	mainNavLis.on('hover',\r\n" + 
				"		\r\n" + 
				"		// Mouseover\r\n" + 
				"		function(){\r\n" + 
				"		 	var li_subnav; \r\n" + 
				"\r\n" + 
				"		 	// Add Hover class to nav li\r\n" + 
				"		 	this.addClass('Hover');\r\n" + 
				"		 	\r\n" + 
				"		 	// Add class to li's subnav\r\n" + 
				"		 	li_subnav = this.one('.Dropdown');\r\n" + 
				"		 	if (li_subnav) {\r\n" + 
				"		 		li_subnav.replaceClass('Hidden', 'Hover');\r\n" + 
				"		 	}\r\n" + 
				"		}, \r\n" + 
				"\r\n" + 
				"		// Mouseout\r\n" + 
				"		function(){\r\n" + 
				"		 	var li_subnav;\r\n" + 
				"\r\n" + 
				"		 	// remove class from nav li\r\n" + 
				"		 	this.removeClass('Hover');\r\n" + 
				"			\r\n" + 
				"		 	// remove class from li's subnav\r\n" + 
				"		 	li_subnav = this.one('.Dropdown');\r\n" + 
				"			if (li_subnav) {\r\n" + 
				"		 		li_subnav.replaceClass('Hover', 'Hidden');\r\n" + 
				"		 	}\r\n" + 
				"		});\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script><script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\"><!--\r\n" + 
				"YSF.use(\"node\", function(Y) {\r\n" + 
				"    var PLAYERNOTE_AD_POS = \"LDRB2\";\r\n" + 
				"    YSF.use('media-playernotes', 'substitute', 'ysf-ads', function(Y) {\r\n" + 
				"        var registeredAds = [];\r\n" + 
				"        \r\n" + 
				"        Y.Sports.PlayerNotes.set('noteUrlFormatter', function() {\r\n" + 
				"            var oMod = this;\r\n" + 
				"            return Y.substitute('{league_url}/playernote?init={init}&view={type}&pid={pid}', {\r\n" + 
				"                league_url : YUI.Fantasy.League.get('url'),\r\n" + 
				"                init : (oMod.get('initialLoad')) ? 1 : 0,\r\n" + 
				"                type : oMod.get('currentView'),\r\n" + 
				"                pid : oMod.get('pid')\r\n" + 
				"            });\r\n" + 
				"        })\r\n" + 
				"        .set('comscoreUrlFormatter', function() {\r\n" + 
				"            var oMod = this;\r\n" + 
				"            return Y.substitute('{league_url}/playernote_dynamic_view?pid={pid}&rand={rand}', {\r\n" + 
				"                league_url : YUI.Fantasy.League.get('url'),\r\n" + 
				"                pid : oMod.get('pid'),\r\n" + 
				"                rand : Math.random()\r\n" + 
				"            });\r\n" + 
				"        })\r\n" + 
				"        .set('enumerate', true)\r\n" + 
				"        .set('zIndex', 9000);\r\n" + 
				"                \r\n" + 
				"        Y.Global.after('YSPlayerNote:initialLoad', function(e) {\r\n" + 
				"            \r\n" + 
				"            var oMod = e.target;\r\n" + 
				"            Y.Array.each(registeredAds, function(el) {\r\n" + 
				"                YUI.Sports.Ads.unregisterAd(\"LDRB\", el);\r\n" + 
				"            });\r\n" + 
				"            registeredAds = [];\r\n" + 
				"            if (YAHOO.Sports.PlayerNoteConfig.is_enabled('player_notes_FB')) {\r\n" + 
				"                oMod.set('footerContent', '<div id=\"playernote-LDRB-'+oMod.get('pid')+'\" class=\"playernote-LDRB\"></div>');\r\n" + 
				"                YUI.Sports.Ads.registerAd('LDRB', 'playernote-LDRB-'+oMod.get('pid'));\r\n" + 
				"            }\r\n" + 
				"            registeredAds.push('playernote-LDRB-'+oMod.get('pid'));\r\n" + 
				"            if (YAHOO.Sports.PlayerNoteConfig.is_enabled('player_notes_xfbml') && !Y.Lang.isUndefined(window.FB) && !Y.Lang.isUndefined(window.FB.XFBML)) {\r\n" + 
				"                FB.XFBML.parse(this.body);\r\n" + 
				"            }\r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"            Y.delegate('click', function(e) {\r\n" + 
				"                if (e.currentTarget && e.currentTarget.get('className').indexOf('noaction') !== -1) {\r\n" + 
				"                    e.preventDefault();\r\n" + 
				"                    Y.Fantasy.InitLinks.showNoActionPopup(e);\r\n" + 
				"                }\r\n" + 
				"                \r\n" + 
				"            },  oMod.get('contentBox'), 'a');\r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"        if(window.DARLA) {\r\n" + 
				"            //DARLA.add({\"name\": \"playernoteview\", \"ps\": \"LDRB2\", \"sp\": YUI.Fantasy.SpaceIds.getSpaceId(\"playernote_dynamic_notes\")});\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        Y.Global.after('YSPlayerNote:reveal', function(e) {\r\n" + 
				"            var oMod = e.target,\r\n" + 
				"                ps,\r\n" + 
				"                oldDarla = true,\r\n" + 
				"                pos_item;\r\n" + 
				"\r\n" + 
				"            Y.Fantasy.rapid.setRapidAttribute({\r\n" + 
				"                spaceid: 782204433            });\r\n" + 
				"            Y.Fantasy.rapid.beaconPageview();\r\n" + 
				"\r\n" + 
				"            if(window.DARLA) {\r\n" + 
				"                pos_item = $sf.host.get(PLAYERNOTE_AD_POS);\r\n" + 
				"\r\n" + 
				"                if (pos_item) { \r\n" + 
				"                    $sf.host.nuke(PLAYERNOTE_AD_POS);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                if (DARLA.hasPos(PLAYERNOTE_AD_POS)) { \r\n" + 
				"                    DARLA.delPos(PLAYERNOTE_AD_POS);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                DARLA.addPos({\"pos\": PLAYERNOTE_AD_POS, \"w\": \"728\", \"h\": \"90\", \"dest\": 'playernote-LDRB-'+oMod.get('pid'), \"supports\": {'exp-ovr': 1}});\r\n" + 
				"                DARLA.add({\r\n" + 
				"                    \"name\": \"playernoteview\", \r\n" + 
				"                    \"ps\": PLAYERNOTE_AD_POS, \r\n" + 
				"                    \"sp\": YUI.Fantasy.SpaceIds.getSpaceId(\"playernote_dynamic_\" + oMod.get('currentView')), \r\n" + 
				"                    \"ssl\": true,\r\n" + 
				"                    \"em\":{\"site-attribute\":\"content=no_expandable;\"}\r\n" + 
				"                });\r\n" + 
				"                DARLA.event(\"playernoteview\");\r\n" + 
				"                oldDarla = false;\r\n" + 
				"            }    \r\n" + 
				"            if (YUI.Sports.Ads.showAds.playernoteFB && oldDarla) {\r\n" + 
				"                YUI.Sports.Ads.subscribe('playernote-LDRB-'+oMod.get('pid'), 'now', {'playernoteview' : { lv:1, npv:true, sp:YUI.Fantasy.SpaceIds.getSpaceId(\"playernote_dynamic_\" + oMod.get('currentView')), ps:PLAYERNOTE_AD_POS, em:{\"site-attribute\":\"content=no_expandable;\"} } });  \r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            //Comscore Beacon\r\n" + 
				"            YSF.use('ysp-i13n', function(Y) {\r\n" + 
				"                if(typeof(YSF.sendComscoreEvent) === 'function') {\r\n" + 
				"                 YSF.sendComscoreEvent(YUI.Fantasy.SpaceIds.getSpaceId(\"playernote\"), encodeURIComponent(document.location.href))\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"        Y.Global.after('YSPlayerNote:visibleChange', function(e) {\r\n" + 
				"            if(!e.newVal) {\r\n" + 
				"                Y.Fantasy.rapid.setRapidAttribute({\r\n" + 
				"                    spaceid: 782200906                });\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"        \r\n" + 
				"        Y.Global.after('DynaPlayers:refresh', function() {\r\n" + 
				"            Y.Sports.PlayerNotes.destroyAllNotes();\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    });\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"// -->\r\n" + 
				"</script>\r\n" + 
				"<script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"YUI.add('ysf-postload', function(Y) {\r\n" + 
				"\r\n" + 
				"    Y.namespace('Fantasy');\r\n" + 
				"\r\n" + 
				"    Y.Fantasy.PostLoad = {\r\n" + 
				"\r\n" + 
				"        initImages : function(id) {\r\n" + 
				"            var el = Y.one('#'+id);\r\n" + 
				"            if (!el) return;\r\n" + 
				"            var images = Y.all('#'+id+' img[realimg]');\r\n" + 
				"            Y.NodeList.each(images, function(node) {\r\n" + 
				"                var realimg = node.getAttribute('realimg');\r\n" + 
				"                if (realimg && node.src != realimg ) {\r\n" + 
				"                    node.src = realimg;\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        initOnlineImages : function() {\r\n" + 
				"            var links = Y.all('img.imimg');\r\n" + 
				"            Y.NodeList.each(links, function(curLink){\r\n" + 
				"                var classes = curLink.get('class').split(' ');\r\n" + 
				"                if ( classes[1].indexOf('http://') != -1 ) { \r\n" + 
				"                    curLink.set('src', classes[1]);\r\n" + 
				"                }   \r\n" + 
				"            });\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        initSelect : function(id) {\r\n" + 
				"            var el = Y.one('#'+id);\r\n" + 
				"            if (!el) return;\r\n" + 
				"            el.on('change', function() {\r\n" + 
				"                el.get('form').submit();\r\n" + 
				"            });\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"}, '', {'requires': ['node']});\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"YSF.use(\"yfa-module\",\"ysf-viewloader\",\"node\",\"ysf-formenhancer\",\"ysf-postload\",\"ysf-initlinks\",\"ysf-headshot\",\"ysf-overlay\",\"ysf-alerts\",\"ysf-sticky\",\"ysf-leaguecontests\",\"stencil\",\"stencil-selectbox\",\"af-applets\",\"ysf-tooltip\",\"ysf-iris-chat\",\"ysf-dfs-promos\",  function(Y) {\r\n" + 
				"    Y.on(\"domready\", function(e, obj) {\r\n" + 
				"        Y.Fantasy.FantasyFormEnhancer.init();\r\n" + 
				"        Y.Fantasy.PostLoad.initImages('fantasy');\r\n" + 
				"        Y.Fantasy.PostLoad.initImages('yspcontentfooter');\r\n" + 
				"        Y.Fantasy.PostLoad.initImages('yspcontenthero');\r\n" + 
				"        Y.Fantasy.PostLoad.initSelect('seasonspec');\r\n" + 
				"        Y.Fantasy.Headshot.init('#fantasy');\r\n" + 
				"        Y.Fantasy.InitLinks.init();\r\n" + 
				"        Y.Fantasy.Sticky.init();\r\n" + 
				"\r\n" + 
				"         \r\n" + 
				"            Y.Fantasy.IrisChat.init();\r\n" + 
				"        \r\n" + 
				"                Y.Fantasy.DailyFantasyPromos.init({\r\n" + 
				"            page: \"team\", \r\n" + 
				"            sport: \"nfl\"\r\n" + 
				"        });\r\n" + 
				"                \r\n" + 
				"                var ApeApp = Y.Base.create('apeApp', Y.Base, [Y.Af.Applets]);\r\n" + 
				"        YMedia.ApeApp = new ApeApp();\r\n" + 
				"                                        Y.Fantasy.LeagueContests.init();\r\n" + 
				"                        Y.Fantasy.ToolTip.init();\r\n" + 
				"                var bd = Y.one(\"body\"), mods;\r\n" + 
				"        if(bd) {\r\n" + 
				"            mods = bd.all(\".Mod, .AlertsMod\");\r\n" + 
				"            mods.each(function(mod) {\r\n" + 
				"                var module;\r\n" + 
				"                if(mod.getData(\"dynamic-viewload\") === \"true\") {\r\n" + 
				"                     module = new Y.Fantasy.ViewLoader({\r\n" + 
				"                        \"el\": mod,\r\n" + 
				"                        \"triggers\": Y.one(Y.config.win)\r\n" + 
				"                     });\r\n" + 
				"                }\r\n" + 
				"                else {\r\n" + 
				"                    module = new Y.Fantasy.Mod({\"el\": mod, \"triggers\": mod});\r\n" + 
				"                    module.on(\"yfamodule:displayudpate\", function(e) {} );\r\n" + 
				"                    module.on(\"yfamodule:displayudpate\", function(e) { \r\n" + 
				"                        Y.Fantasy.PostLoad.initImages(mod.get('id')); \r\n" + 
				"                    });\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        var linkableHandler = function(e, obj) {\r\n" + 
				"            var target_location, doc;\r\n" + 
				"            target_location = this.getData('target');\r\n" + 
				"            if(target_location && !e.target.test('a')) {\r\n" + 
				"                if(e.metaKey) {\r\n" + 
				"                        window.open(target_location,'_blank');\r\n" + 
				"                }else {\r\n" + 
				"                    doc = Y.one('document');\r\n" + 
				"                    doc.set('location', target_location);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        bd.delegate(\"click\", linkableHandler, \".Linkable\", null);\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    if(document.location.href.indexOf(\"layout=webview\") !== -1 || false) {\r\n" + 
				"        var body = Y.one(\"body\");\r\n" + 
				"        body.delegate(\"tap\", function(e){\r\n" + 
				"            var href = this.get(\"href\");\r\n" + 
				"            if(href.indexOf(document.location.protocol + \"//\" + document.location.host) === 0 && href.indexOf(\"layout=webview\") === -1) {\r\n" + 
				"                href += (href.indexOf(\"?\") !== -1) ? \"&\" : \"?\";\r\n" + 
				"                href += \"layout=webview\";\r\n" + 
				"                this.set(\"href\", href);\r\n" + 
				"            }\r\n" + 
				"        }, \"a[href]\");\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    Y.one(document.body).addClass('Js-yfa-init');\r\n" + 
				"    if(YAHOO.Sports.invitefriends) {\r\n" + 
				"        YAHOO.Sports.invitefriends.init();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use(\"ysf-xhr\", \"ysf-tout\", \"ysf-html\", function(Y) { \r\n" + 
				"\r\n" + 
				"    var default_slogan = 'Team Slogan...';\r\n" + 
				"\r\n" + 
				"    if(Y.one(\"#slogan-form\")) {\r\n" + 
				"\r\n" + 
				"        var xhr = new Y.Fantasy.XHR({\r\n" + 
				"            \"form\": '#slogan-form',\r\n" + 
				"            \"callbackObj\": {\r\n" + 
				"                \"success\": function(cId, response) {\r\n" + 
				"\r\n" + 
				"                    var respObj     = this.parseResponse( cId, response ),\r\n" + 
				"                        slogan_node = Y.one('#slogan-content'),\r\n" + 
				"                        tout,\r\n" + 
				"                        errors_array,\r\n" + 
				"                        error_string,\r\n" + 
				"                        x,\r\n" + 
				"                        response;\r\n" + 
				"                    \r\n" + 
				"                    if (respObj.errors.length > 0) {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                        errors_array = respObj.errors;\r\n" + 
				"                        error_string = '';\r\n" + 
				"                        \r\n" + 
				"                        for (x = 0; x < errors_array.length; x++) {\r\n" + 
				"                            error_string = error_string + errors_array[x].title + \"\\n\";\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        alert(error_string.replace(\"&nbsp;\", \" \"));\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                    } else if(respObj.content) {\r\n" + 
				"                        \r\n" + 
				"\r\n" + 
				"                        //Update Div that displays current slogan and gets edited.\r\n" + 
				"                        response = Y.Fantasy.html.htmlDecode(respObj.content);\r\n" + 
				"                        slogan_node.set('value', response);\r\n" + 
				"\r\n" + 
				"                        //Most likely user cleared out the slogan, change display to empty slogan styling\r\n" + 
				"                        if(respObj.content === default_slogan) {\r\n" + 
				"                            slogan_node.addClass('slogan-default'); //different styling\r\n" + 
				"                            Y.one('#slogan-default-label').removeClass('yfa-js-hidden');\r\n" + 
				"                        }\r\n" + 
				"                        \r\n" + 
				"                        //Update Form variables for future edits\r\n" + 
				"                        Y.one('#slogan-old').setAttribute('value', respObj.content);\r\n" + 
				"\r\n" + 
				"                        //Success message\r\n" + 
				"                        tout = new Y.Fantasy.Tout();\r\n" + 
				"                        tout.displayTout({\r\n" + 
				"                            \"message\": 'Your team slogan was updated'\r\n" + 
				"                        });                    \r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    enable_slogan_form_listener(slogan_node);\r\n" + 
				"\r\n" + 
				"                },\r\n" + 
				"                \"failure\": function(cId) {\r\n" + 
				"     \r\n" + 
				"                    alert(\"An error has occured, please try again\");\r\n" + 
				"\r\n" + 
				"                    enable_slogan_form_listener(slogan_node);\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"triggerHandler\": function(e, obj) {\r\n" + 
				"                \r\n" + 
				"                //Form Submitted\r\n" + 
				"                e.preventDefault();\r\n" + 
				"\r\n" + 
				"                var slogan_content = Y.one('#slogan-content').get('value');;\r\n" + 
				"\r\n" + 
				"                //Validate Slogan length\r\n" + 
				"                if(slogan_content.length > 150 ) {\r\n" + 
				"                    alert('Slogans can not be longer than 150 characters. Currently you are at ' + slogan_content.length);\r\n" + 
				"                } else {\r\n" + 
				"\r\n" + 
				"                    //Hide Submit/Cancel\r\n" + 
				"                    toggle_form_buttons();\r\n" + 
				"                    temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"                    connection = obj.submit(this);\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    var temporary_hover_disable = function() {\r\n" + 
				"\r\n" + 
				"        //After clicking Save the hover effect makes content look editable,  \r\n" + 
				"        //temporarily remove it hover\r\n" + 
				"        var slogan_node = Y.one('#slogan-content');\r\n" + 
				"\r\n" + 
				"        slogan_node.removeClass('is-editable');\r\n" + 
				"        \r\n" + 
				"        Y.later(3000, this, function(){\r\n" + 
				"            slogan_node.addClass('is-editable');\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    toggle_form_buttons = function() {\r\n" + 
				"\r\n" + 
				"        //user_is_editing_class maintains hover state look and feel even if user clicks outside textarea\r\n" + 
				"        Y.one('#slogan-button-bar').toggleClass('yfa-js-hidden'); \r\n" + 
				"        Y.one('#slogan-content').toggleClass('editing');\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_slogan_form_listener = function(slogan_node) {\r\n" + 
				"\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            if(slogan_node.hasClass('slogan-default')) {\r\n" + 
				"\r\n" + 
				"                //slogan-default has different styling than a regular slogan\r\n" + 
				"                slogan_node.removeClass('slogan-default');\r\n" + 
				"\r\n" + 
				"                //Remove default message\r\n" + 
				"                Y.one('#slogan-content').set('value', '');\r\n" + 
				"\r\n" + 
				"                //Hide default lable used when there is no slogan\r\n" + 
				"                Y.one('#slogan-default-label').addClass('yfa-js-hidden');\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            //Show Submit/Cancel\r\n" + 
				"            toggle_form_buttons();\r\n" + 
				"\r\n" + 
				"            //Only want this to run on first click\r\n" + 
				"            this.detach();\r\n" + 
				"           \r\n" + 
				"        }, '#slogan-content');\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    enable_cancel_form_listener = function(slogan_node) {\r\n" + 
				"\r\n" + 
				"        //Event Handler for CANCEL button\r\n" + 
				"        Y.on('click', function(e) { \r\n" + 
				"\r\n" + 
				"            e.preventDefault();\r\n" + 
				"\r\n" + 
				"            var old_slogan = Y.one('#slogan-old').getAttribute('value');\r\n" + 
				"            \r\n" + 
				"            old_slogan = Y.Fantasy.html.htmlDecode(old_slogan) || \"\";\r\n" + 
				"\r\n" + 
				"            temporary_hover_disable();\r\n" + 
				"\r\n" + 
				"            if(old_slogan === '' || old_slogan === default_slogan ) {\r\n" + 
				"                \r\n" + 
				"                old_slogan = default_slogan;\r\n" + 
				"\r\n" + 
				"                slogan_node.addClass('slogan-default');\r\n" + 
				"\r\n" + 
				"                Y.one('#slogan-default-label').removeClass('yfa-js-hidden');\r\n" + 
				"            }\r\n" + 
				"            \r\n" + 
				"            slogan_node.set('value', old_slogan);\r\n" + 
				"            slogan_node.removeClass('editing');\r\n" + 
				"\r\n" + 
				"            Y.one('#slogan-button-bar').addClass('yfa-js-hidden');\r\n" + 
				"\r\n" + 
				"            enable_slogan_form_listener(slogan_node);\r\n" + 
				"\r\n" + 
				"        }, '#slogan-cancel');  \r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    init = function() {\r\n" + 
				"\r\n" + 
				"         var slogan_node,\r\n" + 
				"             slogan_node_tagName;\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        slogan_node         = Y.one('#slogan-content');\r\n" + 
				"        \r\n" + 
				"        if(slogan_node) {\r\n" + 
				"    \r\n" + 
				"            slogan_node_tagName = slogan_node.get('tagName');\r\n" + 
				"        \r\n" + 
				"            if(slogan_node_tagName == 'TEXTAREA') {\r\n" + 
				"\r\n" + 
				"                slogan_node.addClass('is-editable');\r\n" + 
				"\r\n" + 
				"                //Event handlers for showing form buttons/edit styling/cancel button\r\n" + 
				"                enable_slogan_form_listener(slogan_node);\r\n" + 
				"                enable_cancel_form_listener(slogan_node);\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    init();\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"YSF.use(\"node\", \"event\",\"hover-intent\", function(Y) {\r\n" + 
				"\r\n" + 
				"  function swapSubnav(newSelected, currentSelected, statsubnav) {\r\n" + 
				"    var currentSubnav = statsubnav.one(\"#subnav_\"+currentSelected.one(\".Navtarget\").get(\"id\")),\r\n" + 
				"    newSubnav = statsubnav.one(\"#subnav_\"+newSelected.one(\".Navtarget\").get(\"id\"));\r\n" + 
				"\r\n" + 
				"    if(newSelected.one(\".Navtarget\").hasAttribute(\"has-sub\")) {\r\n" + 
				"      if(currentSelected.hasClass(\"Hovered\")) {\r\n" + 
				"        currentSelected.removeClass(\"Hovered\");\r\n" + 
				"      }\r\n" + 
				"      newSelected.addClass(\"Hovered\");\r\n" + 
				"\r\n" + 
				"      //change subnav\r\n" + 
				"      if(currentSubnav !== null) {\r\n" + 
				"        currentSubnav.addClass(\"Hidden\");\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      if(newSubnav !== null) {\r\n" + 
				"        newSubnav.removeClass(\"Hidden\");\r\n" + 
				"        if(newSubnav.all(\"li\").size() == 1) {\r\n" + 
				"          newSubnav.addClass(\"Hidden\");\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  //Scroll over any stat nav, change the subnav to show that one... move the arrow to it.  Once off either. revert to normal\r\n" + 
				"  if(Y.one(\"#statnav\") !== null) {\r\n" + 
				"    var statnav = Y.one(\"#statnav\"),\r\n" + 
				"    statsubnav = Y.one(\"#statsubnav\"),\r\n" + 
				"    fullstatnav = Y.one(\"#full_stat_nav\"),\r\n" + 
				"    originalSelected = statnav.one(\".Selected\");\r\n" + 
				"\r\n" + 
				"    originalSelected.addClass(\"Hovered\");\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    //hover any stat nav, show their stat sub menu\r\n" + 
				"    Y.delegate([\"hover-intent\",\"focus\"], function(e) {\r\n" + 
				"      var currentSelected = statnav.one(\".Hovered\"),\r\n" + 
				"      newSelected = e.currentTarget.ancestor(\".Navitem\");\r\n" + 
				"\r\n" + 
				"      if(e.currentTarget.ancestor(\"#statnav\") !== null) { // make sure it's only in statnav\r\n" + 
				"        swapSubnav(newSelected, currentSelected, statsubnav);\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"    }, \".Navtarget\");\r\n" + 
				"\r\n" + 
				"    fullstatnav.on([\"mouseleave\",\"blur\"], function(e){\r\n" + 
				"      var el = e.currentTarget.ancestor(\"#full_stat_nav\"),\r\n" + 
				"      currentSelected = statnav.one(\".Hovered\");\r\n" + 
				"      originalSelected = statnav.one(\".Selected\");\r\n" + 
				"      swapSubnav(originalSelected, currentSelected, statsubnav);\r\n" + 
				"    });\r\n" + 
				"  }\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script><script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"<!--\r\n" + 
				"\r\n" + 
				"YUI.add(\"ysf-medal-notifications\", function(Y) {\r\n" + 
				"\r\n" + 
				"  if (!Y.Lang.isUndefined(YUI.Fantasy.MedalNotifications)) {\r\n" + 
				"    return;\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  var MedalNotifications = Y.Base.create('FantasyMedalNotifications', Y.Base, [], {\r\n" + 
				"\r\n" + 
				"    _handles : {},\r\n" + 
				"\r\n" + 
				"    initializer: function() {\r\n" + 
				"\r\n" + 
				"      var oMedalNotifications = this,\r\n" + 
				"        medalNode = Y.one('#ysf-medal-block'),\r\n" + 
				"        containerNode = Y.one('#ysf-medal-notifications'),\r\n" + 
				"        closeNode = Y.one('#ysf-medal-notifications a.close'),\r\n" + 
				"        uri = closeNode.getAttribute('data-href'),\r\n" + 
				"        requestData,\r\n" + 
				"        anim = new Y.Anim({ node: containerNode, to: { opacity: 0 }, duration: 0.5, easing: Y.Easing.easeOut }),\r\n" + 
				"        heightAnim = new Y.Anim({ node: containerNode, to: {height: 0}, duration: 0.2 });\r\n" + 
				"\r\n" + 
				"      anim.on('end', function() { heightAnim.run(); }, this);\r\n" + 
				"      heightAnim.on('end', function() { containerNode.setStyles({ 'display' : 'none', 'opacity' : '' }); }, this);\r\n" + 
				"      containerNode.delegate('click', oMedalNotifications.closeMedal, 'a');\r\n" + 
				"      containerNode.on('mouseenter', function() {\r\n" + 
				"        if(!containerNode.hasClass('no-autorun')) {\r\n" + 
				"          containerNode.addClass('no-autorun');\r\n" + 
				"        }\r\n" + 
				"      });\r\n" + 
				"\r\n" + 
				"      setTimeout(function() {\r\n" + 
				"        if(!containerNode.hasClass('in-progress')) {\r\n" + 
				"          if(!containerNode.hasClass('no-autorun')) {\r\n" + 
				"            anim.run();\r\n" + 
				"            Y.on('io:complete', function(){\r\n" + 
				"              oMedalNotifications.completeIO;\r\n" + 
				"              containerNode.remove();\r\n" + 
				"            }, Y, [closeNode, containerNode]);\r\n" + 
				"            requestData = Y.io(uri, {\"headers\": {\"Ajax-Request\": \"true\"}});\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"      }, 6000);\r\n" + 
				"\r\n" + 
				"      oMedalNotifications.set('medalNode', medalNode);\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    completeIO: function(id, o, args) {\r\n" + 
				"      var id = id,\r\n" + 
				"        data = o.responseText,\r\n" + 
				"        node = args[0];\r\n" + 
				"\r\n" + 
				"      return data;\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    closeMedal: function(e) {\r\n" + 
				"\r\n" + 
				"      if(e.currentTarget.hasClass('close')) {\r\n" + 
				"        e.preventDefault();\r\n" + 
				"      }\r\n" + 
				"      var oMedalNotifications = this,\r\n" + 
				"        containerNode = Y.one('#ysf-medal-notifications'),\r\n" + 
				"        uri = e.currentTarget.getAttribute('data-href'),\r\n" + 
				"        redirectUri = e.currentTarget.getAttribute('href'),\r\n" + 
				"        node = e.currentTarget,\r\n" + 
				"        requestData,\r\n" + 
				"        anim = new Y.Anim({ node: containerNode, to: { opacity: 0 }, duration: 0.5, easing: Y.Easing.easeOut }),\r\n" + 
				"        heightAnim = new Y.Anim({ node: containerNode, to: {height: 0}, duration: 0.2 });\r\n" + 
				"\r\n" + 
				"      anim.on('end', function() { heightAnim.run(); }, this);\r\n" + 
				"      heightAnim.on('end', function() { containerNode.setStyles({ 'display' : 'none', 'opacity' : '' }); }, this);\r\n" + 
				"\r\n" + 
				"      containerNode.addClass('in-progress');\r\n" + 
				"      anim.run();\r\n" + 
				"      Y.on('io:complete', function(){\r\n" + 
				"        oMedalNotifications.completeIO;\r\n" + 
				"        containerNode.remove();\r\n" + 
				"      }, Y, [node]);\r\n" + 
				"      requestData = Y.io(uri, {\"headers\": {\"Ajax-Request\": \"true\"}});\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    destructor : function() {\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    ATTRS : {\r\n" + 
				"\r\n" + 
				"      medalNode : {\r\n" + 
				"        value : null\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  });\r\n" + 
				"\r\n" + 
				"  YUI.Fantasy.MedalNotifications = new MedalNotifications();\r\n" + 
				"\r\n" + 
				"}, '', {\r\n" + 
				"  requires : ['base-build', 'node-event-delegate', 'anim-base', 'anim-easing', 'io-base']\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"YSF.use('event', function(Y) {\r\n" + 
				"    if (Y.UA.ie === 0 || Y.UA.ie > 7){\r\n" + 
				"	    Y.on('contentready', function() {\r\n" + 
				"  	        Y.use('ysf-medal-notifications', function(){});\r\n" + 
				"        }, '#ysf-medal-notifications');\r\n" + 
				"    }\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"// -->\r\n" + 
				"</script>\r\n" + 
				" <script charset=\"utf-8\" language=\"javascript\">\r\n" + 
				"\r\n" + 
				"YSF.use('node', function(Y) {\r\n" + 
				"\r\n" + 
				"    var lastOpenedNote = '';\r\n" + 
				"\r\n" + 
				"    var showStatNote = function(e) {\r\n" + 
				"        e.halt();\r\n" + 
				"\r\n" + 
				"        var popupId     = e.currentTarget.getAttribute('data-stat-note-id'),\r\n" + 
				"            noteToShow  = Y.one('#' + popupId),\r\n" + 
				"            click_x     = e.currentTarget.getX(),\r\n" + 
				"            click_y     = e.currentTarget.getY();\r\n" + 
				"\r\n" + 
				"        noteToShow.removeClass('hidden');\r\n" + 
				"\r\n" + 
				"        click_x += 20;\r\n" + 
				"        if(click_x > (window.innerWidth - parseInt(noteToShow.getComputedStyle(\"width\")))){\r\n" + 
				"            click_x = window.innerWidth - 2 * parseInt(noteToShow.getComputedStyle(\"width\"));\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        click_y -= (parseInt(noteToShow.getComputedStyle(\"height\")) / 2) - 8;\r\n" + 
				"\r\n" + 
				"        noteToShow.setXY([click_x, click_y]);\r\n" + 
				"\r\n" + 
				"        var arrow = noteToShow.one(\".arrow\");\r\n" + 
				"        if(arrow && !arrow.hasClass(\"repositioned\")) {\r\n" + 
				"            arrow.setX(arrow.getX() + 6);\r\n" + 
				"            arrow.addClass(\"repositioned\");\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        //Make sure last one removed in case the use is\r\n" + 
				"        //opening a new note without closing the first\r\n" + 
				"        Y.detach(\"close|click\");\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        if(lastOpenedNote) {\r\n" + 
				"            /* Make sure the last note opened gets closed */\r\n" + 
				"            if(lastOpenedNote.getAttribute('id') != popupId && !lastOpenedNote.hasClass('hidden')) {\r\n" + 
				"                lastOpenedNote.addClass('hidden');\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        lastOpenedNote = noteToShow;\r\n" + 
				"        Y.later(5, window, function(){\r\n" + 
				"            Y.on(\"close|click\",  clickAnywhereToClose, document.body, null, noteToShow);\r\n" + 
				"        }, [], false);\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    var clickAnywhereToClose =  function(e, noteToClose) {\r\n" + 
				"\r\n" + 
				"        noteToClose.addClass('hidden');\r\n" + 
				"        Y.detach(\"close|click\");\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    var init = function(e) {\r\n" + 
				"\r\n" + 
				"        Y.delegate(\"click\",  showStatNote, \"body\", \".has-stat-note\");\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    Y.on('available', init, '#ysf-stat-notes', this);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"</script><script charset=\"utf-8\" type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"\r\n" + 
				"/*\r\n" + 
				" * YAFT [Yahoo above fold time] is a js performance library aims to measure mainly \r\n" + 
				" * user perceived performance [aft] by utilizing Navigation and Resource Timing APIs.\r\n" + 
				" * It returns following metrics via its callback function's first parameter object:\r\n" + 
				" * AFT ( above fold time )\r\n" + 
				" * VIC ( Visually Complete )\r\n" + 
				" * costlyResources \r\n" + 
				" * domElementsCount\r\n" + 
				" * ttbf: time to first byte\r\n" + 
				" * domInteractive: the time at which page is interactive\r\n" + 
				" * modulesReport: the details of each module’s loadTime, coveragePercentage, inViewPort, resources and start time\r\n" + 
				" * \r\n" + 
				" * Appending showaft=1 query param to main Fantasy pages in Chrome will allow you to see aft report visually on the page.\r\n" + 
				" * More at http://yo/yaft\r\n" + 
				" *\r\n" + 
				" */\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"YSF.use(\"node\", \"event\",\"event\",\"node-base\",\"event-base\", \"json\", \"cookie\",\"base\",\"jsonp\",\"querystring\", function(Y) {\r\n" + 
				"Y.later(10, this, function() {\r\n" + 
				"  if (window.LH !== undefined) {\r\n" + 
				"    if ( !window.LH.isInitialized) {\r\n" + 
				"	if (window.location.href.indexOf('showaft=') != -1 || Math.floor(Math.random()*100)<=3 || 0) {\r\n" + 
				"	    window.LH.init(\r\n" + 
				"	    {\r\n" + 
				"		spaceid: '782200906',\r\n" + 
				"		serverip:'', \r\n" + 
				"		pvid:'', \r\n" + 
				"		crumb:''\r\n" + 
				"	    });\r\n" + 
				"	}\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    if (window.LH.isInitialized && window.YAFT !== undefined) {\r\n" + 
				"	var yaftCallback = function (data, error) {\r\n" + 
				"	    if (!error) {\r\n" + 
				"                \r\n" + 
				"               // AFT = Above Fold Time :  average time at which visible parts of the page are displayed. \r\n" + 
				"               // It is expressed in milliseconds and dependent on size of the view port.\r\n" + 
				"		window.LH.record('AFT', {\r\n" + 
				"		    name: 'AFT', type: 'mark', startTime: Math.round(data.aft), duration: 0\r\n" + 
				"		});\r\n" + 
				"\r\n" + 
				"               // VIC = Visually Complete :  the time at which everything in the viewport is visually loaded \r\n" + 
				"		window.LH.record('VIC', {\r\n" + 
				"		    name: 'VIC', type: 'mark', startTime: Math.round(data.visuallyComplete), duration: 0\r\n" + 
				"		});\r\n" + 
				"\r\n" + 
				"		if ( ___adLT___ !== undefined && ___adLT___.length && ___adLT___.length > 0) {\r\n" + 
				"		    for (var __i__ = 0; __i__ < ___adLT___.length; __i__++) {\r\n" + 
				"			window.LH.record(___adLT___[__i__][0], {\r\n" + 
				"			    name: ___adLT___[__i__][0], type: 'mark', startTime: ___adLT___[__i__][1], duration: 0\r\n" + 
				"			});\r\n" + 
				"		    }\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"		window.LH.beacon( {\r\n" + 
				"		    clearMarks:false, clearMeasures: false, clearCustomEntries: true, clearTags: false\r\n" + 
				"		});\r\n" + 
				"	    }\r\n" + 
				"	};\r\n" + 
				"	var modArray = ['sitenav','sitenavsub','yucsHead'];\r\n" + 
				"\r\n" + 
				"        [].slice.call(document.querySelectorAll(\".Mod\")).forEach(function(el,i){\r\n" + 
				"           modArray.push(el.getAttribute(\"id\"));\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"        [].slice.call(document.querySelectorAll(\".Ad\")).forEach(function(el,i){\r\n" + 
				"           modArray.push(el.getAttribute(\"id\"));\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"	window.YAFT.init(\r\n" + 
				"	{\r\n" + 
				"	   modules: modArray,\r\n" + 
				"           generateHAR: true,\r\n" + 
				"	    maxWaitTime: 2500\r\n" + 
				"	}, yaftCallback);\r\n" + 
				"\r\n" + 
				"	//Need to do this manually\r\n" + 
				"	//YAFT triggers this onLoad, but by this time onLoad has fired so YAFT misses it\r\n" + 
				"	 setTimeout(function () {\r\n" + 
				"	  YAFT.triggerPerf('custom', yaftCallback);\r\n" + 
				"	  }, 4000);\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"}});\r\n" + 
				"\r\n" + 
				"/*\r\n" + 
				" * Used to send User Timing Metrics beacons to Lighthouse for the following : \r\n" + 
				" * AD_LREC , AD_LREC2, AD_LN1, AD_LN1 etc. Darla ads fire a custom event.\r\n" + 
				" * YAFT hooks into onFinishPosRender to get a snapshot of performance (user timing metrics)\r\n" + 
				" * using the window.performance object. \r\n" + 
				" */\r\n" + 
				"\r\n" + 
				"var ___adLT___ = [];\r\n" + 
				"function onDarlaFinishPosRender(position) {\r\n" + 
				"  if (window.performance !== undefined && window.performance.now !== undefined) {\r\n" + 
				"    var ltime = window.performance.now();\r\n" + 
				"    ___adLT___.push(['AD-'+position, Math.round(ltime)]);\r\n" + 
				"    setTimeout(function () {\r\n" + 
				"        if (window.LH !== undefined && window.YAFT !== undefined && window.YAFT.isInitialized()) {\r\n" + 
				"          window.YAFT.triggerCustomTiming('yspad'+position, '', ltime);\r\n" + 
				"        }\r\n" + 
				"    },1000);\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"if (window.DARLA && (DARLA.config || window.DARLA_CONFIG)) {\r\n" + 
				"    var oldConf = DARLA.config() || DARLA_CONFIG || null;\r\n" + 
				"    if (oldConf) {\r\n" + 
				"        if (oldConf.onFinishPosRender) {\r\n" + 
				"            (function() {\r\n" + 
				"                var oldVersion = oldConf.onFinishPosRender;\r\n" + 
				"                oldConf.onFinishPosRender = function(position) {\r\n" + 
				"                    onDarlaFinishPosRender(position);\r\n" + 
				"                    return oldVersion.apply(me, arguments);\r\n" + 
				"                };\r\n" + 
				"            })();\r\n" + 
				"        } else {\r\n" + 
				"            oldConf.onFinishPosRender  = onDarlaFinishPosRender;\r\n" + 
				"        }\r\n" + 
				"        DARLA.config(oldConf);\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"</footer><div style=\"\" id=\"yspglobalcontentincludes\" class=\"Thm-snow\"><section id=\"ie8-warning\" class=\"Mod Thm-inherit Z-10 Fixed Botstart W-100 Ta-c Bdrtop-accent IE8-show\">\r\n" + 
				"	<div class=\"Bd Py-med No-px\">\r\n" + 
				"		<span>Internet Explorer 8 is no longer supported by Yahoo Fantasy.</span>\r\n" + 
				"		<a href=\"https://help.yahoo.com/kb/fantasy-football/yahoo-supported-web-browser-sln4556.html\" target=\"_blank\"> Please download a supported browser.</a>\r\n" + 
				"	</div>\r\n" + 
				"</section></div><div class=\"Tst-adlocation-Z\"></div><div id=\"comscore-beacon\" >\r\n" + 
				"    <!-- COMSCORE BEACON -->\r\n" + 
				"    <script>\r\n" + 
				"        /*\r\n" + 
				"         * YUI3 port of i13n.js\r\n" + 
				"         */\r\n" + 
				"        // construct comscore beacon Image\r\n" + 
				"        if(typeof(YUI) === 'function') {\r\n" + 
				"\r\n" + 
				"            YUI.add('ysp-i13n', function(Y) {\r\n" + 
				"\r\n" + 
				"                var comscore_image = new Image();\r\n" + 
				"\r\n" + 
				"                YSF.sendComscoreEvent = function (spaceid, uri) {\r\n" + 
				"\r\n" + 
				"                    var beacon_url     = '//sb.scorecardresearch.com/b?c1=2&c2=7241469&c7='+uri+'&c5='+spaceid;\r\n" + 
				"                    comscore_image.src = beacon_url;\r\n" + 
				"\r\n" + 
				"                };\r\n" + 
				"\r\n" + 
				"            }, '1.0', {});\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"            YSF.use('ysp-i13n', function(Y) {\r\n" + 
				"                if(typeof(YSF.sendComscoreEvent) === 'function') {\r\n" + 
				"                  YSF.sendComscoreEvent(YUI.Fantasy.SpaceIds.spaceid, encodeURIComponent(document.location.href));\r\n" + 
				"                }\r\n" + 
				"            });\r\n" + 
				"\r\n" + 
				"        } else {\r\n" + 
				"                        document.write('<img src=\"https://sb.scorecardresearch.com/b?c1=2&c2=7241469&c7=football.fantasysports.yahoo.com%2Ff1%2F686943%2F3&c5=782200906&cv=2.0&cj=1\" style=\"display:none\" width=\"0\" height=\"0\" alt=\"\">');\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"    </script>\r\n" + 
				"\r\n" + 
				"    <noscript>\r\n" + 
				"        <img src=\"https://sb.scorecardresearch.com/b?c1=2&c2=7241469&c7=football.fantasysports.yahoo.com%2Ff1%2F686943%2F3&c5=782200906&cv=2.0&cj=1\" style=\"display:none\" width=\"0\" height=\"0\" alt=\"\">    </noscript>\r\n" + 
				"    <!-- END OF COMSCORE BEACON -->\r\n" + 
				"</div>\r\n" + 
				"              </div> <!-- END .Page -->\r\n" + 
				"            </div> <!-- END .Page-wrap -->\r\n" + 
				"          </div> <!-- END .yui-sv-content -->\r\n" + 
				"        </div> <!-- END .ct-box-hd -->\r\n" + 
				"      </div> <!-- END .ct-box -->\r\n" + 
				"    </div><!-- END .outer-wrapper -->\r\n" + 
				"    <script>\r\n" + 
				"    if(YSF && YSF.exec) {\r\n" + 
				"      YFB = YMedia = YSF.getInstance();\r\n" + 
				"      YSF.exec();\r\n" + 
				"    }\r\n" + 
				"    </script>\r\n" + 
				"    	</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"<!-- fanos550.sports.bf1.yahoo.com Thu Oct 19 18:42:45 UTC 2017 -->\r\n";
		Player Collin[] = new Player[19];
		int firs=0;
		int sec;
		String playr;
		String pos;
		position posi = null;
		String playrs[] = new String[19];
		int i = 0;
		while(inputLine.indexOf("p name",firs)>0){
			firs = inputLine.indexOf("p name",firs);
			firs = inputLine.indexOf(">",firs);
			sec = inputLine.indexOf("<", firs);
			playr = inputLine.substring(firs+1, sec);
			firs = inputLine.indexOf("- ",firs);
			sec = inputLine.indexOf("<",firs);
			pos = inputLine.substring(firs+1,sec);
			switch (pos.toUpperCase().trim()) {
			case "QB":
				posi=position.QB;
				break;
			case "RB":
				posi=position.RB;
				break;
			case "WR":
				posi=position.WR;
				break;
			case "TE":
				posi=position.TE;
				break;
			case "DEF":
				posi=position.DEF;
				break;
			}
			Player player = new Player(playr,posi,"Starter");
			team.addplayer(player);
						
		}
		;
		
		

	/*URL oracle = new URL(
			"http://api.fantasy.nfl.com/v1/players/stats?statType=weekStats&week=6&season=2017&dp=0&format=json");
	BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
	String inputLine;inputLine=in.readLine();
	// System.out.println(inputLine);
	in.close();
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(inputLine).useDelimiter("name");sc.findInLine("Cam Newton");
	String statln;System.out.println(statln=sc.next());
	Scanner sc2 = new Scanner(statln);
	int firs;
	String cat;
	int val;firs=statln.indexOf("stats")+9;while(statln.charAt(firs)!='"')
	{
		String mult = new StringBuilder().append(statln.charAt(firs)).toString();
		if (statln.charAt(firs + 1) != '"') {
			while (statln.charAt(firs + 1) != '"') {
				mult += statln.charAt(firs + 1);
				firs += 1;
			}
		}
		cat = mult; // HERE IS THE CATAGORY
		firs += 4;
		String mult2 = new StringBuilder().append(statln.charAt(firs)).toString();
		if (statln.charAt(firs + 1) != '"') {
			while (statln.charAt(firs + 1) != '"') {
				mult2 += statln.charAt(firs + 1);
				firs += 1;
			}
		}
		val = Integer.parseInt(mult2);
		firs += 4;
		System.out.println(cat);
		System.out.println(val);
	}
	// statln = sc2.findInLine("stats");

	// System.out.println(sc2.nextByte());
	// int i = sc.nextInt();
	// System.out.println(i);
	sc.close();*/

}}
