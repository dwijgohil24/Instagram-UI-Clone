package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.synac.instagramuipractice.R
import com.synac.instagramuipractice.model.User

@Composable
fun MainFeedScreen() {
    //main feed screen ----- here are the code of different posts that you can see on the main screen.
    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "Dwij",
            location = "Kasol, Himachal Pradesh",
            postPic = painterResource(R.drawable.jon_snow_post),
            likeCount = 168,
            caption = "Galat kholi me aa gaya re baba !",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.arya_stark),
            username = "Isabelle",
            location = "Munich, Germany",
            postPic = painterResource(R.drawable.arya_stark_post),
            likeCount = 168,
            caption = "Bohot hard h yar insta ko manage karna .",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.bran_stark),
            username = "Tony_Stark",
            location = "Avengers Center, MCU",
            postPic = painterResource(R.drawable.bran_stark_post),
            likeCount = 168,
            caption = "DDU se graduate hokar nikalte hue.",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            location = "Some where in your heart.",
            postPic = painterResource(R.drawable.daenerys_targaryen_post),
            likeCount = 168,
            caption = "Yeah, i know i am beautiful, but still i will post my pics to make you jealous that you are still single.",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.jorah_mormont),
            username = "Uday_Bhai",
            location = "Mumbai, India",
            postPic = painterResource(R.drawable.jorah_mormont_post),
            likeCount = 168,
            caption = "Bhagwan ka diya hua sab ku6 h.",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.rob_stark),
            username = "Ranbir_Kapoor",
            location = "Mumbai, India",
            postPic = painterResource(R.drawable.robb_stark_post),
            likeCount = 168,
            caption = "Kesariya tera Ishq h piya ....",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.sansa_stark),
            username = "Girl_Name",
            location = "Billioners Row , NewYork",
            postPic = painterResource(R.drawable.sansa_stark_post),
            likeCount = 168,
            caption = "Linkedin par dp me upload karni thi yeh pic galti s insta p ho gayi guyz ! Ab ho hi gayi h to like kar dena.",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.tyrian_lannister),
            username = "Insta_Addict",
            location = "Delhi, India",
            postPic = painterResource(R.drawable.tyrian_lannister_post),
            likeCount = 168,
            caption = "Me after realising, that i am the only one left single in my branch. ",
            commentCount = 15
        )
    )

    Scaffold(
        topBar = { TopBar() },
        backgroundColor = Color.White,
        bottomBar = { BottomBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                LazyRow {
                    items(users) { user ->
                        StoryWidget(user)
                    }
                }
            }
            item { Divider() }
            items(users) { user ->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}
