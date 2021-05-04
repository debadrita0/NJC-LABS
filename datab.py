
#1. setting up local database


import mysql.connector
db_connection = mysql.connector.connect(

  host='localhost',
  user='root',
  passwd='12345', 
  database = 'employees'
)

# creating database_cursor to perform SQL operation
db_cursor = db_connection.cursor()
# get list of all databases
db_cursor.execute("SHOW DATABASES")
#print all databases
for db in db_cursor:
	print(db)

#2. creating a table and inserting some records

db_cursor.execute('SELECT * FROM employee')
employee_sql_query = " INSERT INTO employee (employee_name, dept_name, dept_id) VALUES (%s, %s, %s)"           
db_result= db_cursor.fetchall()    #3.  retrieving of data            
print(db_result)
db_connection.commit()
print(db_cursor.rowcount, "Record Inserted")
