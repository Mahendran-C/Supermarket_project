SELECT orders.order_id, customer.first_name, orders.orderDate,orders.product_id
FROM Orders
INNER JOIN Customer ON Orders.customer_id=Customer.customer_id;

