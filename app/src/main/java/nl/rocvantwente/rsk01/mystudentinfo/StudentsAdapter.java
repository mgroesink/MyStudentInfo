package nl.rocvantwente.rsk01.mystudentinfo;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 12-4-2018.
 */

public class StudentsAdapter extends ArrayAdapter<StudentPartialInfo> {

    ViewHolder viewHolder = new ViewHolder();

    Context context;

    private class ViewHolder {
        TextView initials;
        TextView name;
        TextView studentnr;
        TextView residence;
        TextView education;
        TextView gender;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        StudentPartialInfo student = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_list_item, parent, false);
            viewHolder.initials = convertView.findViewById(R.id.text_view_initials);
            viewHolder.name = convertView.findViewById(R.id.text_view_name);
            viewHolder.studentnr = convertView.findViewById(R.id.text_view_studentnr);
            viewHolder.gender = convertView.findViewById(R.id.text_view_gender);
            viewHolder.education = convertView.findViewById(R.id.text_view_education);
            viewHolder.residence = convertView.findViewById(R.id.text_view_residence);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (student.getFullName() != null) viewHolder.name.setText(student.getFullName());
        if (student.getStudentNr() != null) viewHolder.studentnr.setText(student.getStudentNr());
        if (student.getEducation() != null) viewHolder.education.setText(student.getEducation());
        if (student.getGender() != null) viewHolder.gender.setText(
                context.getString(R.string.gender) + ": " +
                        student.getGender());
        if (student.getResidence() != null) viewHolder.residence.setText(
                context.getString(R.string.city) + ": " +
                student.getResidence());
        if (student.getFullName() != null) viewHolder.initials.setText(
                student.getFirstName().substring(0, 1) + student.getLastName().substring(0, 1)
        );
        GradientDrawable magCircle = (GradientDrawable)convertView
                .findViewById(R.id.text_view_initials).getBackground();

        int magColor = getMagnitudeColor(student.getResidence());
        magCircle.setColor(magColor);

        return convertView;
    }

    public StudentsAdapter(@NonNull Context context, ArrayList<StudentPartialInfo> students) {
        super(context, 0, students);
        this.context = context;

    }

    /**
     *
     * @param city
     * @return
     */
    private int getMagnitudeColor(String city) {
        int color;
        switch(city.substring(0,3).toLowerCase()){
            case "alm":
                color =  ContextCompat.getColor(getContext() , R.color.colorAlmelo);
                break;
            case "hen":
                color = ContextCompat.getColor(getContext() , R.color.colorHengelo);
                break;
            case "ens":
                color = ContextCompat.getColor(getContext() , R.color.colorEnschede);
                break;
            default:
                color =  ContextCompat.getColor(getContext() , R.color.colorOther);
                break;
        }
        return color;
    }

}
