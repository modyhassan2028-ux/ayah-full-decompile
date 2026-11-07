package L8;

import J8.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f5569d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f5570e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I8.b f5572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5573c = new d();

    public c(Context context, I8.b bVar) {
        this.f5571a = context;
        this.f5572b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e10) {
            throw new f(e10.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f5570e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", p123m2.c.t("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : p123m2.c.s(", ", str)));
    }

    public static long d(String str) {
        if (!f5569d.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid Expiration Timestamp.");
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f5570e));
        byte b5 = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        b bVar = null;
        long jD = 0;
        String strNextString3 = null;
        String strNextString4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString4 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        b5 = (byte) (b5 | 1);
                        jD = d(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b5 != 1) {
                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                }
                bVar = new b(jD, 0, strNextString);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(strNextString3, strNextString4, strNextString2, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f5570e));
        byte b5 = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        long jD = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jD = d(jsonReader.nextString());
                b5 = (byte) (b5 | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b5 == 1) {
            return new b(jD, 1, strNextString);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public final HttpURLConnection c(URL url, String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f5571a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            H8.f fVar = (H8.f) this.f5572b.get();
            if (fVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) p000a.a.l(((H8.d) fVar).a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            String string = null;
            try {
                PackageInfo packageInfoB = Z6.b.a(context).b(64, context.getPackageName());
                Signature[] signatureArr = packageInfoB.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i10++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    if (messageDigest == null) {
                        bArrDigest = null;
                    } else {
                        bArrDigest = messageDigest.digest(packageInfoB.signatures[0].toByteArray());
                    }
                }
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i11 = 0; i11 < length; i11++) {
                        char[] cArr = Y6.b.f10438a;
                        sb.append(cArr[(bArrDigest[i11] & 240) >>> 4]);
                        sb.append(cArr[bArrDigest[i11] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e12) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e12);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
