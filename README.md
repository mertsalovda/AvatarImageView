# AvatarImageView
Circle avatar view.

<h>Круглая ImageView для чатов и экранов профиля</br></h>

<p>Если не установлено изображения, то отображаются установленные инициалы. Если инициалы и изображение не установлены, отображаются <b>"??"</b></p>

<p>
  <a target="_blank" rel="noopener noreferrer" href="https://github.com/mertsalovda/AvatarImageView/blob/master/AvatarImegeView.gif">
    <img src="https://github.com/mertsalovda/AvatarImageView/blob/master/AvatarImegeView.gif" alt="" style="max-width:50%;">
  </a>
</p>

<h2>Атрибуты</h2>
<p> 
            android:id="@+id/avatar"</br>
            android:layout_width="240dp"</br>
            android:layout_height="240dp"</br>
            android:src="@drawable/korra"</br>
            <b>app:aiv_initials="JM"</b>                    // установка инициалов</br>
            <b>app:aiv_borderColor="@color/colorAccent"</b> // цвет границы</br>
            <b>app:aiv_borderWidth="10dp"</b>               // толщина границы</br>
</p>

<h2>Сеттеры</h2>

<p> 
    <b>setImageBitmap(bm: Bitmap?)</b></br>
    <b>setImageDrawable(drawable: Drawable?) </b></br>
    <b>setImageResource(resId: Int)</b></br>
    <b>setInitials(initials: String)</b></br>
    <b>setBorderColor(@ColorInt color: Int)</b></br>
    <b>setBorderWidth(@Dimension width: Int)</b></br>
</p>
