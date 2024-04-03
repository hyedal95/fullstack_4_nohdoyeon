<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <section id="section11">
            <div class="container">
                <div class="gap">
                    <div class="content">
                        <div class="left">
                            <ul>
                                <li><h2>DON’T MISS THE LAST SEATS HERE</h2></li>
                                <li><h3>GREAT SPEAKERS WITH GREAT TOPICS</h3></li>
                                <li><h4>BUY THE LAST SEATS!</h4></li>
                                <li><i></i></li>
                            </ul>
                        </div>
                        <div class="right">
                            <div class="bg-box">
                                <form name="seats" id="seats" method="post" action="seats.php">
                                    <ul>                                                                        
                                        <li><input type="text" name="name" id="name" placeholder="Your Name"></li>
                                        <li><input type="email" name="email" id="email" placeholder="Your Email"></li>
                                        <li>
                                            <select name="ticket" id="ticket">
                                                <option value="Choose Your Ticket Type">Choose Your Ticket Type</option>
                                                <option value="Individual">Individual</option>
                                                <option value="Business">Business</option>
                                                <option value="Institution">Institution</option>
                                                <option value="Government">Government</option>
                                                <option value="Other">Other</option>
                                            </select>
                                        </li>
                                        <li>
                                            <textarea name="message" id="message" placeholder="Your Message"></textarea>
                                        </li>
                                        <li>
                                            <button type="submit" class="submit-btn">SUBMIT</button>
                                        </li>
                                        <li>
                                            <p  class="submit-message-error">
                                                Validation errors occurred. Please confirm the fields and submit it again.
                                            </p>
                                            <p  class="submit-message-success">
                                                Your message was sent successfully. Thanks.
                                            </p>
                                        </li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>