package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testVerifyJoke() throws InterruptedException {
        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        Context context = InstrumentationRegistry.getContext();
        EndpointsAsyncTask testTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);

                if (result != null){
                    assertTrue(result.length() > 0);
                    latch.countDown();
                }
            }
        };
        testTask.execute(context);
        latch.await();
    }

}