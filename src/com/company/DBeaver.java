package com.company;

import java.sql.*;

public class DBeaver {
    public void register(User user) {

        String SQL = "insert into users (login,email,password,date_of_registration) values (?,?,?,now())";
        try (Connection conn = Connect.connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeLargeUpdate();
            System.out.println("Register success");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public User findUser(String login) {
        String SQL = "select * from users where login =?";
        try (Connection conn = Connect.connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, login);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setLogin(rs.getString("LOGIN" + ""));
                    user.setEmail(rs.getString("EMAIL" + ""));
                    user.setPassword(rs.getString("PASSWORD" + ""));
                    user.setTimestamp(rs.getTimestamp("date_of_registration" + ""));
                    return user;
                }
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void registerWithCode(User user) {
        String SQL = "insert into users (login,email,password,date_of_registration) values (?,?,?,now())";
        try (Connection conn = Connect.connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.Coding());
            stmt.executeLargeUpdate();
            System.out.println("Register success");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public int getUserByLogin(String login) {
        String SQL = "select count(*) from users where login = ?";
        int count = 0;
        try (Connection conn = Connect.connect();
             PreparedStatement stmt = conn.prepareStatement(SQL);
        ) {
            stmt.setString(1, login);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    count++;
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return count;
    }


    public void authorize(String login, String password, User user) {
        user.Coding();
        if (getUserByLogin(login) == 1 &&user.getPassword().equals(password) ) {
            System.out.println("Successful authorize");
        } else
            System.out.println("Login or password is wrong");

    String SQL = "insert into user_Logs (user_id, time_of_entrance, success) values(?, now(), ?)";
        try(
    Connection conn = Connect.connect();
    PreparedStatement statement = conn.prepareStatement(SQL))

    {
        statement.setInt(1, user.getID());
        if (getUserByLogin(login) == 1) {
            statement.setString(2, String.valueOf(Successfulness.OK));
        } else {
            statement.setString(2, String.valueOf(Successfulness.FAIL));
        }
        statement.executeUpdate();
    } catch(SQLException e)    {
        e.printStackTrace();
    }

}

    public void blockedUsers(User user) {
        if (countOfEnter(user) == true) {
            String SQL = "insert into blocked_Users (login,email,password,date_of_registration) values (?,?,?,now())";
            try {
                try (Connection conn = Connect.connect();
                     PreparedStatement stmt = conn.prepareStatement(SQL)) {
                    stmt.setString(1, user.getLogin());
                    stmt.setString(2, user.getEmail());
                    stmt.setString(3, user.getPassword());
                    stmt.executeLargeUpdate();
                    System.out.println("Blocked success");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFromBlocked(User user) {
        String SQL = "delete from blocked_Users where id=?";
        try {
            try (Connection conn = Connect.connect();
                 PreparedStatement stmt = conn.prepareStatement(SQL)) {
                stmt.setInt(1, user.getID());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean countOfEnter(User user) {
        String SQL = "select count(*) from user_Logs where user_id = " + user.getID() + " and successfullness = " + String.valueOf(Successfulness.FAIL);
        int count = 0;
        try (Connection conn = Connect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            count = rs.getInt(1);
            if (count > 3)
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

