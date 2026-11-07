package p013b2;

import B0.c;
import F1.a;
import H8.e;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.r;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p023c2.b;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile j f13157k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f13158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1351f f13159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f13161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f13162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f13163f;
    public final e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f13165i;

    public j(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13158a = reentrantReadWriteLock;
        this.f13160c = 3;
        i iVar = (i) tVar.f1626b;
        this.f13163f = iVar;
        int i10 = tVar.f1625a;
        this.f13164h = i10;
        this.f13165i = (d) tVar.f1627c;
        this.f13161d = new Handler(Looper.getMainLooper());
        this.f13159b = new C1351f(0);
        this.g = new e(21);
        f fVar = new f(this);
        this.f13162e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f13160c = 0;
            } catch (Throwable th) {
                this.f13158a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (j) {
            try {
                jVar = f13157k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static boolean d() {
        return f13157k != null;
    }

    public final int b(CharSequence charSequence, int i10) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        c.i(charSequence, "charSequence cannot be null");
        r rVar = (r) this.f13162e.f13154a;
        rVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            y[] yVarArr = (y[]) spanned.getSpans(i10, i10 + 1, y.class);
            if (yVarArr.length > 0) {
                return spanned.getSpanStart(yVarArr[0]);
            }
        }
        return ((q) rVar.L(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new q(i10))).f13174s;
    }

    public final int c() {
        this.f13158a.readLock().lock();
        try {
            return this.f13160c;
        } finally {
            this.f13158a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f13164h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f13158a.writeLock().lock();
        try {
            if (this.f13160c == 0) {
                this.f13158a.writeLock().unlock();
                return;
            }
            this.f13160c = 0;
            this.f13158a.writeLock().unlock();
            f fVar = this.f13162e;
            j jVar = (j) fVar.f13156c;
            try {
                jVar.f13163f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.f(th);
            }
        } catch (Throwable th2) {
            this.f13158a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f13158a.writeLock().lock();
        try {
            this.f13160c = 2;
            arrayList.addAll(this.f13159b);
            this.f13159b.clear();
            this.f13158a.writeLock().unlock();
            this.f13161d.post(new a(arrayList, this.f13160c, th));
        } catch (Throwable th2) {
            this.f13158a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:96:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:96:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    public final CharSequence g(int i10, int i11, int i12, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i13;
        int i14;
        y[] yVarArr;
        int spanStart;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        c.g("start should be <= than end", i10 <= i11);
        A a9 = null;
        if (charSequence == null) {
            return null;
        }
        c.g("start should be < than charSequence length", i10 <= charSequence.length());
        c.g("end should be < than charSequence length", i11 <= charSequence.length());
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        boolean z10 = i12 == 1;
        r rVar = (r) this.f13162e.f13154a;
        rVar.getClass();
        boolean z11 = charSequence instanceof w;
        if (z11) {
            ((w) charSequence).a();
        }
        if (z11) {
            a9 = new A((Spannable) charSequence);
            if (a9 != null) {
                for (y yVar : yVarArr) {
                    spanStart = a9.f13149s.getSpanStart(yVar);
                    int spanEnd = a9.f13149s.getSpanEnd(yVar);
                    if (spanStart != i11) {
                        a9.removeSpan(yVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            }
            ((w) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    a9 = new A((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z11) {
                        throw th;
                    }
                    ((w) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, y.class) <= i11) {
                a9 = new A();
                a9.f13148r = false;
                a9.f13149s = new SpannableString(charSequence);
            }
            if (a9 != null && (yVarArr = (y[]) a9.f13149s.getSpans(i10, i11, y.class)) != null && yVarArr.length > 0) {
                while (i < r3) {
                    spanStart = a9.f13149s.getSpanStart(yVar);
                    int spanEnd2 = a9.f13149s.getSpanEnd(yVar);
                    if (spanStart != i11) {
                        a9.removeSpan(yVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14 || i13 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    A a10 = (A) rVar.L(charSequence2, i13, i14, Integer.MAX_VALUE, z10, new L5.c(20, a9, (e) rVar.f11364s, false));
                    if (a10 != null) {
                        Spannable spannable = a10.f13149s;
                        if (z11) {
                            ((w) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z11) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z11) {
                        throw th;
                    }
                    ((w) charSequence2).b();
                    throw th;
                }
            }
            ((w) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th;
        }
        ((w) charSequence2).b();
        throw th;
    }

    public final void h(h hVar) {
        c.i(hVar, "initCallback cannot be null");
        this.f13158a.writeLock().lock();
        try {
            if (this.f13160c == 1 || this.f13160c == 2) {
                this.f13161d.post(new a(Arrays.asList(hVar), this.f13160c, (Throwable) null));
            } else {
                this.f13159b.add(hVar);
            }
        } finally {
            this.f13158a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f13162e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        b bVar = (b) ((Aa.a) fVar.f13155b).f554r;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f3680u).getInt(iA + bVar.f3677r) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
