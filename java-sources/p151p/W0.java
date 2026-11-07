package p151p;

import K0.n1;
import O1.a;
import O1.b;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.ayah.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f20610O = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LayoutInflater f20611A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SearchView f20612B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final SearchableInfo f20613C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Context f20614D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final WeakHashMap f20615E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f20616F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f20617G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ColorStateList f20618H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f20619I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f20620J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f20621K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f20622L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f20623M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f20624N;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f20625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f20626z;

    public W0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f6440s = true;
        this.f6441t = null;
        this.f6439r = false;
        this.f6442u = -1;
        this.f6443v = new n1(this);
        this.f6444w = new a(0, this);
        this.f20626z = suggestionRowLayout;
        this.f20625y = suggestionRowLayout;
        this.f20611A = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f20617G = 1;
        this.f20619I = -1;
        this.f20620J = -1;
        this.f20621K = -1;
        this.f20622L = -1;
        this.f20623M = -1;
        this.f20624N = -1;
        this.f20612B = searchView;
        this.f20613C = searchableInfo;
        this.f20616F = searchView.getSuggestionCommitIconResId();
        this.f20614D = context;
        this.f20615E = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override // O1.b
    public final void a(View view, Cursor cursor) {
        int i10;
        Drawable drawableF;
        CharSequence charSequenceH;
        V0 v10 = (V0) view.getTag();
        int i11 = this.f20624N;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        TextView textView = v10.f20604a;
        TextView textView2 = v10.f20605b;
        ImageView imageView = v10.f20608e;
        if (textView != null) {
            String strH = h(cursor, this.f20619I);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f20614D;
        if (textView2 != null) {
            String strH2 = h(cursor, this.f20621K);
            if (strH2 != null) {
                if (this.f20618H == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f20618H = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f20618H, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(cursor, this.f20620J);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = v10.f20606c;
        if (imageView2 != null) {
            int i13 = this.f20622L;
            if (i13 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i13));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f20613C.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f20615E;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbW = c.w(iconResource, "Invalid icon resource ", " for ");
                                    sbW.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbW.toString());
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.w("SuggestionsAdapter", e10.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView3 = v10.f20607d;
        if (imageView3 == null) {
            i10 = 1;
        } else {
            int i14 = this.f20623M;
            Drawable drawableF2 = i14 == -1 ? null : f(cursor.getString(i14));
            imageView3.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView3.setVisibility(8);
                i10 = 1;
            } else {
                imageView3.setVisibility(0);
                drawableF2.setVisible(false, false);
                i10 = 1;
                drawableF2.setVisible(true, false);
            }
        }
        int i15 = this.f20617G;
        if (i15 != 2 && (i15 != i10 || (i12 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // O1.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f20619I = cursor.getColumnIndex("suggest_text_1");
                this.f20620J = cursor.getColumnIndex("suggest_text_2");
                this.f20621K = cursor.getColumnIndex("suggest_text_2_url");
                this.f20622L = cursor.getColumnIndex("suggest_icon_1");
                this.f20623M = cursor.getColumnIndex("suggest_icon_2");
                this.f20624N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // O1.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f20613C;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // O1.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f20611A.inflate(this.f20625y, viewGroup, false);
        viewInflate.setTag(new V0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f20616F);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f20614D.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f20615E;
        Context context = this.f20614D;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i10;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i10);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e10) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e11) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
                    if (drawableE != null) {
                        weakHashMap.put(str, drawableE.getConstantState());
                    }
                    return drawableE;
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f20614D.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // O1.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewInflate = this.f20611A.inflate(this.f20626z, viewGroup, false);
            if (viewInflate != null) {
                ((V0) viewInflate.getTag()).f20604a.setText(e10.toString());
            }
            return viewInflate;
        }
    }

    @Override // O1.b, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewD = d(viewGroup);
            ((V0) viewD.getTag()).f20604a.setText(e10.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f6441t;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f6441t;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f20612B.p((CharSequence) tag);
        }
    }
}
