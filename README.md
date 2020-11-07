
<p>My next step in <b>Android/Java</b> learning was to get familiar with Adapters and Event Listeners concepts</p>

<ol>
<li>Event listeners (e.g. <a href="https://developer.android.com/reference/android/widget/AdapterView.OnItemClickListener">OnItemClickListener</a> interface) allow us to listen to events such as when views get clicked, when they receive 
or lose the focus or when user presses a button on its device.
<p>P.S. We can use <a href="https://developer.android.com/reference/android/R.attr#onClick">android:OnClick</a> attribute in activity layouts only for buttons or its subclasses: <a href="https://developer.android.com/guide/topics/ui/controls/button">Button</a> <- CheckBoxes && RadioButtons </p></li>

<li>If we need to display data in a list view (ListView) that comes from a source other than strings.xml (such as a Java array or database), 
you need to use an adapter <a href="https://developer.android.com/guide/topics/ui/binding?hl=ru">AdapterView</a>. 
This example includes Array adapter which is used to bind arrays to views.
</li></ol>

<h3>Example of UI</h3>
![Alt text](https://github.com/AlexPeshkov/Android_Adapter_OnClickItemListener_Example/blob/feature/travis_build_readme-1/app/src/main/res/screenshots/main_activity.png)
<p></p>
![Alt text](https://github.com/AlexPeshkov/Android_Adapter_OnClickItemListener_Example/blob/feature/travis_build_readme-1/app/src/main/res/screenshots/drink_activity.png)
<p></p>
![Alt text](https://github.com/AlexPeshkov/Android_Adapter_OnClickItemListener_Example/blob/feature/travis_build_readme-1/app/src/main/res/screenshots/latte_view.png)
