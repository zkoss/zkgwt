function zkapp(){
  var $intern_0 = '', $intern_29 = '" for "gwt:onLoadErrorFn"', $intern_27 = '" for "gwt:onPropertyErrorFn"', $intern_12 = '"><\/script>', $intern_14 = '#', $intern_38 = '.cache.html', $intern_16 = '/', $intern_37 = '7A4DB1198A5D42E99BBF2C961BF543E2', $intern_46 = '<script defer="defer">zkapp.onInjectionDone(\'zkapp\')<\/script>', $intern_11 = '<script id="', $intern_24 = '=', $intern_15 = '?', $intern_26 = 'Bad handler "', $intern_45 = 'DOMContentLoaded', $intern_13 = 'SCRIPT', $intern_10 = '__gwt_marker_zkapp', $intern_17 = 'base', $intern_4 = 'begin', $intern_3 = 'bootstrap', $intern_19 = 'clear.cache.gif', $intern_23 = 'content', $intern_9 = 'end', $intern_5 = 'gwt.codesvr=', $intern_6 = 'gwt.hosted=', $intern_7 = 'gwt.hybrid', $intern_39 = 'gwt/standard/standard.css', $intern_28 = 'gwt:onLoadErrorFn', $intern_25 = 'gwt:onPropertyErrorFn', $intern_22 = 'gwt:property', $intern_44 = 'head', $intern_35 = 'hosted.html?zkapp', $intern_43 = 'href', $intern_30 = 'iframe', $intern_18 = 'img', $intern_31 = "javascript:''", $intern_40 = 'link', $intern_34 = 'loadExternalRefs', $intern_20 = 'meta', $intern_33 = 'moduleRequested', $intern_8 = 'moduleStartup', $intern_21 = 'name', $intern_32 = 'position:absolute;width:0;height:0;border:none', $intern_41 = 'rel', $intern_36 = 'selectingPermutation', $intern_2 = 'startup', $intern_42 = 'stylesheet', $intern_1 = 'zkapp';
  var $wnd = window, $doc = document, $stats = $wnd.__gwtStatsEvent?function(a){
    return $wnd.__gwtStatsEvent(a);
  }
  :null, $sessionId = $wnd.__gwtStatsSessionId?$wnd.__gwtStatsSessionId:null, scriptsDone, loadDone, bodyDone, base = $intern_0, metaProps = {}, values = [], providers = [], answers = [], onLoadErrorFunc, propertyErrorFunc;
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_3, millis:(new Date).getTime(), type:$intern_4});
  if (!$wnd.__gwt_stylesLoaded) {
    $wnd.__gwt_stylesLoaded = {};
  }
  if (!$wnd.__gwt_scriptsLoaded) {
    $wnd.__gwt_scriptsLoaded = {};
  }
  function isHostedMode(){
    var result = false;
    try {
      var query = $wnd.location.search;
      return (query.indexOf($intern_5) != -1 || (query.indexOf($intern_6) != -1 || $wnd.external && $wnd.external.gwtOnLoad)) && query.indexOf($intern_7) == -1;
    }
     catch (e) {
    }
    isHostedMode = function(){
      return result;
    }
    ;
    return result;
  }

  function maybeStartModule(){
    if (scriptsDone && loadDone) {
      var iframe = $doc.getElementById($intern_1);
      var frameWnd = iframe.contentWindow;
      if (isHostedMode()) {
        frameWnd.__gwt_getProperty = function(name){
          return computePropValue(name);
        }
        ;
      }
      zkapp = null;
      frameWnd.gwtOnLoad(onLoadErrorFunc, $intern_1, base);
      $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_8, millis:(new Date).getTime(), type:$intern_9});
    }
  }

  function computeScriptBase(){
    var thisScript, markerId = $intern_10, markerScript;
    $doc.write($intern_11 + markerId + $intern_12);
    markerScript = $doc.getElementById(markerId);
    thisScript = markerScript && markerScript.previousSibling;
    while (thisScript && thisScript.tagName != $intern_13) {
      thisScript = thisScript.previousSibling;
    }
    function getDirectoryOfFile(path){
      var hashIndex = path.lastIndexOf($intern_14);
      if (hashIndex == -1) {
        hashIndex = path.length;
      }
      var queryIndex = path.indexOf($intern_15);
      if (queryIndex == -1) {
        queryIndex = path.length;
      }
      var slashIndex = path.lastIndexOf($intern_16, Math.min(queryIndex, hashIndex));
      return slashIndex >= 0?path.substring(0, slashIndex + 1):$intern_0;
    }

    ;
    if (thisScript && thisScript.src) {
      base = getDirectoryOfFile(thisScript.src);
    }
    if (base == $intern_0) {
      var baseElements = $doc.getElementsByTagName($intern_17);
      if (baseElements.length > 0) {
        base = baseElements[baseElements.length - 1].href;
      }
       else {
        base = getDirectoryOfFile($doc.location.href);
      }
    }
     else if (base.match(/^\w+:\/\//)) {
    }
     else {
      var img = $doc.createElement($intern_18);
      img.src = base + $intern_19;
      base = getDirectoryOfFile(img.src);
    }
    if (markerScript) {
      markerScript.parentNode.removeChild(markerScript);
    }
  }

  function processMetas(){
    var metas = document.getElementsByTagName($intern_20);
    for (var i = 0, n = metas.length; i < n; ++i) {
      var meta = metas[i], name = meta.getAttribute($intern_21), content;
      if (name) {
        if (name == $intern_22) {
          content = meta.getAttribute($intern_23);
          if (content) {
            var value, eq = content.indexOf($intern_24);
            if (eq >= 0) {
              name = content.substring(0, eq);
              value = content.substring(eq + 1);
            }
             else {
              name = content;
              value = $intern_0;
            }
            metaProps[name] = value;
          }
        }
         else if (name == $intern_25) {
          content = meta.getAttribute($intern_23);
          if (content) {
            try {
              propertyErrorFunc = eval(content);
            }
             catch (e) {
              alert($intern_26 + content + $intern_27);
            }
          }
        }
         else if (name == $intern_28) {
          content = meta.getAttribute($intern_23);
          if (content) {
            try {
              onLoadErrorFunc = eval(content);
            }
             catch (e) {
              alert($intern_26 + content + $intern_29);
            }
          }
        }
      }
    }
  }

  function computePropValue(propName){
    var value = providers[propName](), allowedValuesMap = values[propName];
    if (value in allowedValuesMap) {
      return value;
    }
    var allowedValuesList = [];
    for (var k in allowedValuesMap) {
      allowedValuesList[allowedValuesMap[k]] = k;
    }
    if (propertyErrorFunc) {
      propertyErrorFunc(propName, allowedValuesList, value);
    }
    throw null;
  }

  var frameInjected;
  function maybeInjectFrame(){
    if (!frameInjected) {
      frameInjected = true;
      var iframe = $doc.createElement($intern_30);
      iframe.src = $intern_31;
      iframe.id = $intern_1;
      iframe.style.cssText = $intern_32;
      iframe.tabIndex = -1;
      $doc.body.appendChild(iframe);
      $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_8, millis:(new Date).getTime(), type:$intern_33});
      iframe.contentWindow.location.replace(base + initialHtml);
    }
  }

  zkapp.onScriptLoad = function(){
    if (frameInjected) {
      loadDone = true;
      maybeStartModule();
    }
  }
  ;
  zkapp.onInjectionDone = function(){
    scriptsDone = true;
    $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_34, millis:(new Date).getTime(), type:$intern_9});
    maybeStartModule();
  }
  ;
  computeScriptBase();
  var strongName;
  var initialHtml;
  if (isHostedMode()) {
    if ($wnd.external && ($wnd.external.initModule && $wnd.external.initModule($intern_1))) {
      $wnd.location.reload();
      return;
    }
    initialHtml = $intern_35;
    strongName = $intern_0;
  }
  processMetas();
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_3, millis:(new Date).getTime(), type:$intern_36});
  if (!isHostedMode()) {
    try {
      strongName = $intern_37;
      initialHtml = strongName + $intern_38;
    }
     catch (e) {
      return;
    }
  }
  var onBodyDoneTimerId;
  function onBodyDone(){
    if (!bodyDone) {
      bodyDone = true;
      if (!__gwt_stylesLoaded[$intern_39]) {
        var l = $doc.createElement($intern_40);
        __gwt_stylesLoaded[$intern_39] = l;
        l.setAttribute($intern_41, $intern_42);
        l.setAttribute($intern_43, base + $intern_39);
        $doc.getElementsByTagName($intern_44)[0].appendChild(l);
      }
      maybeStartModule();
      if ($doc.removeEventListener) {
        $doc.removeEventListener($intern_45, onBodyDone, false);
      }
      if (onBodyDoneTimerId) {
        clearInterval(onBodyDoneTimerId);
      }
    }
  }

  if ($doc.addEventListener) {
    $doc.addEventListener($intern_45, function(){
      maybeInjectFrame();
      onBodyDone();
    }
    , false);
  }
  var onBodyDoneTimerId = setInterval(function(){
    if (/loaded|complete/.test($doc.readyState)) {
      maybeInjectFrame();
      onBodyDone();
    }
  }
  , 50);
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_3, millis:(new Date).getTime(), type:$intern_9});
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_34, millis:(new Date).getTime(), type:$intern_4});
  $doc.write($intern_46);
}

zkapp();
