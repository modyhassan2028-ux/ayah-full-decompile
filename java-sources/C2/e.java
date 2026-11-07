package C2;

import A.C0045t0;
import U6.C0532j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.support.v4.media.session.p;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0532j f700a = new C0532j(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f701b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f702c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f703d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f704e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f705f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f706h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f707i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.g * 2) + 7) & (-8)) / 8) + (cVar.f696e * 2) + d(cVar.f692a, cVar.f693b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f697f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f705f)) {
            int length2 = cVarArr.length;
            while (i10 < length2) {
                c cVar2 = cVarArr[i10];
                q(byteArrayOutputStream, cVar2, d(cVar2.f692a, cVar2.f693b, bArr));
                p(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f692a, cVar3.f693b, bArr));
            }
            int length3 = cVarArr.length;
            while (i10 < length3) {
                p(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f706h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return p.B(p.C(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(p123m2.c.r(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i11] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f707i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f703d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i10, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f693b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f696e = i13;
            cVar.f698h = g(byteArrayInputStream, i13);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < cVarArr.length; i12++) {
                    if (cVarArr[i12].f693b.equals(strSubstring)) {
                        cVar = cVarArr[i12];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f695d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f706h)) {
                cVar.f696e = iM;
                cVar.f698h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f704e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i10) throws IOException {
        byte[] bArrF = f(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrF[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i12] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            c cVar = cVarArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = cVar.f697f;
            int i15 = cVar.g;
            TreeMap treeMap = cVar.f699i;
            int i16 = iAvailable - i14;
            int iM3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iM4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f698h = g(byteArrayInputStream, cVar.f696e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f703d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f704e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f699i.size() * 4;
                    String strD = d(cVar.f692a, cVar.f693b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f698h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f694c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.f699i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : cVar.f698h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f705f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f706h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f692a;
                TreeMap treeMap = cVar2.f699i;
                String strD2 = d(str, cVar2.f693b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f698h.length);
                u(byteArrayOutputStream, cVar2.f694c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : cVar2.f698h) {
                    v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f694c, 4);
                u(byteArrayOutputStream2, cVar3.f695d, 4);
                u(byteArrayOutputStream2, cVar3.g, 4);
                String strD3 = d(cVar3.f692a, cVar3.f693b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i15];
                    v(byteArrayOutputStream3, i15);
                    v(byteArrayOutputStream3, cVar4.f696e);
                    i16 = i16 + 4 + (cVar4.f696e * i13);
                    int[] iArr = cVar4.f698h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        v(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i21];
                    Iterator it3 = cVar5.f699i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i22 = i23 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(lVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i24);
                int i25 = lVar4.f719a;
                byte[] bArr7 = lVar4.f720b;
                if (i25 == 1) {
                    j10 = 0;
                } else if (i25 == 2) {
                    j10 = 1;
                } else if (i25 == 3) {
                    j10 = 2;
                } else if (i25 == 4) {
                    j10 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                u(byteArrayOutputStream, j10, 4);
                u(byteArrayOutputStream, size2, 4);
                if (lVar4.f721c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        s(byteArrayOutputStream, cVar);
        int i10 = cVar.g;
        int[] iArr = cVar.f698h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            v(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f699i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f696e);
        u(byteArrayOutputStream, cVar.f697f, 4);
        u(byteArrayOutputStream, cVar.f694c, 4);
        u(byteArrayOutputStream, cVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, c cVar) throws IOException {
        int i11 = cVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f699i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : cVar.f699i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0197 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #34 {all -> 0x0194, blocks: (B:96:0x0172, B:98:0x017e, B:109:0x0197, B:110:0x019c), top: B:289:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8 A[Catch: IllegalStateException -> 0x018d, IOException -> 0x018f, FileNotFoundException -> 0x0192, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0192, IOException -> 0x018f, IllegalStateException -> 0x018d, blocks: (B:94:0x016a, B:99:0x0188, B:117:0x01a8, B:115:0x01a5, B:114:0x01a2), top: B:301:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01be  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e8 A[Catch: all -> 0x01f7, TRY_LEAVE, TryCatch #16 {all -> 0x01f7, blocks: (B:132:0x01dc, B:134:0x01e8, B:143:0x01fa), top: B:272:0x01dc, outer: #39 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x01fa A[Catch: all -> 0x01f7, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x01f7, blocks: (B:132:0x01dc, B:134:0x01e8, B:143:0x01fa), top: B:272:0x01dc, outer: #39 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0217  */
    /* JADX WARN: Code duplicated, block: B:158:0x0223  */
    /* JADX WARN: Code duplicated, block: B:159:0x0227  */
    /* JADX WARN: Code duplicated, block: B:168:0x0249 A[Catch: all -> 0x0288, TryCatch #26 {all -> 0x0288, blocks: (B:166:0x0243, B:168:0x0249, B:169:0x024d, B:171:0x0253), top: B:279:0x0243 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0253 A[Catch: all -> 0x0288, TRY_LEAVE, TryCatch #26 {all -> 0x0288, blocks: (B:166:0x0243, B:168:0x0249, B:169:0x024d, B:171:0x0253), top: B:279:0x0243 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:241:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:248:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:268:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0258 A[EDGE_INSN: B:302:0x0258->B:173:0x0258 BREAK  A[LOOP:0: B:169:0x024d->B:303:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:268:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:268:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x017e A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #34 {all -> 0x0194, blocks: (B:96:0x0172, B:98:0x017e, B:109:0x0197, B:110:0x019c), top: B:289:0x0172 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static void t(Context context, Executor executor, d dVar, boolean z10) {
        boolean z11;
        ?? D10;
        byte[] bArr;
        c[] cVarArrL;
        c[] cVarArr;
        d dVar2;
        c[] cVarArr2;
        byte[] bArr2;
        ?? r10;
        byte[] bArr3;
        ?? r11;
        boolean z12;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i10;
        ?? r12;
        boolean z13;
        ?? byteArrayOutputStream;
        ?? r13;
        C0045t0 c0045t0;
        ?? r14;
        String str;
        FileInputStream fileInputStreamD;
        ?? r15;
        ?? r16;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j10 == packageInfo.lastUpdateTime;
                            if (z14) {
                                dVar.h(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    k.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0045t0 c0045t1 = new C0045t0(assets, executor, dVar, name, file2);
            byte[] bArr5 = (byte[]) c0045t1.f419d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            c0045t1.f416a = true;
                            D10 = c0045t1.d(assets, "dexopt/baseline.prof");
                            bArr = f701b;
                            if (D10 != 0) {
                                if (Arrays.equals(bArr, f(D10, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cVarArrL = l(D10, f(D10, 4), (String) c0045t1.f421f);
                                D10.close();
                                c0045t1.g = cVarArrL;
                            }
                            cVarArr = (c[]) c0045t1.g;
                            if (cVarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamD = c0045t1.d(assets, "dexopt/baseline.profm");
                                r14 = str;
                                if (fileInputStreamD == null) {
                                    if (fileInputStreamD != null) {
                                        fileInputStreamD.close();
                                        r14 = str;
                                    }
                                    c0045t0 = null;
                                    D10 = r14;
                                } else {
                                    if (Arrays.equals(f702c, f(fileInputStreamD, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrF = f(fileInputStreamD, 4);
                                    c0045t1.g = i(fileInputStreamD, bArrF, bArr5, cVarArr);
                                    fileInputStreamD.close();
                                    c0045t0 = c0045t1;
                                    D10 = bArrF;
                                }
                                if (c0045t0 != null) {
                                    c0045t1 = c0045t0;
                                }
                            }
                            dVar2 = (d) c0045t1.f418c;
                            cVarArr2 = (c[]) c0045t1.g;
                            bArr2 = (byte[]) c0045t1.f419d;
                            r10 = D10;
                            r10 = D10;
                            if (cVarArr2 != null) {
                                byteArrayOutputStream = c0045t1.f416a;
                                if (byteArrayOutputStream != 0) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, cVarArr2)) {
                                    c0045t1.f422h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r13 = byteArrayOutputStream;
                                    c0045t1.g = null;
                                    r10 = r13;
                                } else {
                                    dVar2.h(5, null);
                                    c0045t1.g = null;
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) c0045t1.f422h;
                            if (bArr3 != null) {
                                if (c0045t1.f416a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) c0045t1.f420e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i10 = byteArrayInputStream.read(bArr4);
                                            if (i10 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i10);
                                        }
                                        r12 = 1;
                                        c0045t1.e(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        c0045t1.f422h = null;
                                        c0045t1.g = null;
                                        z12 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z12 = false;
                            r12 = 1;
                            if (z12) {
                                e(packageInfo, filesDir);
                            }
                            z13 = z12;
                            r15 = r12;
                        } else {
                            c0045t1.e(4, null);
                        }
                    } catch (IOException unused2) {
                        z11 = true;
                        c0045t1.e(4, null);
                    }
                } else if (file2.canWrite()) {
                    c0045t1.f416a = true;
                    try {
                        D10 = c0045t1.d(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        dVar.h(6, e10);
                        D10 = 0;
                    } catch (IOException e11) {
                        dVar.h(7, e11);
                        D10 = 0;
                    }
                    bArr = f701b;
                    try {
                        if (D10 != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, f(D10, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    cVarArrL = l(D10, f(D10, 4), (String) c0045t1.f421f);
                                    try {
                                        D10.close();
                                    } catch (IOException e12) {
                                        dVar.h(7, e12);
                                    }
                                    c0045t1.g = cVarArrL;
                                } catch (IOException e13) {
                                    dVar.h(7, e13);
                                    try {
                                        D10.close();
                                    } catch (IOException e14) {
                                        dVar.h(7, e14);
                                    }
                                    cVarArrL = null;
                                }
                            } catch (IllegalStateException e15) {
                                dVar.h(8, e15);
                                D10.close();
                                cVarArrL = null;
                            }
                        }
                        cVarArr = (c[]) c0045t1.g;
                        if (cVarArr != null && (D10 = Build.VERSION.SDK_INT) >= 24 && (D10 >= 31 || D10 == 24 || D10 == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamD = c0045t1.d(assets, "dexopt/baseline.profm");
                                r14 = str;
                                if (fileInputStreamD == null) {
                                    try {
                                        if (Arrays.equals(f702c, f(fileInputStreamD, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrF2 = f(fileInputStreamD, 4);
                                        c0045t1.g = i(fileInputStreamD, bArrF2, bArr5, cVarArr);
                                        fileInputStreamD.close();
                                        c0045t0 = c0045t1;
                                        D10 = bArrF2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamD.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamD != null) {
                                        fileInputStreamD.close();
                                        r14 = str;
                                    }
                                    c0045t0 = null;
                                    D10 = r14;
                                }
                            } catch (FileNotFoundException e16) {
                                dVar.h(9, e16);
                                r14 = D10;
                            } catch (IOException e17) {
                                dVar.h(7, e17);
                                r14 = D10;
                            } catch (IllegalStateException e18) {
                                c0045t1.g = null;
                                dVar.h(8, e18);
                                r14 = D10;
                            }
                            if (c0045t0 != null) {
                                c0045t1 = c0045t0;
                            }
                        }
                        dVar2 = (d) c0045t1.f418c;
                        cVarArr2 = (c[]) c0045t1.g;
                        bArr2 = (byte[]) c0045t1.f419d;
                        r10 = D10;
                        r10 = D10;
                        if (cVarArr2 != null && bArr2 != null) {
                            byteArrayOutputStream = c0045t1.f416a;
                            if (byteArrayOutputStream != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, cVarArr2)) {
                                        dVar2.h(5, null);
                                        c0045t1.g = null;
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                    } else {
                                        c0045t1.f422h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r13 = byteArrayOutputStream;
                                        c0045t1.g = null;
                                        r10 = r13;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e19) {
                                dVar2.h(7, e19);
                                r13 = byteArrayOutputStream;
                            } catch (IllegalStateException e20) {
                                dVar2.h(8, e20);
                                r13 = byteArrayOutputStream;
                            }
                        }
                        bArr3 = (byte[]) c0045t1.f422h;
                        if (bArr3 != null) {
                            z12 = false;
                            r12 = 1;
                        } else {
                            try {
                                if (c0045t1.f416a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) c0045t1.f420e);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i10 = byteArrayInputStream.read(bArr4);
                                                                                    if (i10 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i10);
                                                                                    }
                                                                                }
                                                                                r12 = 1;
                                                                                c0045t1.e(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c0045t1.f422h = null;
                                                                                c0045t1.g = null;
                                                                                z12 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        c0045t1.e(6, e);
                                        r11 = r10;
                                        c0045t1.f422h = null;
                                        c0045t1.g = null;
                                        z12 = false;
                                        r12 = r11;
                                    } catch (IOException e22) {
                                        e = e22;
                                        c0045t1.e(7, e);
                                        r11 = r10;
                                        c0045t1.f422h = null;
                                        c0045t1.g = null;
                                        z12 = false;
                                        r12 = r11;
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    r10 = 1;
                                    c0045t1.e(6, e);
                                    r11 = r10;
                                    c0045t1.f422h = null;
                                    c0045t1.g = null;
                                    z12 = false;
                                    r12 = r11;
                                } catch (IOException e24) {
                                    e = e24;
                                    r10 = 1;
                                    c0045t1.e(7, e);
                                    r11 = r10;
                                    c0045t1.f422h = null;
                                    c0045t1.g = null;
                                    z12 = false;
                                    r12 = r11;
                                }
                            } catch (Throwable th23) {
                                c0045t1.f422h = null;
                                c0045t1.g = null;
                                throw th23;
                            }
                        }
                        if (z12) {
                            e(packageInfo, filesDir);
                        }
                        z13 = z12;
                        r15 = r12;
                    } catch (Throwable th24) {
                        try {
                            D10.close();
                            throw th24;
                        } catch (IOException e25) {
                            dVar.h(7, e25);
                            throw th24;
                        }
                    }
                } else {
                    c0045t1.e(4, null);
                }
                if (z13 || !z10) {
                    r16 = 0;
                } else {
                    r16 = r15;
                }
                k.c(context, r16);
            }
            c0045t1.e(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = true;
            z13 = false;
            r15 = z11;
            if (z13) {
                r16 = 0;
            } else {
                r16 = 0;
            }
            k.c(context, r16);
        } catch (PackageManager.NameNotFoundException e26) {
            dVar.h(7, e26);
            k.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        u(byteArrayOutputStream, i10, 2);
    }
}
