(function() {
  if (!goog.isProvided_("react_quill")) {
    goog.provide("react_quill");
    var reactQuill = goog.getObjectByName("react_quill");
    reactQuill.component = require("react-quill");
  }
}());
