
DELETE FROM customers;

INSERT INTO partner_mapping (customer_id, partner_id, partner_customer_id, last_name, first_name, middle_name, avatar_image)
VALUES
  (100000, 'id1', 'sid1', 'Иванов', 'Иван', 'Иванович', NULL),
  (100002, 'id4', 'sid6', 'China', NULL, NULL, NULL);