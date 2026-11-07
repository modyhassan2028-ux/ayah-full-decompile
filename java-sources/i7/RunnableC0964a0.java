package i7;

import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p056f2.AbstractC0939l;

/* JADX INFO: renamed from: i7.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0964a0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17250r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final URL f17251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f17252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f17253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map f17254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f17255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractC0939l f17256x;

    public RunnableC0964a0(C0967b0 c0967b0, String str, URL url, byte[] bArr, Map map, Z z10) {
        Objects.requireNonNull(c0967b0);
        this.f17256x = c0967b0;
        U6.y.c(str);
        U6.y.f(url);
        this.f17251s = url;
        this.f17252t = bArr;
        this.f17255w = z10;
        this.f17253u = str;
        this.f17254v = map;
    }

    public void a(final int i10, final IOException iOException, final byte[] bArr, final Map map) {
        C1014r0 c1014r0 = ((C1023u0) ((C0971c1) this.f17256x).f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new Runnable() { // from class: i7.b1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC0964a0 runnableC0964a0 = this.f17266r;
                ((InterfaceC0965a1) runnableC0964a0.f17255w).b(runnableC0964a0.f17253u, i10, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Type inference failed for: r14v0, types: [i7.a0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5;
        Throwable th2;
        OutputStream outputStream6;
        IOException iOException2;
        ?? r10;
        OutputStream outputStream7;
        ?? r11;
        OutputStream outputStream8;
        InputStream inputStream2;
        boolean zHasNext;
        switch (this.f17250r) {
            case 0:
                String str = this.f17253u;
                C0967b0 c0967b0 = (C0967b0) this.f17256x;
                C1023u0 c1023u0 = (C1023u0) c0967b0.f16104r;
                C1023u0 c1023u1 = (C1023u0) c0967b0.f16104r;
                C1014r0 c1014r0 = c1023u0.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.s();
                int i10 = 0;
                OutputStream outputStream9 = null;
                try {
                    URLConnection uRLConnectionOpenConnection = this.f17251s.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    c1023u1.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map5 = this.f17254v;
                        if (map5 != null) {
                            for (Map.Entry entry : map5.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.f17252t;
                        if (bArr != null) {
                            C0967b0 c0967b1 = c0967b0.f17001s.f17110x;
                            Q1.U(c0967b1);
                            byte[] bArrA0 = c0967b1.a0(bArr);
                            X x9 = c1023u1.f17584w;
                            C1023u0.m(x9);
                            V v10 = x9.f17178E;
                            int length = bArrA0.length;
                            v10.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream10 = httpURLConnection.getOutputStream();
                            try {
                                outputStream10.write(bArrA0);
                                outputStream10.close();
                            } catch (IOException e10) {
                                iOException = e10;
                                responseCode = 0;
                                map2 = null;
                                outputStream9 = outputStream10;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e11) {
                                        X x10 = c1023u1.f17584w;
                                        C1023u0.m(x10);
                                        x10.f17182w.c(X.w(str), e11, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                Z z10 = (Z) this.f17255w;
                                C1014r0 c1014r1 = c1023u1.f17585x;
                                C1023u0.m(c1014r1);
                                c1014r1.x(new U(this.f17253u, z10, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                map = null;
                                outputStream9 = outputStream10;
                                th = th;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e12) {
                                        X x11 = c1023u1.f17584w;
                                        C1023u0.m(x11);
                                        x11.f17182w.c(X.w(str), e12, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                Z z11 = (Z) this.f17255w;
                                C1014r0 c1014r2 = c1023u1.f17585x;
                                C1023u0.m(c1014r2);
                                c1014r2.x(new U(this.f17253u, z11, i10, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i11 = inputStream.read(bArr2);
                                            if (i11 <= 0) {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                inputStream.close();
                                                httpURLConnection.disconnect();
                                                Z z12 = (Z) this.f17255w;
                                                C1014r0 c1014r3 = c1023u1.f17585x;
                                                C1023u0.m(c1014r3);
                                                c1014r3.x(new U(this.f17253u, z12, responseCode, (IOException) null, byteArray, headerFields));
                                                return;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, i11);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream = null;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                map2 = map4;
                                iOException = e;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                Z z13 = (Z) this.f17255w;
                                C1014r0 c1014r4 = c1023u1.f17585x;
                                C1023u0.m(c1014r4);
                                c1014r4.x(new U(this.f17253u, z13, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                i10 = responseCode;
                                map = map3;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                Z z14 = (Z) this.f17255w;
                                C1014r0 c1014r5 = c1023u1.f17585x;
                                C1023u0.m(c1014r5);
                                c1014r5.x(new U(this.f17253u, z14, i10, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            map2 = null;
                            iOException = e;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            Z z15 = (Z) this.f17255w;
                            C1014r0 c1014r6 = c1023u1.f17585x;
                            C1023u0.m(c1014r6);
                            c1014r6.x(new U(this.f17253u, z15, responseCode, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            map = null;
                            i10 = responseCode;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            Z z16 = (Z) this.f17255w;
                            C1014r0 c1014r7 = c1023u1.f17585x;
                            C1023u0.m(c1014r7);
                            c1014r7.x(new U(this.f17253u, z16, i10, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e15) {
                        iOException = e15;
                        responseCode = 0;
                        map2 = null;
                    } catch (Throwable th8) {
                        th = th8;
                        map = null;
                    }
                } catch (IOException e16) {
                    iOException = e16;
                    responseCode = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = null;
                    map = null;
                }
                break;
            default:
                String str2 = this.f17253u;
                C0971c1 c0971c1 = (C0971c1) this.f17256x;
                C1023u0 c1023u2 = (C1023u0) c0971c1.f16104r;
                C1023u0 c1023u3 = (C1023u0) c0971c1.f16104r;
                C1014r0 c1014r8 = c1023u2.f17585x;
                C1023u0.m(c1014r8);
                c1014r8.s();
                int responseCode2 = 0;
                try {
                    URLConnection uRLConnectionOpenConnection2 = this.f17251s.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    c1023u3.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map6 = this.f17254v;
                            if (map6 != null) {
                                Iterator it = map6.entrySet().iterator();
                                while (true) {
                                    zHasNext = it.hasNext();
                                    if (zHasNext) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.f17252t;
                            ?? r12 = zHasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    X x12 = c1023u3.f17584w;
                                    C1023u0.m(x12);
                                    V v11 = x12.f17178E;
                                    int length2 = byteArray2.length;
                                    v11.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    OutputStream outputStream11 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream11.write(byteArray2);
                                        outputStream11.close();
                                        r12 = outputStream11;
                                    } catch (IOException e17) {
                                        e = e17;
                                        responseCode2 = 0;
                                        outputStream4 = null;
                                        outputStream6 = outputStream11;
                                        iOException2 = e;
                                        outputStream8 = outputStream6;
                                        r11 = outputStream4;
                                        if (outputStream8 != null) {
                                            try {
                                                outputStream8.close();
                                            } catch (IOException e18) {
                                                X x13 = c1023u3.f17584w;
                                                C1023u0.m(x13);
                                                x13.f17182w.c(X.w(str2), e18, "Error closing HTTP compressed POST connection output stream. appId");
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, iOException2, null, r11);
                                        return;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        responseCode2 = 0;
                                        outputStream3 = null;
                                        outputStream5 = outputStream11;
                                        th2 = th;
                                        outputStream7 = outputStream5;
                                        r10 = outputStream3;
                                        if (outputStream7 != null) {
                                            try {
                                                outputStream7.close();
                                            } catch (IOException e19) {
                                                X x14 = c1023u3.f17584w;
                                                C1023u0.m(x14);
                                                x14.f17182w.c(X.w(str2), e19, "Error closing HTTP compressed POST connection output stream. appId");
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, null, null, r10);
                                        throw th2;
                                    }
                                } catch (IOException e20) {
                                    X x15 = c1023u3.f17584w;
                                    C1023u0.m(x15);
                                    x15.f17182w.b(e20, "Failed to gzip post request content");
                                    throw e20;
                                }
                            }
                            responseCode2 = httpURLConnection2.getResponseCode();
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            byte[] bArr4 = new byte[1024];
                                            while (true) {
                                                int i12 = inputStream2.read(bArr4);
                                                if (i12 <= 0) {
                                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                    inputStream2.close();
                                                    httpURLConnection2.disconnect();
                                                    a(responseCode2, null, byteArray3, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i12);
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        inputStream2 = null;
                                    }
                                } catch (IOException e21) {
                                    iOException2 = e21;
                                    r11 = r12;
                                    outputStream8 = null;
                                    if (outputStream8 != null) {
                                        outputStream8.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, iOException2, null, r11);
                                    return;
                                } catch (Throwable th13) {
                                    th2 = th13;
                                    r10 = r12;
                                    outputStream7 = null;
                                    if (outputStream7 != null) {
                                        outputStream7.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, null, null, r10);
                                    throw th2;
                                }
                            } catch (IOException e22) {
                                iOException2 = e22;
                                outputStream8 = null;
                                r11 = 0;
                                if (outputStream8 != null) {
                                    outputStream8.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r11);
                                return;
                            } catch (Throwable th14) {
                                th2 = th14;
                                outputStream7 = null;
                                r10 = 0;
                                if (outputStream7 != null) {
                                    outputStream7.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r10);
                                throw th2;
                            }
                        } catch (IOException e23) {
                            e = e23;
                            outputStream2 = null;
                            outputStream4 = outputStream2;
                            outputStream6 = outputStream2;
                            iOException2 = e;
                            outputStream8 = outputStream6;
                            r11 = outputStream4;
                            if (outputStream8 != null) {
                                outputStream8.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r11);
                            return;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        outputStream = null;
                        outputStream3 = outputStream;
                        outputStream5 = outputStream;
                        th2 = th;
                        outputStream7 = outputStream5;
                        r10 = outputStream3;
                        if (outputStream7 != null) {
                            outputStream7.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, null, null, r10);
                        throw th2;
                    }
                } catch (IOException e24) {
                    e = e24;
                    httpURLConnection2 = null;
                    outputStream2 = null;
                } catch (Throwable th16) {
                    th = th16;
                    httpURLConnection2 = null;
                    outputStream = null;
                }
                break;
        }
    }

    public RunnableC0964a0(C0971c1 c0971c1, String str, URL url, byte[] bArr, HashMap map, InterfaceC0965a1 interfaceC0965a1) {
        Objects.requireNonNull(c0971c1);
        this.f17256x = c0971c1;
        U6.y.c(str);
        this.f17251s = url;
        this.f17252t = bArr;
        this.f17255w = interfaceC0965a1;
        this.f17253u = str;
        this.f17254v = map;
    }
}
