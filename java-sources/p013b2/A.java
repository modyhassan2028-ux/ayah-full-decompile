package p013b2;

import U6.C0532j;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.gms.internal.measurement.K1;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Spannable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13148r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Spannable f13149s;

    public A(Spannable spannable) {
        this.f13149s = spannable;
    }

    public final void a() {
        Spannable spannable = this.f13149s;
        if (!this.f13148r) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0532j(21) : new z(21)).n(spannable)) {
                this.f13149s = new SpannableString(spannable);
            }
        }
        this.f13148r = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f13149s.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return j$.util.stream.IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return j$.util.stream.IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f13149s.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f13149s.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f13149s.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f13149s.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13149s.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f13149s.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f13149s.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f13149s.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f13149s.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13149s.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return K1.a(this.f13149s);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return K1.b(this.f13149s);
    }
}
