(function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    println(require('../../../package.json').version);
    hello();
  }
  function hello() {
    println('Hello World!');
  }
  _.main_kand9s$ = main;
  var package$foo = _.foo || (_.foo = {});
  package$foo.hello = hello;
  Kotlin.defineModule('index.kt', _);
  main([]);
  return _;
}(module.exports, require('kotlin')));
