#!/bin/bash

# Function to commit all files day-wise and file-wise
for day_dir in Day-*/; do
    day_name="${day_dir%/}"
    echo "Processing $day_name..."
    
    # Get all Java files in the day directory, sorted by question number
    for file in $(ls "$day_dir"*.java 2>/dev/null | sort -V); do
        filename=$(basename "$file")
        question_name="${filename%.java}"
        
        echo "Committing $day_name/$filename..."
        git add "$file" 2>/dev/null
        git commit -m "$day_name: Add $question_name solution" 2>/dev/null || true
    done
    
    # Handle deleted files in this day
    for file in $(git status --short "$day_dir" | grep "^ D " | awk '{print $3}'); do
        filename=$(basename "$file")
        question_name="${filename%.java}"
        
        echo "Committing deletion $day_name/$filename..."
        git add "$file" 2>/dev/null
        git commit -m "$day_name: Remove $question_name" 2>/dev/null || true
    done
done

echo "All commits completed!"
