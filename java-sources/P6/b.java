package P6;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ HashMap f6717r;

    public b(HashMap map) {
        this.f6717r = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap map = this.f6717r;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(string);
                    Log.w("HttpUrlPinger", sb.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e10) {
            e = e10;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
            sb2.append("Error while pinging URL: ");
            sb2.append(string);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (IndexOutOfBoundsException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
            sb3.append("Error while parsing ping URL: ");
            sb3.append(string);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e11);
        } catch (RuntimeException e12) {
            e = e12;
            String message3 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
            sb4.append("Error while pinging URL: ");
            sb4.append(string);
            sb4.append(". ");
            sb4.append(message3);
            Log.w("HttpUrlPinger", sb4.toString(), e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
