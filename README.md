# Fragment2FragmentCommunication
<b>Passing Data between Fragments through interface</b>
<ol type="1">
<li>

I have one activity - MainActivity. Within this Activity I have two fragments, both of which I created declaratively within the xml.
I am trying to pass the String of text input by the user into Fragment A & show textview in Fragment B.

</li>
<b>|---------------------|</b>
<b>Rules :              | </b> 
<b>---------------------|</b>
<li>
You don't want the Fragments talking directly to each other or to the Activity. That ties them to a particular Activity and makes reuse difficult.
The solution is to make an callback listener interface that the Activity will implement. When the Fragment wants to send a message to another Fragment or its parent activity, it can do it through the interface.
It is ok for the Activity to communicate directly to its child fragment public methods.
Thus the Activity serves as the controller, passing messages from one fragment to another.
