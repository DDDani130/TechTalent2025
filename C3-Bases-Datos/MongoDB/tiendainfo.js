// // Usar o crear la base de datos
// use tienda_informatica;

// Lenguaje MONGODB

// Insertar documentos en la colección "articulos"
db.articulos.insertMany([
  { _id: 101, nombre: "Portátil ZenBook", precio: 1200, fabricante: 1 },
  { _id: 102, nombre: 'Monitor 27"', precio: 300, fabricante: 9 },
  { _id: 103, nombre: "Teclado Mecánico", precio: 100, fabricante: 10 },
  { _id: 104, nombre: "Raton Gaming", precio: 60, fabricante: 10 },
  { _id: 105, nombre: "Placa Base Z490", precio: 250, fabricante: 8 },
  { _id: 106, nombre: "Disco SSD 1TB", precio: 150, fabricante: 9 },
  { _id: 107, nombre: "Impresora Láser", precio: 200, fabricante: 2 },
  { _id: 108, nombre: "All-in-One", precio: 950, fabricante: 4 },
  { _id: 109, nombre: "MacBook Pro", precio: 1800, fabricante: 7 },
  { _id: 110, nombre: "Torre Gaming", precio: 1300, fabricante: 5 }
]);

db.fabricantes.insertMany([
  { _id: 1, nombre: "Asus" },
  { _id: 2, nombre: "HP" },
  { _id: 3, nombre: "Lenovo" },
  { _id: 4, nombre: "Dell" },
  { _id: 5, nombre: "MSI" },
  { _id: 6, nombre: "Acer" },
  { _id: 7, nombre: "Apple" },
  { _id: 8, nombre: "Gigabyte" },
  { _id: 9, nombre: "Samsung" },
  { _id: 10, nombre: "Logitech" }
]);