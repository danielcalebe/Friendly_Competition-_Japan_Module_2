package com.app.friendlycompetitionjapanmodule2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.app.friendlycompetitionjapanmodule2.R
import com.app.friendlycompetitionjapanmodule2.ui.theme.FriendlyCompetitionJapanModule2Theme

@Composable
fun Home() {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(MaterialTheme.colorScheme.background)
      .verticalScroll(rememberScrollState())
  ) {
    HomeHeader(onSearch = {})
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f)

    ) {
      HomeHeadline(
        modifier = Modifier
          .weight(1f)
          .padding(16.dp)
      )
      LazyVerticalGrid(
        modifier = Modifier
          .weight(1f)
          .padding(8.dp)
          .height(120.dp * 3),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
      ) {
        items(12) {
          NewsCard()
        }
      }
    }

    LazyVerticalGrid(
      modifier = Modifier
        .weight(0.7f)
        .padding(8.dp),
      columns = GridCells.Fixed(3),
      verticalArrangement = Arrangement.spacedBy(12.dp),
      horizontalArrangement = Arrangement.spacedBy(32.dp)
    ) {
      items(12) {
        NewsCard()
      }
    }


  }
}

@Composable
fun NewsCard() {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .height(160.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(2.dp)
  ) {
    Image(
      painter = painterResource(R.drawable.new_5_image_2),
      contentDescription = null,
      modifier = Modifier
        .fillMaxWidth()
        .aspectRatio(16f / 9f)
    )

    Text(
      text = "Strong cold air coming tonight! Guangdong lowest break 0! As for the weather in Guangzhou",
      maxLines = 2,
      overflow = TextOverflow.Clip,
      style = MaterialTheme.typography.bodyLarge.copy(
        fontSize = 12.sp,
        lineHeight = 12.sp,
        fontWeight = FontWeight.Bold
      ),
      textAlign = TextAlign.Start
    )

  }

}

@Composable
fun HomeHeader(onSearch: () -> Unit) {
  Column(
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Box(modifier = Modifier.width(24.dp))

      Image(
        painter = painterResource(R.drawable.logo),
        contentDescription = null,
        modifier = Modifier.size(60.dp),
        contentScale = ContentScale.Crop
      )
      Image(
        painter = painterResource(R.drawable.search),
        contentDescription = null,
        modifier = Modifier
          .width(20.dp)
          .clickable(onClick = onSearch),
      )

    }
    HorizontalDivider(modifier = Modifier.fillMaxWidth())
  }
}

@Composable
fun HomeHeadline(modifier: Modifier = Modifier) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(8.dp)
  ) {
    Text(
      text = "Strong cold air coming tonight! Guangdong lowest break 0! As for the weather in Guangzhou",
      maxLines = 2,
      overflow = TextOverflow.Ellipsis,
      style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
    )

    Image(
      painter = painterResource(R.drawable.new_5_image_1),
      contentDescription = null,
      modifier = Modifier
        .fillMaxWidth()
        .aspectRatio(16f / 9f),
      contentScale = ContentScale.Crop
    )

    Column() {
      Text("These days, Guangdong is so warm that you wear short sleeves")
      Text("On February 20, most of the province")
    }

    Spacer(Modifier.height(12.dp))

    Column(
      modifier = Modifier
        .fillMaxWidth()
        .height(5 * 16.dp + 40.dp)
        .verticalScroll(rememberScrollState())
    ) {
      Text(
        "• 8:00 temperature 12°, humidity 95%, body temperature 10°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 9:00 temperature 13°, humidity 95%, body temperature 11°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 10:00 temperature 13°, humidity 95%, body temperature 11°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 11:00 temperature 15°, humidity 95%, body temperature 15°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 12:00 temperature 15°, humidity 95%, body temperature 15°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 13:00 temperature 15°, humidity 95%, body temperature 14°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 14:00 temperature 15°, humidity 95%, body temperature 14°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 15:00 temperature 13°, humidity 95%, body temperature 11°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 16:00 temperature 13°, humidity 95%, body temperature 11°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 17:00 temperature 11°, humidity 95%, body temperature 10°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 18:00 temperature 11°, humidity 95%, body temperature 10°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 19:00 temperature 10°, humidity 95%, body temperature 9°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 20:00 temperature 10°, humidity 95%, body temperature 9°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 21:00 temperature 9°, humidity 95%, body temperature 8°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 22:00 temperature 9°, humidity 95%, body temperature 7°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
      Text(
        "• 23:00 temperature 6°, humidity 95%, body temperature 6°",
        style = MaterialTheme.typography.bodyLarge.copy(
          fontSize = 12.sp,
          lineHeight = 12.sp,
          fontWeight = FontWeight.Bold
        )
      )
      Spacer(Modifier.height(8.dp))
    }

  }
}

@Preview
@Composable
private fun Preview_Home() {
  FriendlyCompetitionJapanModule2Theme() {
    Home()
  }
}