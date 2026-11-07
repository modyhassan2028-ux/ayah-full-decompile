package p013b2;

import B0.c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w extends SpannableStringBuilder {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f13194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f13195s;

    public w(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f13195s = new ArrayList();
        c.i(cls, "watcherClass cannot be null");
        this.f13194r = cls;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13195s;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((v) arrayList.get(i10)).f13193s.incrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13195s;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((v) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    public final v c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13195s;
            if (i10 >= arrayList.size()) {
                return null;
            }
            v vVar = (v) arrayList.get(i10);
            if (vVar.f13192r == obj) {
                return vVar;
            }
            i10++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f13194r == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13195s;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((v) arrayList.get(i10)).f13193s.decrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        v vVarC;
        if (d(obj) && (vVarC = c(obj)) != null) {
            obj = vVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        v vVarC;
        if (d(obj) && (vVarC = c(obj)) != null) {
            obj = vVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        v vVarC;
        if (d(obj) && (vVarC = c(obj)) != null) {
            obj = vVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        if (this.f13194r != cls) {
            return super.getSpans(i10, i11, cls);
        }
        v[] vVarArr = (v[]) super.getSpans(i10, i11, v.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, vVarArr.length);
        for (int i12 = 0; i12 < vVarArr.length; i12++) {
            objArr[i12] = vVarArr[i12].f13192r;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.f13194r == cls) {
            cls = v.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        v vVarC;
        if (d(obj)) {
            vVarC = c(obj);
            if (vVarC != null) {
                obj = vVarC;
            }
        } else {
            vVarC = null;
        }
        super.removeSpan(obj);
        if (vVarC != null) {
            this.f13195s.remove(vVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            v vVar = new v(obj);
            this.f13195s.add(vVar);
            obj = vVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new w(this.f13194r, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public w(Class cls, w wVar, int i10, int i11) {
        super(wVar, i10, i11);
        this.f13195s = new ArrayList();
        c.i(cls, "watcherClass cannot be null");
        this.f13194r = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
