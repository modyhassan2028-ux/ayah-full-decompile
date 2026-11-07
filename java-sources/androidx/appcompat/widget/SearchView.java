package androidx.appcompat.widget;

import I1.S;
import P7.h;
import X7.r;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.ayah.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p017b7.g;
import p074h0.i;
import p151p.C1270u0;
import p151p.M0;
import p151p.N0;
import p151p.O0;
import p151p.P0;
import p151p.Q0;
import p151p.R0;
import p151p.S0;
import p151p.T0;
import p151p.U0;
import p151p.W0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements p130n.b {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final S0 f11591z0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final SearchAutoComplete f11592G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final View f11593H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final View f11594I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final View f11595J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ImageView f11596K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ImageView f11597L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ImageView f11598M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ImageView f11599N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View f11600O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public U0 f11601P;
    public final Rect Q;
    public final Rect R;
    public final int[] S;
    public final int[] T;
    public final ImageView U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Drawable f11602V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f11603W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f11604a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Intent f11605b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Intent f11606c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final CharSequence f11607d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Q0 f11608e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View.OnFocusChangeListener f11609f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View.OnClickListener f11610g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f11611h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f11612i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public O1.b f11613j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f11614k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public CharSequence f11615l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f11616m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f11617n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f11618o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f11619p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f11620q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CharSequence f11621r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f11622s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f11623t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SearchableInfo f11624u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Bundle f11625v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final M0 f11626w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final M0 f11627x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final WeakHashMap f11628y0;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f11629v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public SearchView f11630w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f11631x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final d f11632y;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            S0 s10 = SearchView.f11591z0;
            s10.getClass();
            S0.a();
            Method method = s10.f20584c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f11629v <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f11631x) {
                d dVar = this.f11632y;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f11630w;
            searchView.w(searchView.f11612i0);
            searchView.post(searchView.f11626w0);
            if (searchView.f11592G.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f11630w.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f11630w.hasFocus() && getVisibility() == 0) {
                this.f11631x = true;
                Context context = getContext();
                S0 s10 = SearchView.f11591z0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f11632y;
            if (!z10) {
                this.f11631x = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f11631x = true;
                    return;
                }
                this.f11631x = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f11630w = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f11629v = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f11632y = new d(this);
            this.f11629v = getThreshold();
        }
    }

    static {
        S0 s10 = null;
        if (Build.VERSION.SDK_INT < 29) {
            S0 s11 = new S0();
            s11.f20582a = null;
            s11.f20583b = null;
            s11.f20584c = null;
            S0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                s11.f20582a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                s11.f20583b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                s11.f20584c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            s10 = s11;
        }
        f11591z0 = s10;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f11617n0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f11592G;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f11617n0 = false;
    }

    public int getImeOptions() {
        return this.f11592G.getImeOptions();
    }

    public int getInputType() {
        return this.f11592G.getInputType();
    }

    public int getMaxWidth() {
        return this.f11618o0;
    }

    public CharSequence getQuery() {
        return this.f11592G.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f11615l0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f11624u0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f11607d0 : getContext().getText(this.f11624u0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f11604a0;
    }

    public int getSuggestionRowLayout() {
        return this.f11603W;
    }

    public O1.b getSuggestionsAdapter() {
        return this.f11613j0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f11621r0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f11625v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f11624u0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f11625v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f11592G;
        if (i10 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        S0 s10 = f11591z0;
        s10.getClass();
        S0.a();
        Method method = s10.f20582a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        s10.getClass();
        S0.a();
        Method method2 = s10.f20583b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f11592G;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f11611h0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i10) {
        int position;
        String strH;
        Cursor cursor = this.f11613j0.f6441t;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentJ = null;
            try {
                int i11 = W0.f20610O;
                String strH2 = W0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f11624u0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = W0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f11624u0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = W0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentJ = j(strH2, strH3 == null ? null : Uri.parse(strH3), W0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), W0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f11592G;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i10) {
        Editable text = this.f11592G.getText();
        Cursor cursor = this.f11613j0.f6441t;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String strC = this.f11613j0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // p130n.b
    public final void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        w(true);
        this.f11592G.setImeOptions(this.f11623t0);
        this.f11622s0 = false;
    }

    @Override // p130n.b
    public final void onActionViewExpanded() {
        if (this.f11622s0) {
            return;
        }
        this.f11622s0 = true;
        SearchAutoComplete searchAutoComplete = this.f11592G;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f11623t0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f11626w0);
        post(this.f11627x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f11592G;
            int[] iArr = this.S;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.T;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.Q;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.R;
            rect2.set(i16, 0, i17, i18);
            U0 u8 = this.f11601P;
            if (u8 == null) {
                U0 u10 = new U0(searchAutoComplete, rect2, rect);
                this.f11601P = u10;
                setTouchDelegate(u10);
            } else {
                u8.f20598b.set(rect2);
                Rect rect3 = u8.f20600d;
                rect3.set(rect2);
                int i19 = -u8.f20601e;
                rect3.inset(i19, i19);
                u8.f20599c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f11612i0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f11618o0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f11618o0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f11618o0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof T0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T0 t2 = (T0) parcelable;
        super.onRestoreInstanceState(t2.f6852r);
        w(t2.f20596t);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        T0 t2 = new T0(super.onSaveInstanceState());
        t2.f20596t = this.f11612i0;
        return t2;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f11626w0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f11592G;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f11608e0 != null) {
            text.toString();
            return;
        }
        if (this.f11624u0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f11592G.getText());
        int i10 = (!zIsEmpty || (this.f11611h0 && !this.f11622s0)) ? 0 : 8;
        ImageView imageView = this.f11598M;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f11617n0 || !isFocusable()) {
            return false;
        }
        if (this.f11612i0) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f11592G.requestFocus(i10, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.f11592G.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f11594I.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f11595J.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f11625v0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f11592G;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f11610g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f11611h0 == z10) {
            return;
        }
        this.f11611h0 = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i10) {
        this.f11592G.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f11592G.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f11618o0 = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f11609f0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(Q0 q10) {
        this.f11608e0 = q10;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f11610g0 = onClickListener;
    }

    public void setQuery(CharSequence charSequence, boolean z10) {
        SearchAutoComplete searchAutoComplete = this.f11592G;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f11621r0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        q();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f11615l0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f11616m0 = z10;
        O1.b bVar = this.f11613j0;
        if (bVar instanceof W0) {
            ((W0) bVar).f20617G = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z10;
        this.f11624u0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f11592G;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f11624u0.getImeOptions());
            int inputType = this.f11624u0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f11624u0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            O1.b bVar = this.f11613j0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f11624u0.getSuggestAuthority() != null) {
                W0 w9 = new W0(getContext(), this, this.f11624u0, this.f11628y0);
                this.f11613j0 = w9;
                searchAutoComplete.setAdapter(w9);
                ((W0) this.f11613j0).f20617G = this.f11616m0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f11624u0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f11624u0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f11605b0;
            } else if (this.f11624u0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f11606c0;
            }
            z10 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f11619p0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.f11612i0);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f11614k0 = z10;
        w(this.f11612i0);
    }

    public void setSuggestionsAdapter(O1.b bVar) {
        this.f11613j0 = bVar;
        this.f11592G.setAdapter(bVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z10 = this.f11611h0;
        SearchAutoComplete searchAutoComplete = this.f11592G;
        CharSequence charSequence2 = charSequence;
        if (z10 && (drawable = this.f11602V) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.f11595J.setVisibility(((this.f11614k0 || this.f11619p0) && !this.f11612i0 && (this.f11597L.getVisibility() == 0 || this.f11599N.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z10) {
        boolean z11 = this.f11614k0;
        this.f11597L.setVisibility((!z11 || !(z11 || this.f11619p0) || this.f11612i0 || !hasFocus() || (!z10 && this.f11619p0)) ? 8 : 0);
    }

    public final void w(boolean z10) {
        this.f11612i0 = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f11592G.getText());
        this.f11596K.setVisibility(i11);
        v(!zIsEmpty);
        this.f11593H.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.U;
        imageView.setVisibility((imageView.getDrawable() == null || this.f11611h0) ? 8 : 0);
        r();
        if (this.f11619p0 && !this.f11612i0 && zIsEmpty) {
            this.f11597L.setVisibility(8);
            i10 = 0;
        }
        this.f11599N.setVisibility(i10);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new int[2];
        this.T = new int[2];
        this.f11626w0 = new M0(this, 0);
        this.f11627x0 = new M0(this, 1);
        this.f11628y0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        O0 o10 = new O0(this);
        r rVar = new r(2, this);
        C1270u0 c1270u0 = new C1270u0(1, this);
        h hVar = new h(this, 2);
        int[] iArr = p073h.a.f16400w;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        S.n(this, context, iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        layoutInflaterFrom.inflate(typedArray.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f11592G = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f11593H = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f11594I = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f11595J = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f11596K = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f11597L = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f11598M = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f11599N = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.U = imageView5;
        viewFindViewById.setBackground(iVarB.r(20));
        viewFindViewById2.setBackground(iVarB.r(25));
        imageView.setImageDrawable(iVarB.r(23));
        imageView2.setImageDrawable(iVarB.r(15));
        imageView3.setImageDrawable(iVarB.r(12));
        imageView4.setImageDrawable(iVarB.r(28));
        imageView5.setImageDrawable(iVarB.r(23));
        this.f11602V = iVarB.r(22);
        g.r0(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f11603W = typedArray.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f11604a0 = typedArray.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(hVar);
        searchAutoComplete.setOnEditorActionListener(o10);
        searchAutoComplete.setOnItemClickListener(rVar);
        searchAutoComplete.setOnItemSelectedListener(c1270u0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new N0(this));
        setIconifiedByDefault(typedArray.getBoolean(18, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f11607d0 = typedArray.getText(14);
        this.f11615l0 = typedArray.getText(21);
        int i11 = typedArray.getInt(6, -1);
        if (i11 != -1) {
            setImeOptions(i11);
        }
        int i12 = typedArray.getInt(5, -1);
        if (i12 != -1) {
            setInputType(i12);
        }
        setFocusable(typedArray.getBoolean(1, true));
        iVarB.C();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f11605b0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f11606c0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f11600O = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new K7.b(2, this));
        }
        w(this.f11611h0);
        t();
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f11592G;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void setOnCloseListener(P0 p10) {
    }

    public void setOnSuggestionListener(R0 r10) {
    }
}
