package connection;

import java.sql.*;
import java.util.ArrayList;

public class ConnectDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdatabase?characterEncoding=latin1&useConfigs=maxPerformance";
        String username = "root";


        String password = "pockets864";
        String query = "select * from students";
        String query2 = "insert into test (name)" + "values (?)";


        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);




        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();

        String student1 = resultSet.getString("name");
        System.out.println(student1);

        String studentGrade = resultSet.getString("grade");
        System.out.println(studentGrade);

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Fucker");
        arrayList.add("Sucker");
        arrayList.add("BitchAss");
        arrayList.add("WTFMan");

      PreparedStatement preparedStatement = connection.prepareStatement(query2);

        for(String s: arrayList){
            System.out.println(s);
            preparedStatement.setString(1,s);

            preparedStatement.execute();

        }



        ResultSetMetaData metData = resultSet.getMetaData();
        int number = metData.getColumnCount();
        System.out.println("column numbers:"+number);

        while (resultSet.next()){
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)+" " + resultSet.getString(3));
            arrayList.add(resultSet.getString(1));
        }
        for (String str : arrayList){
            System.out.println("Data from arrayList :" +str);

        }
        statement.close();
        connection.close();
    }

}

