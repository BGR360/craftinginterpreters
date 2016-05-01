package com.craftinginterpreters.vox;

interface Environment {
  Object get(String name, int line);
  Object get(Token name);
  void set(Token name, Object value);

  Environment declare(Token name);
  Environment define(String name, Object value);
  Environment enterScope();
}
